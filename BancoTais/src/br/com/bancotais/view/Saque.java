package br.com.bancotais.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.bancotais.core.Agencia;
import br.com.bancotais.core.Conta;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saque extends JFrame {

	private JPanel contentPane;
	private JTextField numeroField;
	private JTextField valorSaque;

	private Agencia agencia;
	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saque frame = new Saque();
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
	public Saque() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSaque = new JLabel("Saque");
		lblSaque.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero da Conta");
		
		JLabel lblNewLabel_1 = new JLabel("Valor do Saque");
		
		numeroField = new JTextField();
		numeroField.setColumns(10);
		
		valorSaque = new JTextField();
		valorSaque.setColumns(10);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = numeroField.getText();
				Double valor = Double.parseDouble(valorSaque.getText());
				Conta contaEncontrada = agencia.buscarContaPorNumero(numero);
				if(contaEncontrada != null) {
					JOptionPane.showMessageDialog(null, contaEncontrada.sacar(valor));
				} else {
					JOptionPane.showMessageDialog(null, "conta não encontrada!");
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(181)
								.addComponent(lblSaque, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(45)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(valorSaque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
										.addGap(18)
										.addComponent(numeroField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(165)
							.addComponent(btnSacar, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(177, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(lblSaque, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(numeroField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(valorSaque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(btnSacar)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
