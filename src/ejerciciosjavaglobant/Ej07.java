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
public class Ej07 {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
     * el programa pondrá un mensaje de Correcto,
     * sino mostrará un mensaje de Incorrecto.
     * Nota: investigar la función equals() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase;
       Scanner input = new Scanner(System.in);
       frase = input.nextLine();
       if (frase.equals("eureka")){ //equals compara strings como el igual de pseint
           System.out.println("correcto");
    } else {
           System.out.println("incorrecto");
       }
    }
}
