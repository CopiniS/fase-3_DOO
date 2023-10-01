
package Controler;
import Model.Simulador;
import Viwe.AplicationViwe;
import Viwe.Tela_Classificacao;
import Viwe.Tela_execucao_2;
import Viwe.Tela_executaRodada;
import Viwe.Tela_mostraResultado;
import Viwe.Tela_mostraTabela;
import javax.swing.JOptionPane;

public class ControlerExecutaRodada{
    
    public ControlerExecutaRodada() {
        
    }

    public void executarRodadaMouseClicked(){
        
        Simulador s1 = new Simulador(Main.c1.Desserealiza());
        s1.executaRodada();
        s1.getObj().setRodada(s1.getObj().getRodada() + 1); //atualiza a rodada
        Main.c1.serializa(s1.getObj());
        
        Main.c1.getView().setTelaF(new Tela_mostraResultado());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaF());
            
    }
    
    public void mostrarJogosMouseClicked(){
        Main.c1.getView().setTelaI(new Tela_mostraTabela());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaI());
    }
    
    public void bt_voltarMouseClicked(){
        Main.c1.getView().setTelaD(new Tela_execucao_2());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaD());
    }
    
    public void bt_classificacaoMouseCliecked(){
        Main.c1.getView().setTelaG(new Tela_Classificacao());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaG());
    }
    
}
