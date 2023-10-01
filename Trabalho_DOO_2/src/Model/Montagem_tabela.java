
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Montagem_tabela implements Serializable{
    int numeroJogos;
    int JogosRodada;
    int[] casa = new int[5];
    int[] visitante = new int[5];
    int[] [] tabelaJogos = new int [90][2];
    HashMap<Integer, Time> listaTimes;
    ArrayList<Integer> indiceTimes;
    double[] forcaAtaque;
    double[] forcaDefesa;
    Serialização obj;

    public Montagem_tabela() {
        listaTimes = new HashMap<>();
        indiceTimes = new ArrayList();
        forcaAtaque = new double[10];
        forcaDefesa = new double[10];
        this.JogosRodada = 5;
        this.numeroJogos = 45;
        this.obj = new Serialização(tabelaJogos, null, listaTimes, forcaAtaque, forcaDefesa, 0);
    }
    
    public void addTime(){
        Time t1 = new Time("São Paulo  ");
        listaTimes.put(0,t1);
        Time t2 = new Time("Santos     ");
        listaTimes.put(1,t2);
        Time t3 = new Time("Palmeiras  ");
        listaTimes.put(2,t3);
        Time t4 = new Time("Corinthias ");
        listaTimes.put(3,t4);
        Time t5 = new Time("Flamengo   ");
        listaTimes.put(4,t5);
        Time t6 = new Time("Fluminense ");
        listaTimes.put(5,t6);
        Time t7 = new Time("Botafogo   ");
        listaTimes.put(6,t7);
        Time t8 = new Time("Cruzeiro   ");
        listaTimes.put(7,t8);
        Time t9 = new Time("Atletico-MG");
        listaTimes.put(8,t9);
        Time t10 = new Time("Bahia     ");
        listaTimes.put(9,t10);
        
        for(int i=0;i<10;i++){
            indiceTimes.add(i);
        }
    }
    
    public void addForcas(){
        forcaAtaque[0] = 8;
        forcaAtaque[1] = 6;
        forcaAtaque[2] = 7;
        forcaAtaque[3] = 8;
        forcaAtaque[4] = 2;
        forcaAtaque[5] = 3;
        forcaAtaque[6] = 4;
        forcaAtaque[7] = 8;
        forcaAtaque[8] = 3;
        forcaAtaque[9] = 5;
        
        
        forcaDefesa[0] = 9;
        forcaDefesa[1] = 2;
        forcaDefesa[2] = 5;
        forcaDefesa[3] = 6;
        forcaDefesa[4] = 8;
        forcaDefesa[5] = 2;
        forcaDefesa[6] = 3;
        forcaDefesa[7] = 7;
        forcaDefesa[8] = 8;
        forcaDefesa[9] = 4;
    }
    
    public boolean verificaRepConfrontos(int contRodada){
        int jogoAtual = contRodada * JogosRodada;
        
        for(int i=0; i<JogosRodada; i++){
            for(int j=0; j<jogoAtual; j++){
                if((casa[i] == tabelaJogos[j][0] && visitante[i] == tabelaJogos[j][1]) || (casa[i] == tabelaJogos[j][1] && visitante[i] == tabelaJogos[j][0])){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public void fazTrocas(int contRodadas){
        int jogoAtual = contRodadas * JogosRodada;
        
        while(verificaRepConfrontos(contRodadas) == true){
            Collections.shuffle(indiceTimes);
            try{
                int j=0;
                int p=0;
                for(int i=0; i<indiceTimes.size(); i++){
                    if(i%2 == 0){
                        
                    casa[j] = indiceTimes.get(i);
                    j++;
                    }
                    else{
                    visitante[p] = indiceTimes.get(i);
                    p++;
                    }
                }
            }
            
            catch (Exception e){
                System.out.println("erro");
            }
        }
    }
    
    public void addTabela(int contRodadas){
        int jogoAtual = contRodadas * JogosRodada;
        
        for(int i=0;i<JogosRodada;i++){
            tabelaJogos[jogoAtual + i][0] = casa[i];
            tabelaJogos[jogoAtual + i][1] = visitante[i];
        }
    }
    
    //INICIO DA EXECUCAO
    public void fazTabelaCampeonato(){
        
            addTime();
            addForcas();
            Collections.shuffle(indiceTimes);
            int k = 0;
            int contRodadas = 0;
            System.out.println("entrou");
            while(k < numeroJogos){
                int j=0;
                int p=0;
                for(int i=0; i<10; i++){
                    if(i%2 == 0){
                        casa[j] = indiceTimes.get(i);
                        j++;
                    }
                    else{
                        visitante[p] = indiceTimes.get(i);
                        p++;
                    }
                }
                k=k+JogosRodada;
                fazTrocas(contRodadas);
                addTabela(contRodadas);
                contRodadas++;
            }
            System.out.println("saiu");
            for(int i=numeroJogos; i<numeroJogos*2; i++){
                tabelaJogos[i][0] = tabelaJogos[i-numeroJogos][1];
                tabelaJogos[i][1] = tabelaJogos[i-numeroJogos][0];
            }
            atualizaObj();
    }
    
    public void atualizaObj(){
        obj.setListaTime(listaTimes);
        obj.setForcaAtaque(forcaAtaque);
        obj.setForcaDefesa(forcaDefesa);
        obj.setResultados(null);
        obj.setRodada(0);
        obj.setTabelaJogos(tabelaJogos);
    }
    
    public void mostraTabela(){
        int jogoAtual = 0;
        System.out.println("PRIMEIRO TURNO\n");
        for(int i=0; i<listaTimes.size()-1; i++){
            jogoAtual = i * JogosRodada;
            System.out.println("Rodada "+i);
            for(int j=0; j<JogosRodada; j++){
                System.out.println("Jogo " + j + ": " + listaTimes.get(tabelaJogos[jogoAtual + j][0]).getNome() + " x " + listaTimes.get(tabelaJogos[jogoAtual + j][1]).getNome());
            }
            System.out.println("\n");
        }
        
        System.out.println("\n\n");
        
        System.out.println("SEGUNDO TURNO\n");
        for(int i=0; i<listaTimes.size()-1; i++){
            jogoAtual = i * JogosRodada;
            System.out.println("Rodada "+i);
            for(int j=45; j<50; j++){
                System.out.println("Jogo " + j + ": " + listaTimes.get(tabelaJogos[jogoAtual + j][0]).getNome() + " x " + listaTimes.get(tabelaJogos[jogoAtual + j][1]).getNome());
            }
            System.out.println("\n");
        }
    }

    public int[][] getTabelaJogos() {
        return tabelaJogos;
    }

    public void setTabelaJogos(int[][] tabelaJogos) {
        this.tabelaJogos = tabelaJogos;
    }

    public HashMap<Integer, Time> getListaTimes() {
        return listaTimes;
    }

    public void setListaTimes(HashMap<Integer, Time> listaTimes) {
        this.listaTimes = listaTimes;
    }

    public double[] getForcaAtaque() {
        return forcaAtaque;
    }

    public void setForcaAtaque(double[] forcaAtaque) {
        this.forcaAtaque = forcaAtaque;
    }

    public double[] getForcaDefesa() {
        return forcaDefesa;
    }

    public void setForcaDefesa(double[] forcaDefesa) {
        this.forcaDefesa = forcaDefesa;
    }

    public Serialização getObj() {
        return obj;
    }

    public void setObj(Serialização obj) {
        this.obj = obj;
    }

    
    
    
    
    
    
    
}
