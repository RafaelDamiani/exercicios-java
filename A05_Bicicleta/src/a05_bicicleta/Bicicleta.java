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
class Bicicleta {
    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;
    void mudarCadencia(int novoValor){
        cadencia = novoValor;
    }
    void mudarMarcha(int novoValor){
        marcha = novoValor;
    }
    void aumentarVelocidade(int incremento){
        velocidade = velocidade + incremento;
    }
    void aplicarFreios(int decremento){
        velocidade = velocidade - decremento;
    }
    void printStates(){
        System.out.println("cadencia="+cadencia+" velocidade="+velocidade+" marcha="+marcha);
    }
}

class Bici {
    Bicicleta bicicleta = new Bicicleta() {
        void aplicarFreios(int decremento) {
            velocidade = velocidade - 2*decremento;
        }
    };
}