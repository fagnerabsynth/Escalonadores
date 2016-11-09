package models;

import java.util.ArrayList;

public class Fifo {

    private ArrayList<ProcessoMOD> retorno;

    public Fifo(ProcessoMOD dados) {
        retorno = new ArrayList<>();
        retorno.add(dados);
    }

    public Fifo(ArrayList<ProcessoMOD> dados) {
        retorno = new ArrayList<>();
        retorno = dados;
    }

    public ArrayList<ProcessoMOD> retorno() {
        return this.retorno;
    }
    
    
}
