
package Controler;

import static Controler.Controler.obj;
import Model.Montagem_tabela;
import Model.Serialização;
import Model.Simulador;
import Viwe.AplicationViwe;
import Viwe.Tela_executaRodada;
import Viwe.Tela_login;

public class ControlerExecucao_1{
   
     
    
    public void iniciarSilulacaoMouseClicked(){
        Montagem_tabela tabelaNova = new Montagem_tabela();
        tabelaNova.fazTabelaCampeonato();
        Main.c1.serializa(tabelaNova.getObj());
        
        Main.c1.getView().setTelaE(new Tela_executaRodada(tabelaNova.getObj()));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaE());
    }
    
    public void bt_voltarMOuseClicked(){
        Main.c1.start();
    }
}
