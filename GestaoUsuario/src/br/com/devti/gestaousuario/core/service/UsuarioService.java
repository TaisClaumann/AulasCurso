package br.com.devti.gestaousuario.core.service;

import java.util.List;

import br.com.devti.gestaousuario.core.bo.UsuarioBO;
import br.com.devti.gestaousuario.core.entity.UsuarioEntity;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class UsuarioService {

	public String salvarUsuario(UsuarioEntity usuario) throws NegocioException {
		System.out.println("Entrando no backend, camada service...");
	    UsuarioBO bo = new UsuarioBO();
	    return bo.salvarUsuario(usuario);
	}
	
	
	
}
