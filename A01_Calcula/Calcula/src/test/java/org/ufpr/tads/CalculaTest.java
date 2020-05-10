package org.ufpr.tads;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculaTest {

    /**
     * Testes de área do Retângulo, onde:
     * 
     * @param lado1 é um lado
     * @param lado2 é outro lado
     * @param area é o resultado de lado1 * lado2;
     */
    @Test
    public void testaAreaRetanguloRuntimeException() {
        try {
            double lado1 = -1, lado2 = -1;

            Calcula.calculaAreaRetangulo(lado1, lado2);
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("lado 1 e/ou lado 2 são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }

    @Test
    public void testaAreaRetanguloExceptionLado1() {
        try {
            double lado1 = -1, lado2 = 1;

            Calcula.calculaAreaRetangulo(lado1, lado2);
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("lado 1 e/ou lado 2 são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());

        }
    }

    @Test
    public void testaAreaRetanguloExceptionLado2() {
        try {
            double lado1 = 1, lado2 = -1;

            Calcula.calculaAreaRetangulo(lado1, lado2);
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("lado 1 e/ou lado 2 são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }

    @Test
    public void testaAreaRetangulo1() {
        double lado1 = 2, lado2 = 2, area;

        area = lado1 * lado2;

        assertEquals(area, Calcula.calculaAreaRetangulo(lado1, lado2), 0.0);
    }

    @Test
    public void testaAreaRetangulo2() {
        double lado1 = 2.0, lado2 = 2.0, area;

        area = lado1 * lado2;

        assertEquals(area, Calcula.calculaAreaRetangulo(lado1, lado2), 0.0);
    }

    @Test
    public void testaAreaRetangulo3() {
        double lado1 = 3, lado2 = 3.0, area;

        area = lado1 * lado2;

        assertEquals(area, Calcula.calculaAreaRetangulo(lado1, lado2), 0.0);
    }

    @Test
    public void testaAreaRetangulo4() {
        double lado1 = 4.0, lado2 = 4, area;

        area = lado1 * lado2;

        assertEquals(area, Calcula.calculaAreaRetangulo(lado1, lado2), 0.0);
    }

    @Test
    public void testaAreaRetangulo5() {
        double lado1 = 2.3, lado2 = 2.7, area;

        area = lado1 * lado2;

        assertEquals(area, Calcula.calculaAreaRetangulo(lado1, lado2), 0.0);
    }

    @Test
    public void testaAreaRetangulo6() {
        double lado1 = 3, lado2 = 3.7, area;

        area = lado1 * lado2;

        assertEquals(area, Calcula.calculaAreaRetangulo(lado1, lado2), 0.0);
    }

    @Test
    public void testaAreaRetangulo7() {
        double lado1 = 4.3, lado2 = 4, area;

        area = lado1 * lado2;

        assertEquals(area, Calcula.calculaAreaRetangulo(lado1, lado2), 0.0);
    }

    /**
     * Testes de área da Circunferência, onde:
     * 
     * @param pi é o valor de pi
     * @param raio é o raio da circunferência
     * @param area é o resultado de pi * raio²
     */

     @Test
    public void testaAreaCircunferenciaRuntimeException() {
        try{
            double raio = -1;

            Calcula.calculaAreaCircunferencia(raio);
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Raio é menor que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }

    @Test
    public void testaAreaCircunferencia1() {
        double pi = Math.PI, raio = 1, area;
        
        area = pi * (raio * raio);

        assertEquals(area, Calcula.calculaAreaCircunferencia(raio), 0.0);
    }

    @Test
    public void testaAreaCircunferencia2() {
        double pi = Math.PI, raio = 2.0, area;
        
        area = pi * (raio * raio);

        assertEquals(area, Calcula.calculaAreaCircunferencia(raio), 0.0);
    }

    @Test
    public void testaAreaCircunferencia3() {
        double pi = Math.PI, raio = 3.4, area;
        
        area = pi * (raio * raio);

        assertEquals(area, Calcula.calculaAreaCircunferencia(raio), 0.0);
    }

    @Test
    public void testaAreaCircunferencia4() {
        double pi = Math.PI, raio = 4.7, area;
        
        area = pi * (raio * raio);

        assertEquals(area, Calcula.calculaAreaCircunferencia(raio), 0.0);
    }

    @Test
    public void testaAreaCircunferencia5() {
        double pi = Math.PI, raio = 5.6, area;
        
        area = pi * (raio * raio);

        assertEquals(area, Calcula.calculaAreaCircunferencia(raio), 0.0);
    }

     /**
     * Testes de área do Triângulo, onde:
     * 
     * @param base é a base do triângulo
     * @param altura é a distância entre o ponto central da base até a ponta
     * @param area é o resultado de base * altura / 2
     */
    @Test
    public void testaAreaTrianguloRuntimeException() {
        try{
            double base = -1, altura = -1;

            Calcula.calculaAreaTriangulo(base, altura);
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Base e/ou altura são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }

    @Test
    public void testaAreaTrianguloRuntimeExceptionBase() {
        try{
            double base = -1, altura = 1;

            Calcula.calculaAreaTriangulo(base, altura);
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Base e/ou altura são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }

    @Test
    public void testaAreaTrianguloRuntimeExceptionAltura() {
        try{
            double base = 1, altura = -1;

            Calcula.calculaAreaTriangulo(base, altura);
            fail("Deveria ter dado erro");
        }
        catch(Exception ex) {
            assertEquals("Base e/ou altura são menores que 0. Por favor, insira um número maior ou igual a 0", ex.getMessage());
        }
    }

    @Test
    public void testaAreaTriangulo1() {
        double base = 3, altura = 4, area;

        area = (base * altura) / 2;

        assertEquals(area, Calcula.calculaAreaTriangulo(base, altura), 0.0);
    }

    @Test
    public void testaAreaTriangulo2() {
        double base = 4.7, altura = 7.8, area;

        area = (base * altura) / 2;

        assertEquals(area, Calcula.calculaAreaTriangulo(base, altura), 0.0);
    }

    @Test
    public void testaAreaTriangulo3() {
        double base = 5, altura = 8.4, area;

        area = (base * altura) / 2;

        assertEquals(area, Calcula.calculaAreaTriangulo(base, altura), 0.0);
    }

    @Test
    public void testaAreaTriangulo4() {
        double base = 6.7, altura = 11, area;

        area = (base * altura) / 2;

        assertEquals(area, Calcula.calculaAreaTriangulo(base, altura), 0.0);
    }
}