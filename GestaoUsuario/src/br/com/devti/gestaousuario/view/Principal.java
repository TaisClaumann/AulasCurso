package br.com.devti.gestaousuario.view;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.devti.gestaousuario.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaousuario.core.entity.RecursoEntity;
import br.com.devti.gestaousuario.core.entity.UsuarioEntity;
import br.com.devti.gestaousuario.core.service.GrupoUsuarioService;
import br.com.devti.gestaousuario.core.service.RecursoService;
import br.com.devti.gestaousuario.core.service.UsuarioService;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class Principal {

	public static void main(String[] args) {
		//Montando o objeto com as informações da tela
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setNome("Rogério");
		usuario.setLogin("rogerionj");
		usuario.setSenha("1234");
		usuario.setEmail("rogerionj@gmail.com");
//		Estou chamando meu CORE/Backend para salvar o usuario em questao
		UsuarioService us = new UsuarioService();
		
		GrupoUsuarioEntity grupoUsuario = new GrupoUsuarioEntity();
		grupoUsuario.setNomeGrupo("Administrador");
		GrupoUsuarioService gus = new GrupoUsuarioService();
		
		RecursoEntity recurso = new RecursoEntity();
		recurso.setNomeRecurso("Tela Inicial");
		recurso.setCaminhoTela("Tela Inicial");
		RecursoService rs = new RecursoService();
		
		
		try {
			System.out.println(us.salvarUsuario(usuario));
			System.out.println(gus.salvarGrupoUsuario(grupoUsuario));
			System.out.println(rs.salvarRecurso(recurso));
		}catch(NegocioException e) {
			JOptionPane.showMessageDialog(null, e.getMensagemDeErro());
		}
		
		

		
		
		
	}

}
