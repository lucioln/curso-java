package fundamentos;

public class DesafioOperadores {
	public static void main(String[] args) {
		int expA = ((int) (Math.pow(6*(3+2), 2)) ) / (3*2);
		int expB = (int) Math.pow( ((1-5)*(2-7))/2, 2);
		
		int  expFinal = ((int) Math.pow(expA - expB, 3))/ (int) Math.pow(10, 3);
		
		System.out.println(expFinal);

	}
}
