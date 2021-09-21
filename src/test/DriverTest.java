package test;

import main.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DriverTest {

    Driver driver = new Driver();

    @Test
    void testeParticaoEquivalencia() {
        System.out.println("Teste de Partição de Equivalência");
        assertEquals("Renovação a cada 10 anos!", driver.renovacao(39));
        assertEquals("Renovação a cada 5 anos!", driver.renovacao(59));
        assertEquals("Renovação a cada 3 anos!", driver.renovacao(78));
    }


    @Test
    void testeAnaliseValorLimite() {
        System.out.println("Teste de Analise de Valor Limite");
        assertEquals("Renovação a cada 10 anos!", driver.renovacao(49));
        assertEquals("Renovação a cada 5 anos!", driver.renovacao(51));
        assertEquals("Renovação a cada 3 anos!", driver.renovacao(71));
    }
}