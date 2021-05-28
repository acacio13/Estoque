package core.test;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import core.controller.Calculadora;
import core.model.Nota;
import core.view.MainClass;

public class CaixaEletronicoTest {

	Calculadora Calcula = new Calculadora();

	static Long valor = (long) 80;

	@Test
	void VerificarSerNumero() {

		Calcula.calculate(valor);

	}
	
}
