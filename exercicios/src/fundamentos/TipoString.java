package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Noleto";
		var idade = 6;
		var salario = 0.0;
		
		System.out.printf("Nome: %s %s\nIdade: %d anos \nSalario: R$%.2f",
				nome, sobrenome, idade, salario);
	}
}
