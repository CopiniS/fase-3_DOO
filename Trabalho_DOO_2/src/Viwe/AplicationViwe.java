
package Viwe;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class AplicationViwe {
     //Objetos das views.
    private Janela janela;            
    private Tela_login telaA;      
    private Tela_cadastro telaB;  
    private Tela_execucao telaC;   
    private Tela_execucao_2 telaD;         
    private Tela_executaRodada telaE;
    private Tela_mostraResultado telaF;
    private Tela_Classificacao telaG;
    private Tela_campeao telaH;
    private Tela_mostraTabela telaI;
    private Pn_Tabela tabela;
    
    
    public AplicationViwe() {
        this.janela = new Janela();
        this.janela.setLayout(new BorderLayout());
        this.janela.setLocationRelativeTo(null);   //Posiciona no meio da tela.
        this.janela.setVisible(true);   
    }
    
    //Método genérico que recebe por parâmetro o painel que será mostrado no JFrame janela.
    public void mostraTela(JPanel newPanel){
        this.janela.getContentPane().removeAll();       //Remove o conteúdo atual do frame.
        this.janela.add(newPanel, BorderLayout.CENTER); //Adiciona o novo painel ao frame.
        this.janela.pack();   
            
    //Redimensiona o frame.
    }
    
    //Método para encerrar a aplicação.
    public void fechaJanela(){
        this.janela.dispose(); //Fecha o frame.
    }
    
    public Janela getJanela() {
        return janela;
    }

    public void setJanela(Janela janela) {
        this.janela = janela;
    }

    public Tela_login getTelaA() {
        return telaA;
    }

    public void setTelaA(Tela_login telaA) {
        this.telaA = telaA;
    }

    public Tela_cadastro getTelaB() {
        return telaB;
    }

    public void setTelaB(Tela_cadastro telaB) {
        this.telaB = telaB;
    }

    public Tela_execucao getTelaC() {
        return telaC;
    }

    public void setTelaC(Tela_execucao telaC) {
        this.telaC = telaC;
    }

    public Tela_execucao_2 getTelaD() {
        return telaD;
    }

    public void setTelaD(Tela_execucao_2 telaD) {
        this.telaD = telaD;
    }

    public Tela_executaRodada getTelaE() {
        return telaE;
    }

    public void setTelaE(Tela_executaRodada telaE) {
        this.telaE = telaE;
    }

    public Tela_mostraResultado getTelaF() {
        return telaF;
    }

    public void setTelaF(Tela_mostraResultado telaF) {
        this.telaF = telaF;
    }

    public Tela_Classificacao getTelaG() {
        return telaG;
    }

    public void setTelaG(Tela_Classificacao telaG) {
        this.telaG = telaG;
    }

    public Tela_campeao getTelaH() {
        return telaH;
    }

    public void setTelaH(Tela_campeao telaH) {
        this.telaH = telaH;
    }

    public Pn_Tabela getTabela() {
        return tabela;
    }

    public void setTabela(Pn_Tabela tabela) {
        this.tabela = tabela;
    }

    public Tela_mostraTabela getTelaI() {
        return telaI;
    }

    public void setTelaI(Tela_mostraTabela telaI) {
        this.telaI = telaI;
    }
    
    
}

