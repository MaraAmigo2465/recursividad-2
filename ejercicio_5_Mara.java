/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datoss5;

/**
 *
 * @author 52243
 */
public class ejercicio_5_Mara {
    public static void main(String[] args){
        int numero[] = new int[5];
        
        numero[0]= 1;
        numero[1]= 2;
        numero[2]= 3;
        numero[3]= 4;
        numero[4]= 5;
        
        System.out.print("Numeros en primer orden");
        System.out.print("["+ numero[0] + ",");
        System.out.print(""+ numero[1] + ",");
        System.out.print(""+ numero[2] + ",");
        System.out.print(""+ numero[3] + ",");
        System.out.println(""+ numero[4] + "]");
        
        System.out.print("Numeros en segundo orden");
        System.out.print("["+ numero[4] + ",");
        System.out.print(""+ numero[3] + ",");
        System.out.print(""+ numero[2] + ",");
        System.out.print(""+ numero[1] + ",");
        System.out.println(""+ numero[0] + "]");
    }
    
}
