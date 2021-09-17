package aplicativo;

import java.util.Scanner;

import valores.Matematica;

public class Calculadora {

	public static void main(String[] args) {
		// Adquirir dados do user
		
		Scanner leitor = new Scanner(System.in);
		Matematica calculo = new Matematica();
		
		System.out.print("Qual o seu peso(kg)? ");
		calculo.peso = leitor.nextInt();
		
		System.out.print("Qual sua altura(metro e cm)? ");
		calculo.altura = leitor.nextDouble();

		System.out.println("Seu IMC é");
		calculo.calcular();
		
	}

}
