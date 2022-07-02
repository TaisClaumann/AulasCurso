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
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saldo extends JFrame {

	private JPanel contentPane;
	private JTextField numeroField;

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
					Saldo frame = new Saldo();
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
	public Saldo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero da Conta");
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = numeroField.getText();
				Conta contaEncontrada = agencia.buscarContaPorNumero(numero);
				if(contaEncontrada != null) {
					JOptionPane.showMessageDialog(null, "Saldo da conta é " + contaEncontrada.getSaldo());
				} else { 
					JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma conta!");
				}
			}
		});
		
		numeroField = new JTextField();
		numeroField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(192, Short.MAX_VALUE)
					.addComponent(lblSaldo)
					.addGap(188))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(76)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnConsultar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(numeroField, Alignment.TRAILING))
					.addGap(168))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblSaldo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(numeroField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(43)
					.addComponent(btnConsultar)
					.addGap(103))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
