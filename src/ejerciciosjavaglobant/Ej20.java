/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejerciciosjavaglobant;
import java.util.Scanner;
/**
 *
 * @author LUCAS
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = 3;
        int[][] matriz = new int[n][n];
        boolean flag;
       rellenarMatriz(matriz, input);
       muestra(matriz);
  flag =  magico(matriz, n);
if (flag==false){
    System.out.println("el cubo es magico");
}else{
    System.out.println("el cubo no es magico");
}
                
       
    }

    /**
     *
     * @param matriz
     * @param input
     */
    public static void rellenarMatriz(int[][]matriz, Scanner input){
        int num;
         System.out.println("escribe los 9 numeros del cuadrado entre el 1 y el 9");
        for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    System.out.print("matriz " +i+","+j+" :");
                    num = input.nextInt();
                    if (num<10&&num>0){
                        matriz[i][j]=num;
                    }else{
                        System.out.println("el numero no es correcto");
                        j--;
                    }
                }
        }
    }
    
    public static void muestra(int [][]matriz){
         for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }   
    }
    
    public static boolean magico(int[][]matriz, int n ){
 boolean flag = false;
 boolean start = false;
 int first;
        first = 0;
        int auxF;
        auxF = 0;
        int auxC;
        auxC = 0;
        int auxE;
        auxE = 0;
        int auxD =0;
 for (int i = 0; i<3;i++){
     for ( int j = 0; j<3; j++){
         auxF+=matriz[i][j];
         auxC+=matriz[j][i];
         if (start==false){
             auxE+=matriz[j][j];
         }
         if (i+j==n-1){
             auxD+=matriz[i][j];
         }  
     }
     start=true;
     if (auxC==auxF){
        first=auxC;
        
     }else{
         flag = true;
         break;
     }
     
     if (auxC==first&&auxF==first ){
         auxC=0;
         auxF=0;
     }else{
         flag=true;
         break;
     }
         
         }
        if (auxE!=first||auxD!=first){
            flag = true;
        }
         
         
         return flag;
        
    }
}
