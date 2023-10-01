
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Random;

public class Simulador {
    int[] calssificacao = new int[10];
    int contRodada;
    int[][] tabelaJogos;
    int jogosRodada = 5;
    int[] golsMarcados = new int[10];
    int[] golsSofridos = new int[10];
    int[] vitorias = new int[10];
    int[] empates = new int[10];
    int[] derrotas = new int[10];
    double[] forcaAtaque;
    double[] forcaDefesa;
    int[][] resultados = new int[90][2];
    int pontosVitoria = 3;
    int pontosEmpate = 1;
    Serialização obj;
    HashMap<Integer, Time> listaTimes;
    
    
    

    public Simulador(Serialização obj) {
        this.obj = obj;
        this.tabelaJogos =obj.getTabelaJogos();
        this.forcaAtaque = obj.getForcaAtaque();
        this.forcaDefesa = obj.getForcaDefesa();
        this.listaTimes = obj.getListaTime();
        this.contRodada = obj.getRodada();
        
        if(obj.getVitorias() != null){
            this.vitorias = obj.getVitorias();
            this.derrotas = obj.getDerrotas();
            this.empates = obj.getEmpates();
        }
        
        if(obj.getResultados() != null){
            resultados = obj.getResultados();
        }
    }
    
    public double calculaProbabilidadeGol(int ataque, int defesa){
        double probGol = (forcaAtaque[ataque] / 10) * (1- (forcaDefesa[defesa] / 10));
        
        return probGol;
    }
    
    public void atualizaForcas(int local, int golFeito, int golSofrido){
        if(forcaAtaque[local] < 5){
            forcaAtaque[local] = forcaAtaque[local] + 0.3 * golFeito;
        }
        
        else if(forcaAtaque[local] < 7){
            forcaAtaque[local] = forcaAtaque[local] + 0.1 * golFeito;
        }
        
        else{
            forcaAtaque[local] = forcaAtaque[local] + 0.01 * golFeito;
        }
        
        if(golFeito == 0){
            if(forcaAtaque[local] < 5 ){
                forcaAtaque[local] = forcaAtaque[local] - 0.1;
            }
            else if(forcaAtaque[local] < 7){
                forcaAtaque[local] = forcaAtaque[local] - 0.3;
            }
            else{
                forcaAtaque[local] = forcaAtaque[local] - 0.5;
            }
        }
        
        
        //DEFESA
        if(forcaDefesa[local] < 5){
            forcaDefesa[local] = forcaDefesa[local] - 0.1 * golSofrido;
        }
        else if(forcaDefesa[local] < 7){
            forcaDefesa[local] = forcaDefesa[local] - 0.1 * golSofrido;
        }
        else{
            forcaDefesa[local] = forcaDefesa[local] - 0.3 * golSofrido;
        }
        
        if(golSofrido == 0){
            if(forcaDefesa[local] < 5){
                forcaDefesa[local] = forcaDefesa[local] + 0.5;
            }
            
            if(forcaDefesa[local] < 7){
                forcaDefesa[local] = forcaDefesa[local] + 0.3;
            }
            
            else{
                forcaDefesa[local] = forcaDefesa[local] + 0.1;
            }
        }
        
        
    }
    
    public void executaRodada(){
        int JogoAtual= contRodada * jogosRodada;
        int casa;
        int visitante;
        double probGolCasa;
        double probGolVisitante;
        
        
        Random r = new Random();
        for(int i=JogoAtual; i<JogoAtual + jogosRodada; i++){
            casa = tabelaJogos[i][0];   
            visitante = tabelaJogos[i][1];
            probGolCasa = calculaProbabilidadeGol(casa, visitante);
            probGolVisitante = calculaProbabilidadeGol(visitante, casa);
            int golCasa = 0;
            int golVisitante = 0;
            
            for(int j=0; j<5; j++){
               double valor = r.nextDouble(0, 1);
               double valor2 = r.nextDouble(0,1);
               
               if(valor < probGolCasa){
                   golCasa++;
               }
               
               if(valor2 < probGolVisitante){
                   golVisitante++;
               }
            }
            resultados[i][0] = golCasa;
            resultados[i][1] = golVisitante;
            
            
            atualizaPontos(golCasa, golVisitante, i);
            atualziaSaldoGols(golCasa, golVisitante, i);
            
            atualizaForcas(casa, golCasa, golVisitante);
            atualizaForcas(visitante, golVisitante, golCasa);
        }
        atualizaObj();
    }
    
