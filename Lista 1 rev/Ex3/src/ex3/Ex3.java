/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author gabil
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int[][] matrix = new int[3][3];
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.println("Digite Numero: " + i + j );
               matrix[i][j] = scan.nextInt();
           }
       }
         for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(matrix[i][j] + "-" );
             
           }
          System.out.println();
       }
       
       
       
    }
}
    
    

