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

import org.json.JSONException;
import org.json.JSONObject;

public class Endereco {
	private Integer id;
	private String rua;
	private String numero;
	private String complemento;
	private String cep;
	private String estado;
	private String bairro;
	
	public Endereco() {
	}
	
	
	public Map<String,String> getMapEstado(){
		Map<String,String> estados = new HashMap<String,String>();
		estados.put("AC", "Acre");
		estados.put("AL", "Alagoas");
		estados.put("AP", "Amapá");
		estados.put("AM", "Amazonas");
		estados.put("BA", "Bahia");
		estados.put("CE", "Ceará");
		estados.put("DF", "Distrito Federal");
		estados.put("ES", "Espírito Santo");
		estados.put("GO", "Goiás");
		estados.put("MA", "Maranhão");
		estados.put("MT", "Mato Grosso");
		estados.put("MS", "Mato Grosso do Sul");
		estados.put("MG", "Minas Gerais");
		estados.put("PA", "Pará");
		estados.put("PB", "Paraíba");
		estados.put("PR", "Paraná");
		estados.put("PE", "Pernambuco");
		estados.put("PI", "Piauí");
		estados.put("RJ", "Rio de janeiro");
		estados.put("RN", "Rio Grande do Norte");
		estados.put("RS", "Rio Grande do Sul");
		estados.put("RO", "Rondônia");
		estados.put("RR", "Roraima");
		estados.put("SP", "São Paulo");
		estados.put("SC", "Santa Catarina");
		estados.put("SE", "Sergipe");
		estados.put("TO", "Tocantins");
		return estados;
	}
	
	public void getByCep(String cep) throws MalformedURLException,IOException,JSONException{
		final String CEP_BASE_URL = "viacep.com.br/ws/"+cep+"/json/";
		HttpURLConnection urlConnection;
		BufferedReader reader;
		URL url = new URL(CEP_BASE_URL);
		urlConnection = (HttpURLConnection) url.openConnection();
		urlConnection.setRequestMethod("GET");
		urlConnection.connect();
		InputStream inputStream = urlConnection.getInputStream();
		reader = new BufferedReader(new InputStreamReader(inputStream));
		String data = reader.toString();
		JSONObject jsonObject = new JSONObject(data);
		String bairro = jsonObject.getString("bairro");
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

	
	
}

