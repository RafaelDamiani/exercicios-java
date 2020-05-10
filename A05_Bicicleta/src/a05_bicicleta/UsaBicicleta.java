/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a05_bicicleta;

/**
 *
 * @author rafae
 */
public class UsaBicicleta {
    public static void main(String[] args) {
        Bici bike = new Bici();
        bike.bicicleta.aumentarVelocidade(20);
        bike.bicicleta.printStates();
        bike.bicicleta.mudarCadencia(20);
        bike.bicicleta.printStates();
        bike.bicicleta.mudarMarcha(2);
        bike.bicicleta.printStates();
        bike.bicicleta.aplicarFreios(7);
        bike.bicicleta.printStates();
    }
}
