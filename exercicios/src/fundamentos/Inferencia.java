package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		/*
		 * Java sempre atrela a variavel a um tipo
		 *Dessa forma, a variavel a não pode ser uma string futuramente.
		 *Assim como a variavel c, não poderá ser um int ou double
		*/
	}
}
