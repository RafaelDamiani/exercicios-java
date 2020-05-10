/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a05_velocidademedia;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class A05_VelocidadeMedia {
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Informe a distancia percorrida(KM): ");
        double distanciaPercorrida = scan.nextDouble();
        System.out.println("Informe o tempo gasto na viagem: ");
        double tempoGasto = scan.nextDouble();
        BigDecimal distanciaPercorridaBD = new BigDecimal(distanciaPercorrida).setScale(10, RoundingMode.HALF_UP);
        BigDecimal tempoGastoBD = new BigDecimal(tempoGasto).setScale(10, RoundingMode.HALF_UP);
        BigDecimal velocidade = distanciaPercorridaBD.divide(tempoGastoBD, 3, RoundingMode.HALF_UP);
        System.out.printf("Velocidade média: %s\n", velocidade);
    }
}
