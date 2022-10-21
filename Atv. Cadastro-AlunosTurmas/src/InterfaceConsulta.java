import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;

public class InterfaceConsulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel AppMainPanel;
	private JTextField textPesquisaForTurma;

	/**
	 * Create the frame.
	 */
	
	public InterfaceConsulta() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 432);
		AppMainPanel = new JPanel();
		AppMainPanel.setBackground(Color.WHITE);
		AppMainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AppMainPanel);
		AppMainPanel.setLayout(null);
		
		JPanel AppDesignPanel = new JPanel();
		AppDesignPanel.setBackground(new Color(0, 153, 153));
		AppDesignPanel.setBounds(0, 0, 340, 574);
		AppMainPanel.add(AppDesignPanel);
		AppDesignPanel.setLayout(null);
		
		JLabel LabelBrand = new JLabel("Going to Knowledge School");
		LabelBrand.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBrand.setFont(new Font("Tahoma", Font.BOLD, 15));
		LabelBrand.setForeground(new Color(240, 248, 255));
		LabelBrand.setBounds(10, 274, 320, 25);
		AppDesignPanel.add(LabelBrand);
		
		JLabel LabelImage = new JLabel("");
		LabelImage.setBounds(-26, -41, 400, 242);
		LabelImage.setVerticalAlignment(SwingConstants.TOP);
		LabelImage.setIcon(new ImageIcon(InterfaceConsulta.class.getResource("/imagens/looking for.png")));
		AppDesignPanel.add(LabelImage);
		
		JLabel LabelSystem = new JLabel("Search System \u00AE");
		LabelSystem.setHorizontalAlignment(SwingConstants.CENTER);
		LabelSystem.setForeground(new Color(240, 248, 255));
		LabelSystem.setBounds(10, 300, 320, 14);
		AppDesignPanel.add(LabelSystem);
		
		JLabel LabelVersion = new JLabel("vers\u00E3o 1.1.2");
		LabelVersion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		LabelVersion.setBounds(10, 381, 320, 14);
		AppDesignPanel.add(LabelVersion);
		LabelVersion.setHorizontalAlignment(SwingConstants.LEFT);
		LabelVersion.setForeground(Color.WHITE);
	
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {" ", " Lista de alunos", " Lista de turmas"}));
		comboBox.setToolTipText("Selecione a op\u00E7\u00E3o de consulta");
		comboBox.setBounds(401, 119, 240, 32);
		AppMainPanel.add(comboBox);				
		
		Button buttonConsList = new Button("Consultar Lista"); //parte do código que atribui ação ao botão de cadastro para aluno
		buttonConsList.setActionCommand("ConsultarLista");
		buttonConsList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonConsList.addActionListener(new ActionListener() {	
			
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				//comboBox.setSelectedIndex();
			switch(comboBox.getSelectedIndex()) {
				case 0:
					JOptionPane.showMessageDialog(null, "Selecione uma opção de busca ou tente pesquisar alunos inserindo uma turma!");
					break;
					
				case 1:
					Alunos.listarAlunos();
					break;
					
				case 2:
					Turmas.listarTurmas();
					break;
				}
			}
			
		});
		
		buttonConsList.setForeground(Color.WHITE);
		buttonConsList.setBackground(new Color(204, 0, 0));
		buttonConsList.setBounds(436, 174, 170, 34);
		AppMainPanel.add(buttonConsList);
		
		JLabel lblMétodo = new JLabel("Listas Gerais");
		lblMétodo.setBounds(401, 94, 240, 14);
		AppMainPanel.add(lblMétodo);
		
		JLabel LabelConsult = new JLabel("Consultar Listas");
		LabelConsult.setHorizontalAlignment(SwingConstants.LEFT);
		LabelConsult.setFont(new Font("Tahoma", Font.BOLD, 15));
		LabelConsult.setBounds(401, 45, 240, 24);
		AppMainPanel.add(LabelConsult);
		
		JLabel lblPesquisarAlunosPor = new JLabel("Pesquise alunos digitando a turma");
		lblPesquisarAlunosPor.setBounds(401, 227, 240, 14);
		AppMainPanel.add(lblPesquisarAlunosPor);
		
		Button buttonConsAlunoForTurma = new Button("Pesquisar Alunos");
		buttonConsAlunoForTurma.setForeground(Color.WHITE);
		buttonConsAlunoForTurma.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		buttonConsAlunoForTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Alunos alunos = new Alunos();
				
				if (textPesquisaForTurma.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Dados não foram inseridos!");	}
				else {
			        alunos.setconsultPorTurma(textPesquisaForTurma.getText());
			        alunos.consultarPorTurma();
					textPesquisaForTurma.setText("");	
				}
			}
			
		});
	
		buttonConsAlunoForTurma.setBackground(new Color(204, 0, 0));
		buttonConsAlunoForTurma.setActionCommand("ConsultarPorTurma");
		buttonConsAlunoForTurma.setBounds(436, 307, 170, 34);
		AppMainPanel.add(buttonConsAlunoForTurma);
		
		textPesquisaForTurma = new JTextField();
		textPesquisaForTurma.setBounds(401, 252, 240, 32);
		AppMainPanel.add(textPesquisaForTurma);
		textPesquisaForTurma.setColumns(10);
		
	}
}