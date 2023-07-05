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
public class Ej04 {

    /**
     * dada una cantidad de grados centigrados se debe mostrar su equivalente
     * en grados fahrenheit. la formula es: f=32+(9*c/5).
     * @param args
     */
    public static void main(String[] args) {
      int c;
      int f;
      Scanner input = new Scanner(System.in);
        System.out.println("Cuántos grados centigrados hay");
      c = input.nextInt();
      f= 32 + (9*c/5);
        System.out.println(c + " grados centigrados equivalen a " + f + " grados fahreinheit");
    }
    
}
