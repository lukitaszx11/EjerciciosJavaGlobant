/*
 * realizar un programa que lea 4 numeros entre 1 y 20 e imprima el numero ingresado seguido de " * "
 */
package ejerciciosjavaglobant;

    /**
     * 
     * @param args the command line arguments
     */
 import java.util.Scanner;

public class Ejerciciodelateoria10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4;
        
        System.out.println("Escribe 4 números entre 1 y 20:");

        do {
            System.out.print("Número 1: ");
            num1 = input.nextInt();
        } while (num1 < 1 || num1 > 20);

        do {
            System.out.print("Número 2: ");
            num2 = input.nextInt();
        } while (num2 < 1 || num2 > 20);

        do {
            System.out.print("Número 3: ");
            num3 = input.nextInt();
        } while (num3 < 1 || num3 > 20);

        do {
            System.out.print("Número 4: ");
            num4 = input.nextInt();
        } while (num4 < 1 || num4 > 20);
        
        System.out.println("Números ingresados seguidos de \"*\":");
        imprimirConAsteriscos(num1);
        imprimirConAsteriscos(num2);
        imprimirConAsteriscos(num3);
        imprimirConAsteriscos(num4);
    }
    
    public static void imprimirConAsteriscos(int num) {
        System.out.print(num + " ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
