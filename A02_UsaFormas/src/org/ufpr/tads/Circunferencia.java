/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.tads;

/**
 *
 * @author rafae
 */
class Circunferencia {

    double areaCircunferencia;

    public Circunferencia(double raio) {
        if (raio < 0) {
            throw new RuntimeException("Raio é menor que 0. Por favor, insira um número maior ou igual a 0");
        }
        
        areaCircunferencia = area(raio);
    }
    
    double area(double raio) {
        double pi = Math.PI, area = 0.0;
        
        try {
            area = pi * (raio * raio);
        }
        catch(Exception e) {
            System.out.print("Algum erro não esperado ocorreu: ");
            System.out.println(e);
        }        

        return area;
    }
}
