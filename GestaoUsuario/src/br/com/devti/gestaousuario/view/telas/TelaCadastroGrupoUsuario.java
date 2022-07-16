package br.com.devti.gestaousuario.view.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.devti.gestaousuario.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaousuario.core.service.GrupoUsuarioService;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroGrupoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField nomeGrupoUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroGrupoUsuario frame = new TelaCadastroGrupoUsuario();
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
	public TelaCadastroGrupoUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Cadastro Grupo Usu\u00E1rio");
		
		JLabel lblNomeGrupoUsurio = new JLabel("Nome Grupo Usu\u00E1rio:");
		
		nomeGrupoUsuario = new JTextField();
		nomeGrupoUsuario.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nomeGrupoUsuario.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Nome do Grupo Usuário não poder ser vazio");
				} else {
					
					GrupoUsuarioEntity gue = new GrupoUsuarioEntity();
					gue.setNomeGrupo(nomeGrupoUsuario.getText());
					
					try {
						String msg = new GrupoUsuarioService().salvarGrupoUsuario(gue);
						nomeGrupoUsuario.setText("");
						JOptionPane.showMessageDialog(null, msg);
					} catch (NegocioException e2) {
						JOptionPane.showMessageDialog(null, e2.getMensagemDeErro(), "Erro", JOptionPane.ERROR_MESSAGE);
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
							.addGap(147)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(lblNomeGrupoUsurio, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(nomeGrupoUsuario, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(95, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(184, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(177))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeGrupoUsurio)
						.addComponent(nomeGrupoUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(72)
					.addComponent(btnNewButton)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
