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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposito extends JFrame {

	private JPanel contentPane;
	private JTextField numeroField;
	private JTextField valorDeposito;

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
					Deposito frame = new Deposito();
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
	public Deposito() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDepsito = new JLabel("Dep\u00F3sito");
		lblDepsito.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero da Conta");
		
		JLabel lblNewLabel_1 = new JLabel("Valor do Dep\u00F3sito");
		
		numeroField = new JTextField();
		numeroField.setColumns(10);
		
		valorDeposito = new JTextField();
		valorDeposito.setColumns(10);
		
		JButton btnNewButton = new JButton("Depositar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = numeroField.getText();
				Double valor = Double.parseDouble(valorDeposito.getText());
				Conta contaEncontrada = agencia.buscarContaPorNumero(numero);
				if(contaEncontrada != null) {
					JOptionPane.showMessageDialog(null, contaEncontrada.depositar(valor));
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Conta inexistente");
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(181)
							.addComponent(lblDepsito))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(valorDeposito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(numeroField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(164)
							.addComponent(btnNewButton)))
					.addContainerGap(171, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDepsito, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(numeroField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(valorDeposito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addComponent(btnNewButton)
					.addContainerGap(76, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
