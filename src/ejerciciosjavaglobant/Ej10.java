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
public class Ej10 {

    /**
     Escriba un programa en el cual se ingrese un valor límite positivo,
     * y a continuación solicite números al usuario hasta que
     * la suma de los números introducidos supere el límite inicial.
     * @param args
     */
    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
    int aux = 0;
    int limite;
        System.out.println("escriba el numero limite");
        limite = leer.nextInt();
           while (aux < limite){ //pongo de condicion que aux tiene que ser menor que limite para que siga fncionando
               System.out.println("escriba un numero");
               aux = aux + leer.nextInt();
           }
           System.out.println(aux +" es mas grande que " + limite );
    }
    
}
