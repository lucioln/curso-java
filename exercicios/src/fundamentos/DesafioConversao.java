package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario:");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario:");
		String sal2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario:");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		
		double media = (Double.parseDouble(sal1) + Double.parseDouble(sal2) 
		+ Double.parseDouble(sal3))/3;
		
		System.out.println("Media salarial em 3 meses é: " + media);
	}
}
