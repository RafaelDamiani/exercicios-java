package org.ufpr.tads;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafae
 */
public class TrianguloTest {
    @Test
    public void testaTrianguloRuntimeException() {
        try {
            double base = -1, altura = -1;
            Triangulo triangulo = new Triangulo(base, altura);
            
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Base e/ou altura são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }
    
    @Test
    public void testaTrianguloRuntimeException2() {
        try {
            double base = -2.5, altura = -3.0;
            Triangulo triangulo = new Triangulo(base, altura);
            
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Base e/ou altura são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }
    
    @Test
    public void testaAreaTriangulo1() {
        double base = 3, altura = 4, area;
        
        Triangulo triangulo = new Triangulo(base, altura);        

        area = (base * altura) / 2;

        assertEquals(area, triangulo.area(base, altura), 0.0);
    }
    
    @Test
    public void testaAreaTriangulo2() {
        double base = 4.7, altura = 7.8, area;
        
        Triangulo triangulo = new Triangulo(base, altura);       

        area = (base * altura) / 2;

        assertEquals(area, triangulo.area(base, altura), 0.0);
    }
}
