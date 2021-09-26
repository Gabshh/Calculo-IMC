package status;

import valores.Matematica;

public class TabelaStatus {

	Matematica calculo = new Matematica();

	public void verificarStatus() {

		if (calculo.imc < 18.5) {
			System.out.print("Abaixo do peso!!");
		} else if (calculo.imc >= 18.5 && calculo.imc < 25) {
			System.out.print("Peso normal!!");
		} else if (calculo.imc >= 25 && calculo.imc < 30) {
			System.out.print("Sobrepeso!!");
		} else if (calculo.imc >= 30 && calculo.imc < 35) {
			System.out.print("Obesidade Grau I !!");
		} else if (calculo.imc >= 35 && calculo.imc < 40) {
			System.out.print("Obesidade Grau II !!");
		} else {
			System.out.print("Obesidade Grau III ou Mórbida!!");
		}
	}
}
