
package Controler;

import Model.LoginSerializacao;
import Model.Montagem_tabela;
import Model.Serialização;
import Viwe.AplicationViwe;
import Viwe.Janela;
import Viwe.Tela_cadastro;
import Viwe.Tela_execucao;
import Viwe.Tela_execucao_2;
import Viwe.Tela_executaRodada;
import Viwe.Tela_login;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Controler {
    static Serialização objSerializado;
    static Serialização obj;
    static AplicationViwe view;
    static LoginSerializacao login;
    
    
    ControlerLogin controlerLogin;
    ControlerExecucao_1 controlerExecucao1;
    ControlerExecucao_2 controlerExecucao_2;
    ControlerExecutaRodada controlerExecutaRodada;
    ControlerCadastro controlerCadastro;
    ControlerMostraResultado controlerMostraResultado;
    Controler_classificacao controlerClassificacao;
    ControlerCampeao controlerCampeao;
    
    
    
    public Controler(AplicationViwe view) {
        this.obj = null;
        this.objSerializado = null;
        this.login = new LoginSerializacao();
        this.view = view;
        
        
        controlerLogin = new ControlerLogin();
        controlerCadastro = new ControlerCadastro();
        controlerExecucao1 = new ControlerExecucao_1();
        controlerExecucao_2 = new ControlerExecucao_2();
        controlerExecutaRodada = new ControlerExecutaRodada();
        controlerMostraResultado = new ControlerMostraResultado();
        controlerClassificacao = new Controler_classificacao();
        controlerCampeao = new ControlerCampeao();
        
        
    }
    
     public void start(){
        Tela_login telaA = new Tela_login();
        this.view.setTelaA(telaA);
        this.view.mostraTela(telaA);   
        
        if(this.view.getTelaA() != null){
        }
    }
     
     
     public void serializa(Serialização obj){
        
        try {
            FileOutputStream fileOut = new FileOutputStream("tabelas.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     public Serialização Desserealiza(){
        
        try {
            FileInputStream fileIn = new FileInputStream("tabelas.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            objSerializado = (Serialização) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            objSerializado = null;
            JOptionPane.showMessageDialog(null, "erro");
        }
        
        return objSerializado;
    }

    public static Serialização getObjSerializado() {
        return objSerializado;
    }

    public static void setObjSerializado(Serialização objSerializado) {
        Controler.objSerializado = objSerializado;
    }

    public static Serialização getObj() {
        return obj;
    }

    public static void setObj(Serialização obj) {
        Controler.obj = obj;
    }

    public static AplicationViwe getView() {
        return view;
    }

    public static void setView(AplicationViwe view) {
        Controler.view = view;
    }

    public ControlerLogin getControlerLogin() {
        return controlerLogin;
    }

    public void setControlerLogin(ControlerLogin controlerLogin) {
        this.controlerLogin = controlerLogin;
    }

    public ControlerExecucao_1 getControlerExecucao1() {
        return controlerExecucao1;
    }

    public void setControlerExecucao1(ControlerExecucao_1 controlerExecucao1) {
        this.controlerExecucao1 = controlerExecucao1;
    }

    public ControlerExecutaRodada getControlerExecutaRodada() {
        return controlerExecutaRodada;
    }

    public void setControlerExecutaRodada(ControlerExecutaRodada controlerExecutaRodada) {
        this.controlerExecutaRodada = controlerExecutaRodada;
    }

    public static LoginSerializacao getLogin() {
        return login;
    }

    public static void setLogin(LoginSerializacao login) {
        Controler.login = login;
    }



    public ControlerCadastro getControlerCadastro() {
        return controlerCadastro;
    }

    public void setControlerCadastro(ControlerCadastro controlerCadastro) {
        this.controlerCadastro = controlerCadastro;
    }

    public ControlerExecucao_2 getControlerExecucao_2() {
        return controlerExecucao_2;
    }

    public void setControlerExecucao_2(ControlerExecucao_2 controlerExecucao_2) {
        this.controlerExecucao_2 = controlerExecucao_2;
    }

    public ControlerMostraResultado getControlerMostraResultado() {
        return controlerMostraResultado;
    }

    public void setControlerMostraResultado(ControlerMostraResultado controlerMostraResultado) {
        this.controlerMostraResultado = controlerMostraResultado;
    }

    public Controler_classificacao getControlerClassificacao() {
        return controlerClassificacao;
    }

    public void setControlerClassificacao(Controler_classificacao controlerClassificacao) {
        this.controlerClassificacao = controlerClassificacao;
    }

    public ControlerCampeao getControlerCampeao() {
        return controlerCampeao;
    }

    public void setControlerCampeao(ControlerCampeao controlerCampeao) {
        this.controlerCampeao = controlerCampeao;
    }
    
    

}
