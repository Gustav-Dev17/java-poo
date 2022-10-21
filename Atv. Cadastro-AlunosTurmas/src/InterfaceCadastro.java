import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InterfaceCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel AppMainPanel;
	private JTextField txtNome;
	private JTextField txtMatrícula;
	private JTextField txtCódTurmaForAluno;
	private JTextField txtCódTurmaForTurma;
	private JTextField txtCurso;

	/**
	 * Create the frame.
	 */
	
	public InterfaceCadastro() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 588);
		AppMainPanel = new JPanel();
		AppMainPanel.setBackground(Color.WHITE);
		AppMainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AppMainPanel);
		AppMainPanel.setLayout(null);
		
		JPanel AppDesignPanel = new JPanel();
		AppDesignPanel.setBackground(new Color(0, 0, 102));
		AppDesignPanel.setBounds(0, 0, 340, 574);
		AppMainPanel.add(AppDesignPanel);
		AppDesignPanel.setLayout(null);
		
		JLabel LabelBrand = new JLabel("Going to Knowledge School");
		LabelBrand.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBrand.setFont(new Font("Tahoma", Font.BOLD, 15));
		LabelBrand.setForeground(new Color(240, 248, 255));
		LabelBrand.setBounds(10, 384, 320, 25);
		AppDesignPanel.add(LabelBrand);
		
		JLabel LabelImage = new JLabel("");
		LabelImage.setBounds(-29, -12, 400, 242);
		LabelImage.setVerticalAlignment(SwingConstants.TOP);
		LabelImage.setIcon(new ImageIcon(InterfaceCadastro.class.getResource("/imagens/students and books.jpg")));
		AppDesignPanel.add(LabelImage);
		
		JLabel LabelSystem = new JLabel("Registration System \u00AE");
		LabelSystem.setHorizontalAlignment(SwingConstants.CENTER);
		LabelSystem.setForeground(new Color(240, 248, 255));
		LabelSystem.setBounds(10, 410, 320, 14);
		AppDesignPanel.add(LabelSystem);
		
		JLabel LabelVersion = new JLabel("vers\u00E3o 1.1.2");
		LabelVersion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		LabelVersion.setBounds(10, 537, 320, 14);
		AppDesignPanel.add(LabelVersion);
		LabelVersion.setHorizontalAlignment(SwingConstants.LEFT);
		LabelVersion.setForeground(Color.WHITE);
		
		Button buttonCadAluno = new Button("Cadastrar"); //parte do código que atribui ação ao botão de cadastro para aluno
		buttonCadAluno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonCadAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Alunos alunos = new Alunos();
				
				if (txtNome.getText().equals("")||txtMatrícula.getText().equals("")||txtCódTurmaForAluno.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Um ou mais dados para aluno não foram inseridos!");	
				}
				else {
				alunos.setNome(txtNome.getText());
				alunos.setMatricula(txtMatrícula.getText());
				alunos.setCodTurma(txtCódTurmaForAluno.getText());
				JOptionPane.showMessageDialog(null, alunos.salvarAluno());
				}
				
				txtNome.setText("");
				txtMatrícula.setText("");
				txtCódTurmaForAluno.setText("");	
			}
			
		});
		buttonCadAluno.setForeground(Color.WHITE);
		buttonCadAluno.setBackground(new Color(204, 0, 0));
		buttonCadAluno.setBounds(437, 264, 170, 34);
		AppMainPanel.add(buttonCadAluno);
		
		txtNome = new JTextField();
		txtNome.setBounds(401, 71, 240, 32);
		AppMainPanel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(402, 46, 100, 14);
		AppMainPanel.add(lblNewLabel);
		
		txtMatrícula = new JTextField();
		txtMatrícula.setColumns(10);
		txtMatrícula.setBounds(401, 141, 240, 32);
		AppMainPanel.add(txtMatrícula);
		
		JLabel lblMatrícula = new JLabel("Matr\u00EDcula");
		lblMatrícula.setBounds(402, 116, 100, 14);
		AppMainPanel.add(lblMatrícula);
		
		txtCódTurmaForAluno = new JTextField();
		txtCódTurmaForAluno.setColumns(10);
		txtCódTurmaForAluno.setBounds(401, 211, 240, 32);
		AppMainPanel.add(txtCódTurmaForAluno);
		
		JLabel lblCódTurmaForAluno = new JLabel("C\u00F3d. Turma");
		lblCódTurmaForAluno.setBounds(402, 186, 100, 14);
		AppMainPanel.add(lblCódTurmaForAluno);
		
		JLabel LabelCadAluno = new JLabel("Cadastro de Aluno");
		LabelCadAluno.setHorizontalAlignment(SwingConstants.LEFT);
		LabelCadAluno.setFont(new Font("Tahoma", Font.BOLD, 15));
		LabelCadAluno.setBounds(401, 11, 240, 24);
		AppMainPanel.add(LabelCadAluno);
		
		JLabel LabelCadTurma = new JLabel("Cadastro de Turma");
		LabelCadTurma.setHorizontalAlignment(SwingConstants.LEFT);
		LabelCadTurma.setFont(new Font("Tahoma", Font.BOLD, 15));
		LabelCadTurma.setBounds(401, 320, 240, 24);
		AppMainPanel.add(LabelCadTurma);
		
		JLabel lblCdTurmaForTurma = new JLabel("C\u00F3d. Turma");
		lblCdTurmaForTurma.setBounds(402, 355, 100, 14);
		AppMainPanel.add(lblCdTurmaForTurma);
		
		txtCódTurmaForTurma = new JTextField();
		txtCódTurmaForTurma.setColumns(10);
		txtCódTurmaForTurma.setBounds(401, 380, 240, 32);
		AppMainPanel.add(txtCódTurmaForTurma);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(402, 425, 100, 14);
		AppMainPanel.add(lblCurso);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(401, 450, 240, 32);
		AppMainPanel.add(txtCurso);
		
		Button buttonCadTurma = new Button("Cadastrar"); //parte do código que atribui ação ao botão de cadastro para turma
		buttonCadTurma.setForeground(Color.WHITE);
		buttonCadTurma.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonCadTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Turmas turmas = new Turmas();
				
				if (txtCódTurmaForTurma.getText().equals("")||txtCurso.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Um ou mais dados para turma não foram inseridos!");
				}else {
				turmas.setCodTurma(txtCódTurmaForTurma.getText());
				turmas.setCurso(txtCurso.getText());
				JOptionPane.showMessageDialog(null, turmas.salvarTurma());
				}
		
				txtCódTurmaForTurma.setText("");
				txtCurso.setText("");
			}
			
		});
		buttonCadTurma.setBackground(new Color(204, 0, 0));
		buttonCadTurma.setBounds(437, 503, 170, 34);
		AppMainPanel.add(buttonCadTurma);
	}
}