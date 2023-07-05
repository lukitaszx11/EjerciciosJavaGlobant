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
public class Ej06 {

    /**
     * crear un programa que dado un numero determine si es par o impar
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int violeta;//violeta es un numero entero
      Scanner leer = new Scanner(System.in);
      violeta = leer.nextInt();
       if (violeta%2==0){; //el simbolo % se usa para el modulo, asi saco numero par
        System.out.println("el numero es par");
        }else{//significa "sino"
          System.out.println("el numero es impar");   
        }
    
}
}