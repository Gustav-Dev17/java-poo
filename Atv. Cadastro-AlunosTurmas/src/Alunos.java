import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Alunos {
	
	private String nome;
	public String matricula;
	private String codTurma;
	
	public String consultPorTurma;
	
	public String getNome() { //métoto get para o nome
		return nome;
	}
	public void setNome(String nome) { //métoto set para o nome
		this.nome = nome;
	}
	public String getMatricula() { //métoto get para a matrícula
		return matricula;
	}
	public void setMatricula(String matricula) { //métoto set para a matrícula
		this.matricula = matricula;
	}
	public String getCodTurma() { //métoto get para a turma
		return codTurma;
	}
	public void setCodTurma(String codTurma) { //métoto set para a turma
		this.codTurma = codTurma;
	}
	
	public String getconsultPorTurma() { //métoto get para buscar pela matrícula na interface consulta
		return consultPorTurma;
	}
	
	public void setconsultPorTurma(String consultPorTurma) { //métoto set para buscar pela matrícula na interface consulta
		this.consultPorTurma = consultPorTurma;
	} 	
	
	public String salvarAluno() { //método criador do arquivo.txt que armazenará os dados
		
		try {
			FileWriter fw = new FileWriter("alunos.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Aluno: "+this.nome+"; Matrícula: "+this.matricula+"; Código da Turma: "+this.codTurma);
			pw.println();
	        pw.flush();
	        pw.close();
	        fw.close();
			
		} catch (IOException e) {
			Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return "Aluno cadastrado!";
	}
		
	public static String listarAlunos() { //método que listará os alunos a partir da InterfaceConsulta
	
		 Path caminho = Paths.get("alunos.txt");
	        try {
	            byte[] texto = Files.readAllBytes(caminho);
	            String leitura = new String(texto);
	            
	            
	            JOptionPane.showMessageDialog(null, leitura.split(";\\s"), "Alunos cadastrados", JOptionPane.PLAIN_MESSAGE);
	            return "";
	        } catch (IOException e) {
            	JOptionPane.showMessageDialog(null,"Ainda não há dados!");
                return "";
	        }
	}
		

    public String consultarPorTurma(){ //método que consultará os alunos ao digitar uma matrícula
        try{
            FileReader fr = new FileReader("alunos.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linha = br.readLine();
            boolean teste = false;
            
            String aluno = "";
            
            while(linha != null) {
                if (linha.contains(consultPorTurma)){
                   String[] separar = linha.split(";\\s");
                   String nome = separar[0];
                   String matrícula = separar[1];

                   aluno += nome + "\n" + matrícula + "\n\n";

                   teste = true;
                }
                linha = br.readLine();                 
            }
            if (teste == false){
                    JOptionPane.showMessageDialog(null, "Não há alunos cadastrados nessa turma", "Erro", JOptionPane.PLAIN_MESSAGE);
            }
            if(teste == true) JOptionPane.showMessageDialog(null, aluno, ("Alunos na turma "+consultPorTurma), JOptionPane.PLAIN_MESSAGE);
            br.close();
            fr.close();
            return "";
        } catch (FileNotFoundException e) {
        	JOptionPane.showMessageDialog(null,"Ainda não há turmas!");
        	return "";
        }catch (IOException e) {
        	JOptionPane.showMessageDialog(null,"Erro: Não foi possível ler o arquivo!");
            return "";
        }
    }		
}