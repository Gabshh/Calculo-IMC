package valores;

public class Matematica {

	public int peso;
	public double altura;
	public double imc;
	public String status;

	public void calcular() {

		imc = peso / (altura * altura);
		System.out.println(imc);

		if (imc < 18.5) {
			System.out.println("Abaixo do peso!!");
		}else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal!!");
		}else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso!!");
		}else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade Grau I !!");
		}else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade Grau II !!");
		}else {
			System.out.println("Obesidade Grau III ou M�rbida!!");
		}
	}
}
