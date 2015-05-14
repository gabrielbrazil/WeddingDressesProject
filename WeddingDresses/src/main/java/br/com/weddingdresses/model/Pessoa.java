package br.com.weddingdresses.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Pessoa {
		private Integer id;
		@NotNull
		@Size(min=5,message="O nome não pode ter menos de 5 caracteres!")
		private String nome;
		private String cpf;
		private String email;
		private String telefone;
		private boolean recebeInformacao;
		private Endereco endereco;
		
		
		public Pessoa() {}
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public boolean isRecebeInformacao() {
			return recebeInformacao;
		}

		public void setRecebeInformacao(boolean recebeInformacao) {
			this.recebeInformacao = recebeInformacao;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
	
}
