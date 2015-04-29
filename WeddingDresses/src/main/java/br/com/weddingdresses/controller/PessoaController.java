package br.com.weddingdresses.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.weddingdresses.model.Endereco;
import br.com.weddingdresses.model.Pessoa;

@Controller
public class PessoaController {

	@Autowired
	private Endereco endereco;
	
	@RequestMapping("/getEstados")
	public @ResponseBody String getEstados(@RequestParam(value="cep") String cep ){
		String json = new String();
		try {
		 JSONObject jsonObject = endereco.getByCep(cep);
		 json = jsonObject.toString();
		} catch (IOException | JSONException e) {
			e.printStackTrace();
		}
		return json;
	}
	
	@RequestMapping("/salvar")
	public String SalvarFormulario(Model model){
		model.addAttribute("pessoa",new Pessoa());
		return "redirect:home";
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
}
