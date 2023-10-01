
package Controler;

import static Controler.Controler.objSerializado;
import static Controler.Controler.view;
import Model.LoginSerializacao;
import Model.Serialização;
import Viwe.AplicationViwe;
import Viwe.Tela_cadastro;
import Viwe.Tela_execucao;
import Viwe.Tela_execucao_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlerLogin{
    
    public ControlerLogin() {
    }

    
    public void bt_entrarMouseClicked(String usuario, String senha){
        
        desserealizaLogin();
        boolean existeLogin = false;
        if(Controler.getLogin() != null){                                                                                        
            for(int i=0; i<Controler.getLogin().getListaUsuarios().size(); i++){                                            
                if(Controler.getLogin().getListaUsuarios().get(i).equals(usuario)                          //VERIFICA SE O USUARIO ESTA NO "BANCO DE DADOS"                     
                && Controler.getLogin().getListaSenhas().get(i).equals(senha)){                    //VERIFICA SE A SENHA BATE COM O USUARIO
                    if(Main.c1.Desserealiza() == null){                                                                //VERIFIA O TORNEIO ESTÁ EM ANDAMENTO         
                        Main.c1.getView().setTelaC(new Tela_execucao());                                                
                        Main.c1.getView().mostraTela(Main.c1.getView().getTelaC());                             //PASSA PARA A TELA EXECUCAO 1
                        existeLogin = true;
                    }
                    
                    else{
                        Main.c1.getView().setTelaD(new Tela_execucao_2());                                                
                        Main.c1.getView().mostraTela(Main.c1.getView().getTelaD());                             //PASSA PARA A TELA EXECUCAO 2
                        existeLogin = true;
                    }
                }
            }
            if(existeLogin == false){
            JOptionPane.showMessageDialog(null, "Usuario ou Senha incorretos", "ERRO", JOptionPane.ERROR_MESSAGE);     //OCORRE SE ERRAR A SENHA OU USUARIO
            }
            
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Usuario ou Senha incorretos", "ERRO", JOptionPane.ERROR_MESSAGE);     //OCORRE SE NÃO EXISTIR NENHUM USUARIO NO BANCO
        }
        
    }
    
    public void bt_cadastrarMouseClicked(){
        Main.c1.getView().setTelaB(new Tela_cadastro());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaB());
    }
    
    public void desserealizaLogin(){
        try {
            FileInputStream fileIn = new FileInputStream("logins.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Controler.setLogin((LoginSerializacao) in.readObject());
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Login nao encontrado", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void serealizaLogin(){
         
        try {
            FileOutputStream fileOut = new FileOutputStream("logins.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Controler.getLogin());
            out.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
