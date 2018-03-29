package org.ufpr.exercicios-java;

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main (String[] args) {
        System.out.println ("Informe a distancia percorrida (km): ");
        Scanner s = new Scanner (System.in);
        float km = s.nextFloat();
        System.out.println ("Informe o tempo da viagem (em horas): ");
        float horas = s.nextFloat();

        double velocidadeMedia = km / horas;

        System.out.printf ("A velocdiade media do automovel e: %.2f km/h", (velocidadeMedia));
    }

}
