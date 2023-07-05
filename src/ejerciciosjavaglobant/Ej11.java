/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaglobant;
import static java.lang.Math.abs;
import java.util.Scanner;
/**
 *
 * @author LUCAS
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       char opc;//defino la opcion para el switch
       int num;//defino 2 variables numericas
       int num2;
      String letra = "N";//defino una letra que se usa en la opcion 5
       do { //abro un do while
            System.out.println("escriba 2 numeros enteros positivos");
        num = leer.nextInt(); //leo ambos numeros
        num2 = leer.nextInt();
        System.out.println("MENU"); //procedo a escribir todo el menu
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        System.out.println("Elija opcion:");
        opc = leer.next().charAt(0); //leo la opc(char) por teclado
           switch (opc){
               case '1':
                   System.out.println("la suma da "+ (num+num2));
                break;
               case '2':
                   System.out.println("la resta da " + Math.abs(num-num2));
                   break;
               case '3':
                   System.out.println("la multiplicacion da "+ num*num2);
                   break;
               case '4':
                   if (num>=num2){ /*hago este if para que siempre se divida 
                                    *el numero mas grande 
                                    */
                   System.out.println("la division da " + num/num2);
                   }else{
                        System.out.println("la division da " + num2/num);
                   }
                   break;
               case '5':
                   System.out.println("¿está seguro de que deseas salir? (S/N)");
                    leer.nextLine();
                   letra = leer.nextLine();
                   letra = letra.toUpperCase(); //convierto letra en mayusculas
                   break;
               default :
                   System.out.println("la opcion no es correcta");
           }
       } while (letra.equals("N")); //me fijo que letra no sea igual a S
                          
           }
       }
    
    

