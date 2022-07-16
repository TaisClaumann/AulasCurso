package br.com.devti.gestaousuario.core.bo;

import java.util.List;

import br.com.devti.gestaousuario.core.dao.UsuarioDAO;
import br.com.devti.gestaousuario.core.entity.UsuarioEntity;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class UsuarioBO {

	public String salvarUsuario(UsuarioEntity usuario) throws NegocioException {
		System.out.println("Camada BO, processando informações");
		
		if(usuario == null) {
			throw new NegocioException("O usuario n�o pode ser nulo");
		} 
		if(usuario.getNome().equals("")) {
			throw new NegocioException("O nome do usuário precisa ser preenchido");
		}
		
		if(!usuario.getEmail().contains("@")) {
			throw new NegocioException("O email está no formato inválido, favor verificar!");
		}
		//TODO Poderia criptografar a senha
		//TODO Poderia validar o restante das informações
		
		
		UsuarioDAO udao = new UsuarioDAO();		
		return udao.salvarUsuario(usuario);
	}
	
	
}
