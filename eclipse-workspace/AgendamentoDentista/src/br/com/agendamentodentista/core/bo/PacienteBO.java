package br.com.agendamentodentista.core.bo;

import br.com.agendamentodentista.core.dao.PacienteDAO;
import br.com.agendamentodentista.core.entity.PacienteEntity;

public class PacienteBO { //fazer verificações
	
	public String salvarPaciente(PacienteEntity paciente) {
		System.out.println("Entrando no backend, camada BO...");
		
		PacienteDAO pDAO = new PacienteDAO();
		return pDAO.salvarPaciente(paciente);
	}

}
