package br.com.weddingdresses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/home") 
	public String home(){
		return "home";
	}
	
	
	@RequestMapping("/novo")
	public String NovoFormulario(){
		
		return"pessoa/novo";
	}
	
	@RequestMapping("/salvar")
	public String SalvarFormulario(){
		return "redirect:home";
	}
	
}
