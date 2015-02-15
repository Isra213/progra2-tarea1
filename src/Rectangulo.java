// el ejercicio consiste en sacar el area  y para sacar el area se multiplica base por altura entonces se nombran las variables base y altura 
public class Rectangulo {
int altura, base;
Rectangulo(int base, int altura) // este es el constructor que vimos hoy 
{
this.base = base;
this.altura = altura;		
}
int getAltura()
{
return altura;
}
int getBase()
{
return base;
}
void setAltura(int altura)
{
this.altura = altura;
}
void setBase(int base)
{
this.base = base;
}
return (altura*base);
}
}
