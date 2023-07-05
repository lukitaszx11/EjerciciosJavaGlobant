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
public class Ej03 {
   
/* 
    /*
      escribir un programa que pida una frase y la muestre toda en mayusculas
      y despues toda en minusculas.
      (investigar funcion touppercase() y tolowercase().
     */
    public static void main(String[] args) {
       String mayus;
       String minus;
       String frase;
        System.out.println("escriba una frase");
        Scanner input = new Scanner(System.in);
        frase = input.nextLine();
        mayus = frase.toUpperCase();
        minus = frase.toLowerCase();
        System.out.println(mayus);
        System.out.println(minus);
       
        
    }
    
}
