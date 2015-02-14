import java.util.Scanner;


public class PentagonoRegular {

	int  lado;
	Scanner n;
	
	PentagonoRegular(int lado) {
		// TODO Auto-generated constructor stub
		
		getLado();
		
	    System.out.println("El perimetro de un pentagono regular es: "+getPerimetro());
	}
	
	int getLado(){
		n = new Scanner(System.in);
		System.out.println("Ingresa el valor de los lados");  
	    lado = n.nextInt(); 
	    
		return lado;
	}
	
	void setLado(int lado){
		this.lado = lado;
	}
	
	int getPerimetro(){
		return lado*5;
	}
}
