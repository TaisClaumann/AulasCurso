package br.com.bancotais.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.bancotais.core.Agencia;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaInicio extends JFrame {

	private JPanel contentPane;

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
					TelaInicio frame = new TelaInicio();
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
	public TelaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Banco Aleat\u00F3rio");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnNewButton = new JButton("DEP\u00D3SITO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deposito deposito = new Deposito();
				deposito.setVisible(true);
				deposito.setAgencia(agencia);
			}
		});
		
		JButton btnSaque = new JButton("SAQUE");
		btnSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Saque saque = new Saque();
				saque.setVisible(true);
				saque.setAgencia(agencia);
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("SALDO");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Saldo saldo = new Saldo();
				saldo.setVisible(true);
				saldo.setAgencia(agencia);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(127)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSaque, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(152)
							.addComponent(lblNewLabel)))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnSaque)
					.addGap(18)
					.addComponent(btnNewButton_1_1)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
