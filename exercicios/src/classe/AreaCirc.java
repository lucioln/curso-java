package classe;

public class AreaCirc {
	static double pi = 3.14;
	double raio;
	
	AreaCirc(double raio){
		this.raio = raio;
	}
	
	double area() {
		return this.pi * this.raio * this.raio; 
	}
}
