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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        byte cant = 0 ; //cantidad correctas
        byte cantx =0 ; //cantidad incorrectas
        Scanner input = new Scanner(System.in);
       do 
            {   
            System.out.println("escriba una frase de 5 caracteres que arranque con x y termine con o");
            mensaje = input.nextLine(); //leo mensaje
        if (mensaje.length() == 5 && mensaje.substring(0,1).equals("x") && mensaje.substring(4,5).equals("o"))
           /*
            reviso que la longitud sea 5, la primera sea x y la ultima o
            para que sume la variable de correctas
            */
        {
            ++cant; //sunmo en 1 la cantidad no entiendo bien lo de byte
                }else if (!mensaje.equals("&&&&&")){
                    ++cantx;
                }
        } while (!mensaje.equals("&&&&&")); // el loop sigue hasta q una frase sean 5 "&"
        System.out.println("las frases correctas fueron: "+ cant);
        System.out.println("las frases incorrectas fueron: "+ cantx);  
    }
    
}
