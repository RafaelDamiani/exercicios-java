package org.ufpr.exercicios-java;

import java.util.Scanner;

public class Fibonacci{
	public static void main (String[] args){

			String arg = args[0];
			int numero = Integer.parseInt(arg);

			int atual = 1, anterior = 0;

			System.out.print (anterior);
			System.out.print (" " +atual);
			for (int cont = 0; cont < numero; cont++) {
					if (atual <= (numero-anterior)){
								atual = atual + anterior;
								anterior = atual - anterior;
								System.out.print (" " +atual);
					}
			}
	}	
}
