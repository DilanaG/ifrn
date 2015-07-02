/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author 20141144010570
 */
public class Lista4 {

    /**
     * @param args the command line arguments
     */
    //Questão6
    public boolean Q6 (int x,int vetorA){
      return;  
    }
            
    public static void main(String[] args) {
        int x;
        int vetorA[] = null;
        Scanner E = new Scanner(System.in);
        System.out.println("Digite um valor para o tamanho do seu vetor:");
        x = E.nextInt();
        System.out.println("Dgite valores para o vetor:");
        for (int i=0; i<x; i++){
            vetorA[i]=E.nextInt();
        }
    }
}
