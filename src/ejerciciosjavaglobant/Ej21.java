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
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean retorno;
        int m =10, p=3;
       int[][] matrizM = new int[m][m];
       int[][] matrizP = new int[p][p];
     RellenarMatrizM(matrizM, m);       
     RellenarMatrizP(matrizP, p);
     retorno = Comprobación(matrizP, matrizM, p, m);
     if (retorno==true){
         System.out.println("la matriz se encuentra");
     }else{
         System.out.println("la matriz no se encuentra");
     }
    }
    
    public static void RellenarMatrizM(int[][] matrizM, int m){
        for (int i = 0; i<m;m++){
            for (int j = 0; j<m; j++){
                matrizM[i][j]= (int) (Math.random()*10+1);
            }
        }
        matrizM[5][5]=3;
        matrizM[5][6]=4;
        matrizM[5][7]=5;
        matrizM[6][5]=3;
        matrizM[6][6]=6;
        matrizM[6][7]=7;
        matrizM[7][5]=9;
        matrizM[7][6]=8;
        matrizM[7][7]=1;
    }
    
    public static void RellenarMatrizP(int [][] matrizP, int p){
        matrizP[0][0]=3;
        matrizP[0][1]=4;
        matrizP[0][2]=5;
        matrizP[1][0]=3;
        matrizP[1][1]=6;
        matrizP[1][2]=7;
        matrizP[2][0]=9;
        matrizP[2][1]=8;
        matrizP[2][2]=1;
    }
    
    public static boolean Comprobación(int[][] matrizM,int [][] matrizP, int p, int m){
      boolean flag = false;
      int k, l;
                  int cant=0;
                  int b = 0, n = 0;
      for (int i = 0; i<m;i++){
          for (int j =0; j<m; j++){
              if (matrizM[i][j]==matrizP[0][0]){
                  
                  for  (k =i;k<p;k++){
                      for (l=j;l<p;l++){
                          if (matrizM[k][l]==matrizP[b][n]){
                              cant++;
                              n++;
                          }
                          
                      }
                      n=0;
                          b++;
                  }
                  if(cant==9){
                      flag = true;
                      break;
                     
                  }
              }
              b=0;
              cant=0;
          }
      }
        return flag;
    }
}
