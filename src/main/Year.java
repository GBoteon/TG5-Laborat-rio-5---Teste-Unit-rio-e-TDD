package main;

public class Year {
    int ano;

    public Year() {
    }

    public String setAno(int ano) {
        if(ano < 1900 || ano > 2020) {
            return "Data Inválida";
        }
        this.ano = ano;
        return "Data Válida";
    }
}
