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
public class Ej05 {

    /**
     * escribir un programa que lea un numero entero por teclado y
     * muestre por pantalla el doble, el triple y la raiz cuadrada.
     * investigar la funcion math sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int num  = leer.nextInt();
   
        System.out.println("Del numero " + num + " el doble es " + num * 2 +
                " el triple "+ num*3 + " y la raiz cuadrada "+ Math.sqrt(num));  
         //Math.sqrt(num) saca la raiz cuadrada de un numero
          //ahi veo que mientras no cierre con ; puedo seguir escribiendo abajo
    }
    
}
