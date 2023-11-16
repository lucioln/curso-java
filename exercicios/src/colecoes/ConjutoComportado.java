package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjutoComportado {
	public static void main(String[] args) {
		Set<String> lista = new TreeSet<>();
		lista.add("Lucio");
		lista.add("Samantha");
		lista.add("Lucas");
		lista.add("Joana");
		
		System.out.println(lista);
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		for(Integer num: nums) {
			System.out.println(num);
		}
	} 
}
