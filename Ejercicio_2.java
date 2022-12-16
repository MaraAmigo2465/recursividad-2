/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datoss4;

/**
 *
 * @author 52243
 */
public class Ejercicio_2 {
    
public static void main(String[] args) {
//Creo un array
int[] numeros=new int[100];
//Declaro las variables necesarias
int suma=0;
double media; //declaramos una variable para decimales 
//Recorro el arreglo, asigno números y sumo
for(int i=0;i<numeros.length;i++){
    //inicializamos un ciclo, tomando como uso la variable numero
numeros[i]=i+1;
//creamos el indice de o hasta 100 espacios.
suma+=numeros[i];
//sumaremos todos los numeros declosados del indice
}
//Calculo la media y muestro la suma y la meda
System.out.println("La suma es "+suma); //le pedimos al programa que imprim la suma
media=(double)suma/numeros.length; //le pedimos que la variable del resultado dividiendo en 100
System.out.println("La media es "+media);
//al final imprimimos el resultado 'double'
}    
}
