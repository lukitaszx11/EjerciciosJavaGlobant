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
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int euros;
        String divisas;
        System.out.println("dime la cantidad de euros a convertir");
        euros = input.nextInt();
        System.out.println("a que divisa desea cambiarlo?");
        divisas = input.next();
        if (divisas.equals("yenes")||divisas.equals("dolares")||divisas.equals("libras")){
                   cambiodedivisas(euros, divisas);
        }
    }
    public static void cambiodedivisas(int euros, String divisas){
        switch (divisas) {
            case "dolares":
                System.out.println(euros +" euros equivalen a "+abs(euros*1.28611)+ " dolares");
                break;
            case "yenes":
                System.out.println(euros+" euros equivalen a "+ (euros*129852)+ " yenes");
                break;
            case "libras":
                System.out.println(euros+" euros equivalen a "+ (euros*0.089)+ " libras");
                break;
            default:
                break;
        }

        }
    }

