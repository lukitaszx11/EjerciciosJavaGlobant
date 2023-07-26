package ejerciciosjavaglobant;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUCAS
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("escribe la longitud del cuadrado");
        num = input.nextInt();
        for (int i = 0;i<(num+1); i++){
            /*
            defino i=0, digo hasta donde quiero q haga y al final
            que quiero q pase con i, en este caso aumente
            */
            System.out.print("*");//escribo el primer *
            for (int j = 1; j<(num-1); j++){//creo el j para escribir los * del medio
                if (i==0 || i==num){
                                     
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
             System.out.println(" *");   
        }
    }
    
}
