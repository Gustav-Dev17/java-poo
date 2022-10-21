
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Turmas {
	
	public String codTurma;
	public String curso;

	
	public String getCodTurma() { //métoto get para a turma
		return codTurma;
	}
	public void setCodTurma(String codTurma) { //métoto set para a turma
		this.codTurma = codTurma;
	}
	public String getCurso() { //métoto get para o curso
		return curso;
	}
	public void setCurso(String curso) { //métoto set para o curso
		this.curso = curso;
	}
	
	public String salvarTurma() { //método criador e manipulador do arquivo.txt que armazenará os dados
		
		try {
			FileWriter fw = new FileWriter("turmas.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Código da Turma: "+this.codTurma+"; Curso: "+this.curso);		
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			Logger.getLogger(Turmas.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return "Turma cadastrada!";
	}
	
	public static String listarTurmas() { //método que listará os alunos a partir da InterfaceConsulta
		
		 Path caminho = Paths.get("turmas.txt");
	        try {
	            byte[] texto = Files.readAllBytes(caminho);
	            String leitura = new String(texto);
	            
	            
	            JOptionPane.showMessageDialog(null, leitura.split(";\\s"), "Turmas cadastradas", JOptionPane.PLAIN_MESSAGE);
	            return "";
	        } catch (IOException e) {
           	JOptionPane.showMessageDialog(null,"Ainda não há dados!");
               return "";
	        }
	}
}	
