
package Model;

import java.io.Serializable;
import java.util.HashMap;

public class Serialização implements Serializable{
    int[][] tabelaJogos;
    int[][] resultados;
    HashMap<Integer, Time> listaTime;
    double[] forcaAtaque;
    double[] forcaDefesa;
    int[] vitorias;
    int[] empates;
    int[] derrotas;
    int[] golsMarcados;
    int[] golsSofridos;
    int rodada;

    public Serialização(int[][] tabelaJogos, int[][] resultados, HashMap<Integer, Time> listaTime, double[]forcaAtaque, double[] forcaDefesa, int rodada) {
        this.tabelaJogos = tabelaJogos;
        this.resultados = resultados;
        this.listaTime = listaTime;
        this.rodada = rodada;
        this.forcaAtaque = forcaAtaque;
        this.forcaDefesa = forcaDefesa;
        
    }

    public int[][] getTabelaJogos() {
        return tabelaJogos;
    }

    public void setTabelaJogos(int[][] tabelaJogos) {
        this.tabelaJogos = tabelaJogos;
    }

    public int[][] getResultados() {
        return resultados;
    }

    public void setResultados(int[][] resultados) {
        this.resultados = resultados;
    }

    public HashMap<Integer, Time> getListaTime() {
        return listaTime;
    }

    public void setListaTime(HashMap<Integer, Time> listaTime) {
        this.listaTime = listaTime;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
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
    
    
}
