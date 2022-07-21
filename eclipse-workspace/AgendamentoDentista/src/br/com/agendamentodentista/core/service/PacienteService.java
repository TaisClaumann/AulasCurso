package br.com.agendamentodentista.core.service;

import br.com.agendamentodentista.core.bo.PacienteBO;
import br.com.agendamentodentista.core.entity.PacienteEntity;

public class PacienteService {
	
	public String salvarPaciente(PacienteEntity paciente) {
		System.out.println("Entrando no backend, camada service...");
		
		PacienteBO pBO = new PacienteBO();
		return pBO.salvarPaciente(paciente);
	}

}
