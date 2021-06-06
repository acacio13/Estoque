
package br.com.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastro.model.CadastroCepEntity;
import br.com.cadastro.service.RetornarCepService;


@RequestMapping({ "/retornoCep" })
public class RetornarCepController {

	@Autowired
	RetornarCepService service;

	@GetMapping(path = { "/listacep" })
	public CadastroCepEntity listarId(@RequestParam("id") int id) {
		return service.listarCep(id);
	}

}
