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
public class Estructura_de_datosS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Creo el array
int[] numeros=new int[100]; //declaramos una variable
//Lo recorro y le asigno números
for(int i=0;i<numeros.length;i++){
    //creamos un ciclo for contando la variable
numeros[i]=i+1; //crear un indice de 0 hasta el limite puesto como variable.
System.out.println(numeros[i]);
//inprimimos el indice
}
}    
}
