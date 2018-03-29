/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinante;

import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Determinante {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int matriz[][] = new int [3][3];
        Scanner s = new Scanner (System.in);
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Informe o numero da matriz na posicao [" +(linha+1)+ "][" +(coluna+1)+"]");
                matriz[linha][coluna] = s.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print (matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        int diagPrincipalUm = 0, diagPrincipalDois = 0, diagPrincipalTres = 0;
        int diagSecundariaUm = 0, diagSecundariaDois = 0, diagSecundariaTres = 0;
        diagPrincipalUm = matriz[0][0] * matriz[1][1] * matriz[2][2];
        diagPrincipalDois = matriz[0][1] * matriz[1][2] * matriz[2][0];
        diagPrincipalTres = matriz[0][2] * matriz[1][0] * matriz[2][1];
        int somaDiagPrincipal = diagPrincipalUm + diagPrincipalDois + diagPrincipalTres;
        diagSecundariaUm = matriz[0][2] * matriz[1][1] * matriz[2][0];
        diagSecundariaDois = matriz[0][0] * matriz[1][2] * matriz[2][1];
        diagSecundariaTres = matriz[0][1] * matriz[1][0] * matriz[2][2];
        int somaDiagSecundaria = diagSecundariaUm + diagSecundariaDois + diagSecundariaTres;
        int determinante = somaDiagPrincipal - somaDiagSecundaria;
        System.out.println("O Determinante da matriz é: " +determinante);
    }
}