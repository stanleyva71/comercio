package com.itb.inf2cm.comercio.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2cm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	

	@GetMapping("/listar")
	public String testProduto(Model model) {
		
     List<Produto> listaDeProdutos = new ArrayList<Produto>();
     Produto produto1 = new Produto();
		produto1.setNome("televisor samsung 70");
		produto1.setCodigoDeBarras("123adert3432r3r3");
		produto1.setPreco(6598.41);
		produto1.setId(122l);
		
		Produto produto2 = new Produto();
		produto2.setNome("televisor samsung 75");
		produto2.setCodigoDeBarras("123adert3432r3r5");
		produto2.setPreco(6896.41);
		produto2.setId(123l);

		listaDeProdutos.add(produto1);
		listaDeProdutos.add(produto2);
	
		
	    model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos"; //Retorna o nome do template arquivo se encontra na pasta 
	}
		@GetMapping("/novo-produto")
		public String adicionarProduto () {
			return "novo-prod";
			
		}
	}

