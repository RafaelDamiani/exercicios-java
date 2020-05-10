/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a04_somaareaformas;

/**
 *
 * @author rafae
 */
public class Quadrado implements Superficie {

    public double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public Quadrado(double side) {
        this.side = side;
    }
    
    public double area(){
        return Math.pow(this.side, 2);
    }
}
