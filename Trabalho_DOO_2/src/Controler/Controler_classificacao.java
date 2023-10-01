
package Controler;

import Model.Serialização;
import Viwe.Tela_execucao;
import Viwe.Tela_executaRodada;

public class Controler_classificacao {
    Serialização obj;
    int [] posicoes;
    int[] pontos;
    int pontosVitoria = 3;
    int pontosEmpate = 1;
        
    public Controler_classificacao() {
        pontos = new int[10];
        posicoes = new int[10];
        
    }
    
    public int[] ordenaClassificacao(){
        obj = Main.c1.Desserealiza();
        for(int i=0;i<posicoes.length; i++){
          pontos[i] = (obj.getVitorias()[i] * pontosVitoria) + (obj.getEmpates()[i] * pontosEmpate);
       }
       
       int contador = 0;
       int j = 9;
       int menor;
       int posicaoMenor =0;
       while(contador < posicoes.length){
           menor = Integer.MAX_VALUE;
           for(int i=0; i<posicoes.length; i++){
               if(pontos[i] < menor && pontos[i] > -1){
                  menor = pontos[i];
                  posicoes[j] = i; 
                  posicaoMenor = i;
               }
           }
           
           pontos[posicaoMenor] = -1;
           j--;
           contador++;
       }
       return posicoes;
    }
    
    public void bt_voltarMouseClicked(){
        
        if(obj.getRodada() < 18){
            Main.c1.getView().setTelaE(new Tela_executaRodada(obj));
            Main.c1.getView().mostraTela(Main.c1.getView().getTelaE());
        }
        
        else{
            Main.c1.getView().setTelaC(new Tela_execucao());
            Main.c1.getView().mostraTela(Main.c1.getView().getTelaC());
                    
            Main.c1.setObj(null);
            Main.c1.serializa(Main.c1.getObj());
        }
        
    }
}
