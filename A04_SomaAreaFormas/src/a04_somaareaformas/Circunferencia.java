/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a04_somaareaformas;

import static java.lang.Math.PI;

/**
 *
 * @author rafae
 */
public class Circunferencia implements Superficie{

    public double radius;
        
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circunferencia(double radius) {
        this.radius = radius;
    }
    
    public double area(){
        return PI * Math.pow(this.radius, 2);
    }
}
