package org.ufpr.tads;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class A02_UsaFormas {
    private static Scanner scan = new Scanner(System.in);
        
    public static void main(String[] args) {
        System.out.println("Quantas formas deseja criar? ");
        
        int quantidade = scan.nextInt(), operacao= 0;

        String[] areas = new String[quantidade];
        String[] perimetros = new String[quantidade];

        Integer operacoes[] = new Integer[quantidade];
        
        double area = 0.0, perimetro = 0.0;
        
        for (int i = 0; i < quantidade; i++) {
            if (operacao == 4) {
                break;
            }                
                
            System.out.println("Qual forma quer calcular? ");
            System.out.println("1 - Retangulo");
            System.out.println("2 - Circunferencia");
            System.out.println("3 - Triangulo");
            System.out.println("4 - Saindo");

            operacao = scan.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Calculo da Area do Retangulo!");
                    System.out.printf("Insira o lado 1: ");
                    double lado1 = scan.nextDouble();
                    System.out.printf("Insira o lado 2: ");
                    double lado2 = scan.nextDouble();

                    Retangulo retangulo = new Retangulo(lado1, lado2);

                    area = retangulo.areaRetangulo;
                    perimetro = retangulo.perimetroRetangulo;

                    break;
                case 2:
                    System.out.println("Calculo da Area da Circunferencia!!");
                    System.out.printf("Insira o raio: ");
                    double raio = scan.nextDouble();

                    Circunferencia circunferencia = new Circunferencia(raio);

                    area = circunferencia.areaCircunferencia;
                    perimetro = -1.0;

                    break;
                case 3:
                    System.out.println("Calculo da Area do Triangulo!");
                    System.out.printf("Insira a base: ");
                    double base = scan.nextDouble();
                    System.out.printf("Insira a altura: ");
                    double altura = scan.nextDouble();      

                    Triangulo triangulo = new Triangulo(base, altura);

                    area = triangulo.areaTriangulo;
                    perimetro = -1.0;

                    break;
                case 4:
                    System.out.println("Execucao finalizada pelo usuario");

                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    System.out.println("\n");
                    continue;
            }
            
            System.out.println("\n");
            DecimalFormat duasCasasDecimais = new DecimalFormat("0.00"); //Make new decimal format

            areas[i] = duasCasasDecimais.format(area);
            perimetros[i] = duasCasasDecimais.format(perimetro);
            operacoes[i] = operacao;
        }
        
        for (int i = 0; i < areas.length; i++) {
            switch (operacoes[i]) { 
                case 1:
                    System.out.println((i + 1) + " - Area do Retangulo: " + areas[i]);
                    System.out.println((i + 1) + " - Perimetro do Retangulo: " + perimetros[i]);
                    break;
                case 2:
                    System.out.println((i + 1) + " - Area da Circunferencia: " + areas[i]);
                    break;
                case 3:
                    System.out.println((i + 1) + " - Area do Triangulo: " + areas[i]);
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    return;
            }
        }
    }
}
