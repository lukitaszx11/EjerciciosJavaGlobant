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
public class Ejerciciodelateoria11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new  Scanner(System.in);
        String Frase;
        do{
                   System.out.println("escriba frases y seran codificadas hasta que escriba: salir");
        Frase = input.nextLine();
        Codificador(Frase);
        } while (!Frase.equals("salir"));
 
   
    }
    public static void Codificador(String frase){
        int lenght = frase.length();
        String letra, aux;
        aux = "";
        for (int i=0; i<lenght; i++){
            switch (frase.substring(i, i+1)){
            case "a":
           letra = "@";
           break;           
            case "e":
          letra = "#";
          break;
            case "i":
          letra = "$";
          break;
            case "o":
          letra = "%";
          break;
            case "u":
          letra = "*";
          break;
            default:
          letra = frase.substring(i, i+1);
        }
            aux = aux.concat(letra);
        }
        System.out.println(aux);
    }
       
}


