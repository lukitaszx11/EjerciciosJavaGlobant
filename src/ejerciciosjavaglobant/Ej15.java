/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaglobant;

/**
 *
 * @author LUCAS
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]matriz;
        matriz = new int[10][10];
        for (int i = 0; i<10;i++){
            for(int j=0; j<10;j++){
            matriz[i][j]= j+(i*10)+1;
        }
        }
         for (int i = 0; i<10;i++){
            for(int j=0; j<10;j++){
                if (matriz[i][j]<10){
                      System.out.print(" [00"+matriz[i][j]+"] ");
                } else if (matriz[i][j]<100&&matriz[i][j]>9){
                      System.out.print(" [0"+matriz[i][j]+"] ");
                }else{
                      System.out.print(" ["+matriz[i][j]+"] ");
                }
              
        }
             System.out.println("");
        }
    }
    
}
