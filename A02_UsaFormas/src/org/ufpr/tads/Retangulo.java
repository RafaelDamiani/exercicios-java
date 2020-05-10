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
class Retangulo {

    double areaRetangulo, perimetroRetangulo;

    public Retangulo(double lado1, double lado2) {        
        if (lado1 < 0 || lado2 < 0) {
            throw new RuntimeException("lado 1 e/ou lado 2 são menores que 0. Por favor, insira um número maior ou igual a 0");
        }

        areaRetangulo = area(lado1 ,lado2);
        perimetroRetangulo = perimetro(lado1 ,lado2);
    }
    
    double area(double lado1, double lado2) {
        double area = 0.0;
        
        try {
            area = lado1 * lado2;
        }
        catch(Exception e) {
            System.out.print("Algum erro não esperado ocorreu: ");
            System.out.println(e);
        }
        
        return area;
    }

    double perimetro(double lado1, double lado2) {
        double perimetro = 0.0;
        
        try {
            perimetro = 2*(lado1 + lado2);
        }
        catch(Exception e){
            System.out.print("Algum erro não esperado ocorreu: ");
            System.out.println(e);
        }
        
        return perimetro;
    }
}
