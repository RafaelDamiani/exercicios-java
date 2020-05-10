package org.ufpr.tads;

import java.util.Scanner;

public class Salario {
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Calculo do Salario!\n");

        System.out.printf("Insira o valor do salario por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.printf("\nInsira o numero de horas trabalhados no mes: ");
        int horasTrabalhadasMes = scan.nextInt();
        System.out.printf("Insira o percentual do INSS: ");
        double descontoInss = scan.nextDouble();

        recebeParametros(salarioHora, horasTrabalhadasMes, descontoInss);        
    }

    public static boolean recebeParametros(double salarioHora, int horasTrabalhadasMes, double descontoInss) {
        if (salarioHora < 0) {
            throw new RuntimeException("Salario hora nao deve ser menor que zero");
        }
        if (horasTrabalhadasMes < 0) {
            throw new RuntimeException("Horas trabalhadas no mes nao deve ser menor que zero");
        }
        if (descontoInss < 0) {
            throw new RuntimeException("Desconto do INSS nao deve ser menor que zero");
        }

        double salarioBruto = calculaSalarioBruto(salarioHora, horasTrabalhadasMes, descontoInss);
        double salarioLiquido = calculaSalarioLiquido(salarioHora, horasTrabalhadasMes);

        imprimeResultado(salarioHora, horasTrabalhadasMes, salarioBruto, salarioLiquido);

        return true;
    }

    public static double calculaSalarioBruto(double salarioHora, int horasTrabalhadasMes, double descontoInss) {
        double salarioLiquido = salarioHora * horasTrabalhadasMes;
        double desconto = (salarioLiquido * descontoInss) / 100;
        double salarioBruto = salarioLiquido - desconto;

        return salarioBruto;
    }

    public static double calculaSalarioLiquido(double salarioHora, int horasTrabalhadasMes) {
        double salarioLiquido = salarioHora * horasTrabalhadasMes;

        return salarioLiquido;
    }

    public static void imprimeResultado(double salarioHora, int horasTrabalhadasMes, double salarioBruto, double salarioLiquido) {
        System.out.println("Extrato de salario\n");
        System.out.printf("Valor Hora: R$ %.2f\n", salarioHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadasMes + " horas");
        System.out.printf("Salario Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Salario Liquido: R$ %.2f\n", salarioLiquido);
    }
}
