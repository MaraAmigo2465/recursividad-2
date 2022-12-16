/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datoss5;
import javax.swing.JOptionPane;
/**
 *
 * @author 52243
 */
public class ejercicio_2_MARA {
   
    public static void main(String[] args) {
   
        //Se especifica el tamaño de la variable
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
   
        //Se interpretan las variables
        rellenarNumPrimosAleatorioArray(num, 1, 100);
   
        mostrarArray(num);
         
        
        int primoMayor=mayor(num);
        System.out.println("El primo más grande es el "+primoMayor);
        //Se obtiene el primo mayor
    }
   
    public static void rellenarNumPrimosAleatorioArray(int lista[], int a, int b){
   
        int i=0;
   
        //Se utiliza un while, ya que solo aumenta cuando se genera un numero primo
        while(i<lista.length){           
            int num=((int)Math.floor(Math.random()*(a-b)+b));           
            if (esPrimo(num)){              
                lista[i]=num;               
                i++;            
            }       
        }   
    }   
    private static boolean esPrimo (int num){       
          
        if (num<=1){
            return false;
        }else{
  
            //Se declaran las variables      
            int prueba;         
            int contador=0;
            //Se realiza la raiz cuadrada y se usa para dividir el numero original
            prueba=(int)Math.sqrt(num);
            //Se usa un while para crear un bucle y asi determinar los numeros que son divisibles
            for (;prueba>1;prueba--){
                if (num%prueba==0){
                    contador+=1;
                }
            }
            return contador < 1;
        }
    }
   
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
     
    public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>mayor){
                mayor=lista[i];
            }
        }
         
        return mayor;
    }
     
}