package br.com.agendamentodentista.core.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.agendamentodentista.core.bo.PacienteBO;
import br.com.agendamentodentista.core.dao.connection.ConexaoMySQL;
import br.com.agendamentodentista.core.entity.PacienteEntity;

public class PacienteDAO {
	
		public String salvarPaciente(PacienteEntity paciente) {
			
			String sql = "INSERT INTO PACIENTE (NOME_PACIE, CPF_PACIE, RG_PACIE, DATANASCIMENTO_PACIE, ENDERECO_PACIE, TELEFONE_PACIE) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement ps = null;
			
			try {
				ps = ConexaoMySQL.getConexao().prepareStatement(sql);
				ps.setString(1, paciente.getNome());
				ps.setString(2, paciente.getCpf());
				ps.setString(3, paciente.getRg());
				ps.setString(4, paciente.getDataNascimento());
				ps.setString(5, paciente.getEndereco());
				ps.setString(6, paciente.getTelefone());
				
				ps.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return "Paciente cadastrado com sucesso no banco de dados";
		}
	

}
