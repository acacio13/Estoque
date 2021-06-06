
package br.com.cadastro.service;
import java.util.List;

import br.com.cadastro.model.CadastroCepEntity;

public interface CadastroCepService {
    List<CadastroCepEntity>listar();
    CadastroCepEntity listarCep(int faixaInicio);
    CadastroCepEntity add(CadastroCepEntity p);
    CadastroCepEntity edit(CadastroCepEntity p);
    CadastroCepEntity delete(int id);
}
