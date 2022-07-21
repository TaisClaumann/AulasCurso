package br.com.agendamentodentista.core.bo;

import br.com.agendamentodentista.core.dao.ServicoDAO;
import br.com.agendamentodentista.core.entity.ServicoEntity;

public class ServicoBO {
	
	public String salvarServico(ServicoEntity servico) {
		System.out.println("Entrando no backend, camada BO ...");
		
		ServicoDAO sDAO = new ServicoDAO();
		return sDAO.salvarServico(servico);
	}

}
