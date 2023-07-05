/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaglobant;
import java.util.Scanner;//importo el metodo scanner para asignar valores por teclado
/**
 *
 * @author LUCAS
 */
public class Ej01 {

    /**
     * pide 2 numeros y muestra su suma
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;//defino a y b como numeros enteros
       int b;
       Scanner input = new Scanner(System.in);
       a = input.nextInt(); //el usuario escribe los numeros
       b = input.nextInt();
        System.out.println("la suma da: " + (a+b));
        
    }
    
}
