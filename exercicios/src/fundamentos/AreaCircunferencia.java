package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14; //final funciona como um const, não permitindo alteração da variavel
		double area = PI * raio * raio;

		System.out.println("A area é: " + area + "m");
	}
}
