/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadiagonalprincipal;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class SomaDiagonalPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a dimensao da matriz: ");
        int dimensao = s.nextInt();

        int matriz[][] = new int[dimensao][dimensao];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Informe o numero da matriz na posicao [" + (linha + 1) + "][" + (coluna + 1) + "]");
                matriz[linha][coluna] = s.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        int diagPrincipal = 0, diagSecundaria = 0;
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                if (i == j) {
                    diagPrincipal = diagPrincipal + matriz[i][j];
                }
                if (((i + j) + 1) == (dimensao)) {
                    diagSecundaria = diagSecundaria + matriz[i][j];
                }
            }
        }
        int soma = diagPrincipal + diagSecundaria;
        System.out.println("\nA soma da diagonal principal é: " + diagPrincipal + " e a da diagonal secundaria é: " + diagSecundaria);
        System.out.println("A soma da diagonal principal com a secundaria é: " + soma);
    }
}
