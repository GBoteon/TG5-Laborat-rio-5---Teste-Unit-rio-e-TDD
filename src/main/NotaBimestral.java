package main;

public class NotaBimestral{

    int nota;

    public NotaBimestral(){
    }

    public String setNota(int nota){
        if(nota < 0 || nota > 10) {
            return "Nota Inv�lida";
        }
        this.nota = nota;
        return "Nota V�lida";
    }
}
