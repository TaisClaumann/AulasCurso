package br.com.agendamentodentista.core.bo;

import br.com.agendamentodentista.core.dao.DentistaDAO;
import br.com.agendamentodentista.core.entity.DentistaEntity;

public class DentistaBO { // fazer verificações

	public String salvarDentista(DentistaEntity dentista) {
		System.out.println("Entrando no backend, camada BO...");
		
		DentistaDAO dDAO = new DentistaDAO();
		return dDAO.salvarDentista(dentista);
	}
}
