package br.com.weddingdresses.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.weddingdresses.model.Endereco;

@Repository
public class EnderecoDAO implements IEnderecoDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void salvar(Endereco endereco) {
		String sql = "insert into endereco(rua,bairro,cep,complemento,estado,numero) values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql,new Object[]{endereco.getRua(),endereco.getBairro(),
				endereco.getCep(),endereco.getComplemento(),endereco.getEstado(),endereco.getNumero()});
	}

}
