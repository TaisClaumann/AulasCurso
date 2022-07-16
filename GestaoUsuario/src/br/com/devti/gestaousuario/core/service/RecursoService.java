package br.com.devti.gestaousuario.core.service;

import br.com.devti.gestaousuario.core.bo.RecursoBO;
import br.com.devti.gestaousuario.core.bo.UsuarioBO;
import br.com.devti.gestaousuario.core.entity.RecursoEntity;
import br.com.devti.gestaousuario.core.entity.UsuarioEntity;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class RecursoService {
	
	public String salvarRecurso(RecursoEntity recurso) throws NegocioException {
		System.out.println("Entrando no backend, camada service...");
	    RecursoBO bo = new RecursoBO();
	    return bo.salvarRecurso(recurso);
	}

}
