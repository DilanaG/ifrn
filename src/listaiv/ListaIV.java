package listaiv;

import java.util.Scanner;

public class ListaIV {

    public int q5 (int x, int vetorA, int y, int z){
        int a=0;
        for (int i=0; i<y; i++)
            if (z == x){
            a++;
            }
            
            return a;
     
    
    }
    
    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
       int vetorA [] ;
       int y, x,z=0;
       System.out.println("Digite um número que irá preeencher seu array:");
       y = E.nextInt(); 
       vetorA = new int[y];
        System.out.println("Digite um número:");
       x = E.nextInt();
        System.out.println("Digite os números que irão preencher seu array:");
       
        for (int i=0; i<y; i++) {
            z = E.nextInt();
            vetorA[i] = z; 
        }
        }
        }
       
