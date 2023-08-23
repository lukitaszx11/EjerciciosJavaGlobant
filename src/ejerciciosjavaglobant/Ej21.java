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
     RellenarMatrizP(matrizP);
     retorno = Comprobación(matrizP, matrizM, p, m);
     if (retorno==true){
         System.out.println("la matriz se encuentra");
     }else{
         System.out.println("la matriz no se encuentra");
     }
    }
    
    public static void RellenarMatrizM(int[][] matrizM, int m){
        for (int i = 0; i<m;i++){
            for (int j = 0; j<m; j++){
                matrizM[i][j]= (int) (Math.random()*10);
            }
        }
        matrizM[0][1]=3;
        matrizM[0][2]=4;
        matrizM[0][3]=5;
        matrizM[1][1]=3;
        matrizM[1][2]=6;
        matrizM[1][3]=7;
        matrizM[2][1]=9;
        matrizM[2][2]=8;
        matrizM[2][3]=1;
        
         for (int i = 0; i<m;i++){
            for (int j = 0; j<m; j++){
                System.out.print(" ["+matrizM[i][j]+"] ");
            }
             System.out.println("");
        }
      System.out.println("\n");
        
        
    }
    
    public static void RellenarMatrizP(int [][] matrizP){
        matrizP[0][0]=3;
        matrizP[0][1]=4;
        matrizP[0][2]=5;
        matrizP[1][0]=3;
        matrizP[1][1]=6;
        matrizP[1][2]=7;
        matrizP[2][0]=9;
        matrizP[2][1]=8;
        matrizP[2][2]=1;
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3; j++){
                System.out.print(" ["+matrizP[i][j]+"] ");
            }
             System.out.println("");
        }
        System.out.println("\n");
    }
    
    public static boolean Comprobación(int[][] matrizM, int[][] matrizP, int p, int m) {
    boolean flag = false;

    int b, n;
    
    for (int i = 0; i <= m - p; i++) {  // Asegurarse de no salirse del rango
        for (int j = 0; j <= m-p; j++) {  // Asegurarse de no salirse del rango
            if (matrizM[i][j] == matrizP[0][0]) {
                          int cant = 0;  // Reiniciar el contador después de cada iteración interna
                b = 0;
                
                for (int k = i; k < i + p; k++) {
                    n = 0;
                    for (int l = j; l < j + p; l++) {
                        if (matrizM[k][l] == matrizP[b][n]) {
                            cant++;
                            System.out.println("cant");
                        }
                     if (n>2){
                         System.out.println("miau");
                     }
                        n++;
                    }
                    b++;
                }

                if (cant == p * p) {
                    flag = true;
                    return flag;  // No es necesario seguir iterando si ya encontramos una coincidencia
                }
            }            
        }
    }
    
    return flag;
}

}
