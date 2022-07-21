package br.com.agendamentodentista.core.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.agendamentodentista.core.dao.connection.ConexaoMySQL;
import br.com.agendamentodentista.core.entity.DentistaEntity;

public class DentistaDAO {
	
	public String salvarDentista(DentistaEntity dentista) {
		
		String sql = "INSERT INTO DENTISTA (NOME_DENT, CPF_DENT, TELEFONE_DENT, RG_DENT, DATANASCIMENTO_DENT, ENDERECO_DENT, NUMEROCARTEIRATRABALHO_DENT) VALUES (?,?,?,?,?,?,?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = ConexaoMySQL.getConexao().prepareStatement(sql);
			ps.setString(1, dentista.getNome());
			ps.setString(2, dentista.getCpf());
			ps.setString(3, dentista.getTelefone());
			ps.setString(4, dentista.getRg());
			ps.setString(5, dentista.getDataNascimento());
			ps.setString(6, dentista.getEndereco());
			ps.setString(7, dentista.getNumeroCarteiraTrabalho());
			
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Dentista cadastrado com sucesso no banco de dados";
	}

}
