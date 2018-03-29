package org.ufpr.exercicios-java;

import java.util.Scanner;
import java.lang.Math;

public class BonusAnual {
	public static void main (String[] args) {
		System.out.println ("Digite o cargo do funcionario: ");
		Scanner s = new Scanner (System.in);
		String cargo = s.nextLine();
		System.out.println ("Digite o salario do funcionario: ");
		double salario = s.nextDouble();

		switch (cargo) {
			case "Diretor":
				System.out.println ("Digite a quantidade de departamentos gerenciadas: ");
				int departamento = s.nextInt();
				double bonusDiretor = (4*salario) + (3000*departamento);
				System.out.printf ("Bonus anual do funcionario: " +bonusDiretor);
				break;
			case "Gerente":
				System.out.println ("Digite a quantidade de pessoas gerenciadas: ");
				int pessoas = s.nextInt();
				double bonusGerente = (2*salario) + (100*pessoas);
				System.out.printf ("Bonus anual do funcionario: %.2f", bonusGerente);
				break;
			case "Analista":
				double bonusAnalista = salario;
				System.out.printf ("Bonus anual do funcionario: %.2f", bonusAnalista);
				break;
			case "Programador":
				double bonusProgramador = 0.8*salario;
				System.out.printf ("Bonus anual do funcionario: %.2f", bonusProgramador);
				break;
			case "Auxiliar de Limpeza":
				double bonusAuxiliar = 0.5*salario;
				System.out.printf ("Bonus anual do funcionario: %.2f", bonusAuxiliar);
				break;
			default:
				System.out.println ("Cargo nao existente!");
		}
	}
}
