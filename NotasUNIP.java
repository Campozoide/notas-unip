package NotasUNIP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotasUNIP extends JFrame {

	private JPanel contentPane;
	private JTextField txtPIM;
	private JTextField txtAVA;
	private JTextField txtPP;
	private JTextField txtMD;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasUNIP frame = new NotasUNIP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NotasUNIP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadoraDeMdia = new JLabel("Calculadora de M\u00E9dia da Disciplina\r\n");
		lblCalculadoraDeMdia.setBounds(5, 5, 324, 22);
		lblCalculadoraDeMdia.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeMdia.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblCalculadoraDeMdia);
		
		JLabel lblPIM = new JLabel("Nota do PIM");
		lblPIM.setBounds(13, 87, 78, 14);
		contentPane.add(lblPIM);
		
		JLabel lblAva = new JLabel("Nota do AVA");
		lblAva.setBounds(129, 87, 78, 14);
		contentPane.add(lblAva);
		
		JLabel lblPresencial = new JLabel("Prova Presencial");
		lblPresencial.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresencial.setBounds(227, 83, 102, 22);
		contentPane.add(lblPresencial);
		
		txtPIM = new JTextField();
		txtPIM.setBounds(5, 112, 86, 20);
		contentPane.add(txtPIM);
		txtPIM.setColumns(10);
		
		txtAVA = new JTextField();
		txtAVA.setBounds(121, 112, 86, 20);
		contentPane.add(txtAVA);
		txtAVA.setColumns(10);
		
		txtPP = new JTextField();
		txtPP.setBounds(238, 112, 86, 20);
		contentPane.add(txtPP);
		txtPP.setColumns(10);
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*Toda a execução do codigo é desencadeada pelo botão calcular.
				 * 
				 * Aqui consta a leitura dos textfields, aplicação da matemática.
				 * 
				 * E por ultimo a exibição dos resultados. 
				 */
				
				try { 
					
				
				double pim, ava, pp, at, md;
				String result;
				
				pim = Double.parseDouble( txtPIM.getText() );
				ava = Double.parseDouble( txtAVA.getText() );
				pp = Double.parseDouble( txtPP.getText() );
				
				at = ((pim * 9) + (ava * 1)) / 10;
				
				md = ((pp * 3) + (at * 1)) / 4;
				
				txtMD.setText(String.format("%.2f", md)); 
					
				
				if ( md >= 6 ) {
					
					result = "APROVADO !!.!!!";
				} 
				else 
				{
					result = "REPROVADO !!.!!!";
				}
				
				txtResult.setText(result);
				
				}
				catch(Exception e) {
					txtResult.setText("Entrada Inválida.");
				}
				
			}
		});
		btnCalculate.setBounds(65, 143, 184, 23);
		contentPane.add(btnCalculate);
		
		JLabel lblMD = new JLabel("M\u00E9dia da Disciplina");
		lblMD.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMD.setHorizontalAlignment(SwingConstants.CENTER);
		lblMD.setBounds(99, 217, 131, 14);
		contentPane.add(lblMD);
		
		txtMD = new JTextField();
		txtMD.setHorizontalAlignment(SwingConstants.CENTER);
		txtMD.setEditable(false);
		txtMD.setBounds(99, 252, 117, 20);
		contentPane.add(txtMD);
		txtMD.setColumns(10);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtResult.setEditable(false);
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setBounds(99, 289, 117, 20);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Botão Limpar insere uma string vazia nos 3 textfields.*/
				
				txtPIM.setText(" ");
				txtAVA.setText(" ");
				txtPP.setText(" ");
				txtMD.setText(" ");
				txtResult.setText(" ");
				
				
			}
		});
		btnLimpar.setBounds(65, 183, 184, 23);
		contentPane.add(btnLimpar);
	}
}
