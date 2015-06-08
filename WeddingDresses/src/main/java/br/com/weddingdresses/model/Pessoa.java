package br.com.weddingdresses.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Pessoa {
		private Integer id;
		@NotNull
		@Size(min=5)
		private String nome;
		@NotNull
		@Size(min=11,max=11)
		private String cpf;
		@NotNull
		@Pattern(regexp="^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$")
		private String email;
		@Size(min=9,max=9)
		private String telefone;
		@Size(min=9, max=9)
		private String celular;
		@NotNull
		@Valid
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


		public String getCelular() {
			return celular;
		}


		public void setCelular(String celular) {
			this.celular = celular;
		}
		
		
	
}
