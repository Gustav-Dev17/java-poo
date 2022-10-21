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
	
	public String getNome() { //m�toto get para o nome
		return nome;
	}
	public void setNome(String nome) { //m�toto set para o nome
		this.nome = nome;
	}
	public String getMatricula() { //m�toto get para a matr�cula
		return matricula;
	}
	public void setMatricula(String matricula) { //m�toto set para a matr�cula
		this.matricula = matricula;
	}
	public String getCodTurma() { //m�toto get para a turma
		return codTurma;
	}
	public void setCodTurma(String codTurma) { //m�toto set para a turma
		this.codTurma = codTurma;
	}
	
	public String getconsultPorTurma() { //m�toto get para buscar pela matr�cula na interface consulta
		return consultPorTurma;
	}
	
	public void setconsultPorTurma(String consultPorTurma) { //m�toto set para buscar pela matr�cula na interface consulta
		this.consultPorTurma = consultPorTurma;
	} 	
	
	public String salvarAluno() { //m�todo criador do arquivo.txt que armazenar� os dados
		
		try {
			FileWriter fw = new FileWriter("alunos.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Aluno: "+this.nome+"; Matr�cula: "+this.matricula+"; C�digo da Turma: "+this.codTurma);
			pw.println();
	        pw.flush();
	        pw.close();
	        fw.close();
			
		} catch (IOException e) {
			Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return "Aluno cadastrado!";
	}
		
	public static String listarAlunos() { //m�todo que listar� os alunos a partir da InterfaceConsulta
	
		 Path caminho = Paths.get("alunos.txt");
	        try {
	            byte[] texto = Files.readAllBytes(caminho);
	            String leitura = new String(texto);
	            
	            
	            JOptionPane.showMessageDialog(null, leitura.split(";\\s"), "Alunos cadastrados", JOptionPane.PLAIN_MESSAGE);
	            return "";
	        } catch (IOException e) {
            	JOptionPane.showMessageDialog(null,"Ainda n�o h� dados!");
                return "";
	        }
	}
		

    public String consultarPorTurma(){ //m�todo que consultar� os alunos ao digitar uma matr�cula
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
                   String matr�cula = separar[1];

                   aluno += nome + "\n" + matr�cula + "\n\n";

                   teste = true;
                }
                linha = br.readLine();                 
            }
            if (teste == false){
                    JOptionPane.showMessageDialog(null, "N�o h� alunos cadastrados nessa turma", "Erro", JOptionPane.PLAIN_MESSAGE);
            }
            if(teste == true) JOptionPane.showMessageDialog(null, aluno, ("Alunos na turma "+consultPorTurma), JOptionPane.PLAIN_MESSAGE);
            br.close();
            fr.close();
            return "";
        } catch (FileNotFoundException e) {
        	JOptionPane.showMessageDialog(null,"Ainda n�o h� turmas!");
        	return "";
        }catch (IOException e) {
        	JOptionPane.showMessageDialog(null,"Erro: N�o foi poss�vel ler o arquivo!");
            return "";
        }
    }		
}