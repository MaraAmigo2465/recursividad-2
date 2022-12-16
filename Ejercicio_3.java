/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datoss4;
import java.util.Scanner; //importamos la clase scanner
/**
 *
 * @author 52243
 */
public class Ejercicio_3 {
    public static void main(String[] args) {

Scanner sn=new Scanner(System.in); //creamos un vinculo con la clase scanner

//Pido una longitud al usuario
System.out.println("Inserte una longitud");
int longitud=sn.nextInt(); //esta partte es el contenedor donde recivira la longitud querida
//declaramos longitud y le ponemos una extencion 'sn.'

//Creo el arreglo con esa longitud
int numeros[]=new int[longitud];
//declaramos numero que compartira el valor o se lo pasara

int num; //declarmos una variable

//Recorro el array
for(int i=0;i<numeros.length;i++){
//empezamos el ciclo donde ponemos como regla que nunca este vacio o que no sea cadena
System.out.println("Inserte un número en la posicion "+i);
//el sistema pedira un valor predeterminado segun la cantidad de caracteres ingresados en numero

do{
//pido el numero en una posicion especifica
num=sn.nextInt();

if(!(num>=0 && num<=10)){
    //creamos un arrego donde el numero deve ser igual o mayor a 0 yy 1ue no pase de 10
System.out.println("Error. Solo números del 0 al 10. "
+ "Inserte un número en la posicion "+i);
//creamos una concatenacion donde verificara y pondra el sistema una repeticion el ciclo
}

}while(!(num>=0 && num<=10));
//crearemos un ciclo igual pero repetible infinitamente deacuerdo a la condicion

//asigno, ya que sé que el número es correcto
numeros[i]=num;

}

//Esta parte es opcional para que se vea lo que hemos insertado
System.out.println("Estos son los números elegidos por el usuario"); //imprimos los valores
for(int i=0;i<numeros.length;i++){ //el ultimo ciclo alojara los numeros indicadas en orden de ingreso
System.out.println(numeros[i]); //imprimira los valores que se remplazaron 
}

}

    
}
