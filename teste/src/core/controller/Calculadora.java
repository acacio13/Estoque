package core.controller;
import core.model.Nota;
public class Calculadora {
    public static void calculate(long value) {
        Nota notas = new Nota();
    	
        value = Math.abs(value);
    	if (value % 2 != 0) {
			
				System.err.println("saque Ímpossivel");
				
		}

		if (notas.get_100() >= notas.get_100()) {
			notas.set_100(value / 100);
			value = value % 100;
			if (notas.get_100() != 0)
				System.out.println(notas.get_100() + " notas de R$ 100,00");
		}

		if (notas.get_50() >= notas.get_50()) {
			notas.set_50(value / 50);
			value = value % 50;
			if (notas.get_50() != 0)
				System.out.println(notas.get_50() + " notas de R$ 50,00");
		}

		if (notas.get_20() >= notas.get_20()) {
			notas.set_20(value / 20);
			value = value % 20;
			if (notas.get_20() != 0)
				System.out.println(notas.get_20() + " notas de R$ 20,00");
		}

		if (notas.get_10() >= notas.get_10()) {
			notas.set_10(value / 10);
			value = value % 10;
			if (notas.get_10() != 0)
				System.out.println(notas.get_10() + " notas de R$ 10,00");
		}

	}
}