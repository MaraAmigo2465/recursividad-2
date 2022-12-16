/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datoss5;
import java.util.Scanner;
/**
 *
 * @author 52243
 */
public class ejercicio_4_MARA {
    public static void main(String[] args) {
//restamos La posicion mayor (Z, añadiendole 1) a la posicion menor
char abecedario[]=new char[91-65];
//creamos el abecedario partiendo con la creaccion de un indice con el metodo for
for(int i=65, indice=0;i<91;i++, indice++){
    //indica que el indice cresera al igual que char de la posision de la variable i
abecedario[indice]=(char)i;
}
Scanner sn=new Scanner(System.in); //creamos una extension para scanner
//Pedimos un numero, que serán posiciones del array
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
int num=sn.nextInt(); //donde se alojara el valor
String cadena=""; //sedeclara que se utilizara una cadena
while(num!=-1){ //empezamos con una compararcion por parte de while
//Comprobamos que el número es correcto
if(num>=0 && num<abecedario.length){ //contaremos al int los espacios que ocupa
    //la condicion pide numero mayor de 0 yy el indice cuente el espacio y que no sea mayor
cadena+=abecedario[num]; //pedira que el string sea incrementacle deacuerdo a la abecedario
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");  //el sistema imprimira y se agregara el indice del abecedario y un desenso con una concatenacion
}else{
System.out.println("Numero no valido inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar"); // Se repetira si la condicion no concuerda volvera a ingresar un valor
}
num=sn.nextInt(); //lo pedimos de nuevo
}
//Resultado final
System.out.println("La cadena resultante es "+cadena);
}
}