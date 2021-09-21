package test;

import main.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DriverTest {

    Driver driver = new Driver();

    @Test
    void testeParticaoEquivalencia() {
        System.out.println("Teste de Parti��o de Equival�ncia");
        assertEquals("Renova��o a cada 10 anos!", driver.renovacao(39));
        assertEquals("Renova��o a cada 5 anos!", driver.renovacao(59));
        assertEquals("Renova��o a cada 3 anos!", driver.renovacao(78));
    }


    @Test
    void testeAnaliseValorLimite() {
        System.out.println("Teste de Analise de Valor Limite");
        assertEquals("Renova��o a cada 10 anos!", driver.renovacao(49));
        assertEquals("Renova��o a cada 5 anos!", driver.renovacao(51));
        assertEquals("Renova��o a cada 3 anos!", driver.renovacao(71));
    }
}