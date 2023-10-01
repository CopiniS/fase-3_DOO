
package Controler;

import Model.Serialização;
import Viwe.Tela_campeao;
import Viwe.Tela_executaRodada;

public class ControlerMostraResultado {

    public ControlerMostraResultado() {
        
    }
    
    public void bt_proximaRodadaMouseClicked(){
        if(Main.c1.Desserealiza().getRodada() < 18){
            Main.c1.getView().setTelaE(new Tela_executaRodada(Main.c1.Desserealiza()));
            Main.c1.getView().mostraTela(Main.c1.getView().getTelaE());
        }
        
        else{
            Main.c1.getView().setTelaH(new Tela_campeao(Main.c1.controlerClassificacao.ordenaClassificacao()));
            Main.c1.getView().mostraTela(Main.c1.getView().getTelaH());
        }
        
    }
    
}
