package br.com.weddingdresses.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.weddingdresses.model.Pessoa;


@Repository
public class PessoaDAO implements IPessoaDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void salvar(Pessoa pessoa) {
		String query = "insert into pessoa(nome,cpf,email,telefone,recebe_informacao,endereco_id) values(?,?,?,?,?)";
		jdbcTemplate.update(query,new Object[]{pessoa.getNome(),pessoa.getCpf(),pessoa.getEmail(),
				pessoa.getTelefone(),pessoa.isRecebeInformacao(),pessoa.getEndereco().getId()});
	
	}
	
}
