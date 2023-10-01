
package Model;

import Controler.Main;

public class SaoPaulo_edicao extends TImes_edicao{

    @Override
    public void alteraForcaAtaque(int indiceTime, double novaForcaAtaque) {
        Main.c1.getObj().getForcaAtaque()[indiceTime] = novaForcaAtaque;
    }

    @Override
    public void alteraForcaDefesa(int indiceTime, double novaForcaDefesa) {
       Main.c1.getObj().getForcaDefesa()[indiceTime] = novaForcaDefesa;
    }

   

    
    
}
