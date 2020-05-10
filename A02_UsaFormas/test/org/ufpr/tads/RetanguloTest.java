package org.ufpr.tads;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafae
 */
public class RetanguloTest {
    @Test
    public void testaAreaRetanguloRuntimeException() {
        try {
            double lado1 = -1, lado2 = -1;            
            Retangulo retangulo = new Retangulo(lado1, lado2);
                       
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("lado 1 e/ou lado 2 são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }
    
    @Test
    public void testaAreaRetanguloRuntimeException2() {
        try {
            double lado1 = -2.5, lado2 = -3.0;            
            Retangulo retangulo = new Retangulo(lado1, lado2);
                       
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("lado 1 e/ou lado 2 são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }
    
    @Test
    public void testaAreaRetangulo1() {
        double lado1 = 3, lado2 = 4, area;
        
        Retangulo retangulo = new Retangulo(lado1, lado2);

        area = lado1 * lado2;

        assertEquals(area, retangulo.area(lado1, lado2), 0.0);
    }
    
    @Test
    public void testaAreaRetangulo2() {
        double lado1 = 4.7, lado2 = 7.8, area;
        
        Retangulo retangulo = new Retangulo(lado1, lado2);

        area = lado1 * lado2;

        assertEquals(area, retangulo.area(lado1, lado2), 0.0);
    }
    
    @Test
    public void testaPerimetroRetangulo1() {
        double lado1 = 3, lado2 = 4, perimetro;
        
        Retangulo retangulo = new Retangulo(lado1, lado2);
        
        perimetro = 2*(lado1 + lado2);
        
        assertEquals(perimetro, retangulo.perimetro(lado1, lado2), 0.0);
    }
    
    @Test
    public void testaPerimetroRetangulo2() {
        double lado1 = 4.7, lado2 = 7.8, perimetro;
        
        Retangulo retangulo = new Retangulo(lado1, lado2);
        
        perimetro = 2*(lado1 + lado2);
        
        assertEquals(perimetro, retangulo.perimetro(lado1, lado2), 0.0);
    }
}
