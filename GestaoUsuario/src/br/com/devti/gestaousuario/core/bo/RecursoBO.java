package br.com.devti.gestaousuario.core.bo;

import br.com.devti.gestaousuario.core.dao.RecursoDAO;
import br.com.devti.gestaousuario.core.entity.RecursoEntity;
import br.com.devti.gestaousuario.core.entity.UsuarioEntity;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class RecursoBO {
	
	public String salvarRecurso(RecursoEntity recurso) throws NegocioException {
		System.out.println("Camada BO, processando informações");
		
		if(recurso == null) {
			throw new NegocioException("O recurso n�o pode ser nulo");
		} 
		if(recurso.getNomeRecurso().equals("")) {
			throw new NegocioException("O nome do recurso precisa ser preenchido");
		}

		RecursoDAO rDAO = new RecursoDAO();
		return rDAO.salvarRecurso(recurso);
	}

}