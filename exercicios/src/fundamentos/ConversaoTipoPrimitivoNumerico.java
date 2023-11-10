package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		float a = 1;
		System.out.println(a);
		
		float b = (float) 1.1234567899999;//float nao suporta a partir do "9"
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d); 
		//gera uma conversão incorreta pq o byte nao suporta numeros acima de 127
		
		double e = 1.9999999;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);
	}
}
