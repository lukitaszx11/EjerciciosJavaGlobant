/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaglobant;

/**
 *
 * @author Lucas
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int digitos1=0, digitos2=0, digitos3=0, digitos4=0, digitos5=0;
        int [] vector = new int[10];
        vector[0]=1;
        vector[1]=10;
        vector[2]=9;
        vector[3]=99;
        vector[4]=10000;
        vector[5]=199;
        vector[6]=1000;
        vector[7]=100;
        vector[8]=999;
        vector[9]=9999;
       
        for (int i = 0;i<10;i++){
            if ((vector[i]/10000)>=1){
                digitos5 ++;
            }else if ((vector[i]/1000)>=1){
                digitos4 ++;
            }else if ((vector[i]/100)>=1){
                digitos3 ++;
            }else if ((vector[i]/10)>=1){
                digitos2 ++;
            }else{
            digitos1 ++;
        }
        }
        System.out.println("1 digito: "+digitos1);
        System.out.println("2 digito: "+digitos2);
        System.out.println("3 digito: "+digitos3);
        System.out.println("4 digito: "+digitos4);
        System.out.println("5 digito: "+digitos5);
     }
    
}
