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
public class Estructura_de_datosS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
      for(int i = 0; i <= 15; i++){
          System.out.println("Inserte un número:");
          int numero = sn.nextInt();
          int longitud[]=new int[numero];

          if(i == 15){
          for(int e = 0; e <= 15; e++){
          System.out.println(longitud[e]);
          }
          
    
     // for(int e = 0;i == 15;e++){
       //   System.out.println(longitud[e]);
       
      }
          
          
      }
    }
}
