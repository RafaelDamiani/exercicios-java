/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indicepluviometrico;

import java.util.Scanner;
/**
 *
 * @author Rafael Damiani
 */
public class IndicePluviometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String diaDaSemana[] = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
        float indicePluviometrico[] = new float[7];
        Scanner s = new Scanner (System.in);
        float indiceMinimo = 999f, indiceMaximo = -999f;
        String diaMenorIndice = "", diaMaiorIndice = "";
        
        for (int i = 0; i < diaDaSemana.length; i++) {
            System.out.println ("Digite o indice pluviometrico de " + diaDaSemana[i] + ":");
            indicePluviometrico[i] = s.nextFloat();
            if (indicePluviometrico[i] < indiceMinimo){
                indiceMinimo = indicePluviometrico[i];
                diaMenorIndice = diaDaSemana[i]; 
            }
            if (indicePluviometrico[i] > indiceMaximo){
                indiceMaximo = indicePluviometrico[i];
                diaMaiorIndice = diaDaSemana[i];
            }    
        }
        float soma = 0, media = 0;
        for (float elemento : indicePluviometrico) {
            soma += elemento;
        }
        media = soma / diaDaSemana.length;
        System.out.printf ("Media do Indice Pluviometrico: %.2f\n", media);
        System.out.println ("Indice Pluviométrico minimo foi no dia de " + diaMenorIndice + " com o valor de: " + indiceMinimo);
        System.out.println ("Indice Pluviometrico maximo foi no dia de " + diaMaiorIndice + " com o valor de: " + indiceMaximo);
    }
    
}