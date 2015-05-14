package br.com.weddingdresses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.weddingdresses.model.Pessoa;


@Controller
public class HomeController {
	
	private Pessoa pessoa;
	
	@RequestMapping("/home") 
	public String home(){
		return "home";
	}
	
	
	@RequestMapping("/novo")
	public String NovoFormulario(ModelMap model){
		model.addAttribute("pessoa",new Pessoa());
		return"pessoa/novo";
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
}
