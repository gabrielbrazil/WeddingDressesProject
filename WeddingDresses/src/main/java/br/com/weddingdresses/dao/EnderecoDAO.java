package br.com.weddingdresses.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;




import com.mysql.jdbc.Statement;

import br.com.weddingdresses.model.Endereco;

@Repository
public class EnderecoDAO implements IEnderecoDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void salvar(final Endereco endereco) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		final String sql = "insert into endereco(rua,bairro,cep,complemento,estado,numero,uf) values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection)
					throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				ps.setString(1,endereco.getRua());
				ps.setString(2,endereco.getBairro());
				ps.setString(3,endereco.getCep());
				ps.setString(4,endereco.getComplemento());
				ps.setString(5,endereco.getEstado());
				ps.setString(6,endereco.getNumero());
				ps.setString(7,endereco.getUf());
				return ps;
			}
		},keyHolder);
		
		endereco.setId(keyHolder.getKey().intValue());
		
	}
	
	

}