    public void atualziaSaldoGols(int golsCasa, int golsVisitante, int i){
        golsMarcados[tabelaJogos[i][0]] = golsMarcados[tabelaJogos[i][0]] + golsCasa;
        golsMarcados[tabelaJogos[i][1]] = golsMarcados[tabelaJogos[i][1]] + golsVisitante;
        
        golsSofridos[tabelaJogos[i][0]] = golsSofridos[tabelaJogos[i][0]] + golsVisitante;
        golsSofridos[tabelaJogos[i][1]] = golsSofridos[tabelaJogos[i][1]] + golsCasa;
        
    }
    
    public void atualizaPontos(int golCasa, int golVisitante, int i){
        if(golCasa == golVisitante){
            
            empates[tabelaJogos[i][0]] = empates[tabelaJogos[i][0]] + 1;
            empates[tabelaJogos[i][1]] = empates[tabelaJogos[i][1]] + 1;
            
        }
        
        else if(golCasa > golVisitante){
            vitorias[tabelaJogos[i][0]] = vitorias[tabelaJogos[i][0]] + 1;
            derrotas[tabelaJogos[i][1]] = derrotas[tabelaJogos[i][1]] + 1;
        }
        
        else{
            derrotas[tabelaJogos[i][0]] = derrotas[tabelaJogos[i][0]] + 1;
            vitorias[tabelaJogos[i][1]] = vitorias[tabelaJogos[i][1]] + 1;
            
        }
    }
    
    public void atualizaObj(){
        obj.setRodada(contRodada);
        obj.setResultados(resultados);
        obj.setForcaAtaque(forcaAtaque);
        obj.setForcaDefesa(forcaDefesa);
        obj.setVitorias(vitorias);
        obj.setDerrotas(derrotas);
        obj.setEmpates(empates);
        obj.setGolsMarcados(golsMarcados);
        obj.setGolsSofridos(golsSofridos);
    }
    
    public void mostraResutado(){
        for(int i=0; i<90; i++){
            System.out.println(resultados[i][0] + " x " + resultados[i][1]);
        }
    }

    public int[] getCalssificacao() {
        return calssificacao;
    }

    public void setCalssificacao(int[] calssificacao) {
        this.calssificacao = calssificacao;
    }

    public int getContRodada() {
        return contRodada;
    }

    public void setContRodada(int contRodada) {
        this.contRodada = contRodada;
    }

    public int[][] getTabelaJogos() {
        return tabelaJogos;
    }

    public void setTabelaJogos(int[][] tabelaJogos) {
        this.tabelaJogos = tabelaJogos;
    }

    public int getJogosRodada() {
        return jogosRodada;
    }

    public void setJogosRodada(int jogosRodada) {
        this.jogosRodada = jogosRodada;
    }

    public int[] getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int[] golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int[] getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int[] golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int[] getVitorias() {
        return vitorias;
    }

    public void setVitorias(int[] vitorias) {
        this.vitorias = vitorias;
    }

    public int[] getEmpates() {
        return empates;
    }

    public void setEmpates(int[] empates) {
        this.empates = empates;
    }

    public int[] getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int[] derrotas) {
        this.derrotas = derrotas;
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

    public int[][] getResultados() {
        return resultados;
    }

    public void setResultados(int[][] resultados) {
        this.resultados = resultados;
    }

    public int getPontosVitoria() {
        return pontosVitoria;
    }

    public void setPontosVitoria(int pontosVitoria) {
        this.pontosVitoria = pontosVitoria;
    }

    public int getPontosEmpate() {
        return pontosEmpate;
    }

    public void setPontosEmpate(int pontosEmpate) {
        this.pontosEmpate = pontosEmpate;
    }

    public Serialização getObj() {
        return obj;
    }

    public void setObj(Serialização obj) {
        this.obj = obj;
    }

    public HashMap<Integer, Time> getListaTimes() {
        return listaTimes;
    }

    public void setListaTimes(HashMap<Integer, Time> listaTimes) {
        this.listaTimes = listaTimes;
    }
    
    
}
