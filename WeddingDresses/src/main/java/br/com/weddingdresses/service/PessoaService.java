package br.com.weddingdresses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.weddingdresses.dao.EnderecoDAO;
import br.com.weddingdresses.dao.PessoaDAO;
import br.com.weddingdresses.model.Pessoa;

@Service
public class PessoaService implements IPessoaService {
	
	@Autowired
	PessoaDAO pessoaDAO;
	@Autowired
	EnderecoDAO enderecoDAO;
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
	public void salvar(Pessoa pessoa) {
		enderecoDAO.salvar(pessoa.getEndereco());
		pessoaDAO.salvar(pessoa);
	}
	
	
}
