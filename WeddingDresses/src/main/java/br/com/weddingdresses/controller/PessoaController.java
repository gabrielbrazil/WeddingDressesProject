package br.com.weddingdresses.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.weddingdresses.model.Endereco;
import br.com.weddingdresses.model.Pessoa;
import br.com.weddingdresses.service.PessoaService;

@Controller
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	private boolean hasError = false;
	
	@RequestMapping("/getEstados")
	public @ResponseBody String getEstados(@RequestParam(value="cep") String cep ){
		String json = new String();
		try {
		 Endereco endereco = new Endereco();	
		 JSONObject jsonObject = endereco.getByCep(cep);
		 json = jsonObject.toString();
		} catch (IOException | JSONException e) {
			e.printStackTrace();
		}
		return json;
	}
	
	@RequestMapping("/salvar")
	public String SalvarFormulario(@Valid Pessoa pessoa,BindingResult result,Model model){
		if(result.hasErrors()){
			hasError = true;
			model.addAttribute("hasError",hasError);
		 return "pessoa/novo";	
		}
		pessoaService.salvar(pessoa);
		return "redirect:home";
	}



	
}
