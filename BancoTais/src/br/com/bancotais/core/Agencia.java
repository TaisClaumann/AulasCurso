package br.com.bancotais.core;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private List<Conta>contas = new ArrayList<>();
	
	public Conta buscarContaPorNumero(String numeroConta) {
		for (Conta conta : contas) {
			if(numeroConta.equals(conta.getNumeroConta())) {
				return conta;
			}
		}
		
		return null; 
	}
	

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
