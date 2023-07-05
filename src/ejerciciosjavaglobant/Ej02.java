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
public class Ej02 {

    /**
     *escribir un programa que pida tu nombre,
     * lo guarde en una variable y lo muestre
     * @param args
     */
    public static void main(String[] args) {
        String nombre; //defino nombre como string(cadena)
        Scanner input = new Scanner(System.in);//defino input como variable de lectura
        System.out.println("escribe tu nombre"); //escribo algo para que salga por pantalla(escribir)
        nombre =input.nextLine();//le doy a nombre el valor de lo proximo que escriba el usuario
        System.out.println(nombre); //escribo la variable                                                                                   
        
    }
    
}
