package br.com.devti.gestaousuario.core.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.devti.gestaousuario.core.dao.connection.ConexaoMySQL;
import br.com.devti.gestaousuario.core.entity.RecursoEntity;
import br.com.devti.gestaousuario.core.entity.UsuarioEntity;
import br.com.devti.gestaousuario.core.util.exception.NegocioException;

public class RecursoDAO {
	
	public String salvarRecurso(RecursoEntity recurso) throws NegocioException{
		
 		String sql = "INSERT INTO RECURSO (NOME_RECURSO, CAMINHO_TELA) VALUES (?,?)";
 		
 		PreparedStatement ps = null;
 		
 		try {
		    ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, recurso.getNomeRecurso());
			ps.setString(2, recurso.getCaminhoTela());
			
			ps.execute();
			
			
		} catch (SQLException e) {	
//			e.printStackTrace();
			throw new NegocioException("Erro ao cadastrar recurso");
			
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	
		return "Recurso cadastrado com sucesso no banco de dados";
	}

}
