package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Lucio"));
		lista.add(new Usuario("Samantha"));
		lista.add(new Usuario("Josana"));
		lista.add(new Usuario("Marco"));
		lista.add(new Usuario("Lucas"));
		
		System.out.println(lista.get(3).nome);
		
		lista.remove(3);
		System.out.println("foi removido? >>> " + lista.remove(new Usuario("Lucas")));;
		System.out.println("foi removido? >>> " + lista.remove(new Usuario("Lia")));;
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lucio")));
		Usuario u1 = new Usuario("Carlos");
		Usuario u2 = new Usuario("Joana");
		lista.add(u2);
		
		System.out.println("Tem? " + lista.contains(u1));
		System.out.println("Tem? " + lista.contains(u2));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
