package br.com.devti.gestaousuario.view.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.devti.gestaousuario.core.entity.RecursoEntity;
import br.com.devti.gestaousuario.core.service.RecursoService;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaCadastroRecurso extends JFrame {

	private JPanel contentPane;
	private JTextField nomeRecurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroRecurso frame = new TelaCadastroRecurso();
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
	public TelaCadastroRecurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroRecurso = new JLabel("Cadastro Recurso");
		
		JLabel lblNomeRecurso = new JLabel("Nome Recurso:");
		
		nomeRecurso = new JTextField();
		nomeRecurso.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nomeRecurso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Nome do Recurso não poder ser vazio");
				} else {
					
					RecursoEntity re = new RecursoEntity();
					re.setNomeRecurso(nomeRecurso.getText());
					re.setCaminhoTela(nomeRecurso.getText());
					
					try {
						String msg = new RecursoService().salvarRecurso(re);
						nomeRecurso.setText("");
						JOptionPane.showMessageDialog(null, msg);
					} catch (NegocioException e3) {
						JOptionPane.showMessageDialog(null, e3.getMensagemDeErro(), "Erro", JOptionPane.ERROR_MESSAGE);
						
					}
				}
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(172)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addComponent(lblNomeRecurso, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCadastroRecurso, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addComponent(nomeRecurso, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(88, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCadastroRecurso)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNomeRecurso))
						.addComponent(nomeRecurso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(75)
					.addComponent(btnNewButton)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
