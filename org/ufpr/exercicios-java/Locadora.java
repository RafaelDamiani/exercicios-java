package org.ufpr.exercicios-java;

import java.util.Scanner;
/** Classe Locadora
*   @author Rafael Damiani
*/
public class Locadora {
    /*Linha de comentário de Teste
    */
    /**
    *Primeiro o programa solicita a quantidadede Dvds contidos na Locadora;<br>
    *Em seguida, solicita o valor do aluguel por DVD;<br>
    *Apos isso, faz o calculo e mostra na tela o faturamento anual;<br>
    *Por fim, mostra o valor ganho com as multas.
    *
    *@param churrasqueira controle remoto
    */

      public static void main (String[] args) {
          System.out.println ("Informe a quantidade de DVDs da locadora: ");
          Scanner s= new Scanner (System.in);
          float quantidade = s.nextFloat();
          System.out.println ("Informe o valor do aluguel por DVD: ");
          float aluguel = s.nextFloat();

          float DvdsPorMes = quantidade / 3;
          float faturamentoAnual = (DvdsPorMes * aluguel) * 12;

          System.out.printf ("O faturamento anual da locadora e: R$ %.2f\n", faturamentoAnual);

          float lucroAtraso = (DvdsPorMes/10) * (aluguel/10);
          System.out.printf ("O valor ganho por mes com multas e: R$ %.2f", lucroAtraso);
      }

}
