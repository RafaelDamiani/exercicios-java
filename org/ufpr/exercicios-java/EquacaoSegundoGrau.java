package org.ufpr.exercicios-java;

import java.util.Scanner;
import java.lang.Math;

public class EquacaoSegundoGrau {
	public static void main (String[] args) {
		System.out.println ("Digite o valor de a: ");
		Scanner s = new Scanner (System.in);
		double a = s.nextDouble();
		System.out.println ("Digite o valor de b: ");
		double b = s.nextDouble();
		System.out.println ("Digite o valor de c: ");
		double c = s.nextDouble();

		double xRaizPositiva = (-b + (Math.sqrt((b*b)-(4*a*c)))) / (2*a);
		double xRaizNegativa = (-b - (Math.sqrt((b*b)-(4*a*c)))) / (2*a);

		System.out.printf ("Valor de x1: %.2f\n", xRaizPositiva);
		System.out.printf ("Valor de x2: %.2f", xRaizNegativa);
	}


}
