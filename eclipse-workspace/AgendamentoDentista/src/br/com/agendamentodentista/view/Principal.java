package br.com.agendamentodentista.view;

import br.com.agendamentodentista.core.entity.DentistaEntity;
import br.com.agendamentodentista.core.entity.PacienteEntity;
import br.com.agendamentodentista.core.entity.ServicoEntity;
import br.com.agendamentodentista.core.service.DentistaService;
import br.com.agendamentodentista.core.service.PacienteService;
import br.com.agendamentodentista.core.service.ServicoService;

public class Principal {

	public static void main(String[] args) {
		
	//	PacienteEntity paciente = new PacienteEntity();
	//	paciente.setNome("Taís Claumann");
	//	paciente.setCpf("120.026.539.41");
	//	paciente.setRg("74.72.702");
	//	paciente.setDataNascimento("14/02/2003");
	//	paciente.setEndereco("Rua Pio XII");
	//	paciente.setTelefone("48996207110");
		
	//	DentistaEntity dentista = new DentistaEntity();
	//	dentista.setNome("Kauã Liberato");
	//	dentista.setCpf("412.432.539-41");
	//	dentista.setTelefone("96207110");
	//	dentista.setRg("14.69.754");
	//	dentista.setDataNascimento("05/12/2004");
	//	dentista.setEndereco("Dehon");
	//	dentista.setNumeroCarteiraTrabalho("123456789");]
		
		ServicoEntity servico = new ServicoEntity();
		servico.setDescricao("Reparo de Aparelho Dentário");
		servico.setPreco(80.00);
		
//		Estou chamando meu CORE/Backend para salvar o usuario em questao
		
//		PacienteService ps = new PacienteService();
//		DentistaService ds = new DentistaService();
		ServicoService ss = new ServicoService();
		
		try {
	//		System.out.println(ps.salvarPaciente(paciente));
	//		System.out.println(ds.salvarDentista(dentista));
			System.out.println(ss.salvarServico(servico));
			
		} catch (Exception e) {
			
		}

	}

}
