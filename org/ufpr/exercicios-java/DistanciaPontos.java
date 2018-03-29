package org.ufpr.exercicios-java;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaPontos {
      public static void main (String[] args) {
          System.out.println ("Digite o ponto X de A: ");
          Scanner s= new Scanner (System.in);
          int pontoXA = s.nextInt();
          System.out.println ("Digite o ponto Y de A: ");
          int pontoYA = s.nextInt();

          System.out.println ("Digite o ponto X de B: ");
          int pontoXB = s.nextInt();
          System.out.println ("Digite o ponto Y de B: ");
          int pontoYB = s.nextInt();

          float distanciaX = pontoXB - pontoXA;
          float distanciaY = pontoYB - pontoYA;
          float distancia = (distanciaX*distanciaX) + (distanciaY*distanciaY);
          System.out.printf ("A distancia entre os dois pontos e: %.2f", Math.sqrt(distancia));

      }

}
