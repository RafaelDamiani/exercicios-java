package org.ufpr.tads;

import java.util.Scanner;

public class Calcula {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Qual area quer calcular? ");
        System.out.println("1 - Retangulo");
        System.out.println("2 - Circunferencia");
        System.out.println("3 - Triangulo");
        
        int areaEscolhida = scan.nextInt();
        double area;

        if (areaEscolhida == 1) {
            System.out.println("Calculo da Area do Retangulo!");

            System.out.printf("Insira o lado 1: ");
            double lado1 = scan.nextDouble();
            System.out.printf("\nInsira o lado 2: ");
            double lado2 = scan.nextDouble();
            area = calculaAreaRetangulo(lado1, lado2);
            System.out.printf("\n\nArea do retangulo: " + area);
        }
        else if (areaEscolhida == 2) {
            System.out.println("Calculo da Area da Circunferencia!");

            System.out.printf("Insira o raio: ");
            double raio = scan.nextDouble();
            area = calculaAreaCircunferencia(raio);
            System.out.printf("\n\nArea do retangulo: " + area);
        }
        else if (areaEscolhida == 3) {
            System.out.println("Calculo da Area do Triangulo!");

            System.out.printf("Insira a base: ");
            double base = scan.nextDouble();
            System.out.printf("Insira a altura: ");
            double altura = scan.nextDouble();            
            area = calculaAreaTriangulo(base, altura);
            System.out.printf("\n\nArea do Triangulo: " + area);
        }
        else {
            System.out.println("Comando não reconhecido.");
        }        
    }

    public static double calculaAreaRetangulo(double lado1, double lado2) {
        double area = 0.0;
        if (lado1 < 0 || lado2 < 0) {
            throw new RuntimeException("lado 1 e/ou lado 2 são menores que 0. Por favor, insira um número maior ou igual a 0");
        }
        try {
            area = lado1 * lado2;
        }
        catch(Exception e) {
            System.out.print("Algum erro não esperado ocorreu: ");
            System.out.println(e);
        }        
        return area;
    }

    public static double calculaAreaCircunferencia(double raio) {
        double pi = Math.PI, area = 0.0;

        if (raio < 0) {
            throw new RuntimeException("Raio é menor que 0. Por favor, insira um número maior ou igual a 0");
        }
        try {
            area = pi * (raio * raio);
        }
        catch(Exception e) {
            System.out.print("Algum erro não esperado ocorreu: ");
            System.out.println(e);
        }        

        return area;
    }

    public static double calculaAreaTriangulo(double base, double altura) {
        double area = 0.0;

        if (base < 0 || altura < 0) {
            throw new RuntimeException("Base e/ou altura são menores que 0. Por favor, insira um número maior ou igual a 0");
        }
        try {
            area = (base * altura) / 2;
        }
        catch(Exception e) {
            System.out.print("Algum erro não esperado ocorreu: ");
            System.out.println(e);
        }        

        return area;    
    }    
}