package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(0, "Roberto"); //criou
		usuarios.put(0, "Lucio"); //atualizou
		usuarios.put(1,"Samanthos");
		usuarios.put(2, "Noletas");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Noletas"));
		System.out.println(usuarios.get(1));
		
		for(String valor: usuarios.values()) {
			System.out.println("Meu nome é: " + valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
	}
}
