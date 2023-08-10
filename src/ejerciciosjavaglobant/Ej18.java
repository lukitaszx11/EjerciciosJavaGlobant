/*
 * llenar una matriz "A" 4 x 4 con valores aleatorios y crear una matriz "B" que sea la matriz "A" transpuesta
 */
package ejerciciosjavaglobant;

/**
 *
 * @author LUCAS
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizA= new int[4][4], matrizB= new int[4][4];
        rellenarMatrizA(matrizA);
          rellenarMatrizB(matrizA, matrizB);
          muestraDeMatrices(matrizA, matrizB);
              
    }
    
 public static void rellenarMatrizA(int[][] matrizA){
 
     for (int i = 0; i<4;i++)   {
          for (int j = 0; j < 4; j++){
              matrizA[i][j]=(int)(Math.random()*10+1);
          }
      }
 }
 public static void rellenarMatrizB(int[][] matrizA, int[][] matrizB){
      for (int i = 0; i<4;i++)   {
          for (int j = 0; j < 4; j++){
              matrizB[j][i]=matrizA[i][j];
          }
    }
 }
  public static void muestraDeMatrices(int[][] matrizA, int[][] matrizB){
      System.out.println("Matriz A: ");
      for (int i = 0; i<4;i++){
          for (int j = 0; j<4; j++){
              System.out.print(" ["+matrizA[i][j]+"] ");
          }
          System.out.println("");
      }
      System.out.println("\n");
      System.out.println("Matriz B: ");
      for (int i = 0; i<4;i++){
          for (int j = 0; j<4; j++){
              System.out.print(" ["+matrizB[i][j]+"] ");
          }
          System.out.println("");
      }
      
          
  }

}

