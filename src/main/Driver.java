package main;

public class Driver {

    public String renovacao(int idade){

        String output = "";

        if(idade > 0 && idade < 50){
            output = "Renova��o a cada 10 anos!";
        }else if(idade >= 50 && idade <=70){
            output = "Renova��o a cada 5 anos!";
        } else if(idade > 70){
            output = "Renova��o a cada 3 anos!";
        } else{
            output = "Idade inv�lida!";
        }
        return output;
    }
}