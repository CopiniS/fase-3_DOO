
package Controler;

import Model.Montagem_tabela;
import Model.Simulador;
import Viwe.AplicationViwe;

public class Main {
    public static Controler c1;
    public static void main(String[] args) {
        AplicationViwe view = new AplicationViwe();    //Objeto da view.
        
        c1 = new Controler(view); //Inicializa o controller.
        c1.start(); 
    }
}
