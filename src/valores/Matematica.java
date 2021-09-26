package valores;

public class Matematica {

	public int peso;
	public double altura;
	public double imc;
	public String status;

	public void calcular() {

		imc = peso / (altura * altura);
		System.out.println(imc);

	}
}
