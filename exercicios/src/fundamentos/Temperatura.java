package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final int const1 = 32;
		final double const2 =  5/9.0;
		
		int temp = 86;

		final double tempEmC = (temp - const1) * const2;
		
		System.out.println("A temperatura em Celsius é: " + tempEmC + "ºC");
	}
}
