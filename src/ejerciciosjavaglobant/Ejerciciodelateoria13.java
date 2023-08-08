/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaglobant;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Ejerciciodelateoria13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[] edades = new int[2];
       String[]nombres = new String[2];
       for (int i = 0; i<2;i++){
           System.out.print("escriba nombre y edad de la persona "+ (i+1)+": ");
           nombres[i] = input.next();
           
           edades[i] = input.nextInt();
       }
      for (int i = 0; i<2;i++){
          System.out.println(nombres[i]+ " tiene "+ edades[i]+ " años.");
      }
    }
    
}
