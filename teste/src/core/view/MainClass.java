package core.view;

import java.text.BreakIterator;
import java.util.Scanner;

import core.controller.Calculadora;
import core.model.Nota;

public class MainClass {
	static Long valor;
	static Nota notas = new Nota();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Calculadora Calcula = new Calculadora();

		System.out.println("Digite o valor que voc� deseja sacar");
		valor = input.nextLong();
//Chamada ao m�todo"calculate" respons�vel pelo calculo do saque!
		Calcula.calculate(valor);

	}

	
	
	
}