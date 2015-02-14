// el ejercicio consiste en sacar el area  y para sacar el area se multiplica base por altura 

import java.util.Scanner;
//nombre mis variables 

public class Rectangulo {
	int base;
	int altura;
	Scanner n;

	Rectangulo(int base, int altura) { 
		
		getBase();
		getAltura();
	    System.out.println("El area de un rectangulo de base "+base+" y altura "+altura+" es igual a: "+getArea()+" y el perimetro es: "+getPerimetro());
	}
	// aqui se pide que ingrese el numero para la base
	int getBase(){
		n = new Scanner(System.in);
		System.out.println("Ingresa la base");  
	    base = n.nextInt(); 
	    
		return base;
	}
	
	void setBase( int base){
		this.base = base;
	}
		// aqui se pide que ingrese el numero para la altura 
	int getAltura(){
		n = new Scanner(System.in);
		System.out.println("Ingresa la altura");  
	    altura = n.nextInt();
		return base;
	}
	
	void setAltura( int altura){
		this.altura = altura;
	}
	// se efectua la multiplicacion 
	
	int getArea(){
		return base*altura;
	}
	int getPerimetro(){
		return 2*(base+altura);
	}

}
