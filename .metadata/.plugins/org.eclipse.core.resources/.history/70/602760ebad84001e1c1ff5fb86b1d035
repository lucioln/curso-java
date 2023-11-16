package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "unchecked", "unchecked" })
	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes", "rawtypes" })
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		conjunto.remove("Teste");
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains("Teste"));
		System.out.println("O tamanho é: " + conjunto.size());
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//conjunto.addAll(nums); //União entre dois conjuntos
		conjunto.retainAll(nums); //Interceção entre dois conjuntos
		System.out.println(conjunto);
	}
}
