package classe;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comeu (Comida comida) {
		if(comida != null) {
		this.peso += comida.peso;
		String msg = "%s comeu %s e agora está pesando %.2f kg!\n";
		System.out.printf(msg, this.nome, comida.nome, this.peso);
		}
	}
}
