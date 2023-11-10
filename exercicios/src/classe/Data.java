package classe;

public class Data {
		int dia;
		int mes;
		int ano;
		
		Data(int day, int month, int age){
			this.dia = day;
			this.mes = month;
			this.ano = age;
		}
		
		Data() {
			this(1,1,1970);
		}
		
		String obterDataFormatada() {
			return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
		}
}
