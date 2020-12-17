/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
import java.util.Scanner;
/**
 *
 * @author gabil
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0;i<10; i++ )
        {
            System.out.println("Digite 10 numeros: ");
            vetor[i] = scan.nextInt();
        }
        for (int i = 0;i<10; i++ )
        {
            System.out.println("Os numeros sao: " + vetor[i]);
           
        }
    }
    }
    

