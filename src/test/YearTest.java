package test;

import main.Year;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YearTest {
    Year year = new Year();

    @Test
    public void testeParticaoEquivalencia() {
        System.out.println("Teste de Parti��o de Equival�cia");
        Assertions.assertEquals("Data Inv�lida", year.setAno(1800));
        Assertions.assertEquals("Data V�lida", year.setAno(1922));
        Assertions.assertEquals("Data Inv�lida", year.setAno(2021));
    }

    @Test
    public void testeAnaliseValorLimite() {
        System.out.println("Teste de Analise de Valor Limite");
        Assertions.assertEquals("Data Inv�lida", year.setAno(1899));
        Assertions.assertEquals("Data V�lida", year.setAno(1900));
        Assertions.assertEquals("Data V�lida", year.setAno(2020));
        Assertions.assertEquals("Data Inv�lida", year.setAno(2021));
    }

}