package br.com.bancotais.core;

import javax.swing.JOptionPane;

public class Conta {

	private String numeroConta;
	private double saldo;
	
	public void cadastrarConta() {
		numeroConta = JOptionPane.showInputDialog("Digite o n�mero da conta");
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));
		setNumeroConta(JOptionPane.showInputDialog("Digite o n�mero da conta"));
		
	}
	
	public String depositar(Double valorDepositado) {
		if(valorDepositado > 0) {
			setSaldo(valorDepositado + saldo);
			return "O valor foi depositado com sucesso";
		} else {
			return "O valor depositado n�o pode ser negativo, deposito n�o efetuado";
		}
	}
	
	public String sacar(Double valorSacado) {
		if(valorSacado > 0 && valorSacado <= saldo) {
			setSaldo(valorSacado - saldo);
			return "O valor foi sacado com sucesso";
		} else {
			return "O valor sacado n�o pode ser negativo, saque n�o efetuado";
		}
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
