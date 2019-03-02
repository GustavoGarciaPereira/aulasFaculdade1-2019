/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3thread;

import java.util.Scanner;

/**
 *
 * @author usrlab01
 */
public class Questao3 {

    

    /**
     * @param args the command line arguments
     */
    int matriz[][];
    public Questao3(int L, int C){
        matriz = new int[L][C];
        for(int i=0; i<L; i++){
            for(int j=0; j<C; j++){
                matriz[i][j] = i+j;
                //matriz[i][j] = 2;
            }
        }
        
    }
    public void mostra(int L, int C){
        for(int i=0; i<L; i++){
            for(int j=0; j<C; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public int[][] retornaM(){
        return matriz;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe as Linhas: ");
        int L = entrada.nextInt();
        System.out.print("Informe as Colunas: ");
        int C = entrada.nextInt();
        Questao3 matrizr = new Questao3(L,C);
        matrizr.mostra(L, C);
        int m[][] = matrizr.retornaM();
         
        for(int i=0; i<L; i++){
            MinhaThread t1 = new MinhaThread(m[i],i);
            t1.start();
        }
        
        
        
    }
}
