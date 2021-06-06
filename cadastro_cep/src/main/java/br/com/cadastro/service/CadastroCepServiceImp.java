
package br.com.cadastro.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.model.CadastroCepEntity;
import br.com.cadastro.repository.CadastroCepRepository;


@Service
public class CadastroCepServiceImp implements CadastroCepService {
	@Autowired
	private CadastroCepRepository repositorio;

	@Override
	public List<CadastroCepEntity> listar() {
		return repositorio.findAll();
	}

	@Override
	public CadastroCepEntity listarCep(int id) {
		return repositorio.findOne(id);
	}
	

	
    @Override
    public CadastroCepEntity add(CadastroCepEntity p) {
        return repositorio.save(p);
    }

	@Override
	public CadastroCepEntity edit(CadastroCepEntity p) {
		return repositorio.save(p);
	}

	@Override
	public CadastroCepEntity delete(int id) {
		CadastroCepEntity p = repositorio.findOne(id);
		if (p != null) {
			repositorio.delete(p);
		}
		return p;
	}


	
	
	
	
/*
	@Override
	public CadastroCepEntity add(CadastroCepEntity p) {

		CadastroCepEntity pa = repositorio.findByPrice(p.getFaixaInicio(), p.getFaixaFim());

		if (pa != null) {
			repositorio.save(p);

		}
		return pa;

	}
*/
	
	
	
	
}