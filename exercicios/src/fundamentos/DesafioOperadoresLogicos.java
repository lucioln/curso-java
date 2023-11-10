package fundamentos;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		int countTrabalhos = 0;
		
		//Trabalho na terça (v / f)
		boolean trampouTerca = true; 
		//Trabalho na quinta (v / f) 
		boolean trampouQuinta = true;
		// VV -> sorvete + tv de 50'
		// VF || FV -> sorvete+ tv de 32'
		// FF -> ficar em casa mermo

		if(trampouTerca) {
			countTrabalhos++;
		}
		
		if(trampouQuinta) {
			countTrabalhos++;
		}
		
		switch(countTrabalhos) {
		case 0:
			System.out.println("Vamos ficar em casa meu povo");
			break;
		case 1: 
			System.out.println("Vamos tomar um sorvetin? e comprar uma tv de 32'");
			break;
		case 2:
			System.out.printf("VAMOS METER O LOUCO!\nTv de 50' e um sorvetin da Blaus");
			break;
		}
	}
}
