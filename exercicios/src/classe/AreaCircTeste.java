package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10);
		AreaCirc.pi = 3.1415;
		System.out.println(a.area());
	}
}
