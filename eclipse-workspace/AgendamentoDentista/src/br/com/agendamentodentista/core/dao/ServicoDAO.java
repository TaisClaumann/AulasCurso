package br.com.agendamentodentista.core.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.agendamentodentista.core.dao.connection.ConexaoMySQL;
import br.com.agendamentodentista.core.entity.PacienteEntity;
import br.com.agendamentodentista.core.entity.ServicoEntity;

public class ServicoDAO {
	
	public String salvarServico(ServicoEntity servico) {
		
		String sql = "INSERT INTO SERVICO (PRECO_SERV, DESCRICAO_SERV) VALUES (?,?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setDouble(1, servico.getPreco());
			ps.setString(2, servico.getDescricao());
			
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Serviço cadastrado com sucesso no banco de dados";
	}


}
