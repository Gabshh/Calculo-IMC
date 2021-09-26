package status;

import valores.Matematica;

public class TabelaStatus {

	Matematica calculo = new Matematica();

	public void verificarStatus() {

		if (calculo.imc < 18.5) {
			System.out.println("Abaixo do peso!!");
		} else if (calculo.imc >= 18.5 && calculo.imc < 25) {
			System.out.println("Peso normal!!");
		} else if (calculo.imc >= 25 && calculo.imc < 30) {
			System.out.println("Sobrepeso!!");
		} else if (calculo.imc >= 30 && calculo.imc < 35) {
			System.out.println("Obesidade Grau I !!");
		} else if (calculo.imc >= 35 && calculo.imc < 40) {
			System.out.println("Obesidade Grau II !!");
		} else {
			System.out.println("Obesidade Grau III ou Mórbida!!");
		}
	}
}
