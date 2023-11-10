package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data dt1 = new Data();
		
		Data dt2 = new Data(28,12,1998);
		
		System.out.println(dt1.obterDataFormatada());
		System.out.println(dt2.obterDataFormatada());
	}
}
