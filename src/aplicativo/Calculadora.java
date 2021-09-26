package aplicativo;

import java.util.Scanner;

import status.TabelaStatus;
import valores.Matematica;

public class Calculadora {

	public static void main(String[] args) {
		// Adquirir dados do user
		
		Scanner leitor = new Scanner(System.in);
		Matematica calculo = new Matematica();
		TabelaStatus status = new TabelaStatus();
		
		System.out.print("Qual o seu peso(kg)? ");
		calculo.peso = leitor.nextInt();
		
		System.out.print("Qual sua altura(?,??)? ");
		calculo.altura = leitor.nextDouble();

		System.out.println("Seu IMC é");
		calculo.calcular();
		
		status.verificarStatus();
	}

}
