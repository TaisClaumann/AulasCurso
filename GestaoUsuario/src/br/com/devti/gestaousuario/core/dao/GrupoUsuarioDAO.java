package br.com.devti.gestaousuario.core.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.devti.gestaousuario.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaousuario.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaousuario.core.entity.UsuarioEntity;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class GrupoUsuarioDAO {
	
	public String salvarGrupoUsuario(GrupoUsuarioEntity grupoUsuario) throws NegocioException{
		
 		String sql = "INSERT INTO GRUPOUSUARIO (NOME_GRUPO) VALUES (?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, grupoUsuario.getNomeGrupo());
			
			ps.execute();
			
			
		} catch (SQLException e) {	
//			e.printStackTrace();
			throw new NegocioException("Erro ao cadastrar grupo usuario");
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
		return "Grupo Usuario cadastrado com sucesso no banco de dados";
	}

}
