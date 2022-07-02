import br.com.bancotais.core.Agencia;
import br.com.bancotais.core.Conta;
import br.com.bancotais.view.TelaInicio;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumeroConta("123");
		Conta conta2 = new Conta();
		conta2.setNumeroConta("124");
		Conta conta3 = new Conta();
		conta3.setNumeroConta("125");
		
		Agencia agencia = new Agencia();
		agencia.getContas().add(conta);
		agencia.getContas().add(conta2);
		agencia.getContas().add(conta3);
		
		TelaInicio telaI = new TelaInicio();
		telaI.setVisible(true);
		telaI.setAgencia(agencia);
		
	}

}
