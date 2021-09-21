package test;

import main.NotaBimestral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaBimestralTest {

    NotaBimestral nota = new NotaBimestral();

    @Test
    public void testeParticaoEquivalencia() {
        System.out.println("Teste de Parti��o de Equivalência");
        assertEquals("Nota V�lida", nota.setNota(7));
        assertEquals("Nota Inv�lida", nota.setNota(-1));
        assertEquals("Nota Inv�lida", nota.setNota(12));
    }

    @Test
    public void testeAnaliseValorLimite() {
        System.out.println("Teste de Analise de Valor Limite");
        assertEquals("Nota Inv�lida", nota.setNota(-1));
        assertEquals("Nota V�lida", nota.setNota(0));
        assertEquals("Nota V�lida", nota.setNota(10));
        assertEquals("Nota Inv�lida", nota.setNota(11));
    }
}