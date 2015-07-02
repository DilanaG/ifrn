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
    public static void main(String[] args) {
        int x, y = 0;
        int vetor[];
        Scanner E = new Scanner(System.in);
        System.out.println("Digite um valor para o tamanho do seu vetor");
        x = E.nextInt();
        vetor = new int[x];
        System.out.println("Digite valores para o seu vetor");

        for (int i = 0; i < x; i++) {
            vetor[i] = E.nextInt();
        }

        for (int i = 0; i < x; i++) {
            if (vetor[i] < 0) {
                y++;
            }
        }
        System.out.println("A quantidade de números negativos é:" + y);
    }
}
