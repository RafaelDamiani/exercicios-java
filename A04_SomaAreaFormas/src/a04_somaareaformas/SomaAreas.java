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
public class SomaAreas {
    public Object calculaArea(Object[] forma) {        
        double result = 0.0;
               
        //for (Iterator<Object> it = forma.iterator(); it.hasNext();)
        for (Object ob : forma) {
            if (ob instanceof Quadrado)
                result += ((Quadrado) ob).area();
            else if (ob instanceof Circunferencia)
                result += ((Circunferencia) ob).area();
        }
        return result;
    }
}
