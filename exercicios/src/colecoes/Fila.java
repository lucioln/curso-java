package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Lucas");
		fila.offer("Lucio");
		fila.offer("Samantha");
		
		System.out.println(fila.peek());//chama mas n remove
		System.out.println(fila.element());
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll());//chama e remove retorna null se estiver vazio
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		}
}
