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
public class Ejerciciodelateoria12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1, num2;
        System.out.print("numero 1: ");
        num1 = input.nextInt();
        System.out.print("numero 2: ");
        num2 = input.nextInt();
        System.out.println("\n");
      EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println("El "+ num1 +" es multiplo de "+ num2);
        }else{
            System.out.println("El "+ num1 +" no es multiplo de "+ num2);
        }
    }
}
