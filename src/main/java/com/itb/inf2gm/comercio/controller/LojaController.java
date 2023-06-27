package com.itb.inf2gm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2gm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		List<Produto> ListaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(20l);
		p1.setNome("Máquina de Lavar");
		p1.setDescricao("Máquina de lavar Brastemp 13l com painel digital");
		p1.setCodigoBarra("4h65ue5h5uyu56rtu43565689");
		p1.setPreco(3215.65);
		
       Produto p2 = new Produto();
		
		p2.setId(20l);
		p2.setNome("Micro-ondas");
		p2.setDescricao("micro-ondas eletrolux multuso com painel digital");
		p2.setCodigoBarra("rv6yede56tfyh8n9u2939");
		p2.setPreco(2225.65);
		
		
		
		ListaDeProdutos.add(p1);
		ListaDeProdutos.add(p2);
		
		model.addAttribute("ListaDeProdutos",ListaDeProdutos);
		return "produtos";
	}
}
