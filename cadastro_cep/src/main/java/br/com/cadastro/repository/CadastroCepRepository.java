
package br.com.cadastro.repository;


import java.util.List;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.cadastro.model.CadastroCepEntity;

public interface CadastroCepRepository extends Repository<CadastroCepEntity, Integer>{
    List<CadastroCepEntity>findAll();
    CadastroCepEntity findOne(int faixaInicio);

    CadastroCepEntity save(CadastroCepEntity p);
    void delete(CadastroCepEntity p);
    
    
	/***
	 * 
	 * Obtem faixa de cep por faixaInicio e faixaFim
	 * 
	 * @author Acácio
	 * @param faixaInicio
	 * @param faixaFim
	 * @return
	 */
	 CadastroCepEntity findByPrice(@Param("faixaInicio") int faixaInicio, @Param("faixaFim") int faixaFim);
    
}