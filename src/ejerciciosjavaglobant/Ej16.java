/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaglobant;
import java.util.Scanner;
/**
 *
 * @author LUCAS
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int tamaño, numero, cant=0;
        System.out.println("de que tamaño quiere el vector?");
        tamaño=input.nextInt();
        System.out.println("que numero desea buscar entre el 1 y el 10?");
        numero = input.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i<tamaño;i++){
            vector[i]= (int)(Math.random()*10+1);
            if (vector[i]==numero){
                cant++;
            }
        }
        for (int i = 0; i<tamaño;i++){
            System.out.print("["+vector[i]+"] "); 
        }
        
        System.out.println("");
        
        if (cant>0){
            System.out.println("El numero "+numero + " se encuentra " + cant +" veces");
        }else{
            System.out.println("El numero "+numero + " no se encuentra en el vector" );
        }
     
    }
    
}
