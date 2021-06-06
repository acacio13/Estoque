
package br.com.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastro.model.CadastroCepEntity;
import br.com.cadastro.service.CadastroCepService;


@RequestMapping({ "/cadastroCep" })
public class CadastroCepController {

	@Autowired
	CadastroCepService service;

	@PostMapping
	public CadastroCepEntity agregar(@RequestBody CadastroCepEntity p) {
		return service.add(p);
	}

	@PutMapping(path = { "/editarCep" })
	public CadastroCepEntity editar(@RequestBody CadastroCepEntity p, @PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}

	@DeleteMapping(path = { "/deletarCep" })
	public CadastroCepEntity delete(@PathVariable("id") int id) {
		return service.delete(id);

	}

	/*
	 * 
	 * @GetMapping public List<CadastroCepEntity> listar() { return
	 * service.listar(); }
	 * 
	 * @GetMapping(path = { "/listacep" }) public CadastroCepEntity
	 * listarId(@RequestParam("faixaInicio") int faixaInicio) { return
	 * service.listarCep(faixaInicio); }
	 */

}
