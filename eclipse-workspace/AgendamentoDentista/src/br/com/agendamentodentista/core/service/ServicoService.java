package br.com.agendamentodentista.core.service;

import br.com.agendamentodentista.core.bo.PacienteBO;
import br.com.agendamentodentista.core.bo.ServicoBO;
import br.com.agendamentodentista.core.entity.PacienteEntity;
import br.com.agendamentodentista.core.entity.ServicoEntity;

public class ServicoService {

	public String salvarServico(ServicoEntity servico) {
		System.out.println("Entrando no backend, camada service...");
		
		ServicoBO sBO = new ServicoBO();
		return sBO.salvarServico(servico);
	}
	
}
