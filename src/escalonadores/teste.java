package escalonadores;

import java.util.ArrayList;
import models.ProcessoMOD;
import models.Sft;

public class teste {

    public static void main(String[] args) {

        ArrayList< ProcessoMOD> x = new ArrayList();
        ProcessoMOD cx = new ProcessoMOD();
        cx.prioridade = 5;
        cx.processo = "Teste 1";
        cx.tempo = 10;
        x.add(cx);

        cx = new ProcessoMOD();
        cx.prioridade = 3;
        cx.processo = "Teste 2";
        cx.tempo = 20;
        x.add(cx);
        
          cx = new ProcessoMOD();
        cx.prioridade = 10;
        cx.processo = "Teste 4";
        cx.tempo = 20;
        x.add(cx);
        
        
        Sft c = new Sft(x);
        c.retorno();
    }

}
