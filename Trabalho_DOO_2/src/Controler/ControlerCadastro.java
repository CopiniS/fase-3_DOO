
package Controler;

import static Controler.Controler.view;
import Model.LoginSerializacao;
import Viwe.Tela_cadastro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.text.View;

public class ControlerCadastro {
    boolean existeArquivo = false;

    public ControlerCadastro() {
        
    }
    
    public void desserealizaLogin(){
        try {
            FileInputStream fileIn = new FileInputStream("logins.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Controler.setLogin((LoginSerializacao) in.readObject());
            in.close();
            fileIn.close();
            existeArquivo = true;
        } catch (IOException | ClassNotFoundException e) {
            existeArquivo = false;
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
    
    public void bt_salvarMouseClicked(String nome, String usuario, String senha){
        if(nome.isBlank() || usuario.isBlank() || senha.isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        else {
            desserealizaLogin();
            boolean usuarioExiste = false;
            if(existeArquivo == true){
                for(int i=0; i<Controler.login.getListaUsuarios().size(); i++){
                    if(Controler.login.getListaUsuarios().equals(usuario)){
                        JOptionPane.showMessageDialog(null, "Este usuario ja existe", "ERRO", JOptionPane.ERROR_MESSAGE);
                        usuarioExiste = true;
                    }
                }   
            }
            
            if(usuarioExiste == false){
                Controler.getLogin().getListaNomes().add(nome);
                Controler.getLogin().getListaUsuarios().add(usuario);
                Controler.getLogin().getListaSenhas().add(senha);
                serealizaLogin();
                JOptionPane.showMessageDialog(null, "usuario cadastrado com sucesso", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }
        
        
        
    }
    
    public void bt_voltarLoginMouseClicked(){
         Main.c1.start();
    }
    
}
