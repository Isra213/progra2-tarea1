import java.util.Scanner;


public class PentagonoRegular {
//  nombramos la variable 
	int  lado;
	Scanner n;
	
	PentagonoRegular(int lado) {
		
		
		getLado();
		
	    System.out.println("El perimetro de un pentagono regular es: "+getPerimetro());
	}
	// este es para que puedas ingresar el numero de lados se saca la multiplicacion  de todos los lados 
	
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
