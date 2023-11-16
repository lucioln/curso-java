package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-> Quantas notas deseja cadastrar?");
		int qtdNotas = teclado.nextInt();
		double [] notas = new double[qtdNotas]; 
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("\n ->Digite o valor da nota %d: ", i+1);
			notas[i] = teclado.nextDouble();
		}
		double total = 0;
		for(double nota: notas) {
			total += nota; 
		}
		
		System.out.println("A média é: " + total/notas.length);
		
		teclado.close();
	}
}
