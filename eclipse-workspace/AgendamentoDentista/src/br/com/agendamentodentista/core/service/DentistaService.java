package br.com.agendamentodentista.core.service;

import br.com.agendamentodentista.core.bo.DentistaBO;
import br.com.agendamentodentista.core.bo.PacienteBO;
import br.com.agendamentodentista.core.entity.DentistaEntity;

public class DentistaService {
	
	public String salvarDentista(DentistaEntity dentista) {
		System.out.println("Entrando no backend, camada service...");
		
		DentistaBO dBO = new DentistaBO();
		return dBO.salvarDentista(dentista);
	}

}
