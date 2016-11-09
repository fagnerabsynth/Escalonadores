package models;

import java.util.ArrayList;

public class Sft {

    private ArrayList<ProcessoMOD> retorno;

    public Sft(ProcessoMOD dados) {
        retorno = new ArrayList<>();
        retorno.add(dados);
    }

    public Sft(ArrayList<ProcessoMOD> dados) {
        retorno = new ArrayList<>();
        retorno = dados;
    }

    private ArrayList<ProcessoMOD> organiza(ArrayList<ProcessoMOD> lista, ArrayList<ProcessoMOD> atual) {
        if (atual == null) {
            atual = new ArrayList<>();
        }
        ArrayList<ProcessoMOD> dados = new ArrayList<>();

        ProcessoMOD novo = new ProcessoMOD();
        int m = 0;
        for (ProcessoMOD x : lista) {
            if (m == 0) {
                novo = x;
                m++;
            } else {
             if (x.prioridade<=novo.prioridade) {
                 novo = x;
             }   
            }
        }
        lista.remove(novo);
        atual.add(novo);
        if (!lista.isEmpty()) {
            dados = this.organiza(lista, atual);
        } else {
            dados = atual;
        }

        return dados;
    }

    public ArrayList<ProcessoMOD> retorno() {

        return organiza(this.retorno, null);

    }
}
