/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a07_contagemthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafae
 */
public class A07_ContagemThread {
    public static void main(String[] args) {
        ContagemThread ct1 = new ContagemThread(10);
        ContagemThread ct2 = new ContagemThread(20);
        ct1.start();
        ct2.start();
    }
}

class ContagemThread extends Thread {
    public int limiteContagem;

    public ContagemThread(int limiteContagem) {
        this.limiteContagem = limiteContagem;
    }

    public void run() {
        for (int i = 0; i <= this.limiteContagem; i ++) {
            System.out.println("Nome: " + getName() + " Numero: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ContagemThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
