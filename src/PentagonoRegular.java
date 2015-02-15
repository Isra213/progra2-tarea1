// bueno en este ejercicio se pide el perimetro de un pentagono regular 

public class PentagonoRegular 
{
 //nombramos la variable lado para poner los valores de cada lado y el perimitro se saca multiplicando  lado por 5
int lado;
PentagonoRegular(int lado)
{
this.lado = lado;
}
int getLado()
{
return lado;
}
void setLado(int lado)
{
this.lado = lado;
}
int getPerimetro()
{
return lado*5;
}
}

 

