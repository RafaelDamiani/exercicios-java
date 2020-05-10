package org.ufpr.tads;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class SalarioTest {

    @Test
    public void testaParametroSalario() {
        double salarioHora = 1;

        assertEquals(true, Salario.recebeParametros(salarioHora, 1, 1));
    }

    @Test
    public void testaParametroNumHoras() {
        double salarioHora = 1;
        int horasTrabalhadasMes = 1;

        assertEquals(true, Salario.recebeParametros(salarioHora, horasTrabalhadasMes, 1));
    }

    @Test
    public void testaParametroDesconto() {
        double salarioHora = 1, descontoInss = 1;
        int horasTrabalhadasMes = 1;

        assertEquals(true, Salario.recebeParametros(salarioHora, horasTrabalhadasMes, descontoInss));
    }

    @Test
    public void testaCalculoSalarioBrutoInteiro() {
        double salarioHora = 10, descontoInss = 5;
        int horasTrabalhadasMes = 100;
        
        assertEquals(950, Salario.calculaSalarioBruto(salarioHora, horasTrabalhadasMes, descontoInss), 0);
    }

    @Test
    public void testaCalculoSalarioBrutoDouble() {
        double salarioHora = 10.50, descontoInss = 5.9;
        int  horasTrabalhadasMes = 100;

        assertEquals(988.05, Salario.calculaSalarioBruto(salarioHora, horasTrabalhadasMes, descontoInss), 0);
    }

    @Test
    public void testaCalculoSalarioLiquidoInteiro() {
        double salarioHora = 10;
        int horasTrabalhadasMes = 100;
        
        assertEquals(1000, Salario.calculaSalarioLiquido(salarioHora, horasTrabalhadasMes), 0);
    }

    @Test
    public void testaCalculoSalarioLiquidoDouble() {
        double salarioHora = 10.50;
        int  horasTrabalhadasMes = 100;

        assertEquals(1050, Salario.calculaSalarioLiquido(salarioHora, horasTrabalhadasMes), 0);
    }

    @After
    public void testaImprimeResultadosInteiro() {
        double salarioHora = 10, salarioBruto = 950, salarioLiquido = 1000;
        int horasTrabalhadasMes = 100;
        Salario.imprimeResultado(salarioHora, horasTrabalhadasMes, salarioBruto, salarioLiquido);
    }

    @After
    public void testaImprimeResultadosDouble() {
        double salarioHora = 10.50, salarioBruto = 988.05, salarioLiquido = 1050;
        int horasTrabalhadasMes = 100;
        Salario.imprimeResultado(salarioHora, horasTrabalhadasMes, salarioBruto, salarioLiquido);
    }
}
