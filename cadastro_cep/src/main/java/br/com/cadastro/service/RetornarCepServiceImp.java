
package br.com.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.model.CadastroCepEntity;
import br.com.cadastro.repository.RetornarCepRepository;


@Service
public class RetornarCepServiceImp implements RetornarCepService {
	@Autowired
	private RetornarCepRepository repositorio;

	

	@Override
	public CadastroCepEntity listarCep(int id) {
		return repositorio.findOne(id);
	}
	

	
	
	
}