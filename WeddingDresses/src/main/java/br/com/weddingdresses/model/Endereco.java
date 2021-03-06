package br.com.weddingdresses.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.json.JSONException;
import org.json.JSONObject;

public class Endereco {
	private Integer id;
	@NotNull
	@Size(min=3,max=50)
	private String rua;
	@NotNull
	@Size(min=1,max=8)
	private String numero;
	@NotNull
	@Size(min=5,max=40)
	private String complemento;
	@NotNull
	@Size(min=8)
	private String cep;
	@NotNull
	private String estado;
	@NotNull
	private String bairro;
	@NotNull
	private String uf;
	
	
	
	
	public Endereco() {
	}
	
	
	public Map<String,String> getMapEstado(){
		Map<String,String> estados = new HashMap<String,String>();
		estados.put("AC", "Acre");
		estados.put("AL", "Alagoas");
		estados.put("AP", "Amap�");
		estados.put("AM", "Amazonas");
		estados.put("BA", "Bahia");
		estados.put("CE", "Cear�");
		estados.put("DF", "Distrito Federal");
		estados.put("ES", "Esp�rito Santo");
		estados.put("GO", "Goi�s");
		estados.put("MA", "Maranh�o");
		estados.put("MT", "Mato Grosso");
		estados.put("MS", "Mato Grosso do Sul");
		estados.put("MG", "Minas Gerais");
		estados.put("PA", "Par�");
		estados.put("PB", "Para�ba");
		estados.put("PR", "Paran�");
		estados.put("PE", "Pernambuco");
		estados.put("PI", "Piau�");
		estados.put("RJ", "Rio de janeiro");
		estados.put("RN", "Rio Grande do Norte");
		estados.put("RS", "Rio Grande do Sul");
		estados.put("RO", "Rond�nia");
		estados.put("RR", "Roraima");
		estados.put("SP", "S�o Paulo");
		estados.put("SC", "Santa Catarina");
		estados.put("SE", "Sergipe");
		estados.put("TO", "Tocantins");
		return estados;
	}
	
	public JSONObject getByCep(String cep) throws MalformedURLException,IOException,JSONException{
		final String CEP_BASE_URL = "http://viacep.com.br/ws/"+cep+"/json/";
		HttpURLConnection urlConnection;
		BufferedReader reader;
		URL url = new URL(CEP_BASE_URL);
		urlConnection = (HttpURLConnection) url.openConnection();
		urlConnection.setRequestMethod("GET");
		urlConnection.connect();
		InputStream inputStream = urlConnection.getInputStream();
		reader = new BufferedReader(new InputStreamReader(inputStream));
		String line;
		StringBuilder sb = new StringBuilder();
		while((line = reader.readLine())!=null){
			sb.append(line+"\n");
		}
		String data = sb.toString();
		JSONObject jsonObject = new JSONObject(data);
		return jsonObject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}

	
	
}

