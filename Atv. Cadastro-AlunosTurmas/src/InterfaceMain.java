import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InterfaceMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel AppMainPanel;

	public static void main(String[] args) { //método main (principal), que roda a aplicação
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceMain frame = new InterfaceMain();
					frame.setTitle("Sistema da Going to Knowledge School"); //título da aplicação
					frame.setVisible(true); 
					frame.setResizable(false); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public InterfaceMain() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 328);
		AppMainPanel = new JPanel();
		AppMainPanel.setBackground(new Color(240, 248, 255));
		AppMainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AppMainPanel);
		AppMainPanel.setLayout(null);
		
		JPanel AppDesignPanel = new JPanel();
		AppDesignPanel.setBackground(new Color(128, 0, 128));
		AppDesignPanel.setBounds(0, 205, 520, 287);
		AppMainPanel.add(AppDesignPanel);
		AppDesignPanel.setLayout(null);
		
		JLabel LabelBrand = new JLabel("Going to Knowledge School");
		LabelBrand.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBrand.setForeground(new Color(240, 248, 255));
		LabelBrand.setFont(new Font("Tahoma", Font.BOLD, 18));
		LabelBrand.setBounds(98, 26, 320, 25);
		AppDesignPanel.add(LabelBrand);
		
		JLabel LabelSystem = new JLabel("School System \u00AE");
		LabelSystem.setHorizontalAlignment(SwingConstants.CENTER);
		LabelSystem.setForeground(new Color(240, 248, 255));
		LabelSystem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LabelSystem.setBounds(98, 57, 320, 14);
		AppDesignPanel.add(LabelSystem);
		
		JLabel LabelVersion = new JLabel("vers\u00E3o 1.1.2");
		LabelVersion.setHorizontalAlignment(SwingConstants.LEFT);
		LabelVersion.setForeground(Color.WHITE);
		LabelVersion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		LabelVersion.setBounds(10, 74, 320, 14);
		AppDesignPanel.add(LabelVersion);
		
		Button buttonCad = new Button("Cadastrar"); 
		buttonCad.setActionCommand("Cadastrar");
		buttonCad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonCad.addActionListener(new ActionListener() {	
			
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							InterfaceCadastro frame = new InterfaceCadastro();
							frame.setTitle("Sistema de Cadastro da Going to Knowledge School");
							frame.setVisible(true);
							frame.setResizable(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
						}
					});
				}
			
		});
		buttonCad.setForeground(Color.WHITE);
		buttonCad.setBackground(new Color(204, 0, 0));
		buttonCad.setBounds(171, 86, 175, 34);
		AppMainPanel.add(buttonCad);
		
		JLabel LabelConsult = new JLabel("  Selecione uma op\u00E7\u00E3o");
		LabelConsult.setHorizontalAlignment(SwingConstants.CENTER);
		LabelConsult.setFont(new Font("Tahoma", Font.BOLD, 15));
		LabelConsult.setBounds(0, 36, 509, 24);
		AppMainPanel.add(LabelConsult);
		
		Button buttonCons = new Button("Consultar");
		buttonCons.setForeground(Color.WHITE);
		buttonCons.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonCons.addActionListener(new ActionListener() {	
			
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								InterfaceConsulta frame = new InterfaceConsulta();
								frame.setTitle("Sistema de Consulta da Going to Knowledge School");
								frame.setVisible(true);
								frame.setResizable(false);
							} catch (Exception e) {
								e.printStackTrace();
							}
							
						
						}
						
					});
			}
			
		});	
		buttonCons.setBackground(new Color(204, 0, 0));
		buttonCons.setActionCommand("Consultar");
		buttonCons.setBounds(171, 136, 175, 34);
		AppMainPanel.add(buttonCons);
		
	}
}