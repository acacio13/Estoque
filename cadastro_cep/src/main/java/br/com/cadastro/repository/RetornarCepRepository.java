
package br.com.cadastro.repository;


import java.util.List;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.cadastro.model.CadastroCepEntity;

public interface RetornarCepRepository extends Repository<CadastroCepEntity, Integer>{
    CadastroCepEntity findOne(int id);

}