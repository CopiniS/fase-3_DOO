
package Controler;

import Viwe.Tela_Classificacao;
import Viwe.Tela_execucao;
import javax.swing.JOptionPane;

public class ControlerCampeao {
    int[] posicoes;
    int campeao;
    public ControlerCampeao() {
    }
    
    public void bt_voltarMOuseClicked(){
        switch(JOptionPane.showConfirmDialog(null, "Deseja retornar ao menu?\nTodos os dados serão perdidos", "Reponda", JOptionPane.YES_NO_CANCEL_OPTION)){
            case 0: Main.c1.getView().setTelaC(new Tela_execucao());
                    Main.c1.getView().mostraTela(Main.c1.getView().getTelaC());
                    
                    Main.c1.setObj(null);
                    Main.c1.serializa(Main.c1.getObj());
        }
    }
    
    public void btClassificacaoMouseCliecked(){
        Main.c1.getView().setTelaG(new Tela_Classificacao());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaG());
    }
    
}
