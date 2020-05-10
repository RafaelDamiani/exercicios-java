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
class Triangulo {

    double areaTriangulo;

    public Triangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new RuntimeException("Base e/ou altura são menores que 0. Por favor, insira um número maior ou igual a 0");
        }
        
        areaTriangulo = area(base, altura);
    }
    
    double area(double base, double altura) {
        double area = 0.0;
        
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
