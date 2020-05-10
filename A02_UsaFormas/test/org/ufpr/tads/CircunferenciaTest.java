package org.ufpr.tads;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafae
 */
public class CircunferenciaTest {
    @Test
    public void testaCircunferenciaRuntimeException() {
        try {
            double raio = -1;
            Circunferencia circunferencia = new Circunferencia(raio);
            
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Raio é menor que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }
     
    @Test
    public void testaCircunferenciaRuntimeException2() {
        try {
            double raio = -3.6;
            Circunferencia circunferencia = new Circunferencia(raio);
            
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Raio é menor que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }
        
    @Test
    public void testaAreaCircunferencia1() {
        double pi = Math.PI, raio = 1, area;
        
        Circunferencia circunferencia = new Circunferencia(raio);        
        
        area = pi * (raio * raio);

        assertEquals(area, circunferencia.area(raio), 0.0);
    }
    
    @Test
    public void testaAreaCircunferencia2() {
        double pi = Math.PI, raio = 2.0, area;
        
        Circunferencia circunferencia = new Circunferencia(raio);        
        
        area = pi * (raio * raio);

        assertEquals(area, circunferencia.area(raio), 0.0);
    }
}
