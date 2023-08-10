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
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][]matrizA = new int[3][3];
        int[][]matrizB = new int[3][3];
        boolean flag = false;
        matrizA[0][0]=0;
        matrizA[0][1]=-2;
        matrizA[0][2]=4;
        matrizA[1][0]=2;
        matrizA[1][1]=0;
        matrizA[1][2]=2;
        matrizA[2][0]=-4;
        matrizA[2][1]=-2;
        matrizA[2][2]=0;
        
        for (int i=0; i<3;i++){
            for (int j=0;j<3; j++){
            matrizB[i][j]=matrizA[j][i];
        }
        }
        
        System.out.println("Matriz A: ");
      for (int i = 0; i<3;i++){
          for (int j = 0; j<3; j++){
              if(matrizA[i][j]>=0){
                  System.out.print(" [ "+matrizA[i][j]+"] ");
              }else{
                    System.out.print(" ["+matrizA[i][j]+"] ");
              }
            
          }
          System.out.println("");
      }
        System.out.println("\n Matriz B: ");
      
     for (int i = 0; i<3;i++){
          for (int j = 0; j<3; j++){
              if(matrizB[i][j]>=0){
                  System.out.print(" [ "+matrizB[i][j]+"] ");
              }else{
                    System.out.print(" ["+matrizB[i][j]+"] ");
              }
            
          }
          System.out.println("");
      }
     
     for (int i=0;i<3;i++){
     for (int j=0;j<3;j++){
         if(matrizA[i][j]+matrizB[i][j]!=0){
             flag=true;
         }
     }
         
     }
     if (flag==false){
         System.out.println("la matriz dada es anti simetrica");
     }else{
         System.out.println("la matriz dada no es anti simetrica");
     }
     
}
}
