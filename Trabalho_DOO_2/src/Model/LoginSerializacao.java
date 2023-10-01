
package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class LoginSerializacao implements Serializable{
    ArrayList<String> listaNomes;
    ArrayList<String> listaUsuarios;
    ArrayList<String> listaSenhas;

    public LoginSerializacao() {
        listaNomes = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        listaSenhas = new ArrayList<>();
    }

    public ArrayList<String> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<String> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<String> getListaSenhas() {
        return listaSenhas;
    }

    public void setListaSenhas(ArrayList<String> listaSenhas) {
        this.listaSenhas = listaSenhas;
    }

    public ArrayList<String> getListaNomes() {
        return listaNomes;
    }

    public void setListaNomes(ArrayList<String> listaNomes) {
        this.listaNomes = listaNomes;
    }
    

    
    
}
