
package Controler;

import Model.Montagem_tabela;
import Viwe.Tela_Classificacao;
import Viwe.Tela_execucao;
import Viwe.Tela_executaRodada;
import javax.swing.JOptionPane;

public class ControlerExecucao_2 {

    public ControlerExecucao_2() {
    }
    
    public void bt_verRodadaMouseClicked(){
        
        if(Main.c1.Desserealiza().getRodada() < 18){
            Main.c1.getView().setTelaE(new Tela_executaRodada(Main.c1.Desserealiza()));
            Main.c1.getView().mostraTela(Main.c1.getView().getTelaE());
        }
        
        else{
            JOptionPane.showMessageDialog(null, "O torneio ja acabou!");
            Main.c1.getView().setTelaG(new Tela_Classificacao());
            Main.c1.getView().mostraTela(Main.c1.getView().getTelaG());
        }
        
    }
    
    public void bt_reiniciarSimulacaoMouseClicked(){
        switch(JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja reiniciar a tabela do campeonato?\nTodos os dados serão perdidos", "Reponda", JOptionPane.YES_NO_CANCEL_OPTION)){
            case 0: Main.c1.getView().setTelaC(new Tela_execucao());
                    Main.c1.getView().mostraTela(Main.c1.getView().getTelaC());
                    
                    Main.c1.setObj(null);
                    Main.c1.serializa(Main.c1.getObj());
        }
        
        
    }
    
    public void bt_voltarMouseClicked(){
        Main.c1.start();
    }
}
