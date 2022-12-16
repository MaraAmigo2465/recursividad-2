/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datoss4;
import java.util.Scanner; //creamos una clase de referencia
/**
 *
 * @author 52243
 */
public class Ejercicio_4{
    public static void main(String[] args) {

Scanner sn=new Scanner(System.in); //creamos la extenscion de scarnner

//Pedimos una longitud al usuario
System.out.println("Inserte una longitud");
int longitud=sn.nextInt(); //los valores pepidos se almacena en esta variable

//creo un array con esa longitud
int numeros[]=new int[longitud]; //cremos una relacion para que comparta los valores

//recorro el arreglo y uso la funcion para crear un aleatorio
for(int i=0;i<numeros.length;i++){ //inicializamos el ciclo
numeros[i]=generaNumeroAleatorio(0,10); //le pedimos que genere un numero de acierdo a alas veces que querramos que se repita
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]); //pedimos al sistema que o imprima
}

}

//Crea un numero aleatorio, entre un minimo y un maximo
public static int generaNumeroAleatorio(int minimo, int maximo){ //Declaramos la accion de numero aleatorio

return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1)); //retornara un numero mayor que una incognita y menor de la misma variable referida y se dara un numero aleatorio donde sera entero

}
}
