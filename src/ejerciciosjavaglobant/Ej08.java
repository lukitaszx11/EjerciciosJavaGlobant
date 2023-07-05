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
public class Ej08 {

    /**
     * Realizar un programa que solo permita introducir solo frases o
     * palabras de 8 de largo. Si el usuario ingresa una frase o palabra
     * de 8 de largo se deberá de imprimir un mensaje por pantall
     * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
     * Nota: investigar la función Lenght() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase;
       Scanner input = new Scanner(System.in); 
       frase = input.nextLine();
       if (frase.length() == 8 ){//frase.length mide la longitud de la frase
           System.out.println("correcto");
       }else{
           System.out.println("incorrecto");
                 
       }
    
    }

   
}
