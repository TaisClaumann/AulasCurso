package br.com.devti.gestaousuario.core.bo;

import br.com.devti.gestaousuario.core.dao.GrupoUsuarioDAO;
import br.com.devti.gestaousuario.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class GrupoUsuarioBO {
	
	public String salvarGrupoUsuario(GrupoUsuarioEntity grupoUsuario) throws NegocioException {
		System.out.println("Camada BO, processando informa√ß√µes");
		
		if(grupoUsuario == null) {
			throw new NegocioException("O grupo usu·rio n„o pode ser nulo");
		} 
		if(grupoUsuario.getNomeGrupo().equals("")) {
			throw new NegocioException("O nome do grupo usu·rio precisa ser preenchido");
		}
		
		GrupoUsuarioDAO gpDAO = new GrupoUsuarioDAO();
		return gpDAO.salvarGrupoUsuario(grupoUsuario);
	}

}
