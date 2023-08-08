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
public class ejerciciodelateoria7 {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
      
System.out.println("inserte un valor");
int tipoMotor = leer.nextInt();

switch(tipoMotor) { //switch es el segun
    case 1://opcion 1
        System.out.println("La bomba es una bomba de agua");
        break;//finaliza la sentencia de una opcion
    case 2:
        System.out.println("La bomba es una bomba de gasolina");
        break;
    case 3:
        System.out.println("La bomba es una bomba de hormigón");
     break;
    case 4:
        System.out.println("La bomba es una bomba de pasta alimenticia");
    default://sentencia q se ejecuta si no se cumplen las otras opciones
        System.out.println("No existe un valor válido para tipo de bomba");
}
}
}

