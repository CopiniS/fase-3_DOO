
package Viwe;

import Controler.Main;
import Model.Serialização;
import javax.swing.ImageIcon;

public class Pn_Tabela extends javax.swing.JPanel {
    ImageIcon[] vetorImagens;
    Serialização obj;
    
    public Pn_Tabela() {
        initComponents();
        this.obj = Main.c1.Desserealiza();
        inicializaVetorImagens();
        iniciaAllLbs();
    }
    
    public void iniciaAllLbs(){
        iniciaLbs_rodada1();
        iniciaAllLbs();
    }
    
    public void iniciaLbs_rodada1(){
       //logos
        lb_rodada1_logo1.setIcon(vetorImagens[obj.getTabelaJogos()[0][0]]);
        lb_rodada1_logo2.setIcon(vetorImagens[obj.getTabelaJogos()[0][1]]);
        lb_rodada1_logo3.setIcon(vetorImagens[obj.getTabelaJogos()[1][0]]);
        lb_rodada1_logo4.setIcon(vetorImagens[obj.getTabelaJogos()[1][1]]);
        lb_rodada1_logo5.setIcon(vetorImagens[obj.getTabelaJogos()[2][0]]);
        lb_rodada1_logo6.setIcon(vetorImagens[obj.getTabelaJogos()[2][1]]);
        lb_rodada1_logo7.setIcon(vetorImagens[obj.getTabelaJogos()[3][0]]);
        lb_rodada1_logo8.setIcon(vetorImagens[obj.getTabelaJogos()[3][1]]);
        lb_rodada1_logo9.setIcon(vetorImagens[obj.getTabelaJogos()[4][0]]);
        lb_rodada1_logo10.setIcon(vetorImagens[obj.getTabelaJogos()[4][1]]);
       
        //times
        lb_rodada1_time1.setText(obj.getListaTime().get(obj.getTabelaJogos()[0][0]).getNome());
        lb_rodada1_time2.setText(obj.getListaTime().get(obj.getTabelaJogos()[0][1]).getNome());
        lb_rodada1_time3.setText(obj.getListaTime().get(obj.getTabelaJogos()[1][0]).getNome());
        lb_rodada1_time4.setText(obj.getListaTime().get(obj.getTabelaJogos()[1][1]).getNome());
        lb_rodada1_time5.setText(obj.getListaTime().get(obj.getTabelaJogos()[2][0]).getNome());
        lb_rodada1_time6.setText(obj.getListaTime().get(obj.getTabelaJogos()[2][1]).getNome());
        lb_rodada1_time7.setText(obj.getListaTime().get(obj.getTabelaJogos()[3][0]).getNome());
        lb_rodada1_time8.setText(obj.getListaTime().get(obj.getTabelaJogos()[3][1]).getNome());
        lb_rodada1_time9.setText(obj.getListaTime().get(obj.getTabelaJogos()[4][0]).getNome());
        lb_rodada1_time10.setText(obj.getListaTime().get(obj.getTabelaJogos()[4][1]).getNome());
       
       //resultado
        if(obj.getRodada() > 1){
            lb_rodada1_gols1.setText(String.valueOf(obj.getResultados()[0][0]));
            lb_rodada1_gols2.setText(String.valueOf(obj.getResultados()[0][1]));
            lb_rodada1_gols3.setText(String.valueOf(obj.getResultados()[1][0]));
            lb_rodada1_gols4.setText(String.valueOf(obj.getResultados()[1][1]));
            lb_rodada1_gols5.setText(String.valueOf(obj.getResultados()[2][0]));
            lb_rodada1_gols6.setText(String.valueOf(obj.getResultados()[2][1]));
            lb_rodada1_gols7.setText(String.valueOf(obj.getResultados()[3][0]));
            lb_rodada1_gols8.setText(String.valueOf(obj.getResultados()[3][1]));
            lb_rodada1_gols9.setText(String.valueOf(obj.getResultados()[4][0]));
            lb_rodada1_gols10.setText(String.valueOf(obj.getResultados()[4][1]));
        
       }
    }
        
    public void iniciaLbs_rodada2(){
       //logos
//        lb_rodada2_logo1.setIcon(vetorImagens[obj.getTabelaJogos()[5][0]]);
//        lb_rodada2_logo2.setIcon(vetorImagens[obj.getTabelaJogos()[5][1]]);
//        lb_rodada2_logo3.setIcon(vetorImagens[obj.getTabelaJogos()[6][0]]);
//        lb_rodada2_logo4.setIcon(vetorImagens[obj.getTabelaJogos()[6][1]]);
//        lb_rodada2_logo5.setIcon(vetorImagens[obj.getTabelaJogos()[7][0]]);
//        lb_rodada2_logo6.setIcon(vetorImagens[obj.getTabelaJogos()[7][1]]);
//        lb_rodada2_logo7.setIcon(vetorImagens[obj.getTabelaJogos()[8][0]]);
//        lb_rodada2_logo8.setIcon(vetorImagens[obj.getTabelaJogos()[8][1]]);
//        lb_rodada2_logo9.setIcon(vetorImagens[obj.getTabelaJogos()[9][0]]);
//        lb_rodada2_logo10.setIcon(vetorImagens[obj.getTabelaJogos()[9][1]]);
       
        //times
        lb_rodada2_Time1.setText(obj.getListaTime().get(obj.getTabelaJogos()[5][0]).getNome());
        lb_rodada2_time2.setText(obj.getListaTime().get(obj.getTabelaJogos()[5][1]).getNome());
        lb_rodada2_time3.setText(obj.getListaTime().get(obj.getTabelaJogos()[6][0]).getNome());
        lb_rodada2_time4.setText(obj.getListaTime().get(obj.getTabelaJogos()[6][1]).getNome());
        lb_rodada2_time5.setText(obj.getListaTime().get(obj.getTabelaJogos()[7][0]).getNome());
        lb_rodada2_time6.setText(obj.getListaTime().get(obj.getTabelaJogos()[7][1]).getNome());
        lb_rodada2_time7.setText(obj.getListaTime().get(obj.getTabelaJogos()[8][0]).getNome());
        lb_rodada2_time8.setText(obj.getListaTime().get(obj.getTabelaJogos()[8][1]).getNome());
        lb_rodada2_time9.setText(obj.getListaTime().get(obj.getTabelaJogos()[9][0]).getNome());
        lb_rodada2_time10.setText(obj.getListaTime().get(obj.getTabelaJogos()[9][1]).getNome());
       
       //resultado
        if(obj.getRodada() > 2){
            lb_rodada2_gols1.setText(String.valueOf(obj.getResultados()[5][0]));
            lb_rodada2_gols2.setText(String.valueOf(obj.getResultados()[5][1]));
            lb_rodada2_gols3.setText(String.valueOf(obj.getResultados()[6][0]));
            lb_rodada2_gols4.setText(String.valueOf(obj.getResultados()[6][1]));
            lb_rodada2_gols5.setText(String.valueOf(obj.getResultados()[7][0]));
            lb_rodada2_gols6.setText(String.valueOf(obj.getResultados()[7][1]));
            lb_rodada2_gols7.setText(String.valueOf(obj.getResultados()[8][0]));
            lb_rodada2_gols8.setText(String.valueOf(obj.getResultados()[8][1]));
            lb_rodada2_gols9.setText(String.valueOf(obj.getResultados()[9][0]));
            lb_rodada2_gols10.setText(String.valueOf(obj.getResultados()[9][1]));
        
       }
    }
    
    public void inicializaVetorImagens(){
        ImageIcon i0 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/saoPaulo_30x30.png"));
        ImageIcon i1 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/santos_30x30.png"));
        ImageIcon i2 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/palmeiras_30x30.png"));
        ImageIcon i3 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/corinthias_30x30.png"));
        ImageIcon i4 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/flamengo_30x30.png"));
        ImageIcon i5 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/fluminense_30x30.png"));
        ImageIcon i6 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/botafogo_30x30.png"));
        ImageIcon i7 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/cruzeiro_30x30.png"));
        ImageIcon i8 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/atleticoMineiro_30x30.png"));
        ImageIcon i9 = new ImageIcon(getClass().getResource("/imagens_escudos_times_30x30/bahia_30x30.png"));
       
        vetorImagens = new ImageIcon[10];
        vetorImagens[0] = i0;
        vetorImagens[1] = i1;
        vetorImagens[2] = i2;
        vetorImagens[3] = i3;
        vetorImagens[4] = i4;
        vetorImagens[5] = i5;
        vetorImagens[6] = i6;
        vetorImagens[7] = i7;
        vetorImagens[8] = i8;
        vetorImagens[9] = i9;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_rodada1_logo10 = new javax.swing.JLabel();
        lb_rodada1_logo8 = new javax.swing.JLabel();
        lb_rodada1_logo6 = new javax.swing.JLabel();
        lb_rodada1_logo4 = new javax.swing.JLabel();
        lb_rodada1_logo2 = new javax.swing.JLabel();
        lb_rodada1_time10 = new javax.swing.JLabel();
        lb_rodada1_time8 = new javax.swing.JLabel();
        lb_rodada1_time6 = new javax.swing.JLabel();
        lb_rodada1_time4 = new javax.swing.JLabel();
        lb_rodada1_time2 = new javax.swing.JLabel();
        lb_rodada1_gols10 = new javax.swing.JLabel();
        lb_rodada1_gols8 = new javax.swing.JLabel();
        lb_rodada1_gols6 = new javax.swing.JLabel();
        lb_rodada1_gols4 = new javax.swing.JLabel();
        lb_rodada1_gols2 = new javax.swing.JLabel();
        lb_result5 = new javax.swing.JLabel();
        lb_result4 = new javax.swing.JLabel();
        lb_result3 = new javax.swing.JLabel();
        lb_result2 = new javax.swing.JLabel();
        lb_result1 = new javax.swing.JLabel();
        lb_rodada1_gols1 = new javax.swing.JLabel();
        lb_rodada1_gols3 = new javax.swing.JLabel();
        lb_rodada1_gols5 = new javax.swing.JLabel();
        lb_rodada1_gols7 = new javax.swing.JLabel();
        lb_rodada1_gols9 = new javax.swing.JLabel();
        lb_rodada1_time9 = new javax.swing.JLabel();
        lb_rodada1_time7 = new javax.swing.JLabel();
        lb_rodada1_time5 = new javax.swing.JLabel();
        lb_rodada1_time3 = new javax.swing.JLabel();
        lb_rodada1_time1 = new javax.swing.JLabel();
        lb_rodada1_logo1 = new javax.swing.JLabel();
        lb_rodada1_logo3 = new javax.swing.JLabel();
        lb_rodada1_logo5 = new javax.swing.JLabel();
        lb_rodada1_logo7 = new javax.swing.JLabel();
        lb_rodada1_logo9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_result6 = new javax.swing.JLabel();
        lb_result7 = new javax.swing.JLabel();
        lb_result8 = new javax.swing.JLabel();
        lb_result9 = new javax.swing.JLabel();
        lb_result10 = new javax.swing.JLabel();
        lb_rodada2_gols1 = new javax.swing.JLabel();
        lb_rodada2_gols3 = new javax.swing.JLabel();
        lb_rodada2_gols5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_rodada2_gols7 = new javax.swing.JLabel();
        lb_rodada2_gols9 = new javax.swing.JLabel();
        lb_rodada2_time9 = new javax.swing.JLabel();
        lb_rodada2_time7 = new javax.swing.JLabel();
        lb_rodada2_time5 = new javax.swing.JLabel();
        lb_rodada2_time3 = new javax.swing.JLabel();
        lb_rodada2_Time1 = new javax.swing.JLabel();
        lb_rodada2_logo1 = new javax.swing.JLabel();
        lb_rodada2_logo3 = new javax.swing.JLabel();
        lb_rodada2_logo5 = new javax.swing.JLabel();
        lb_rodada2_logo7 = new javax.swing.JLabel();
        lb_rodada2_logo9 = new javax.swing.JLabel();
        lb_rodada2_logo10 = new javax.swing.JLabel();
        lb_rodada2_logo8 = new javax.swing.JLabel();
        lb_rodada2_logo6 = new javax.swing.JLabel();
        lb_rodada2_logo4 = new javax.swing.JLabel();
        lb_rodada2_logo2 = new javax.swing.JLabel();
        lb_rodada2_time10 = new javax.swing.JLabel();
        lb_rodada2_time8 = new javax.swing.JLabel();
        lb_rodada2_time6 = new javax.swing.JLabel();
        lb_rodada2_time4 = new javax.swing.JLabel();
        lb_rodada2_time2 = new javax.swing.JLabel();
        lb_rodada2_gols10 = new javax.swing.JLabel();
        lb_rodada2_gols8 = new javax.swing.JLabel();
        lb_rodada2_gols6 = new javax.swing.JLabel();
        lb_rodada2_gols4 = new javax.swing.JLabel();
        lb_rodada2_gols2 = new javax.swing.JLabel();
        lb_rodada3_Time3 = new javax.swing.JLabel();
        lb_rodada3_Time9 = new javax.swing.JLabel();
        lb_rodada3_Time5 = new javax.swing.JLabel();
        lb_rodada3_Time10 = new javax.swing.JLabel();
        lb_rodada3_gols10 = new javax.swing.JLabel();
        lb_rodada3_logo10 = new javax.swing.JLabel();
        lb_rodada3_gols8 = new javax.swing.JLabel();
        lb_rodada3_logo1 = new javax.swing.JLabel();
        lb_rodada3_Time4 = new javax.swing.JLabel();
        lb_rodada3_gols6 = new javax.swing.JLabel();
        lb_rodada3_gols2 = new javax.swing.JLabel();
        lb_rodada3_Time7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_rodada3_Time1 = new javax.swing.JLabel();
        lb_result11 = new javax.swing.JLabel();
        lb_rodada3_logo3 = new javax.swing.JLabel();
        lb_rodada3_logo2 = new javax.swing.JLabel();
        lb_rodada3_logo7 = new javax.swing.JLabel();
        lb_rodada3_Time6 = new javax.swing.JLabel();
        lb_result12 = new javax.swing.JLabel();
        lb_rodada3_logo8 = new javax.swing.JLabel();
        lb_rodada3_gols9 = new javax.swing.JLabel();
        lb_rodada3_logo9 = new javax.swing.JLabel();
        lb_rodada3_gols5 = new javax.swing.JLabel();
        lb_rodada3_gols7 = new javax.swing.JLabel();
        lb_rodada3_logo6 = new javax.swing.JLabel();
        lb_rodada3_logo4 = new javax.swing.JLabel();
        lb_rodada3_logo5 = new javax.swing.JLabel();
        lb_rodada3_gols1 = new javax.swing.JLabel();
        lb_result13 = new javax.swing.JLabel();
        lb_rodada3_gols4 = new javax.swing.JLabel();
        lb_rodada3_gols3 = new javax.swing.JLabel();
        lb_rodada3_Time8 = new javax.swing.JLabel();
        lb_result14 = new javax.swing.JLabel();
        lb_result15 = new javax.swing.JLabel();
        lb_rodada3_Time2 = new javax.swing.JLabel();
        lb_rodada4_logo10 = new javax.swing.JLabel();
        lb_rodada4_gols8 = new javax.swing.JLabel();
        lb_rodada4_logo1 = new javax.swing.JLabel();
        lb_rodada4_Time4 = new javax.swing.JLabel();
        lb_rodada4_gols6 = new javax.swing.JLabel();
        lb_rodada4_gols2 = new javax.swing.JLabel();
        lb_rodada4_Time7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_rodada4_Time1 = new javax.swing.JLabel();
        lb_result16 = new javax.swing.JLabel();
        lb_rodada4_logo3 = new javax.swing.JLabel();
        lb_rodada4_logo2 = new javax.swing.JLabel();
        lb_rodada4_logo7 = new javax.swing.JLabel();
        lb_rodada4_Time6 = new javax.swing.JLabel();
        lb_result17 = new javax.swing.JLabel();
        lb_rodada4_logo8 = new javax.swing.JLabel();
        lb_rodada4_gols9 = new javax.swing.JLabel();
        lb_rodada4_logo9 = new javax.swing.JLabel();
        lb_rodada4_gols5 = new javax.swing.JLabel();
        lb_rodada4_gols7 = new javax.swing.JLabel();
        lb_rodada4_logo6 = new javax.swing.JLabel();
        lb_rodada4_logo4 = new javax.swing.JLabel();
        lb_rodada4_logo5 = new javax.swing.JLabel();
        lb_rodada4_gols1 = new javax.swing.JLabel();
        lb_result18 = new javax.swing.JLabel();
        lb_rodada4_gols4 = new javax.swing.JLabel();
        lb_rodada4_gols3 = new javax.swing.JLabel();
        lb_rodada4_Time8 = new javax.swing.JLabel();
        lb_result19 = new javax.swing.JLabel();
        lb_result20 = new javax.swing.JLabel();
        lb_rodada4_Time3 = new javax.swing.JLabel();
        lb_rodada4_Time9 = new javax.swing.JLabel();
        lb_rodada4_Time5 = new javax.swing.JLabel();
        lb_rodada4_Time2 = new javax.swing.JLabel();
        lb_rodada4_Time10 = new javax.swing.JLabel();
        lb_rodada4_gols10 = new javax.swing.JLabel();
        lb_rodada5_gols10 = new javax.swing.JLabel();
        lb_rodada5_logo8 = new javax.swing.JLabel();
        lb_rodada5_gols4 = new javax.swing.JLabel();
        lb_rodada5_logo9 = new javax.swing.JLabel();
        lb_result21 = new javax.swing.JLabel();
        lb_rodada5_logo6 = new javax.swing.JLabel();
        lb_rodada5_Time7 = new javax.swing.JLabel();
        lb_rodada5_gols3 = new javax.swing.JLabel();
        lb_result22 = new javax.swing.JLabel();
        lb_rodada5_gols9 = new javax.swing.JLabel();
        lb_rodada5_logo1 = new javax.swing.JLabel();
        lb_rodada5_gols6 = new javax.swing.JLabel();
        lb_rodada5_logo4 = new javax.swing.JLabel();
        lb_rodada5_logo2 = new javax.swing.JLabel();
        lb_rodada5_Time9 = new javax.swing.JLabel();
        lb_rodada5_Time1 = new javax.swing.JLabel();
        lb_rodada5_logo7 = new javax.swing.JLabel();
        lb_rodada5_gols5 = new javax.swing.JLabel();
        lb_result23 = new javax.swing.JLabel();
        lb_rodada5_logo3 = new javax.swing.JLabel();
        lb_rodada5_Time6 = new javax.swing.JLabel();
        lb_rodada5_Time4 = new javax.swing.JLabel();
        lb_result24 = new javax.swing.JLabel();
        lb_rodada5_Time2 = new javax.swing.JLabel();
        lb_rodada5_Time8 = new javax.swing.JLabel();
        lb_rodada5_Time5 = new javax.swing.JLabel();
        lb_rodada5_gols7 = new javax.swing.JLabel();
        lb_rodada5_Time10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_rodada5_logo5 = new javax.swing.JLabel();
        lb_rodada5_Time3 = new javax.swing.JLabel();
        lb_rodada5_logo10 = new javax.swing.JLabel();
        lb_rodada5_gols8 = new javax.swing.JLabel();
        lb_rodada5_gols1 = new javax.swing.JLabel();
        lb_rodada5_gols2 = new javax.swing.JLabel();
        lb_result25 = new javax.swing.JLabel();
        lb_rodada6_gols7 = new javax.swing.JLabel();
        lb_rodada6_logo5 = new javax.swing.JLabel();
        lb_rodada6_gols1 = new javax.swing.JLabel();
        lb_rodada6_logo3 = new javax.swing.JLabel();
        lb_rodada6_Time9 = new javax.swing.JLabel();
        lb_rodada6_gols8 = new javax.swing.JLabel();
        lb_rodada6_logo1 = new javax.swing.JLabel();
        lb_rodada6_Time4 = new javax.swing.JLabel();
        lb_result26 = new javax.swing.JLabel();
        lb_rodada6_logo9 = new javax.swing.JLabel();
        lb_rodada6_logo7 = new javax.swing.JLabel();
        lb_result27 = new javax.swing.JLabel();
        lb_rodada6_gols4 = new javax.swing.JLabel();
        lb_rodada6_gols3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_rodada6_gols9 = new javax.swing.JLabel();
        lb_rodada6_gols5 = new javax.swing.JLabel();
        lb_rodada6_Time1 = new javax.swing.JLabel();
        lb_rodada6_gols10 = new javax.swing.JLabel();
        lb_result28 = new javax.swing.JLabel();
        lb_rodada6_Time2 = new javax.swing.JLabel();
        lb_rodada6_Time10 = new javax.swing.JLabel();
        lb_rodada6_logo8 = new javax.swing.JLabel();
        lb_rodada6_logo2 = new javax.swing.JLabel();
        lb_rodada6_Time8 = new javax.swing.JLabel();
        lb_rodada6_Time7 = new javax.swing.JLabel();
        lb_rodada6_logo6 = new javax.swing.JLabel();
        lb_rodada6_logo10 = new javax.swing.JLabel();
        lb_rodada6_Time5 = new javax.swing.JLabel();
        lb_rodada6_gols6 = new javax.swing.JLabel();
        lb_rodada6_logo4 = new javax.swing.JLabel();
        lb_result29 = new javax.swing.JLabel();
        lb_result30 = new javax.swing.JLabel();
        lb_rodada6_gols2 = new javax.swing.JLabel();
        lb_rodada6_Time6 = new javax.swing.JLabel();
        lb_rodada6_Time3 = new javax.swing.JLabel();
        lb_rodada7_gols9 = new javax.swing.JLabel();
        lb_rodada7_Time3 = new javax.swing.JLabel();
        lb_rodada7_logo5 = new javax.swing.JLabel();
        lb_rodada7_Time7 = new javax.swing.JLabel();
        lb_rodada7_logo4 = new javax.swing.JLabel();
        lb_rodada7_logo8 = new javax.swing.JLabel();
        lb_result31 = new javax.swing.JLabel();
        lb_rodada7_logo6 = new javax.swing.JLabel();
        lb_rodada7_gols6 = new javax.swing.JLabel();
        lb_rodada7_Time1 = new javax.swing.JLabel();
        lb_rodada7_logo2 = new javax.swing.JLabel();
        lb_rodada7_gols7 = new javax.swing.JLabel();
        lb_rodada7_Time8 = new javax.swing.JLabel();
        lb_rodada7_logo10 = new javax.swing.JLabel();
        lb_rodada7_logo3 = new javax.swing.JLabel();
        lb_rodada7_logo7 = new javax.swing.JLabel();
        lb_result32 = new javax.swing.JLabel();
        lb_rodada7_Time4 = new javax.swing.JLabel();
        lb_rodada7_gols5 = new javax.swing.JLabel();
        lb_rodada7_gols10 = new javax.swing.JLabel();
        lb_result33 = new javax.swing.JLabel();
        lb_rodada7_gols4 = new javax.swing.JLabel();
        lb_rodada7_Time10 = new javax.swing.JLabel();
        lb_rodada7_gols1 = new javax.swing.JLabel();
        lb_rodada7_gols2 = new javax.swing.JLabel();
        lb_rodada7_Time9 = new javax.swing.JLabel();
        lb_rodada7_gols8 = new javax.swing.JLabel();
        lb_rodada7_Time5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_result34 = new javax.swing.JLabel();
        lb_rodada7_logo9 = new javax.swing.JLabel();
        lb_rodada7_Time2 = new javax.swing.JLabel();
        lb_rodada7_gols3 = new javax.swing.JLabel();
        lb_rodada7_Time6 = new javax.swing.JLabel();
        lb_rodada7_logo1 = new javax.swing.JLabel();
        lb_result35 = new javax.swing.JLabel();
        lb_rodada8_gols9 = new javax.swing.JLabel();
        lb_rodada8_Time3 = new javax.swing.JLabel();
        lb_rodada8_logo5 = new javax.swing.JLabel();
        lb_rodada8_Time7 = new javax.swing.JLabel();
        lb_rodada8_logo4 = new javax.swing.JLabel();
        lb_rodada8_logo8 = new javax.swing.JLabel();
        lb_result36 = new javax.swing.JLabel();
        lb_rodada8_logo6 = new javax.swing.JLabel();
        lb_rodada8_gols6 = new javax.swing.JLabel();
        lb_rodada8_Time1 = new javax.swing.JLabel();
        lb_rodada8_logo2 = new javax.swing.JLabel();
        lb_rodada8_gols7 = new javax.swing.JLabel();
        lb_rodada8_Time8 = new javax.swing.JLabel();
        lb_rodada8_logo110 = new javax.swing.JLabel();
        lb_rodada8_logo3 = new javax.swing.JLabel();
        lb_rodada8_logo7 = new javax.swing.JLabel();
        lb_result37 = new javax.swing.JLabel();
        lb_rodada8_Time4 = new javax.swing.JLabel();
        lb_rodada8_gols5 = new javax.swing.JLabel();
        lb_rodada8_gols10 = new javax.swing.JLabel();
        lb_result38 = new javax.swing.JLabel();
        lb_rodada8_gols4 = new javax.swing.JLabel();
        lb_rodada8_Time10 = new javax.swing.JLabel();
        lb_rodada8_gols1 = new javax.swing.JLabel();
        lb_rodada8_gols2 = new javax.swing.JLabel();
        lb_rodada8_Time9 = new javax.swing.JLabel();
        lb_rodada8_gols8 = new javax.swing.JLabel();
        lb_rodada8_Time5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_result39 = new javax.swing.JLabel();
        lb_rodada8_logo9 = new javax.swing.JLabel();
        lb_rodada8_Time2 = new javax.swing.JLabel();
        lb_rodada8_gols3 = new javax.swing.JLabel();
        lb_rodada8_Time6 = new javax.swing.JLabel();
        lb_rodada8_logo1 = new javax.swing.JLabel();
        lb_result40 = new javax.swing.JLabel();
        lb_result41 = new javax.swing.JLabel();
        lb_rodada9_Time5 = new javax.swing.JLabel();
        lb_rodada9_Time9 = new javax.swing.JLabel();
        lb_rodada9_gols6 = new javax.swing.JLabel();
        lb_rodada9_logo7 = new javax.swing.JLabel();
        lb_rodada9_gols9 = new javax.swing.JLabel();
        lb_rodada9_logo2 = new javax.swing.JLabel();
        lb_rodada9_gols5 = new javax.swing.JLabel();
        lb_rodada9_logo4 = new javax.swing.JLabel();
        lb_rodada9_logo10 = new javax.swing.JLabel();
        lb_rodada9_logo9 = new javax.swing.JLabel();
        lb_result42 = new javax.swing.JLabel();
        lb_rodada9_gols4 = new javax.swing.JLabel();
        lb_rodada9_gols3 = new javax.swing.JLabel();
        lb_rodada9_logo6 = new javax.swing.JLabel();
        lb_rodada9_Time6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_result43 = new javax.swing.JLabel();
        lb_rodada9_Time7 = new javax.swing.JLabel();
        lb_rodada9_gols8 = new javax.swing.JLabel();
        lb_rodada9_Time4 = new javax.swing.JLabel();
        lb_rodada9_gols1 = new javax.swing.JLabel();
        lb_rodada9_logo3 = new javax.swing.JLabel();
        lb_rodada9_Time2 = new javax.swing.JLabel();
        lb_rodada9_Time1 = new javax.swing.JLabel();
        lb_result44 = new javax.swing.JLabel();
        lb_result45 = new javax.swing.JLabel();
        lb_rodada9_logo5 = new javax.swing.JLabel();
        lb_rodada9_gols7 = new javax.swing.JLabel();
        lb_rodada9_Time8 = new javax.swing.JLabel();
        lb_rodada9_Time3 = new javax.swing.JLabel();
        lb_rodada9_gols2 = new javax.swing.JLabel();
        lb_rodada9_Time10 = new javax.swing.JLabel();
        lb_rodada9_logo8 = new javax.swing.JLabel();
        lb_rodada9_gols10 = new javax.swing.JLabel();
        lb_rodada9_logo1 = new javax.swing.JLabel();
        lb_rodada10_Time9 = new javax.swing.JLabel();
        lb_rodada10_gols8 = new javax.swing.JLabel();
        lb_rodada10_logo5 = new javax.swing.JLabel();
        lb_rodada10_logo10 = new javax.swing.JLabel();
        lb_rodada10_Time1 = new javax.swing.JLabel();
        lb_rodada10_logo3 = new javax.swing.JLabel();
        lb_rodada10_logo6 = new javax.swing.JLabel();
        lb_result46 = new javax.swing.JLabel();
        lb_rodada10_logo8 = new javax.swing.JLabel();
        lb_rodada10_logo7 = new javax.swing.JLabel();
        lb_result47 = new javax.swing.JLabel();
        lb_rodada10_gols1 = new javax.swing.JLabel();
        lb_result48 = new javax.swing.JLabel();
        lb_result49 = new javax.swing.JLabel();
        lb_rodada10_Time6 = new javax.swing.JLabel();
        lb_rodada10_gols3 = new javax.swing.JLabel();
        lb_rodada10_gols10 = new javax.swing.JLabel();
        lb_rodada10_gols7 = new javax.swing.JLabel();
        lb_rodada10_logo4 = new javax.swing.JLabel();
        lb_rodada10_Time3 = new javax.swing.JLabel();
        lb_rodada10_logo2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_rodada10_gols2 = new javax.swing.JLabel();
        lb_result50 = new javax.swing.JLabel();
        lb_rodada10_Time5 = new javax.swing.JLabel();
        lb_rodada10_gols5 = new javax.swing.JLabel();
        lb_rodada10_gols4 = new javax.swing.JLabel();
        lb_rodada10_Time7 = new javax.swing.JLabel();
        lb_rodada10_Time10 = new javax.swing.JLabel();
        lb_rodada10_Time8 = new javax.swing.JLabel();
        lb_rodada10_gols9 = new javax.swing.JLabel();
        lb_rodada10_gols6 = new javax.swing.JLabel();
        lb_rodada10_logo9 = new javax.swing.JLabel();
        lb_rodada10_Time2 = new javax.swing.JLabel();
        lb_rodada10_logo1 = new javax.swing.JLabel();
        lb_rodada10_Time4 = new javax.swing.JLabel();
        lb_rodada11_Time3 = new javax.swing.JLabel();
        lb_rodada11_Time8 = new javax.swing.JLabel();
        lb_rodada11_Time2 = new javax.swing.JLabel();
        lb_rodada11_gols2 = new javax.swing.JLabel();
        lb_rodada11_Time7 = new javax.swing.JLabel();
        lb_rodada11_Time4 = new javax.swing.JLabel();
        lb_rodada11_logo2 = new javax.swing.JLabel();
        lb_result51 = new javax.swing.JLabel();
        lb_rodada11_logo1 = new javax.swing.JLabel();
        lb_result52 = new javax.swing.JLabel();
        lb_rodada11_gols9 = new javax.swing.JLabel();
        lb_result53 = new javax.swing.JLabel();
        lb_rodada11_Time5 = new javax.swing.JLabel();
        lb_rodada11_logo9 = new javax.swing.JLabel();
        lb_rodada11_Time1 = new javax.swing.JLabel();
        lb_rodada11_logo6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_rodada11_Time10 = new javax.swing.JLabel();
        lb_rodada11_logo10 = new javax.swing.JLabel();
        lb_rodada11_logo8 = new javax.swing.JLabel();
        lb_rodada11_gols5 = new javax.swing.JLabel();
        lb_rodada11_Time6 = new javax.swing.JLabel();
        lb_rodada11_gols6 = new javax.swing.JLabel();
        lb_rodada11_gols1 = new javax.swing.JLabel();
        lb_rodada11_logo4 = new javax.swing.JLabel();
        lb_result54 = new javax.swing.JLabel();
        lb_result55 = new javax.swing.JLabel();
        lb_rodada11_gols8 = new javax.swing.JLabel();
        lb_rodada11_gols7 = new javax.swing.JLabel();
        lb_rodada11_gols4 = new javax.swing.JLabel();
        lb_rodada11_gols10 = new javax.swing.JLabel();
        lb_rodada11_logo7 = new javax.swing.JLabel();
        lb_rodada11_Time9 = new javax.swing.JLabel();
        lb_rodada11_logo5 = new javax.swing.JLabel();
        lb_rodada11_gols3 = new javax.swing.JLabel();
        lb_rodada11_logo3 = new javax.swing.JLabel();
        lb_rodada12_Time7 = new javax.swing.JLabel();
        lb_result56 = new javax.swing.JLabel();
        lb_rodada12_gols4 = new javax.swing.JLabel();
        lb_rodada12_gols7 = new javax.swing.JLabel();
        lb_rodada12_gols1 = new javax.swing.JLabel();
        lb_rodada12_gols3 = new javax.swing.JLabel();
        lb_result57 = new javax.swing.JLabel();
        lb_rodada12_gols10 = new javax.swing.JLabel();
        lb_result58 = new javax.swing.JLabel();
        lb_rodada12_Time2 = new javax.swing.JLabel();
        lb_rodada12_Time4 = new javax.swing.JLabel();
        lb_rodada12_Time6 = new javax.swing.JLabel();
        lb_rodada12_Time1 = new javax.swing.JLabel();
        lb_rodada12_gols5 = new javax.swing.JLabel();
        lb_rodada12_Time9 = new javax.swing.JLabel();
        lb_rodada12_Time3 = new javax.swing.JLabel();
        lb_result59 = new javax.swing.JLabel();
        lb_rodada12_logo2 = new javax.swing.JLabel();
        lb_rodada12_logo4 = new javax.swing.JLabel();
        lb_rodada12_logo3 = new javax.swing.JLabel();
        lb_rodada12_gols6 = new javax.swing.JLabel();
        lb_rodada12_logo5 = new javax.swing.JLabel();
        lb_rodada12_gols2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lb_rodada12_gols8 = new javax.swing.JLabel();
        lb_rodada12_logo6 = new javax.swing.JLabel();
        lb_rodada12_logo9 = new javax.swing.JLabel();
        lb_rodada12_Time10 = new javax.swing.JLabel();
        lb_rodada12_logo1 = new javax.swing.JLabel();
        lb_rodada12_gols9 = new javax.swing.JLabel();
        lb_rodada12_logo8 = new javax.swing.JLabel();
        lb_result60 = new javax.swing.JLabel();
        lb_rodada12_Time8 = new javax.swing.JLabel();
        lb_rodada12_logo10 = new javax.swing.JLabel();
        lb_rodada12_logo7 = new javax.swing.JLabel();
        lb_rodada12_Time5 = new javax.swing.JLabel();
        lb_rodada13_gols8 = new javax.swing.JLabel();
        lb_rodada13_Time9 = new javax.swing.JLabel();
        lb_rodada13_Time10 = new javax.swing.JLabel();
        lb_rodada13_logo8 = new javax.swing.JLabel();
        lb_rodada13_logo10 = new javax.swing.JLabel();
        lb_rodada13_gols1 = new javax.swing.JLabel();
        lb_rodada13_gols3 = new javax.swing.JLabel();
        lb_rodada13_logo9 = new javax.swing.JLabel();
        lb_rodada13_Time3 = new javax.swing.JLabel();
        lb_rodada13_logo5 = new javax.swing.JLabel();
        lb_rodada13_Time7 = new javax.swing.JLabel();
        lb_rodada13_logo3 = new javax.swing.JLabel();
        lb_rodada13_gols6 = new javax.swing.JLabel();
        lb_rodada13_gols9 = new javax.swing.JLabel();
        lb_rodada13_logo2 = new javax.swing.JLabel();
        lb_result61 = new javax.swing.JLabel();
        lb_rodada13_logo4 = new javax.swing.JLabel();
        lb_rodada13_Time1 = new javax.swing.JLabel();
        lb_result62 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lb_result63 = new javax.swing.JLabel();
        lb_rodada13_Time2 = new javax.swing.JLabel();
        lb_rodada13_logo7 = new javax.swing.JLabel();
        lb_result64 = new javax.swing.JLabel();
        lb_rodada13_Time6 = new javax.swing.JLabel();
        lb_result65 = new javax.swing.JLabel();
        lb_rodada13_gols7 = new javax.swing.JLabel();
        lb_rodada13_Time5 = new javax.swing.JLabel();
        lb_rodada13_gols10 = new javax.swing.JLabel();
        lb_rodada13_logo1 = new javax.swing.JLabel();
        lb_rodada13_gols5 = new javax.swing.JLabel();
        lb_rodada13_gols2 = new javax.swing.JLabel();
        lb_rodada13_logo6 = new javax.swing.JLabel();
        lb_rodada13_Time8 = new javax.swing.JLabel();
        lb_rodada13_gols4 = new javax.swing.JLabel();
        lb_rodada13_Time4 = new javax.swing.JLabel();
        lb_rodada14_Time4 = new javax.swing.JLabel();
        lb_rodada14_Time10 = new javax.swing.JLabel();
        lb_rodada14_logo8 = new javax.swing.JLabel();
        lb_rodada14_gols7 = new javax.swing.JLabel();
        lb_rodada14_gols6 = new javax.swing.JLabel();
        lb_rodada14_gols1 = new javax.swing.JLabel();
        lb_rodada14_Time9 = new javax.swing.JLabel();
        lb_result66 = new javax.swing.JLabel();
        lb_rodada14_logo4 = new javax.swing.JLabel();
        lb_result67 = new javax.swing.JLabel();
        lb_rodada14_gols10 = new javax.swing.JLabel();
        lb_rodada14_Time8 = new javax.swing.JLabel();
        lb_result68 = new javax.swing.JLabel();
        lb_rodada14_gols8 = new javax.swing.JLabel();
        lb_rodada14_gols3 = new javax.swing.JLabel();
        lb_rodada14_Time7 = new javax.swing.JLabel();
        lb_rodada14_gols4 = new javax.swing.JLabel();
        lb_rodada14_logo3 = new javax.swing.JLabel();
        lb_rodada14_logo7 = new javax.swing.JLabel();
        lb_result69 = new javax.swing.JLabel();
        lb_rodada14_Time5 = new javax.swing.JLabel();
        lb_rodada14_gols9 = new javax.swing.JLabel();
        lb_rodada14_Time3 = new javax.swing.JLabel();
        lb_rodada14_logo2 = new javax.swing.JLabel();
        lb_result70 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_rodada14_logo10 = new javax.swing.JLabel();
        lb_rodada14_gols2 = new javax.swing.JLabel();
        lb_rodada14_gols5 = new javax.swing.JLabel();
        lb_rodada14_logo1 = new javax.swing.JLabel();
        lb_rodada14_Time2 = new javax.swing.JLabel();
        lb_rodada14_logo9 = new javax.swing.JLabel();
        lb_rodada14_Time1 = new javax.swing.JLabel();
        lb_rodada14_Time6 = new javax.swing.JLabel();
        lb_rodada14_logo5 = new javax.swing.JLabel();
        lb_rodada14_logo6 = new javax.swing.JLabel();
        lb_rodada15_gols7 = new javax.swing.JLabel();
        lb_result71 = new javax.swing.JLabel();
        lb_rodada15_Time4 = new javax.swing.JLabel();
        lb_rodada15_logo4 = new javax.swing.JLabel();
        lb_rodada15_logo5 = new javax.swing.JLabel();
        lb_result72 = new javax.swing.JLabel();
        lb_rodada15_Time6 = new javax.swing.JLabel();
        lb_rodada15_logo7 = new javax.swing.JLabel();
        lb_rodada15_gols8 = new javax.swing.JLabel();
        lb_rodada15_Time9 = new javax.swing.JLabel();
        lb_rodada15_Time7 = new javax.swing.JLabel();
        lb_rodada15_logo3 = new javax.swing.JLabel();
        lb_rodada15_gols9 = new javax.swing.JLabel();
        lb_rodada15_gols4 = new javax.swing.JLabel();
        lb_rodada15_gols6 = new javax.swing.JLabel();
        lb_rodada15_Time8 = new javax.swing.JLabel();
        lb_rodada15_Time1 = new javax.swing.JLabel();
        lb_rodada15_gols10 = new javax.swing.JLabel();
        lb_rodada15_Time2 = new javax.swing.JLabel();
        lb_rodada15_gols2 = new javax.swing.JLabel();
        lb_rodada15_Time5 = new javax.swing.JLabel();
        lb_result73 = new javax.swing.JLabel();
        lb_rodada15_logo1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lb_result74 = new javax.swing.JLabel();
        lb_rodada15_logo8 = new javax.swing.JLabel();
        lb_rodada15_gols5 = new javax.swing.JLabel();
        lb_rodada15_logo9 = new javax.swing.JLabel();
        lb_rodada15_logo6 = new javax.swing.JLabel();
        lb_result75 = new javax.swing.JLabel();
        lb_rodada15_Time3 = new javax.swing.JLabel();
        lb_rodada15_logo2 = new javax.swing.JLabel();
        lb_rodada15_logo10 = new javax.swing.JLabel();
        lb_rodada15_gols3 = new javax.swing.JLabel();
        lb_rodada15_Time10 = new javax.swing.JLabel();
        lb_rodada15_gols1 = new javax.swing.JLabel();
        lb_rodada16_Time4 = new javax.swing.JLabel();
        lb_result76 = new javax.swing.JLabel();
        lb_rodada16_gols9 = new javax.swing.JLabel();
        lb_rodada16_gols4 = new javax.swing.JLabel();
        lb_rodada16_logo5 = new javax.swing.JLabel();
        lb_rodada16_logo8 = new javax.swing.JLabel();
        lb_rodada16_gols1 = new javax.swing.JLabel();
        lb_rodada16_logo1 = new javax.swing.JLabel();
        lb_result77 = new javax.swing.JLabel();
        lb_rodada16_Time3 = new javax.swing.JLabel();
        lb_rodada16_gols5 = new javax.swing.JLabel();
        lb_rodada16_logo7 = new javax.swing.JLabel();
        lb_rodada16_Time1 = new javax.swing.JLabel();
        lb_rodada16_logo9 = new javax.swing.JLabel();
        lb_rodada16_gols7 = new javax.swing.JLabel();
        lb_rodada16_Time5 = new javax.swing.JLabel();
        lb_rodada16_Time2 = new javax.swing.JLabel();
        lb_rodada16_logo6 = new javax.swing.JLabel();
        lb_rodada16_gols10 = new javax.swing.JLabel();
        lb_rodada16_gols3 = new javax.swing.JLabel();
        lb_result78 = new javax.swing.JLabel();
        lb_rodada16_gols8 = new javax.swing.JLabel();
        lb_result79 = new javax.swing.JLabel();
        lb_rodada16_Time10 = new javax.swing.JLabel();
        lb_rodada16_Time6 = new javax.swing.JLabel();
        lb_rodada16_logo10 = new javax.swing.JLabel();
        lb_rodada16_Time9 = new javax.swing.JLabel();
        lb_rodada16_Time8 = new javax.swing.JLabel();
        lb_rodada16_Time7 = new javax.swing.JLabel();
        lb_rodada16_logo4 = new javax.swing.JLabel();
        lb_rodada16_logo3 = new javax.swing.JLabel();
        lb_rodada16_gols2 = new javax.swing.JLabel();
        lb_rodada16_gols6 = new javax.swing.JLabel();
        lb_rodada16_logo2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lb_result80 = new javax.swing.JLabel();
        lb_rodada17_logo6 = new javax.swing.JLabel();
        lb_rodada17_gols6 = new javax.swing.JLabel();
        lb_rodada17_gols1 = new javax.swing.JLabel();
        lb_rodada17_Time6 = new javax.swing.JLabel();
        lb_rodada17_Time10 = new javax.swing.JLabel();
        lb_rodada17_gols7 = new javax.swing.JLabel();
        lb_result81 = new javax.swing.JLabel();
        lb_result82 = new javax.swing.JLabel();
        lb_rodada17_gols9 = new javax.swing.JLabel();
        lb_rodada17_gols4 = new javax.swing.JLabel();
        lb_rodada17_logo5 = new javax.swing.JLabel();
        lb_rodada17_gols2 = new javax.swing.JLabel();
        lb_rodada17_Time3 = new javax.swing.JLabel();
        lb_result83 = new javax.swing.JLabel();
        lb_rodada17_gols8 = new javax.swing.JLabel();
        lb_rodada17_Time8 = new javax.swing.JLabel();
        lb_rodada17_logo9 = new javax.swing.JLabel();
        lb_rodada17_logo3 = new javax.swing.JLabel();
        lb_rodada17_Time9 = new javax.swing.JLabel();
        lb_result84 = new javax.swing.JLabel();
        lb_rodada17_logo2 = new javax.swing.JLabel();
        lb_rodada17_gols5 = new javax.swing.JLabel();
        lb_rodada17_logo10 = new javax.swing.JLabel();
        lb_rodada17_Time1 = new javax.swing.JLabel();
        lb_result85 = new javax.swing.JLabel();
        lb_rodada17_Time5 = new javax.swing.JLabel();
        lb_rodada17_logo1 = new javax.swing.JLabel();
        lb_rodada17_Time4 = new javax.swing.JLabel();
        lb_rodada17_gols10 = new javax.swing.JLabel();
        lb_rodada17_gols3 = new javax.swing.JLabel();
        lb_rodada17_logo8 = new javax.swing.JLabel();
        lb_rodada17_Time7 = new javax.swing.JLabel();
        lb_rodada17_logo7 = new javax.swing.JLabel();
        lb_rodada17_Time2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lb_rodada17_logo4 = new javax.swing.JLabel();
        lb_rodada18_logo5 = new javax.swing.JLabel();
        lb_rodada18_logo9 = new javax.swing.JLabel();
        lb_rodada18_logo4 = new javax.swing.JLabel();
        lb_gols171 = new javax.swing.JLabel();
        lb_rodada18_Time7 = new javax.swing.JLabel();
        lb_result86 = new javax.swing.JLabel();
        lb_rodada18_logo3 = new javax.swing.JLabel();
        lb_rodada18_Time2 = new javax.swing.JLabel();
        lb_rodada18_Time3 = new javax.swing.JLabel();
        lb_result87 = new javax.swing.JLabel();
        lb_rodada18_logo2 = new javax.swing.JLabel();
        lb_rodada18_Time1 = new javax.swing.JLabel();
        lb_gols172 = new javax.swing.JLabel();
        lb_rodada18_Time5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lb_rodada18_Time9 = new javax.swing.JLabel();
        lb_gols173 = new javax.swing.JLabel();
        lb_rodada18_logo10 = new javax.swing.JLabel();
        lb_rodada18_logo1 = new javax.swing.JLabel();
        lb_rodada18_logo7 = new javax.swing.JLabel();
        lb_rodada18_Time6 = new javax.swing.JLabel();
        lb_rodada18_Time4 = new javax.swing.JLabel();
        lb_gols174 = new javax.swing.JLabel();
        lb_result88 = new javax.swing.JLabel();
        lb_rodada18_Time8 = new javax.swing.JLabel();
        lb_gols175 = new javax.swing.JLabel();
        lb_rodada18_logo6 = new javax.swing.JLabel();
        lb_result89 = new javax.swing.JLabel();
        lb_gols176 = new javax.swing.JLabel();
        lb_rodada18_Time10 = new javax.swing.JLabel();
        lb_gols177 = new javax.swing.JLabel();
        lb_result90 = new javax.swing.JLabel();
        lb_gols178 = new javax.swing.JLabel();
        lb_gols179 = new javax.swing.JLabel();
        lb_rodada18_logo8 = new javax.swing.JLabel();
        lb_gols180 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        lb_rodada1_logo10.setText("jLabel15");
        add(lb_rodada1_logo10);
        lb_rodada1_logo10.setBounds(600, 300, 30, 30);

        lb_rodada1_logo8.setText("jLabel14");
        add(lb_rodada1_logo8);
        lb_rodada1_logo8.setBounds(600, 270, 30, 30);

        lb_rodada1_logo6.setText("jLabel13");
        add(lb_rodada1_logo6);
        lb_rodada1_logo6.setBounds(600, 240, 30, 30);

        lb_rodada1_logo4.setText("jLabel12");
        add(lb_rodada1_logo4);
        lb_rodada1_logo4.setBounds(600, 210, 30, 30);

        lb_rodada1_logo2.setText("jLabel11");
        add(lb_rodada1_logo2);
        lb_rodada1_logo2.setBounds(600, 180, 30, 30);

        lb_rodada1_time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time10.setText("Time10");
        add(lb_rodada1_time10);
        lb_rodada1_time10.setBounds(440, 300, 151, 25);

        lb_rodada1_time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time8.setText("Time8");
        add(lb_rodada1_time8);
        lb_rodada1_time8.setBounds(440, 270, 151, 25);

        lb_rodada1_time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time6.setText("Time6");
        add(lb_rodada1_time6);
        lb_rodada1_time6.setBounds(440, 240, 151, 25);

        lb_rodada1_time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time4.setText("Time4");
        add(lb_rodada1_time4);
        lb_rodada1_time4.setBounds(440, 210, 151, 25);

        lb_rodada1_time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time2.setText("Time2");
        add(lb_rodada1_time2);
        lb_rodada1_time2.setBounds(440, 180, 150, 25);

        lb_rodada1_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols10.setText("3");
        add(lb_rodada1_gols10);
        lb_rodada1_gols10.setBounds(350, 306, 10, 25);

        lb_rodada1_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols8.setText("3");
        add(lb_rodada1_gols8);
        lb_rodada1_gols8.setBounds(350, 280, 10, 20);

        lb_rodada1_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols6.setText("1");
        add(lb_rodada1_gols6);
        lb_rodada1_gols6.setBounds(350, 250, 10, 20);

        lb_rodada1_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols4.setText("0");
        add(lb_rodada1_gols4);
        lb_rodada1_gols4.setBounds(350, 220, 10, 20);

        lb_rodada1_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols2.setText("0");
        add(lb_rodada1_gols2);
        lb_rodada1_gols2.setBounds(350, 190, 10, 25);

        lb_result5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result5.setForeground(new java.awt.Color(255, 255, 255));
        lb_result5.setText("x");
        add(lb_result5);
        lb_result5.setBounds(310, 300, 10, 25);

        lb_result4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result4.setForeground(new java.awt.Color(255, 255, 255));
        lb_result4.setText("x");
        add(lb_result4);
        lb_result4.setBounds(310, 270, 10, 25);

        lb_result3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result3.setForeground(new java.awt.Color(255, 255, 255));
        lb_result3.setText("x");
        add(lb_result3);
        lb_result3.setBounds(310, 250, 10, 20);

        lb_result2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result2.setForeground(new java.awt.Color(255, 255, 255));
        lb_result2.setText("x");
        add(lb_result2);
        lb_result2.setBounds(310, 220, 10, 20);

        lb_result1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result1.setForeground(new java.awt.Color(255, 255, 255));
        lb_result1.setText("x");
        add(lb_result1);
        lb_result1.setBounds(310, 190, 10, 20);

        lb_rodada1_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols1.setText("0");
        add(lb_rodada1_gols1);
        lb_rodada1_gols1.setBounds(260, 190, 20, 20);

        lb_rodada1_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols3.setText("1");
        add(lb_rodada1_gols3);
        lb_rodada1_gols3.setBounds(260, 220, 20, 16);

        lb_rodada1_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols5.setText("2");
        add(lb_rodada1_gols5);
        lb_rodada1_gols5.setBounds(260, 250, 10, 20);

        lb_rodada1_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols7.setText("4");
        add(lb_rodada1_gols7);
        lb_rodada1_gols7.setBounds(260, 280, 10, 20);

        lb_rodada1_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_gols9.setText("5");
        add(lb_rodada1_gols9);
        lb_rodada1_gols9.setBounds(260, 310, 10, 20);

        lb_rodada1_time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time9.setText("Time9");
        add(lb_rodada1_time9);
        lb_rodada1_time9.setBounds(70, 300, 156, 25);

        lb_rodada1_time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time7.setText("Time7");
        add(lb_rodada1_time7);
        lb_rodada1_time7.setBounds(70, 270, 156, 25);

        lb_rodada1_time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time5.setText("Time5");
        add(lb_rodada1_time5);
        lb_rodada1_time5.setBounds(70, 240, 150, 25);

        lb_rodada1_time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time3.setText("TIme3");
        add(lb_rodada1_time3);
        lb_rodada1_time3.setBounds(70, 210, 150, 25);

        lb_rodada1_time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada1_time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada1_time1.setText("Time1");
        add(lb_rodada1_time1);
        lb_rodada1_time1.setBounds(70, 180, 150, 25);

        lb_rodada1_logo1.setText("jLabel6");
        add(lb_rodada1_logo1);
        lb_rodada1_logo1.setBounds(20, 180, 30, 30);

        lb_rodada1_logo3.setText("jLabel7");
        add(lb_rodada1_logo3);
        lb_rodada1_logo3.setBounds(20, 210, 30, 30);

        lb_rodada1_logo5.setText("jLabel8");
        add(lb_rodada1_logo5);
        lb_rodada1_logo5.setBounds(20, 240, 30, 30);

        lb_rodada1_logo7.setText("jLabel1");
        add(lb_rodada1_logo7);
        lb_rodada1_logo7.setBounds(20, 270, 30, 30);

        lb_rodada1_logo9.setText("jLabel10");
        add(lb_rodada1_logo9);
        lb_rodada1_logo9.setBounds(20, 300, 30, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabela de Jogos");
        add(jLabel1);
        jLabel1.setBounds(216, 31, 188, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rodada 1");
        add(jLabel3);
        jLabel3.setBounds(260, 136, 110, 27);

        lb_result6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result6.setForeground(new java.awt.Color(255, 255, 255));
        lb_result6.setText("x");
        add(lb_result6);
        lb_result6.setBounds(310, 559, 10, 25);

        lb_result7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result7.setForeground(new java.awt.Color(255, 255, 255));
        lb_result7.setText("x");
        add(lb_result7);
        lb_result7.setBounds(310, 529, 10, 25);

        lb_result8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result8.setForeground(new java.awt.Color(255, 255, 255));
        lb_result8.setText("x");
        add(lb_result8);
        lb_result8.setBounds(310, 509, 10, 20);

        lb_result9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result9.setForeground(new java.awt.Color(255, 255, 255));
        lb_result9.setText("x");
        add(lb_result9);
        lb_result9.setBounds(310, 479, 10, 20);

        lb_result10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result10.setForeground(new java.awt.Color(255, 255, 255));
        lb_result10.setText("x");
        add(lb_result10);
        lb_result10.setBounds(310, 449, 10, 20);

        lb_rodada2_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols1.setText("0");
        add(lb_rodada2_gols1);
        lb_rodada2_gols1.setBounds(260, 449, 20, 20);

        lb_rodada2_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols3.setText("1");
        add(lb_rodada2_gols3);
        lb_rodada2_gols3.setBounds(260, 479, 20, 16);

        lb_rodada2_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols5.setText("2");
        add(lb_rodada2_gols5);
        lb_rodada2_gols5.setBounds(260, 509, 10, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rodada 2");
        add(jLabel4);
        jLabel4.setBounds(260, 395, 110, 27);

        lb_rodada2_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols7.setText("4");
        add(lb_rodada2_gols7);
        lb_rodada2_gols7.setBounds(260, 539, 10, 20);

        lb_rodada2_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols9.setText("5");
        add(lb_rodada2_gols9);
        lb_rodada2_gols9.setBounds(260, 569, 10, 20);

        lb_rodada2_time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time9.setText("Time9");
        add(lb_rodada2_time9);
        lb_rodada2_time9.setBounds(70, 559, 156, 25);

        lb_rodada2_time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time7.setText("Time7");
        add(lb_rodada2_time7);
        lb_rodada2_time7.setBounds(70, 529, 156, 25);

        lb_rodada2_time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time5.setText("Time5");
        add(lb_rodada2_time5);
        lb_rodada2_time5.setBounds(70, 499, 150, 25);

        lb_rodada2_time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time3.setText("TIme3");
        add(lb_rodada2_time3);
        lb_rodada2_time3.setBounds(70, 469, 150, 25);

        lb_rodada2_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_Time1.setText("Time1");
        add(lb_rodada2_Time1);
        lb_rodada2_Time1.setBounds(70, 439, 150, 25);

        lb_rodada2_logo1.setText("jLabel6");
        add(lb_rodada2_logo1);
        lb_rodada2_logo1.setBounds(20, 439, 30, 30);

        lb_rodada2_logo3.setText("jLabel7");
        add(lb_rodada2_logo3);
        lb_rodada2_logo3.setBounds(20, 469, 30, 30);

        lb_rodada2_logo5.setText("jLabel8");
        add(lb_rodada2_logo5);
        lb_rodada2_logo5.setBounds(20, 499, 30, 30);

        lb_rodada2_logo7.setText("jLabel1");
        add(lb_rodada2_logo7);
        lb_rodada2_logo7.setBounds(20, 529, 30, 30);

        lb_rodada2_logo9.setText("jLabel10");
        add(lb_rodada2_logo9);
        lb_rodada2_logo9.setBounds(20, 559, 30, 30);

        lb_rodada2_logo10.setText("jLabel15");
        add(lb_rodada2_logo10);
        lb_rodada2_logo10.setBounds(600, 559, 30, 30);

        lb_rodada2_logo8.setText("jLabel14");
        add(lb_rodada2_logo8);
        lb_rodada2_logo8.setBounds(600, 529, 30, 30);

        lb_rodada2_logo6.setText("jLabel13");
        add(lb_rodada2_logo6);
        lb_rodada2_logo6.setBounds(600, 499, 30, 30);

        lb_rodada2_logo4.setText("jLabel12");
        add(lb_rodada2_logo4);
        lb_rodada2_logo4.setBounds(600, 469, 30, 30);

        lb_rodada2_logo2.setText("jLabel11");
        add(lb_rodada2_logo2);
        lb_rodada2_logo2.setBounds(600, 439, 30, 30);

        lb_rodada2_time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time10.setText("Time10");
        add(lb_rodada2_time10);
        lb_rodada2_time10.setBounds(440, 559, 151, 25);

        lb_rodada2_time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time8.setText("Time8");
        add(lb_rodada2_time8);
        lb_rodada2_time8.setBounds(440, 529, 151, 25);

        lb_rodada2_time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time6.setText("Time6");
        add(lb_rodada2_time6);
        lb_rodada2_time6.setBounds(440, 499, 151, 25);

        lb_rodada2_time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time4.setText("Time4");
        add(lb_rodada2_time4);
        lb_rodada2_time4.setBounds(440, 469, 151, 25);

        lb_rodada2_time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_time2.setText("Time2");
        add(lb_rodada2_time2);
        lb_rodada2_time2.setBounds(440, 439, 150, 25);

        lb_rodada2_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols10.setText("3");
        add(lb_rodada2_gols10);
        lb_rodada2_gols10.setBounds(350, 565, 10, 25);

        lb_rodada2_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols8.setText("3");
        add(lb_rodada2_gols8);
        lb_rodada2_gols8.setBounds(350, 539, 10, 20);

        lb_rodada2_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols6.setText("1");
        add(lb_rodada2_gols6);
        lb_rodada2_gols6.setBounds(350, 509, 10, 20);

        lb_rodada2_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols4.setText("0");
        add(lb_rodada2_gols4);
        lb_rodada2_gols4.setBounds(350, 479, 10, 20);

        lb_rodada2_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada2_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada2_gols2.setText("0");
        add(lb_rodada2_gols2);
        lb_rodada2_gols2.setBounds(350, 449, 10, 25);

        lb_rodada3_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time3.setText("TIme3");
        add(lb_rodada3_Time3);
        lb_rodada3_Time3.setBounds(70, 728, 150, 25);

        lb_rodada3_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time9.setText("Time9");
        add(lb_rodada3_Time9);
        lb_rodada3_Time9.setBounds(70, 818, 156, 25);

        lb_rodada3_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time5.setText("Time5");
        add(lb_rodada3_Time5);
        lb_rodada3_Time5.setBounds(70, 758, 150, 25);

        lb_rodada3_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time10.setText("Time10");
        add(lb_rodada3_Time10);
        lb_rodada3_Time10.setBounds(440, 818, 151, 25);

        lb_rodada3_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols10.setText("3");
        add(lb_rodada3_gols10);
        lb_rodada3_gols10.setBounds(350, 824, 10, 25);

        lb_rodada3_logo10.setText("jLabel15");
        add(lb_rodada3_logo10);
        lb_rodada3_logo10.setBounds(600, 818, 30, 30);

        lb_rodada3_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols8.setText("3");
        add(lb_rodada3_gols8);
        lb_rodada3_gols8.setBounds(350, 798, 10, 20);

        lb_rodada3_logo1.setText("jLabel6");
        add(lb_rodada3_logo1);
        lb_rodada3_logo1.setBounds(20, 698, 30, 30);

        lb_rodada3_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time4.setText("Time4");
        add(lb_rodada3_Time4);
        lb_rodada3_Time4.setBounds(440, 728, 151, 25);

        lb_rodada3_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols6.setText("1");
        add(lb_rodada3_gols6);
        lb_rodada3_gols6.setBounds(350, 768, 10, 20);

        lb_rodada3_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols2.setText("0");
        add(lb_rodada3_gols2);
        lb_rodada3_gols2.setBounds(350, 708, 10, 25);

        lb_rodada3_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time7.setText("Time7");
        add(lb_rodada3_Time7);
        lb_rodada3_Time7.setBounds(70, 788, 156, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rodada 3");
        add(jLabel5);
        jLabel5.setBounds(260, 654, 110, 27);

        lb_rodada3_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time1.setText("Time1");
        add(lb_rodada3_Time1);
        lb_rodada3_Time1.setBounds(70, 698, 150, 25);

        lb_result11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result11.setForeground(new java.awt.Color(255, 255, 255));
        lb_result11.setText("x");
        add(lb_result11);
        lb_result11.setBounds(310, 738, 10, 20);

        lb_rodada3_logo3.setText("jLabel7");
        add(lb_rodada3_logo3);
        lb_rodada3_logo3.setBounds(20, 728, 30, 30);

        lb_rodada3_logo2.setText("jLabel11");
        add(lb_rodada3_logo2);
        lb_rodada3_logo2.setBounds(600, 698, 30, 30);

        lb_rodada3_logo7.setText("jLabel1");
        add(lb_rodada3_logo7);
        lb_rodada3_logo7.setBounds(20, 788, 30, 30);

        lb_rodada3_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time6.setText("Time6");
        add(lb_rodada3_Time6);
        lb_rodada3_Time6.setBounds(440, 758, 151, 25);

        lb_result12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result12.setForeground(new java.awt.Color(255, 255, 255));
        lb_result12.setText("x");
        add(lb_result12);
        lb_result12.setBounds(310, 818, 10, 25);

        lb_rodada3_logo8.setText("jLabel14");
        add(lb_rodada3_logo8);
        lb_rodada3_logo8.setBounds(600, 788, 30, 30);

        lb_rodada3_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols9.setText("5");
        add(lb_rodada3_gols9);
        lb_rodada3_gols9.setBounds(260, 828, 10, 20);

        lb_rodada3_logo9.setText("jLabel10");
        add(lb_rodada3_logo9);
        lb_rodada3_logo9.setBounds(20, 818, 30, 30);

        lb_rodada3_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols5.setText("2");
        add(lb_rodada3_gols5);
        lb_rodada3_gols5.setBounds(260, 768, 10, 20);

        lb_rodada3_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols7.setText("4");
        add(lb_rodada3_gols7);
        lb_rodada3_gols7.setBounds(260, 798, 10, 20);

        lb_rodada3_logo6.setText("jLabel13");
        add(lb_rodada3_logo6);
        lb_rodada3_logo6.setBounds(600, 758, 30, 30);

        lb_rodada3_logo4.setText("jLabel12");
        add(lb_rodada3_logo4);
        lb_rodada3_logo4.setBounds(600, 728, 30, 30);

        lb_rodada3_logo5.setText("jLabel8");
        add(lb_rodada3_logo5);
        lb_rodada3_logo5.setBounds(20, 758, 30, 30);

        lb_rodada3_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols1.setText("0");
        add(lb_rodada3_gols1);
        lb_rodada3_gols1.setBounds(260, 708, 20, 20);

        lb_result13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result13.setForeground(new java.awt.Color(255, 255, 255));
        lb_result13.setText("x");
        add(lb_result13);
        lb_result13.setBounds(310, 788, 10, 25);

        lb_rodada3_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols4.setText("0");
        add(lb_rodada3_gols4);
        lb_rodada3_gols4.setBounds(350, 738, 10, 20);

        lb_rodada3_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_gols3.setText("1");
        add(lb_rodada3_gols3);
        lb_rodada3_gols3.setBounds(260, 738, 20, 16);

        lb_rodada3_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time8.setText("Time8");
        add(lb_rodada3_Time8);
        lb_rodada3_Time8.setBounds(440, 788, 151, 25);

        lb_result14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result14.setForeground(new java.awt.Color(255, 255, 255));
        lb_result14.setText("x");
        add(lb_result14);
        lb_result14.setBounds(310, 768, 10, 20);

        lb_result15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result15.setForeground(new java.awt.Color(255, 255, 255));
        lb_result15.setText("x");
        add(lb_result15);
        lb_result15.setBounds(310, 708, 10, 20);

        lb_rodada3_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada3_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada3_Time2.setText("Time2");
        add(lb_rodada3_Time2);
        lb_rodada3_Time2.setBounds(440, 698, 150, 25);

        lb_rodada4_logo10.setText("jLabel15");
        add(lb_rodada4_logo10);
        lb_rodada4_logo10.setBounds(600, 1077, 30, 30);

        lb_rodada4_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols8.setText("3");
        add(lb_rodada4_gols8);
        lb_rodada4_gols8.setBounds(350, 1057, 10, 20);

        lb_rodada4_logo1.setText("jLabel6");
        add(lb_rodada4_logo1);
        lb_rodada4_logo1.setBounds(20, 957, 30, 30);

        lb_rodada4_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time4.setText("Time4");
        add(lb_rodada4_Time4);
        lb_rodada4_Time4.setBounds(440, 987, 151, 25);

        lb_rodada4_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols6.setText("1");
        add(lb_rodada4_gols6);
        lb_rodada4_gols6.setBounds(350, 1027, 10, 20);

        lb_rodada4_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols2.setText("0");
        add(lb_rodada4_gols2);
        lb_rodada4_gols2.setBounds(350, 967, 10, 25);

        lb_rodada4_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time7.setText("Time7");
        add(lb_rodada4_Time7);
        lb_rodada4_Time7.setBounds(70, 1047, 156, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rodada 4");
        add(jLabel6);
        jLabel6.setBounds(260, 913, 110, 27);

        lb_rodada4_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time1.setText("Time1");
        add(lb_rodada4_Time1);
        lb_rodada4_Time1.setBounds(70, 957, 150, 25);

        lb_result16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result16.setForeground(new java.awt.Color(255, 255, 255));
        lb_result16.setText("x");
        add(lb_result16);
        lb_result16.setBounds(310, 997, 10, 20);

        lb_rodada4_logo3.setText("jLabel7");
        add(lb_rodada4_logo3);
        lb_rodada4_logo3.setBounds(20, 987, 30, 30);

        lb_rodada4_logo2.setText("jLabel11");
        add(lb_rodada4_logo2);
        lb_rodada4_logo2.setBounds(600, 957, 30, 30);

        lb_rodada4_logo7.setText("jLabel1");
        add(lb_rodada4_logo7);
        lb_rodada4_logo7.setBounds(20, 1047, 30, 30);

        lb_rodada4_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time6.setText("Time6");
        add(lb_rodada4_Time6);
        lb_rodada4_Time6.setBounds(440, 1017, 151, 25);

        lb_result17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result17.setForeground(new java.awt.Color(255, 255, 255));
        lb_result17.setText("x");
        add(lb_result17);
        lb_result17.setBounds(310, 1077, 10, 25);

        lb_rodada4_logo8.setText("jLabel14");
        add(lb_rodada4_logo8);
        lb_rodada4_logo8.setBounds(600, 1047, 30, 30);

        lb_rodada4_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols9.setText("5");
        add(lb_rodada4_gols9);
        lb_rodada4_gols9.setBounds(260, 1087, 10, 20);

        lb_rodada4_logo9.setText("jLabel10");
        add(lb_rodada4_logo9);
        lb_rodada4_logo9.setBounds(20, 1077, 30, 30);

        lb_rodada4_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols5.setText("2");
        add(lb_rodada4_gols5);
        lb_rodada4_gols5.setBounds(260, 1027, 10, 20);

        lb_rodada4_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols7.setText("4");
        add(lb_rodada4_gols7);
        lb_rodada4_gols7.setBounds(260, 1057, 10, 20);

        lb_rodada4_logo6.setText("jLabel13");
        add(lb_rodada4_logo6);
        lb_rodada4_logo6.setBounds(600, 1017, 30, 30);

        lb_rodada4_logo4.setText("jLabel12");
        add(lb_rodada4_logo4);
        lb_rodada4_logo4.setBounds(600, 987, 30, 30);

        lb_rodada4_logo5.setText("jLabel8");
        add(lb_rodada4_logo5);
        lb_rodada4_logo5.setBounds(20, 1017, 30, 30);

        lb_rodada4_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols1.setText("0");
        add(lb_rodada4_gols1);
        lb_rodada4_gols1.setBounds(260, 967, 20, 20);

        lb_result18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result18.setForeground(new java.awt.Color(255, 255, 255));
        lb_result18.setText("x");
        add(lb_result18);
        lb_result18.setBounds(310, 1047, 10, 25);

        lb_rodada4_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols4.setText("0");
        add(lb_rodada4_gols4);
        lb_rodada4_gols4.setBounds(350, 997, 10, 20);

        lb_rodada4_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols3.setText("1");
        add(lb_rodada4_gols3);
        lb_rodada4_gols3.setBounds(260, 997, 20, 16);

        lb_rodada4_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time8.setText("Time8");
        add(lb_rodada4_Time8);
        lb_rodada4_Time8.setBounds(440, 1047, 151, 25);

        lb_result19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result19.setForeground(new java.awt.Color(255, 255, 255));
        lb_result19.setText("x");
        add(lb_result19);
        lb_result19.setBounds(310, 1027, 10, 20);

        lb_result20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result20.setForeground(new java.awt.Color(255, 255, 255));
        lb_result20.setText("x");
        add(lb_result20);
        lb_result20.setBounds(310, 967, 10, 20);

        lb_rodada4_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time3.setText("TIme3");
        add(lb_rodada4_Time3);
        lb_rodada4_Time3.setBounds(70, 987, 150, 25);

        lb_rodada4_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time9.setText("Time9");
        add(lb_rodada4_Time9);
        lb_rodada4_Time9.setBounds(70, 1077, 156, 25);

        lb_rodada4_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time5.setText("Time5");
        add(lb_rodada4_Time5);
        lb_rodada4_Time5.setBounds(70, 1017, 150, 25);

        lb_rodada4_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time2.setText("Time2");
        add(lb_rodada4_Time2);
        lb_rodada4_Time2.setBounds(440, 957, 150, 25);

        lb_rodada4_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_Time10.setText("Time10");
        add(lb_rodada4_Time10);
        lb_rodada4_Time10.setBounds(440, 1077, 151, 25);

        lb_rodada4_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada4_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada4_gols10.setText("3");
        add(lb_rodada4_gols10);
        lb_rodada4_gols10.setBounds(350, 1083, 10, 25);

        lb_rodada5_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols10.setText("3");
        add(lb_rodada5_gols10);
        lb_rodada5_gols10.setBounds(350, 1342, 10, 25);

        lb_rodada5_logo8.setText("jLabel14");
        add(lb_rodada5_logo8);
        lb_rodada5_logo8.setBounds(600, 1306, 30, 30);

        lb_rodada5_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols4.setText("0");
        add(lb_rodada5_gols4);
        lb_rodada5_gols4.setBounds(350, 1256, 10, 20);

        lb_rodada5_logo9.setText("jLabel10");
        add(lb_rodada5_logo9);
        lb_rodada5_logo9.setBounds(20, 1336, 30, 30);

        lb_result21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result21.setForeground(new java.awt.Color(255, 255, 255));
        lb_result21.setText("x");
        add(lb_result21);
        lb_result21.setBounds(310, 1306, 10, 25);

        lb_rodada5_logo6.setText("jLabel13");
        add(lb_rodada5_logo6);
        lb_rodada5_logo6.setBounds(600, 1276, 30, 30);

        lb_rodada5_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time7.setText("Time7");
        add(lb_rodada5_Time7);
        lb_rodada5_Time7.setBounds(70, 1306, 156, 25);

        lb_rodada5_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols3.setText("1");
        add(lb_rodada5_gols3);
        lb_rodada5_gols3.setBounds(260, 1256, 20, 16);

        lb_result22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result22.setForeground(new java.awt.Color(255, 255, 255));
        lb_result22.setText("x");
        add(lb_result22);
        lb_result22.setBounds(310, 1336, 10, 25);

        lb_rodada5_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols9.setText("5");
        add(lb_rodada5_gols9);
        lb_rodada5_gols9.setBounds(260, 1346, 10, 20);

        lb_rodada5_logo1.setText("jLabel6");
        add(lb_rodada5_logo1);
        lb_rodada5_logo1.setBounds(20, 1216, 30, 30);

        lb_rodada5_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols6.setText("1");
        add(lb_rodada5_gols6);
        lb_rodada5_gols6.setBounds(350, 1286, 10, 20);

        lb_rodada5_logo4.setText("jLabel12");
        add(lb_rodada5_logo4);
        lb_rodada5_logo4.setBounds(600, 1246, 30, 30);

        lb_rodada5_logo2.setText("jLabel11");
        add(lb_rodada5_logo2);
        lb_rodada5_logo2.setBounds(600, 1216, 30, 30);

        lb_rodada5_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time9.setText("Time9");
        add(lb_rodada5_Time9);
        lb_rodada5_Time9.setBounds(70, 1336, 156, 25);

        lb_rodada5_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time1.setText("Time1");
        add(lb_rodada5_Time1);
        lb_rodada5_Time1.setBounds(70, 1216, 150, 25);

        lb_rodada5_logo7.setText("jLabel1");
        add(lb_rodada5_logo7);
        lb_rodada5_logo7.setBounds(20, 1306, 30, 30);

        lb_rodada5_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols5.setText("2");
        add(lb_rodada5_gols5);
        lb_rodada5_gols5.setBounds(260, 1286, 10, 20);

        lb_result23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result23.setForeground(new java.awt.Color(255, 255, 255));
        lb_result23.setText("x");
        add(lb_result23);
        lb_result23.setBounds(310, 1286, 10, 20);

        lb_rodada5_logo3.setText("jLabel7");
        add(lb_rodada5_logo3);
        lb_rodada5_logo3.setBounds(20, 1246, 30, 30);

        lb_rodada5_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time6.setText("Time6");
        add(lb_rodada5_Time6);
        lb_rodada5_Time6.setBounds(440, 1276, 151, 25);

        lb_rodada5_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time4.setText("Time4");
        add(lb_rodada5_Time4);
        lb_rodada5_Time4.setBounds(440, 1246, 151, 25);

        lb_result24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result24.setForeground(new java.awt.Color(255, 255, 255));
        lb_result24.setText("x");
        add(lb_result24);
        lb_result24.setBounds(310, 1226, 10, 20);

        lb_rodada5_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time2.setText("Time2");
        add(lb_rodada5_Time2);
        lb_rodada5_Time2.setBounds(440, 1216, 150, 25);

        lb_rodada5_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time8.setText("Time8");
        add(lb_rodada5_Time8);
        lb_rodada5_Time8.setBounds(440, 1306, 151, 25);

        lb_rodada5_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time5.setText("Time5");
        add(lb_rodada5_Time5);
        lb_rodada5_Time5.setBounds(70, 1276, 150, 25);

        lb_rodada5_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols7.setText("4");
        add(lb_rodada5_gols7);
        lb_rodada5_gols7.setBounds(260, 1316, 10, 20);

        lb_rodada5_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time10.setText("Time10");
        add(lb_rodada5_Time10);
        lb_rodada5_Time10.setBounds(440, 1336, 151, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rodada 5");
        add(jLabel7);
        jLabel7.setBounds(260, 1172, 110, 27);

        lb_rodada5_logo5.setText("jLabel8");
        add(lb_rodada5_logo5);
        lb_rodada5_logo5.setBounds(20, 1276, 30, 30);

        lb_rodada5_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_Time3.setText("TIme3");
        add(lb_rodada5_Time3);
        lb_rodada5_Time3.setBounds(70, 1246, 150, 25);

        lb_rodada5_logo10.setText("jLabel15");
        add(lb_rodada5_logo10);
        lb_rodada5_logo10.setBounds(600, 1336, 30, 30);

        lb_rodada5_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols8.setText("3");
        add(lb_rodada5_gols8);
        lb_rodada5_gols8.setBounds(350, 1316, 10, 20);

        lb_rodada5_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols1.setText("0");
        add(lb_rodada5_gols1);
        lb_rodada5_gols1.setBounds(260, 1226, 20, 20);

        lb_rodada5_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada5_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada5_gols2.setText("0");
        add(lb_rodada5_gols2);
        lb_rodada5_gols2.setBounds(350, 1226, 10, 25);

        lb_result25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result25.setForeground(new java.awt.Color(255, 255, 255));
        lb_result25.setText("x");
        add(lb_result25);
        lb_result25.setBounds(310, 1256, 10, 20);

        lb_rodada6_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols7.setText("4");
        add(lb_rodada6_gols7);
        lb_rodada6_gols7.setBounds(260, 1575, 10, 20);

        lb_rodada6_logo5.setText("jLabel8");
        add(lb_rodada6_logo5);
        lb_rodada6_logo5.setBounds(20, 1535, 30, 30);

        lb_rodada6_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols1.setText("0");
        add(lb_rodada6_gols1);
        lb_rodada6_gols1.setBounds(260, 1485, 20, 20);

        lb_rodada6_logo3.setText("jLabel7");
        add(lb_rodada6_logo3);
        lb_rodada6_logo3.setBounds(20, 1505, 30, 30);

        lb_rodada6_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time9.setText("Time9");
        add(lb_rodada6_Time9);
        lb_rodada6_Time9.setBounds(70, 1595, 156, 25);

        lb_rodada6_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols8.setText("3");
        add(lb_rodada6_gols8);
        lb_rodada6_gols8.setBounds(350, 1575, 10, 20);

        lb_rodada6_logo1.setText("jLabel6");
        add(lb_rodada6_logo1);
        lb_rodada6_logo1.setBounds(20, 1475, 30, 30);

        lb_rodada6_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time4.setText("Time4");
        add(lb_rodada6_Time4);
        lb_rodada6_Time4.setBounds(440, 1505, 151, 25);

        lb_result26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result26.setForeground(new java.awt.Color(255, 255, 255));
        lb_result26.setText("x");
        add(lb_result26);
        lb_result26.setBounds(310, 1545, 10, 20);

        lb_rodada6_logo9.setText("jLabel10");
        add(lb_rodada6_logo9);
        lb_rodada6_logo9.setBounds(20, 1595, 30, 30);

        lb_rodada6_logo7.setText("jLabel1");
        add(lb_rodada6_logo7);
        lb_rodada6_logo7.setBounds(20, 1565, 30, 30);

        lb_result27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result27.setForeground(new java.awt.Color(255, 255, 255));
        lb_result27.setText("x");
        add(lb_result27);
        lb_result27.setBounds(310, 1595, 10, 25);

        lb_rodada6_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols4.setText("0");
        add(lb_rodada6_gols4);
        lb_rodada6_gols4.setBounds(350, 1515, 10, 20);

        lb_rodada6_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols3.setText("1");
        add(lb_rodada6_gols3);
        lb_rodada6_gols3.setBounds(260, 1515, 20, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rodada 6");
        add(jLabel8);
        jLabel8.setBounds(260, 1431, 110, 27);

        lb_rodada6_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols9.setText("5");
        add(lb_rodada6_gols9);
        lb_rodada6_gols9.setBounds(260, 1605, 10, 20);

        lb_rodada6_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols5.setText("2");
        add(lb_rodada6_gols5);
        lb_rodada6_gols5.setBounds(260, 1545, 10, 20);

        lb_rodada6_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time1.setText("Time1");
        add(lb_rodada6_Time1);
        lb_rodada6_Time1.setBounds(70, 1475, 150, 25);

        lb_rodada6_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols10.setText("3");
        add(lb_rodada6_gols10);
        lb_rodada6_gols10.setBounds(350, 1601, 10, 25);

        lb_result28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result28.setForeground(new java.awt.Color(255, 255, 255));
        lb_result28.setText("x");
        add(lb_result28);
        lb_result28.setBounds(310, 1565, 10, 25);

        lb_rodada6_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time2.setText("Time2");
        add(lb_rodada6_Time2);
        lb_rodada6_Time2.setBounds(440, 1475, 150, 25);

        lb_rodada6_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time10.setText("Time10");
        add(lb_rodada6_Time10);
        lb_rodada6_Time10.setBounds(440, 1595, 151, 25);

        lb_rodada6_logo8.setText("jLabel14");
        add(lb_rodada6_logo8);
        lb_rodada6_logo8.setBounds(600, 1565, 30, 30);

        lb_rodada6_logo2.setText("jLabel11");
        add(lb_rodada6_logo2);
        lb_rodada6_logo2.setBounds(600, 1475, 30, 30);

        lb_rodada6_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time8.setText("Time8");
        add(lb_rodada6_Time8);
        lb_rodada6_Time8.setBounds(440, 1565, 151, 25);

        lb_rodada6_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time7.setText("Time7");
        add(lb_rodada6_Time7);
        lb_rodada6_Time7.setBounds(70, 1565, 156, 25);

        lb_rodada6_logo6.setText("jLabel13");
        add(lb_rodada6_logo6);
        lb_rodada6_logo6.setBounds(600, 1535, 30, 30);

        lb_rodada6_logo10.setText("jLabel15");
        add(lb_rodada6_logo10);
        lb_rodada6_logo10.setBounds(600, 1595, 30, 30);

        lb_rodada6_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time5.setText("Time5");
        add(lb_rodada6_Time5);
        lb_rodada6_Time5.setBounds(70, 1535, 150, 25);

        lb_rodada6_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols6.setText("1");
        add(lb_rodada6_gols6);
        lb_rodada6_gols6.setBounds(350, 1545, 10, 20);

        lb_rodada6_logo4.setText("jLabel12");
        add(lb_rodada6_logo4);
        lb_rodada6_logo4.setBounds(600, 1505, 30, 30);

        lb_result29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result29.setForeground(new java.awt.Color(255, 255, 255));
        lb_result29.setText("x");
        add(lb_result29);
        lb_result29.setBounds(310, 1515, 10, 20);

        lb_result30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result30.setForeground(new java.awt.Color(255, 255, 255));
        lb_result30.setText("x");
        add(lb_result30);
        lb_result30.setBounds(310, 1485, 10, 20);

        lb_rodada6_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_gols2.setText("0");
        add(lb_rodada6_gols2);
        lb_rodada6_gols2.setBounds(350, 1485, 10, 25);

        lb_rodada6_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time6.setText("Time6");
        add(lb_rodada6_Time6);
        lb_rodada6_Time6.setBounds(440, 1535, 151, 25);

        lb_rodada6_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada6_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada6_Time3.setText("TIme3");
        add(lb_rodada6_Time3);
        lb_rodada6_Time3.setBounds(70, 1505, 150, 25);

        lb_rodada7_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols9.setText("5");
        add(lb_rodada7_gols9);
        lb_rodada7_gols9.setBounds(260, 1864, 10, 20);

        lb_rodada7_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time3.setText("TIme3");
        add(lb_rodada7_Time3);
        lb_rodada7_Time3.setBounds(70, 1764, 150, 25);

        lb_rodada7_logo5.setText("jLabel8");
        add(lb_rodada7_logo5);
        lb_rodada7_logo5.setBounds(20, 1794, 30, 30);

        lb_rodada7_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time7.setText("Time7");
        add(lb_rodada7_Time7);
        lb_rodada7_Time7.setBounds(70, 1824, 156, 25);

        lb_rodada7_logo4.setText("jLabel12");
        add(lb_rodada7_logo4);
        lb_rodada7_logo4.setBounds(600, 1764, 30, 30);

        lb_rodada7_logo8.setText("jLabel14");
        add(lb_rodada7_logo8);
        lb_rodada7_logo8.setBounds(600, 1824, 30, 30);

        lb_result31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result31.setForeground(new java.awt.Color(255, 255, 255));
        lb_result31.setText("x");
        add(lb_result31);
        lb_result31.setBounds(310, 1854, 10, 25);

        lb_rodada7_logo6.setText("jLabel13");
        add(lb_rodada7_logo6);
        lb_rodada7_logo6.setBounds(600, 1794, 30, 30);

        lb_rodada7_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols6.setText("1");
        add(lb_rodada7_gols6);
        lb_rodada7_gols6.setBounds(350, 1804, 10, 20);

        lb_rodada7_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time1.setText("Time1");
        add(lb_rodada7_Time1);
        lb_rodada7_Time1.setBounds(70, 1734, 150, 25);

        lb_rodada7_logo2.setText("jLabel11");
        add(lb_rodada7_logo2);
        lb_rodada7_logo2.setBounds(600, 1734, 30, 30);

        lb_rodada7_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols7.setText("4");
        add(lb_rodada7_gols7);
        lb_rodada7_gols7.setBounds(260, 1834, 10, 20);

        lb_rodada7_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time8.setText("Time8");
        add(lb_rodada7_Time8);
        lb_rodada7_Time8.setBounds(440, 1824, 151, 25);

        lb_rodada7_logo10.setText("jLabel15");
        add(lb_rodada7_logo10);
        lb_rodada7_logo10.setBounds(600, 1854, 30, 30);

        lb_rodada7_logo3.setText("jLabel7");
        add(lb_rodada7_logo3);
        lb_rodada7_logo3.setBounds(20, 1764, 30, 30);

        lb_rodada7_logo7.setText("jLabel1");
        add(lb_rodada7_logo7);
        lb_rodada7_logo7.setBounds(20, 1824, 30, 30);

        lb_result32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result32.setForeground(new java.awt.Color(255, 255, 255));
        lb_result32.setText("x");
        add(lb_result32);
        lb_result32.setBounds(310, 1774, 10, 20);

        lb_rodada7_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time4.setText("Time4");
        add(lb_rodada7_Time4);
        lb_rodada7_Time4.setBounds(440, 1764, 151, 25);

        lb_rodada7_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols5.setText("2");
        add(lb_rodada7_gols5);
        lb_rodada7_gols5.setBounds(260, 1804, 10, 20);

        lb_rodada7_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols10.setText("3");
        add(lb_rodada7_gols10);
        lb_rodada7_gols10.setBounds(350, 1860, 10, 25);

        lb_result33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result33.setForeground(new java.awt.Color(255, 255, 255));
        lb_result33.setText("x");
        add(lb_result33);
        lb_result33.setBounds(310, 1744, 10, 20);

        lb_rodada7_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols4.setText("0");
        add(lb_rodada7_gols4);
        lb_rodada7_gols4.setBounds(350, 1774, 10, 20);

        lb_rodada7_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time10.setText("Time10");
        add(lb_rodada7_Time10);
        lb_rodada7_Time10.setBounds(440, 1854, 151, 25);

        lb_rodada7_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols1.setText("0");
        add(lb_rodada7_gols1);
        lb_rodada7_gols1.setBounds(260, 1744, 20, 20);

        lb_rodada7_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols2.setText("0");
        add(lb_rodada7_gols2);
        lb_rodada7_gols2.setBounds(350, 1744, 10, 25);

        lb_rodada7_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time9.setText("Time9");
        add(lb_rodada7_Time9);
        lb_rodada7_Time9.setBounds(70, 1854, 156, 25);

        lb_rodada7_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols8.setText("3");
        add(lb_rodada7_gols8);
        lb_rodada7_gols8.setBounds(350, 1834, 10, 20);

        lb_rodada7_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time5.setText("Time5");
        add(lb_rodada7_Time5);
        lb_rodada7_Time5.setBounds(70, 1794, 150, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rodada 7");
        add(jLabel9);
        jLabel9.setBounds(260, 1690, 110, 27);

        lb_result34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result34.setForeground(new java.awt.Color(255, 255, 255));
        lb_result34.setText("x");
        add(lb_result34);
        lb_result34.setBounds(310, 1824, 10, 25);

        lb_rodada7_logo9.setText("jLabel10");
        add(lb_rodada7_logo9);
        lb_rodada7_logo9.setBounds(20, 1854, 30, 30);

        lb_rodada7_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time2.setText("Time2");
        add(lb_rodada7_Time2);
        lb_rodada7_Time2.setBounds(440, 1734, 150, 25);

        lb_rodada7_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_gols3.setText("1");
        add(lb_rodada7_gols3);
        lb_rodada7_gols3.setBounds(260, 1774, 20, 16);

        lb_rodada7_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada7_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada7_Time6.setText("Time6");
        add(lb_rodada7_Time6);
        lb_rodada7_Time6.setBounds(440, 1794, 151, 25);

        lb_rodada7_logo1.setText("jLabel6");
        add(lb_rodada7_logo1);
        lb_rodada7_logo1.setBounds(20, 1734, 30, 30);

        lb_result35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result35.setForeground(new java.awt.Color(255, 255, 255));
        lb_result35.setText("x");
        add(lb_result35);
        lb_result35.setBounds(310, 1804, 10, 20);

        lb_rodada8_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols9.setText("5");
        add(lb_rodada8_gols9);
        lb_rodada8_gols9.setBounds(260, 2123, 10, 20);

        lb_rodada8_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time3.setText("TIme3");
        add(lb_rodada8_Time3);
        lb_rodada8_Time3.setBounds(70, 2023, 150, 25);

        lb_rodada8_logo5.setText("jLabel8");
        add(lb_rodada8_logo5);
        lb_rodada8_logo5.setBounds(20, 2053, 30, 30);

        lb_rodada8_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time7.setText("Time7");
        add(lb_rodada8_Time7);
        lb_rodada8_Time7.setBounds(80, 2110, 156, 25);

        lb_rodada8_logo4.setText("jLabel12");
        add(lb_rodada8_logo4);
        lb_rodada8_logo4.setBounds(600, 2023, 30, 30);

        lb_rodada8_logo8.setText("jLabel14");
        add(lb_rodada8_logo8);
        lb_rodada8_logo8.setBounds(600, 2083, 30, 30);

        lb_result36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result36.setForeground(new java.awt.Color(255, 255, 255));
        lb_result36.setText("x");
        add(lb_result36);
        lb_result36.setBounds(310, 2113, 10, 25);

        lb_rodada8_logo6.setText("jLabel13");
        add(lb_rodada8_logo6);
        lb_rodada8_logo6.setBounds(600, 2053, 30, 30);

        lb_rodada8_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols6.setText("1");
        add(lb_rodada8_gols6);
        lb_rodada8_gols6.setBounds(350, 2063, 10, 20);

        lb_rodada8_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time1.setText("Time1");
        add(lb_rodada8_Time1);
        lb_rodada8_Time1.setBounds(70, 1993, 150, 25);

        lb_rodada8_logo2.setText("jLabel11");
        add(lb_rodada8_logo2);
        lb_rodada8_logo2.setBounds(600, 1993, 30, 30);

        lb_rodada8_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols7.setText("4");
        add(lb_rodada8_gols7);
        lb_rodada8_gols7.setBounds(260, 2093, 10, 20);

        lb_rodada8_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time8.setText("Time8");
        add(lb_rodada8_Time8);
        lb_rodada8_Time8.setBounds(440, 2083, 151, 25);

        lb_rodada8_logo110.setText("jLabel15");
        add(lb_rodada8_logo110);
        lb_rodada8_logo110.setBounds(600, 2113, 30, 30);

        lb_rodada8_logo3.setText("jLabel7");
        add(lb_rodada8_logo3);
        lb_rodada8_logo3.setBounds(20, 2023, 30, 30);

        lb_rodada8_logo7.setText("jLabel1");
        add(lb_rodada8_logo7);
        lb_rodada8_logo7.setBounds(20, 2083, 30, 30);

        lb_result37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result37.setForeground(new java.awt.Color(255, 255, 255));
        lb_result37.setText("x");
        add(lb_result37);
        lb_result37.setBounds(310, 2033, 10, 20);

        lb_rodada8_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time4.setText("Time4");
        add(lb_rodada8_Time4);
        lb_rodada8_Time4.setBounds(440, 2023, 151, 25);

        lb_rodada8_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols5.setText("2");
        add(lb_rodada8_gols5);
        lb_rodada8_gols5.setBounds(260, 2063, 10, 20);

        lb_rodada8_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols10.setText("3");
        add(lb_rodada8_gols10);
        lb_rodada8_gols10.setBounds(350, 2119, 10, 25);

        lb_result38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result38.setForeground(new java.awt.Color(255, 255, 255));
        lb_result38.setText("x");
        add(lb_result38);
        lb_result38.setBounds(310, 2003, 10, 20);

        lb_rodada8_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols4.setText("0");
        add(lb_rodada8_gols4);
        lb_rodada8_gols4.setBounds(350, 2033, 10, 20);

        lb_rodada8_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time10.setText("Time10");
        add(lb_rodada8_Time10);
        lb_rodada8_Time10.setBounds(440, 2113, 151, 25);

        lb_rodada8_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols1.setText("0");
        add(lb_rodada8_gols1);
        lb_rodada8_gols1.setBounds(260, 2003, 20, 20);

        lb_rodada8_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols2.setText("0");
        add(lb_rodada8_gols2);
        lb_rodada8_gols2.setBounds(350, 2003, 10, 25);

        lb_rodada8_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time9.setText("Time9");
        add(lb_rodada8_Time9);
        lb_rodada8_Time9.setBounds(70, 2113, 156, 25);

        lb_rodada8_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols8.setText("3");
        add(lb_rodada8_gols8);
        lb_rodada8_gols8.setBounds(350, 2093, 10, 20);

        lb_rodada8_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time5.setText("Time5");
        add(lb_rodada8_Time5);
        lb_rodada8_Time5.setBounds(70, 2053, 150, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rodada 8");
        add(jLabel10);
        jLabel10.setBounds(260, 1949, 110, 27);

        lb_result39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result39.setForeground(new java.awt.Color(255, 255, 255));
        lb_result39.setText("x");
        add(lb_result39);
        lb_result39.setBounds(310, 2083, 10, 25);

        lb_rodada8_logo9.setText("jLabel10");
        add(lb_rodada8_logo9);
        lb_rodada8_logo9.setBounds(20, 2113, 30, 30);

        lb_rodada8_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time2.setText("Time2");
        add(lb_rodada8_Time2);
        lb_rodada8_Time2.setBounds(440, 1993, 150, 25);

        lb_rodada8_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_gols3.setText("1");
        add(lb_rodada8_gols3);
        lb_rodada8_gols3.setBounds(260, 2033, 20, 16);

        lb_rodada8_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada8_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada8_Time6.setText("Time6");
        add(lb_rodada8_Time6);
        lb_rodada8_Time6.setBounds(440, 2053, 151, 25);

        lb_rodada8_logo1.setText("jLabel6");
        add(lb_rodada8_logo1);
        lb_rodada8_logo1.setBounds(20, 1993, 30, 30);

        lb_result40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result40.setForeground(new java.awt.Color(255, 255, 255));
        lb_result40.setText("x");
        add(lb_result40);
        lb_result40.setBounds(310, 2063, 10, 20);

        lb_result41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result41.setForeground(new java.awt.Color(255, 255, 255));
        lb_result41.setText("x");
        add(lb_result41);
        lb_result41.setBounds(310, 2372, 10, 25);

        lb_rodada9_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time5.setText("Time5");
        add(lb_rodada9_Time5);
        lb_rodada9_Time5.setBounds(70, 2312, 150, 25);

        lb_rodada9_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time9.setText("Time9");
        add(lb_rodada9_Time9);
        lb_rodada9_Time9.setBounds(70, 2372, 156, 25);

        lb_rodada9_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols6.setText("1");
        add(lb_rodada9_gols6);
        lb_rodada9_gols6.setBounds(350, 2322, 10, 20);

        lb_rodada9_logo7.setText("jLabel1");
        add(lb_rodada9_logo7);
        lb_rodada9_logo7.setBounds(20, 2342, 30, 30);

        lb_rodada9_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols9.setText("5");
        add(lb_rodada9_gols9);
        lb_rodada9_gols9.setBounds(260, 2382, 10, 20);

        lb_rodada9_logo2.setText("jLabel11");
        add(lb_rodada9_logo2);
        lb_rodada9_logo2.setBounds(600, 2252, 30, 30);

        lb_rodada9_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols5.setText("2");
        add(lb_rodada9_gols5);
        lb_rodada9_gols5.setBounds(260, 2322, 10, 20);

        lb_rodada9_logo4.setText("jLabel12");
        add(lb_rodada9_logo4);
        lb_rodada9_logo4.setBounds(600, 2282, 30, 30);

        lb_rodada9_logo10.setText("jLabel15");
        add(lb_rodada9_logo10);
        lb_rodada9_logo10.setBounds(600, 2372, 30, 30);

        lb_rodada9_logo9.setText("jLabel10");
        add(lb_rodada9_logo9);
        lb_rodada9_logo9.setBounds(20, 2372, 30, 30);

        lb_result42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result42.setForeground(new java.awt.Color(255, 255, 255));
        lb_result42.setText("x");
        add(lb_result42);
        lb_result42.setBounds(310, 2342, 10, 25);

        lb_rodada9_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols4.setText("0");
        add(lb_rodada9_gols4);
        lb_rodada9_gols4.setBounds(350, 2292, 10, 20);

        lb_rodada9_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols3.setText("1");
        add(lb_rodada9_gols3);
        lb_rodada9_gols3.setBounds(260, 2292, 20, 16);

        lb_rodada9_logo6.setText("jLabel13");
        add(lb_rodada9_logo6);
        lb_rodada9_logo6.setBounds(600, 2312, 30, 30);

        lb_rodada9_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time6.setText("Time6");
        add(lb_rodada9_Time6);
        lb_rodada9_Time6.setBounds(440, 2312, 151, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rodada 9");
        add(jLabel11);
        jLabel11.setBounds(260, 2208, 110, 27);

        lb_result43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result43.setForeground(new java.awt.Color(255, 255, 255));
        lb_result43.setText("x");
        add(lb_result43);
        lb_result43.setBounds(310, 2322, 10, 20);

        lb_rodada9_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time7.setText("Time7");
        add(lb_rodada9_Time7);
        lb_rodada9_Time7.setBounds(70, 2342, 156, 25);

        lb_rodada9_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols8.setText("3");
        add(lb_rodada9_gols8);
        lb_rodada9_gols8.setBounds(350, 2352, 10, 20);

        lb_rodada9_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time4.setText("Time4");
        add(lb_rodada9_Time4);
        lb_rodada9_Time4.setBounds(440, 2282, 151, 25);

        lb_rodada9_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols1.setText("0");
        add(lb_rodada9_gols1);
        lb_rodada9_gols1.setBounds(260, 2262, 20, 20);

        lb_rodada9_logo3.setText("jLabel7");
        add(lb_rodada9_logo3);
        lb_rodada9_logo3.setBounds(20, 2282, 30, 30);

        lb_rodada9_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time2.setText("Time2");
        add(lb_rodada9_Time2);
        lb_rodada9_Time2.setBounds(440, 2252, 150, 25);

        lb_rodada9_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time1.setText("Time1");
        add(lb_rodada9_Time1);
        lb_rodada9_Time1.setBounds(70, 2252, 150, 25);

        lb_result44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result44.setForeground(new java.awt.Color(255, 255, 255));
        lb_result44.setText("x");
        add(lb_result44);
        lb_result44.setBounds(310, 2262, 10, 20);

        lb_result45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result45.setForeground(new java.awt.Color(255, 255, 255));
        lb_result45.setText("x");
        add(lb_result45);
        lb_result45.setBounds(310, 2292, 10, 20);

        lb_rodada9_logo5.setText("jLabel8");
        add(lb_rodada9_logo5);
        lb_rodada9_logo5.setBounds(20, 2312, 30, 30);

        lb_rodada9_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols7.setText("4");
        add(lb_rodada9_gols7);
        lb_rodada9_gols7.setBounds(260, 2352, 10, 20);

        lb_rodada9_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time8.setText("Time8");
        add(lb_rodada9_Time8);
        lb_rodada9_Time8.setBounds(440, 2342, 151, 25);

        lb_rodada9_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time3.setText("TIme3");
        add(lb_rodada9_Time3);
        lb_rodada9_Time3.setBounds(70, 2282, 150, 25);

        lb_rodada9_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols2.setText("0");
        add(lb_rodada9_gols2);
        lb_rodada9_gols2.setBounds(350, 2262, 10, 25);

        lb_rodada9_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_Time10.setText("Time10");
        add(lb_rodada9_Time10);
        lb_rodada9_Time10.setBounds(440, 2372, 151, 25);

        lb_rodada9_logo8.setText("jLabel14");
        add(lb_rodada9_logo8);
        lb_rodada9_logo8.setBounds(600, 2342, 30, 30);

        lb_rodada9_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada9_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada9_gols10.setText("3");
        add(lb_rodada9_gols10);
        lb_rodada9_gols10.setBounds(350, 2378, 10, 25);

        lb_rodada9_logo1.setText("jLabel6");
        add(lb_rodada9_logo1);
        lb_rodada9_logo1.setBounds(20, 2252, 30, 30);

        lb_rodada10_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time9.setText("Time9");
        add(lb_rodada10_Time9);
        lb_rodada10_Time9.setBounds(70, 2631, 156, 25);

        lb_rodada10_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols8.setText("3");
        add(lb_rodada10_gols8);
        lb_rodada10_gols8.setBounds(350, 2611, 10, 20);

        lb_rodada10_logo5.setText("jLabel8");
        add(lb_rodada10_logo5);
        lb_rodada10_logo5.setBounds(20, 2571, 30, 30);

        lb_rodada10_logo10.setText("jLabel15");
        add(lb_rodada10_logo10);
        lb_rodada10_logo10.setBounds(600, 2631, 30, 30);

        lb_rodada10_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time1.setText("Time1");
        add(lb_rodada10_Time1);
        lb_rodada10_Time1.setBounds(70, 2511, 150, 25);

        lb_rodada10_logo3.setText("jLabel7");
        add(lb_rodada10_logo3);
        lb_rodada10_logo3.setBounds(20, 2541, 30, 30);

        lb_rodada10_logo6.setText("jLabel13");
        add(lb_rodada10_logo6);
        lb_rodada10_logo6.setBounds(600, 2571, 30, 30);

        lb_result46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result46.setForeground(new java.awt.Color(255, 255, 255));
        lb_result46.setText("x");
        add(lb_result46);
        lb_result46.setBounds(310, 2631, 10, 25);

        lb_rodada10_logo8.setText("jLabel14");
        add(lb_rodada10_logo8);
        lb_rodada10_logo8.setBounds(600, 2601, 30, 30);

        lb_rodada10_logo7.setText("jLabel1");
        add(lb_rodada10_logo7);
        lb_rodada10_logo7.setBounds(20, 2601, 30, 30);

        lb_result47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result47.setForeground(new java.awt.Color(255, 255, 255));
        lb_result47.setText("x");
        add(lb_result47);
        lb_result47.setBounds(310, 2601, 10, 25);

        lb_rodada10_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols1.setText("0");
        add(lb_rodada10_gols1);
        lb_rodada10_gols1.setBounds(260, 2521, 20, 20);

        lb_result48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result48.setForeground(new java.awt.Color(255, 255, 255));
        lb_result48.setText("x");
        add(lb_result48);
        lb_result48.setBounds(310, 2581, 10, 20);

        lb_result49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result49.setForeground(new java.awt.Color(255, 255, 255));
        lb_result49.setText("x");
        add(lb_result49);
        lb_result49.setBounds(310, 2551, 10, 20);

        lb_rodada10_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time6.setText("Time6");
        add(lb_rodada10_Time6);
        lb_rodada10_Time6.setBounds(440, 2571, 151, 25);

        lb_rodada10_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols3.setText("1");
        add(lb_rodada10_gols3);
        lb_rodada10_gols3.setBounds(260, 2551, 20, 16);

        lb_rodada10_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols10.setText("3");
        add(lb_rodada10_gols10);
        lb_rodada10_gols10.setBounds(350, 2637, 10, 25);

        lb_rodada10_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols7.setText("4");
        add(lb_rodada10_gols7);
        lb_rodada10_gols7.setBounds(260, 2611, 10, 20);

        lb_rodada10_logo4.setText("jLabel12");
        add(lb_rodada10_logo4);
        lb_rodada10_logo4.setBounds(600, 2541, 30, 30);

        lb_rodada10_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time3.setText("TIme3");
        add(lb_rodada10_Time3);
        lb_rodada10_Time3.setBounds(70, 2541, 150, 25);

        lb_rodada10_logo2.setText("jLabel11");
        add(lb_rodada10_logo2);
        lb_rodada10_logo2.setBounds(600, 2511, 30, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rodada 10");
        add(jLabel12);
        jLabel12.setBounds(260, 2467, 110, 27);

        lb_rodada10_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols2.setText("0");
        add(lb_rodada10_gols2);
        lb_rodada10_gols2.setBounds(350, 2521, 10, 25);

        lb_result50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result50.setForeground(new java.awt.Color(255, 255, 255));
        lb_result50.setText("x");
        add(lb_result50);
        lb_result50.setBounds(310, 2521, 10, 20);

        lb_rodada10_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time5.setText("Time5");
        add(lb_rodada10_Time5);
        lb_rodada10_Time5.setBounds(70, 2571, 150, 25);

        lb_rodada10_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols5.setText("2");
        add(lb_rodada10_gols5);
        lb_rodada10_gols5.setBounds(260, 2581, 10, 20);

        lb_rodada10_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols4.setText("0");
        add(lb_rodada10_gols4);
        lb_rodada10_gols4.setBounds(350, 2551, 10, 20);

        lb_rodada10_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time7.setText("Time7");
        add(lb_rodada10_Time7);
        lb_rodada10_Time7.setBounds(70, 2601, 156, 25);

        lb_rodada10_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time10.setText("Time10");
        add(lb_rodada10_Time10);
        lb_rodada10_Time10.setBounds(440, 2631, 151, 25);

        lb_rodada10_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time8.setText("Time8");
        add(lb_rodada10_Time8);
        lb_rodada10_Time8.setBounds(440, 2601, 151, 25);

        lb_rodada10_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols9.setText("5");
        add(lb_rodada10_gols9);
        lb_rodada10_gols9.setBounds(260, 2641, 10, 20);

        lb_rodada10_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_gols6.setText("1");
        add(lb_rodada10_gols6);
        lb_rodada10_gols6.setBounds(350, 2581, 10, 20);

        lb_rodada10_logo9.setText("jLabel10");
        add(lb_rodada10_logo9);
        lb_rodada10_logo9.setBounds(20, 2631, 30, 30);

        lb_rodada10_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time2.setText("Time2");
        add(lb_rodada10_Time2);
        lb_rodada10_Time2.setBounds(440, 2511, 150, 25);

        lb_rodada10_logo1.setText("jLabel6");
        add(lb_rodada10_logo1);
        lb_rodada10_logo1.setBounds(20, 2511, 30, 30);

        lb_rodada10_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada10_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada10_Time4.setText("Time4");
        add(lb_rodada10_Time4);
        lb_rodada10_Time4.setBounds(440, 2541, 151, 25);

        lb_rodada11_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time3.setText("TIme3");
        add(lb_rodada11_Time3);
        lb_rodada11_Time3.setBounds(70, 2800, 150, 25);

        lb_rodada11_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time8.setText("Time8");
        add(lb_rodada11_Time8);
        lb_rodada11_Time8.setBounds(440, 2860, 151, 25);

        lb_rodada11_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time2.setText("Time2");
        add(lb_rodada11_Time2);
        lb_rodada11_Time2.setBounds(440, 2770, 150, 25);

        lb_rodada11_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols2.setText("0");
        add(lb_rodada11_gols2);
        lb_rodada11_gols2.setBounds(350, 2780, 10, 25);

        lb_rodada11_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time7.setText("Time7");
        add(lb_rodada11_Time7);
        lb_rodada11_Time7.setBounds(70, 2860, 156, 25);

        lb_rodada11_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time4.setText("Time4");
        add(lb_rodada11_Time4);
        lb_rodada11_Time4.setBounds(440, 2800, 151, 25);

        lb_rodada11_logo2.setText("jLabel11");
        add(lb_rodada11_logo2);
        lb_rodada11_logo2.setBounds(600, 2770, 30, 30);

        lb_result51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result51.setForeground(new java.awt.Color(255, 255, 255));
        lb_result51.setText("x");
        add(lb_result51);
        lb_result51.setBounds(310, 2890, 10, 25);

        lb_rodada11_logo1.setText("jLabel6");
        add(lb_rodada11_logo1);
        lb_rodada11_logo1.setBounds(20, 2770, 30, 30);

        lb_result52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result52.setForeground(new java.awt.Color(255, 255, 255));
        lb_result52.setText("x");
        add(lb_result52);
        lb_result52.setBounds(310, 2840, 10, 20);

        lb_rodada11_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols9.setText("5");
        add(lb_rodada11_gols9);
        lb_rodada11_gols9.setBounds(260, 2900, 10, 20);

        lb_result53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result53.setForeground(new java.awt.Color(255, 255, 255));
        lb_result53.setText("x");
        add(lb_result53);
        lb_result53.setBounds(310, 2780, 10, 20);

        lb_rodada11_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time5.setText("Time5");
        add(lb_rodada11_Time5);
        lb_rodada11_Time5.setBounds(70, 2830, 150, 25);

        lb_rodada11_logo9.setText("jLabel10");
        add(lb_rodada11_logo9);
        lb_rodada11_logo9.setBounds(20, 2890, 30, 30);

        lb_rodada11_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time1.setText("Time1");
        add(lb_rodada11_Time1);
        lb_rodada11_Time1.setBounds(70, 2770, 150, 25);

        lb_rodada11_logo6.setText("jLabel13");
        add(lb_rodada11_logo6);
        lb_rodada11_logo6.setBounds(600, 2830, 30, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rodada 11");
        add(jLabel13);
        jLabel13.setBounds(260, 2726, 110, 27);

        lb_rodada11_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time10.setText("Time10");
        add(lb_rodada11_Time10);
        lb_rodada11_Time10.setBounds(440, 2890, 151, 25);

        lb_rodada11_logo10.setText("jLabel15");
        add(lb_rodada11_logo10);
        lb_rodada11_logo10.setBounds(600, 2890, 30, 30);

        lb_rodada11_logo8.setText("jLabel14");
        add(lb_rodada11_logo8);
        lb_rodada11_logo8.setBounds(600, 2860, 30, 30);

        lb_rodada11_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols5.setText("2");
        add(lb_rodada11_gols5);
        lb_rodada11_gols5.setBounds(260, 2840, 10, 20);

        lb_rodada11_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time6.setText("Time6");
        add(lb_rodada11_Time6);
        lb_rodada11_Time6.setBounds(440, 2830, 151, 25);

        lb_rodada11_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols6.setText("1");
        add(lb_rodada11_gols6);
        lb_rodada11_gols6.setBounds(350, 2840, 10, 20);

        lb_rodada11_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols1.setText("0");
        add(lb_rodada11_gols1);
        lb_rodada11_gols1.setBounds(260, 2780, 20, 20);

        lb_rodada11_logo4.setText("jLabel12");
        add(lb_rodada11_logo4);
        lb_rodada11_logo4.setBounds(600, 2800, 30, 30);

        lb_result54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result54.setForeground(new java.awt.Color(255, 255, 255));
        lb_result54.setText("x");
        add(lb_result54);
        lb_result54.setBounds(310, 2810, 10, 20);

        lb_result55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result55.setForeground(new java.awt.Color(255, 255, 255));
        lb_result55.setText("x");
        add(lb_result55);
        lb_result55.setBounds(310, 2860, 10, 25);

        lb_rodada11_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols8.setText("3");
        add(lb_rodada11_gols8);
        lb_rodada11_gols8.setBounds(350, 2870, 10, 20);

        lb_rodada11_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols7.setText("4");
        add(lb_rodada11_gols7);
        lb_rodada11_gols7.setBounds(260, 2870, 10, 20);

        lb_rodada11_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols4.setText("0");
        add(lb_rodada11_gols4);
        lb_rodada11_gols4.setBounds(350, 2810, 10, 20);

        lb_rodada11_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols10.setText("3");
        add(lb_rodada11_gols10);
        lb_rodada11_gols10.setBounds(350, 2896, 10, 25);

        lb_rodada11_logo7.setText("jLabel1");
        add(lb_rodada11_logo7);
        lb_rodada11_logo7.setBounds(20, 2860, 30, 30);

        lb_rodada11_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_Time9.setText("Time9");
        add(lb_rodada11_Time9);
        lb_rodada11_Time9.setBounds(70, 2890, 156, 25);

        lb_rodada11_logo5.setText("jLabel8");
        add(lb_rodada11_logo5);
        lb_rodada11_logo5.setBounds(20, 2830, 30, 30);

        lb_rodada11_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada11_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada11_gols3.setText("1");
        add(lb_rodada11_gols3);
        lb_rodada11_gols3.setBounds(260, 2810, 20, 16);

        lb_rodada11_logo3.setText("jLabel7");
        add(lb_rodada11_logo3);
        lb_rodada11_logo3.setBounds(20, 2800, 30, 30);

        lb_rodada12_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time7.setText("Time7");
        add(lb_rodada12_Time7);
        lb_rodada12_Time7.setBounds(70, 3119, 156, 25);

        lb_result56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result56.setForeground(new java.awt.Color(255, 255, 255));
        lb_result56.setText("x");
        add(lb_result56);
        lb_result56.setBounds(310, 3039, 10, 20);

        lb_rodada12_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols4.setText("0");
        add(lb_rodada12_gols4);
        lb_rodada12_gols4.setBounds(350, 3069, 10, 20);

        lb_rodada12_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols7.setText("4");
        add(lb_rodada12_gols7);
        lb_rodada12_gols7.setBounds(260, 3129, 10, 20);

        lb_rodada12_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols1.setText("0");
        add(lb_rodada12_gols1);
        lb_rodada12_gols1.setBounds(260, 3039, 20, 20);

        lb_rodada12_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols3.setText("1");
        add(lb_rodada12_gols3);
        lb_rodada12_gols3.setBounds(260, 3069, 20, 16);

        lb_result57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result57.setForeground(new java.awt.Color(255, 255, 255));
        lb_result57.setText("x");
        add(lb_result57);
        lb_result57.setBounds(310, 3149, 10, 25);

        lb_rodada12_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols10.setText("3");
        add(lb_rodada12_gols10);
        lb_rodada12_gols10.setBounds(350, 3155, 10, 25);

        lb_result58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result58.setForeground(new java.awt.Color(255, 255, 255));
        lb_result58.setText("x");
        add(lb_result58);
        lb_result58.setBounds(310, 3099, 10, 20);

        lb_rodada12_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time2.setText("Time2");
        add(lb_rodada12_Time2);
        lb_rodada12_Time2.setBounds(440, 3029, 150, 25);

        lb_rodada12_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time4.setText("Time4");
        add(lb_rodada12_Time4);
        lb_rodada12_Time4.setBounds(440, 3059, 151, 25);

        lb_rodada12_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time6.setText("Time6");
        add(lb_rodada12_Time6);
        lb_rodada12_Time6.setBounds(440, 3089, 151, 25);

        lb_rodada12_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time1.setText("Time1");
        add(lb_rodada12_Time1);
        lb_rodada12_Time1.setBounds(70, 3029, 150, 25);

        lb_rodada12_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols5.setText("2");
        add(lb_rodada12_gols5);
        lb_rodada12_gols5.setBounds(260, 3099, 10, 20);

        lb_rodada12_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time9.setText("Time9");
        add(lb_rodada12_Time9);
        lb_rodada12_Time9.setBounds(70, 3149, 156, 25);

        lb_rodada12_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time3.setText("TIme3");
        add(lb_rodada12_Time3);
        lb_rodada12_Time3.setBounds(70, 3059, 150, 25);

        lb_result59.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result59.setForeground(new java.awt.Color(255, 255, 255));
        lb_result59.setText("x");
        add(lb_result59);
        lb_result59.setBounds(310, 3069, 10, 20);

        lb_rodada12_logo2.setText("jLabel11");
        add(lb_rodada12_logo2);
        lb_rodada12_logo2.setBounds(600, 3029, 30, 30);

        lb_rodada12_logo4.setText("jLabel12");
        add(lb_rodada12_logo4);
        lb_rodada12_logo4.setBounds(600, 3059, 30, 30);

        lb_rodada12_logo3.setText("jLabel7");
        add(lb_rodada12_logo3);
        lb_rodada12_logo3.setBounds(20, 3059, 30, 30);

        lb_rodada12_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols6.setText("1");
        add(lb_rodada12_gols6);
        lb_rodada12_gols6.setBounds(350, 3099, 10, 20);

        lb_rodada12_logo5.setText("jLabel8");
        add(lb_rodada12_logo5);
        lb_rodada12_logo5.setBounds(20, 3089, 30, 30);

        lb_rodada12_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols2.setText("0");
        add(lb_rodada12_gols2);
        lb_rodada12_gols2.setBounds(350, 3039, 10, 25);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rodada 12");
        add(jLabel14);
        jLabel14.setBounds(260, 2985, 110, 27);

        lb_rodada12_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols8.setText("3");
        add(lb_rodada12_gols8);
        lb_rodada12_gols8.setBounds(350, 3129, 10, 20);

        lb_rodada12_logo6.setText("jLabel13");
        add(lb_rodada12_logo6);
        lb_rodada12_logo6.setBounds(600, 3089, 30, 30);

        lb_rodada12_logo9.setText("jLabel10");
        add(lb_rodada12_logo9);
        lb_rodada12_logo9.setBounds(20, 3149, 30, 30);

        lb_rodada12_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time10.setText("Time10");
        add(lb_rodada12_Time10);
        lb_rodada12_Time10.setBounds(440, 3149, 151, 25);

        lb_rodada12_logo1.setText("jLabel6");
        add(lb_rodada12_logo1);
        lb_rodada12_logo1.setBounds(20, 3029, 30, 30);

        lb_rodada12_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_gols9.setText("5");
        add(lb_rodada12_gols9);
        lb_rodada12_gols9.setBounds(260, 3159, 10, 20);

        lb_rodada12_logo8.setText("jLabel14");
        add(lb_rodada12_logo8);
        lb_rodada12_logo8.setBounds(600, 3119, 30, 30);

        lb_result60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result60.setForeground(new java.awt.Color(255, 255, 255));
        lb_result60.setText("x");
        add(lb_result60);
        lb_result60.setBounds(310, 3119, 10, 25);

        lb_rodada12_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time8.setText("Time8");
        add(lb_rodada12_Time8);
        lb_rodada12_Time8.setBounds(440, 3119, 151, 25);

        lb_rodada12_logo10.setText("jLabel15");
        add(lb_rodada12_logo10);
        lb_rodada12_logo10.setBounds(600, 3149, 30, 30);

        lb_rodada12_logo7.setText("jLabel1");
        add(lb_rodada12_logo7);
        lb_rodada12_logo7.setBounds(20, 3119, 30, 30);

        lb_rodada12_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada12_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada12_Time5.setText("Time5");
        add(lb_rodada12_Time5);
        lb_rodada12_Time5.setBounds(70, 3089, 150, 25);

        lb_rodada13_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols8.setText("3");
        add(lb_rodada13_gols8);
        lb_rodada13_gols8.setBounds(350, 3388, 10, 20);

        lb_rodada13_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time9.setText("Time9");
        add(lb_rodada13_Time9);
        lb_rodada13_Time9.setBounds(70, 3408, 156, 25);

        lb_rodada13_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time10.setText("Time10");
        add(lb_rodada13_Time10);
        lb_rodada13_Time10.setBounds(440, 3408, 151, 25);

        lb_rodada13_logo8.setText("jLabel14");
        add(lb_rodada13_logo8);
        lb_rodada13_logo8.setBounds(600, 3378, 30, 30);

        lb_rodada13_logo10.setText("jLabel15");
        add(lb_rodada13_logo10);
        lb_rodada13_logo10.setBounds(600, 3408, 30, 30);

        lb_rodada13_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols1.setText("0");
        add(lb_rodada13_gols1);
        lb_rodada13_gols1.setBounds(260, 3298, 20, 20);

        lb_rodada13_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols3.setText("1");
        add(lb_rodada13_gols3);
        lb_rodada13_gols3.setBounds(260, 3328, 20, 16);

        lb_rodada13_logo9.setText("jLabel10");
        add(lb_rodada13_logo9);
        lb_rodada13_logo9.setBounds(20, 3408, 30, 30);

        lb_rodada13_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time3.setText("TIme3");
        add(lb_rodada13_Time3);
        lb_rodada13_Time3.setBounds(70, 3318, 150, 25);

        lb_rodada13_logo5.setText("jLabel8");
        add(lb_rodada13_logo5);
        lb_rodada13_logo5.setBounds(20, 3348, 30, 30);

        lb_rodada13_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time7.setText("Time7");
        add(lb_rodada13_Time7);
        lb_rodada13_Time7.setBounds(70, 3378, 156, 25);

        lb_rodada13_logo3.setText("jLabel7");
        add(lb_rodada13_logo3);
        lb_rodada13_logo3.setBounds(20, 3318, 30, 30);

        lb_rodada13_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols6.setText("1");
        add(lb_rodada13_gols6);
        lb_rodada13_gols6.setBounds(350, 3358, 10, 20);

        lb_rodada13_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols9.setText("5");
        add(lb_rodada13_gols9);
        lb_rodada13_gols9.setBounds(260, 3418, 10, 20);

        lb_rodada13_logo2.setText("jLabel11");
        add(lb_rodada13_logo2);
        lb_rodada13_logo2.setBounds(600, 3288, 30, 30);

        lb_result61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result61.setForeground(new java.awt.Color(255, 255, 255));
        lb_result61.setText("x");
        add(lb_result61);
        lb_result61.setBounds(310, 3358, 10, 20);

        lb_rodada13_logo4.setText("jLabel12");
        add(lb_rodada13_logo4);
        lb_rodada13_logo4.setBounds(600, 3318, 30, 30);

        lb_rodada13_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time1.setText("Time1");
        add(lb_rodada13_Time1);
        lb_rodada13_Time1.setBounds(70, 3288, 150, 25);

        lb_result62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result62.setForeground(new java.awt.Color(255, 255, 255));
        lb_result62.setText("x");
        add(lb_result62);
        lb_result62.setBounds(310, 3378, 10, 25);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rodada 13");
        add(jLabel15);
        jLabel15.setBounds(260, 3244, 110, 27);

        lb_result63.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result63.setForeground(new java.awt.Color(255, 255, 255));
        lb_result63.setText("x");
        add(lb_result63);
        lb_result63.setBounds(310, 3408, 10, 25);

        lb_rodada13_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time2.setText("Time2");
        add(lb_rodada13_Time2);
        lb_rodada13_Time2.setBounds(440, 3288, 150, 25);

        lb_rodada13_logo7.setText("jLabel1");
        add(lb_rodada13_logo7);
        lb_rodada13_logo7.setBounds(20, 3378, 30, 30);

        lb_result64.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result64.setForeground(new java.awt.Color(255, 255, 255));
        lb_result64.setText("x");
        add(lb_result64);
        lb_result64.setBounds(310, 3298, 10, 20);

        lb_rodada13_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time6.setText("Time6");
        add(lb_rodada13_Time6);
        lb_rodada13_Time6.setBounds(440, 3348, 151, 25);

        lb_result65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result65.setForeground(new java.awt.Color(255, 255, 255));
        lb_result65.setText("x");
        add(lb_result65);
        lb_result65.setBounds(310, 3328, 10, 20);

        lb_rodada13_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols7.setText("4");
        add(lb_rodada13_gols7);
        lb_rodada13_gols7.setBounds(260, 3388, 10, 20);

        lb_rodada13_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time5.setText("Time5");
        add(lb_rodada13_Time5);
        lb_rodada13_Time5.setBounds(70, 3348, 150, 25);

        lb_rodada13_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols10.setText("3");
        add(lb_rodada13_gols10);
        lb_rodada13_gols10.setBounds(350, 3414, 10, 25);

        lb_rodada13_logo1.setText("jLabel6");
        add(lb_rodada13_logo1);
        lb_rodada13_logo1.setBounds(20, 3288, 30, 30);

        lb_rodada13_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols5.setText("2");
        add(lb_rodada13_gols5);
        lb_rodada13_gols5.setBounds(260, 3358, 10, 20);

        lb_rodada13_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols2.setText("0");
        add(lb_rodada13_gols2);
        lb_rodada13_gols2.setBounds(350, 3298, 10, 25);

        lb_rodada13_logo6.setText("jLabel13");
        add(lb_rodada13_logo6);
        lb_rodada13_logo6.setBounds(600, 3348, 30, 30);

        lb_rodada13_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time8.setText("Time8");
        add(lb_rodada13_Time8);
        lb_rodada13_Time8.setBounds(440, 3378, 151, 25);

        lb_rodada13_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_gols4.setText("0");
        add(lb_rodada13_gols4);
        lb_rodada13_gols4.setBounds(350, 3328, 10, 20);

        lb_rodada13_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada13_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada13_Time4.setText("Time4");
        add(lb_rodada13_Time4);
        lb_rodada13_Time4.setBounds(440, 3318, 151, 25);

        lb_rodada14_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time4.setText("Time4");
        add(lb_rodada14_Time4);
        lb_rodada14_Time4.setBounds(440, 3577, 151, 25);

        lb_rodada14_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time10.setText("Time10");
        add(lb_rodada14_Time10);
        lb_rodada14_Time10.setBounds(440, 3667, 151, 25);

        lb_rodada14_logo8.setText("jLabel14");
        add(lb_rodada14_logo8);
        lb_rodada14_logo8.setBounds(600, 3637, 30, 30);

        lb_rodada14_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols7.setText("4");
        add(lb_rodada14_gols7);
        lb_rodada14_gols7.setBounds(260, 3647, 10, 20);

        lb_rodada14_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols6.setText("1");
        add(lb_rodada14_gols6);
        lb_rodada14_gols6.setBounds(350, 3617, 10, 20);

        lb_rodada14_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols1.setText("0");
        add(lb_rodada14_gols1);
        lb_rodada14_gols1.setBounds(260, 3557, 20, 20);

        lb_rodada14_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time9.setText("Time9");
        add(lb_rodada14_Time9);
        lb_rodada14_Time9.setBounds(70, 3667, 156, 25);

        lb_result66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result66.setForeground(new java.awt.Color(255, 255, 255));
        lb_result66.setText("x");
        add(lb_result66);
        lb_result66.setBounds(310, 3667, 10, 25);

        lb_rodada14_logo4.setText("jLabel12");
        add(lb_rodada14_logo4);
        lb_rodada14_logo4.setBounds(600, 3577, 30, 30);

        lb_result67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result67.setForeground(new java.awt.Color(255, 255, 255));
        lb_result67.setText("x");
        add(lb_result67);
        lb_result67.setBounds(310, 3557, 10, 20);

        lb_rodada14_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols10.setText("3");
        add(lb_rodada14_gols10);
        lb_rodada14_gols10.setBounds(350, 3673, 10, 25);

        lb_rodada14_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time8.setText("Time8");
        add(lb_rodada14_Time8);
        lb_rodada14_Time8.setBounds(440, 3637, 151, 25);

        lb_result68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result68.setForeground(new java.awt.Color(255, 255, 255));
        lb_result68.setText("x");
        add(lb_result68);
        lb_result68.setBounds(310, 3637, 10, 25);

        lb_rodada14_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols8.setText("3");
        add(lb_rodada14_gols8);
        lb_rodada14_gols8.setBounds(350, 3647, 10, 20);

        lb_rodada14_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols3.setText("1");
        add(lb_rodada14_gols3);
        lb_rodada14_gols3.setBounds(260, 3587, 20, 16);

        lb_rodada14_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time7.setText("Time7");
        add(lb_rodada14_Time7);
        lb_rodada14_Time7.setBounds(70, 3637, 156, 25);

        lb_rodada14_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols4.setText("0");
        add(lb_rodada14_gols4);
        lb_rodada14_gols4.setBounds(350, 3587, 10, 20);

        lb_rodada14_logo3.setText("jLabel7");
        add(lb_rodada14_logo3);
        lb_rodada14_logo3.setBounds(20, 3577, 30, 30);

        lb_rodada14_logo7.setText("jLabel1");
        add(lb_rodada14_logo7);
        lb_rodada14_logo7.setBounds(20, 3637, 30, 30);

        lb_result69.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result69.setForeground(new java.awt.Color(255, 255, 255));
        lb_result69.setText("x");
        add(lb_result69);
        lb_result69.setBounds(310, 3587, 10, 20);

        lb_rodada14_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time5.setText("Time5");
        add(lb_rodada14_Time5);
        lb_rodada14_Time5.setBounds(70, 3607, 150, 25);

        lb_rodada14_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols9.setText("5");
        add(lb_rodada14_gols9);
        lb_rodada14_gols9.setBounds(260, 3677, 10, 20);

        lb_rodada14_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time3.setText("TIme3");
        add(lb_rodada14_Time3);
        lb_rodada14_Time3.setBounds(70, 3577, 150, 25);

        lb_rodada14_logo2.setText("jLabel11");
        add(lb_rodada14_logo2);
        lb_rodada14_logo2.setBounds(600, 3547, 30, 30);

        lb_result70.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result70.setForeground(new java.awt.Color(255, 255, 255));
        lb_result70.setText("x");
        add(lb_result70);
        lb_result70.setBounds(310, 3617, 10, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Rodada 14");
        add(jLabel16);
        jLabel16.setBounds(260, 3503, 110, 27);

        lb_rodada14_logo10.setText("jLabel15");
        add(lb_rodada14_logo10);
        lb_rodada14_logo10.setBounds(600, 3667, 30, 30);

        lb_rodada14_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols2.setText("0");
        add(lb_rodada14_gols2);
        lb_rodada14_gols2.setBounds(350, 3557, 10, 25);

        lb_rodada14_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_gols5.setText("2");
        add(lb_rodada14_gols5);
        lb_rodada14_gols5.setBounds(260, 3617, 10, 20);

        lb_rodada14_logo1.setText("jLabel6");
        add(lb_rodada14_logo1);
        lb_rodada14_logo1.setBounds(20, 3547, 30, 30);

        lb_rodada14_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time2.setText("Time2");
        add(lb_rodada14_Time2);
        lb_rodada14_Time2.setBounds(440, 3547, 150, 25);

        lb_rodada14_logo9.setText("jLabel10");
        add(lb_rodada14_logo9);
        lb_rodada14_logo9.setBounds(20, 3667, 30, 30);

        lb_rodada14_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time1.setText("Time1");
        add(lb_rodada14_Time1);
        lb_rodada14_Time1.setBounds(70, 3547, 150, 25);

        lb_rodada14_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada14_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada14_Time6.setText("Time6");
        add(lb_rodada14_Time6);
        lb_rodada14_Time6.setBounds(440, 3607, 151, 25);

        lb_rodada14_logo5.setText("jLabel8");
        add(lb_rodada14_logo5);
        lb_rodada14_logo5.setBounds(20, 3607, 30, 30);

        lb_rodada14_logo6.setText("jLabel13");
        add(lb_rodada14_logo6);
        lb_rodada14_logo6.setBounds(600, 3607, 30, 30);

        lb_rodada15_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols7.setText("4");
        add(lb_rodada15_gols7);
        lb_rodada15_gols7.setBounds(260, 3906, 10, 20);

        lb_result71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result71.setForeground(new java.awt.Color(255, 255, 255));
        lb_result71.setText("x");
        add(lb_result71);
        lb_result71.setBounds(310, 3896, 10, 25);

        lb_rodada15_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time4.setText("Time4");
        add(lb_rodada15_Time4);
        lb_rodada15_Time4.setBounds(440, 3836, 151, 25);

        lb_rodada15_logo4.setText("jLabel12");
        add(lb_rodada15_logo4);
        lb_rodada15_logo4.setBounds(600, 3836, 30, 30);

        lb_rodada15_logo5.setText("jLabel8");
        add(lb_rodada15_logo5);
        lb_rodada15_logo5.setBounds(20, 3866, 30, 30);

        lb_result72.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result72.setForeground(new java.awt.Color(255, 255, 255));
        lb_result72.setText("x");
        add(lb_result72);
        lb_result72.setBounds(310, 3926, 10, 25);

        lb_rodada15_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time6.setText("Time6");
        add(lb_rodada15_Time6);
        lb_rodada15_Time6.setBounds(440, 3866, 151, 25);

        lb_rodada15_logo7.setText("jLabel1");
        add(lb_rodada15_logo7);
        lb_rodada15_logo7.setBounds(20, 3896, 30, 30);

        lb_rodada15_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols8.setText("3");
        add(lb_rodada15_gols8);
        lb_rodada15_gols8.setBounds(350, 3906, 10, 20);

        lb_rodada15_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time9.setText("Time9");
        add(lb_rodada15_Time9);
        lb_rodada15_Time9.setBounds(70, 3926, 156, 25);

        lb_rodada15_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time7.setText("Time7");
        add(lb_rodada15_Time7);
        lb_rodada15_Time7.setBounds(70, 3896, 156, 25);

        lb_rodada15_logo3.setText("jLabel7");
        add(lb_rodada15_logo3);
        lb_rodada15_logo3.setBounds(20, 3836, 30, 30);

        lb_rodada15_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols9.setText("5");
        add(lb_rodada15_gols9);
        lb_rodada15_gols9.setBounds(260, 3936, 10, 20);

        lb_rodada15_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols4.setText("0");
        add(lb_rodada15_gols4);
        lb_rodada15_gols4.setBounds(350, 3846, 10, 20);

        lb_rodada15_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols6.setText("1");
        add(lb_rodada15_gols6);
        lb_rodada15_gols6.setBounds(350, 3876, 10, 20);

        lb_rodada15_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time8.setText("Time8");
        add(lb_rodada15_Time8);
        lb_rodada15_Time8.setBounds(440, 3896, 151, 25);

        lb_rodada15_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time1.setText("Time1");
        add(lb_rodada15_Time1);
        lb_rodada15_Time1.setBounds(70, 3806, 150, 25);

        lb_rodada15_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols10.setText("3");
        add(lb_rodada15_gols10);
        lb_rodada15_gols10.setBounds(350, 3932, 10, 25);

        lb_rodada15_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time2.setText("Time2");
        add(lb_rodada15_Time2);
        lb_rodada15_Time2.setBounds(440, 3806, 150, 25);

        lb_rodada15_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols2.setText("0");
        add(lb_rodada15_gols2);
        lb_rodada15_gols2.setBounds(350, 3816, 10, 25);

        lb_rodada15_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time5.setText("Time5");
        add(lb_rodada15_Time5);
        lb_rodada15_Time5.setBounds(70, 3866, 150, 25);

        lb_result73.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result73.setForeground(new java.awt.Color(255, 255, 255));
        lb_result73.setText("x");
        add(lb_result73);
        lb_result73.setBounds(310, 3846, 10, 20);

        lb_rodada15_logo1.setText("jLabel6");
        add(lb_rodada15_logo1);
        lb_rodada15_logo1.setBounds(20, 3806, 30, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Rodada 15");
        add(jLabel17);
        jLabel17.setBounds(260, 3762, 110, 27);

        lb_result74.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result74.setForeground(new java.awt.Color(255, 255, 255));
        lb_result74.setText("x");
        add(lb_result74);
        lb_result74.setBounds(310, 3816, 10, 20);

        lb_rodada15_logo8.setText("jLabel14");
        add(lb_rodada15_logo8);
        lb_rodada15_logo8.setBounds(600, 3896, 30, 30);

        lb_rodada15_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols5.setText("2");
        add(lb_rodada15_gols5);
        lb_rodada15_gols5.setBounds(260, 3876, 10, 20);

        lb_rodada15_logo9.setText("jLabel10");
        add(lb_rodada15_logo9);
        lb_rodada15_logo9.setBounds(20, 3926, 30, 30);

        lb_rodada15_logo6.setText("jLabel13");
        add(lb_rodada15_logo6);
        lb_rodada15_logo6.setBounds(600, 3866, 30, 30);

        lb_result75.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result75.setForeground(new java.awt.Color(255, 255, 255));
        lb_result75.setText("x");
        add(lb_result75);
        lb_result75.setBounds(310, 3876, 10, 20);

        lb_rodada15_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time3.setText("TIme3");
        add(lb_rodada15_Time3);
        lb_rodada15_Time3.setBounds(70, 3836, 150, 25);

        lb_rodada15_logo2.setText("jLabel11");
        add(lb_rodada15_logo2);
        lb_rodada15_logo2.setBounds(600, 3806, 30, 30);

        lb_rodada15_logo10.setText("jLabel15");
        add(lb_rodada15_logo10);
        lb_rodada15_logo10.setBounds(600, 3926, 30, 30);

        lb_rodada15_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols3.setText("1");
        add(lb_rodada15_gols3);
        lb_rodada15_gols3.setBounds(260, 3846, 20, 16);

        lb_rodada15_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_Time10.setText("Time10");
        add(lb_rodada15_Time10);
        lb_rodada15_Time10.setBounds(440, 3926, 151, 25);

        lb_rodada15_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada15_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada15_gols1.setText("0");
        add(lb_rodada15_gols1);
        lb_rodada15_gols1.setBounds(260, 3816, 20, 20);

        lb_rodada16_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time4.setText("Time4");
        add(lb_rodada16_Time4);
        lb_rodada16_Time4.setBounds(440, 4095, 151, 25);

        lb_result76.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result76.setForeground(new java.awt.Color(255, 255, 255));
        lb_result76.setText("x");
        add(lb_result76);
        lb_result76.setBounds(310, 4185, 10, 25);

        lb_rodada16_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols9.setText("5");
        add(lb_rodada16_gols9);
        lb_rodada16_gols9.setBounds(260, 4195, 10, 20);

        lb_rodada16_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols4.setText("0");
        add(lb_rodada16_gols4);
        lb_rodada16_gols4.setBounds(350, 4105, 10, 20);

        lb_rodada16_logo5.setText("jLabel8");
        add(lb_rodada16_logo5);
        lb_rodada16_logo5.setBounds(20, 4125, 30, 30);

        lb_rodada16_logo8.setText("jLabel14");
        add(lb_rodada16_logo8);
        lb_rodada16_logo8.setBounds(600, 4155, 30, 30);

        lb_rodada16_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols1.setText("0");
        add(lb_rodada16_gols1);
        lb_rodada16_gols1.setBounds(260, 4075, 20, 20);

        lb_rodada16_logo1.setText("jLabel6");
        add(lb_rodada16_logo1);
        lb_rodada16_logo1.setBounds(20, 4065, 30, 30);

        lb_result77.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result77.setForeground(new java.awt.Color(255, 255, 255));
        lb_result77.setText("x");
        add(lb_result77);
        lb_result77.setBounds(310, 4075, 10, 20);

        lb_rodada16_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time3.setText("TIme3");
        add(lb_rodada16_Time3);
        lb_rodada16_Time3.setBounds(70, 4095, 150, 25);

        lb_rodada16_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols5.setText("2");
        add(lb_rodada16_gols5);
        lb_rodada16_gols5.setBounds(260, 4135, 10, 20);

        lb_rodada16_logo7.setText("jLabel1");
        add(lb_rodada16_logo7);
        lb_rodada16_logo7.setBounds(20, 4155, 30, 30);

        lb_rodada16_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time1.setText("Time1");
        add(lb_rodada16_Time1);
        lb_rodada16_Time1.setBounds(70, 4065, 150, 25);

        lb_rodada16_logo9.setText("jLabel10");
        add(lb_rodada16_logo9);
        lb_rodada16_logo9.setBounds(20, 4185, 30, 30);

        lb_rodada16_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols7.setText("4");
        add(lb_rodada16_gols7);
        lb_rodada16_gols7.setBounds(260, 4165, 10, 20);

        lb_rodada16_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time5.setText("Time5");
        add(lb_rodada16_Time5);
        lb_rodada16_Time5.setBounds(70, 4125, 150, 25);

        lb_rodada16_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time2.setText("Time2");
        add(lb_rodada16_Time2);
        lb_rodada16_Time2.setBounds(440, 4065, 150, 25);

        lb_rodada16_logo6.setText("jLabel13");
        add(lb_rodada16_logo6);
        lb_rodada16_logo6.setBounds(600, 4125, 30, 30);

        lb_rodada16_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols10.setText("3");
        add(lb_rodada16_gols10);
        lb_rodada16_gols10.setBounds(350, 4191, 10, 25);

        lb_rodada16_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols3.setText("1");
        add(lb_rodada16_gols3);
        lb_rodada16_gols3.setBounds(260, 4105, 20, 16);

        lb_result78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result78.setForeground(new java.awt.Color(255, 255, 255));
        lb_result78.setText("x");
        add(lb_result78);
        lb_result78.setBounds(310, 4155, 10, 25);

        lb_rodada16_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols8.setText("3");
        add(lb_rodada16_gols8);
        lb_rodada16_gols8.setBounds(350, 4165, 10, 20);

        lb_result79.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result79.setForeground(new java.awt.Color(255, 255, 255));
        lb_result79.setText("x");
        add(lb_result79);
        lb_result79.setBounds(310, 4105, 10, 20);

        lb_rodada16_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time10.setText("Time10");
        add(lb_rodada16_Time10);
        lb_rodada16_Time10.setBounds(440, 4185, 151, 25);

        lb_rodada16_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time6.setText("Time6");
        add(lb_rodada16_Time6);
        lb_rodada16_Time6.setBounds(440, 4125, 151, 25);

        lb_rodada16_logo10.setText("jLabel15");
        add(lb_rodada16_logo10);
        lb_rodada16_logo10.setBounds(600, 4185, 30, 30);

        lb_rodada16_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time9.setText("Time9");
        add(lb_rodada16_Time9);
        lb_rodada16_Time9.setBounds(70, 4185, 156, 25);

        lb_rodada16_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time8.setText("Time8");
        add(lb_rodada16_Time8);
        lb_rodada16_Time8.setBounds(440, 4155, 151, 25);

        lb_rodada16_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_Time7.setText("Time7");
        add(lb_rodada16_Time7);
        lb_rodada16_Time7.setBounds(70, 4155, 156, 25);

        lb_rodada16_logo4.setText("jLabel12");
        add(lb_rodada16_logo4);
        lb_rodada16_logo4.setBounds(600, 4095, 30, 30);

        lb_rodada16_logo3.setText("jLabel7");
        add(lb_rodada16_logo3);
        lb_rodada16_logo3.setBounds(20, 4095, 30, 30);

        lb_rodada16_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols2.setText("0");
        add(lb_rodada16_gols2);
        lb_rodada16_gols2.setBounds(350, 4075, 10, 25);

        lb_rodada16_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada16_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada16_gols6.setText("1");
        add(lb_rodada16_gols6);
        lb_rodada16_gols6.setBounds(350, 4135, 10, 20);

        lb_rodada16_logo2.setText("jLabel11");
        add(lb_rodada16_logo2);
        lb_rodada16_logo2.setBounds(600, 4065, 30, 30);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Rodada 16");
        add(jLabel18);
        jLabel18.setBounds(260, 4021, 110, 27);

        lb_result80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result80.setForeground(new java.awt.Color(255, 255, 255));
        lb_result80.setText("x");
        add(lb_result80);
        lb_result80.setBounds(310, 4135, 10, 20);

        lb_rodada17_logo6.setText("jLabel13");
        add(lb_rodada17_logo6);
        lb_rodada17_logo6.setBounds(600, 4384, 30, 30);

        lb_rodada17_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols6.setText("1");
        add(lb_rodada17_gols6);
        lb_rodada17_gols6.setBounds(350, 4394, 10, 20);

        lb_rodada17_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols1.setText("0");
        add(lb_rodada17_gols1);
        lb_rodada17_gols1.setBounds(260, 4334, 20, 20);

        lb_rodada17_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time6.setText("Time6");
        add(lb_rodada17_Time6);
        lb_rodada17_Time6.setBounds(440, 4384, 151, 25);

        lb_rodada17_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time10.setText("Time10");
        add(lb_rodada17_Time10);
        lb_rodada17_Time10.setBounds(440, 4444, 151, 25);

        lb_rodada17_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols7.setText("4");
        add(lb_rodada17_gols7);
        lb_rodada17_gols7.setBounds(260, 4424, 10, 20);

        lb_result81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result81.setForeground(new java.awt.Color(255, 255, 255));
        lb_result81.setText("x");
        add(lb_result81);
        lb_result81.setBounds(310, 4414, 10, 25);

        lb_result82.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result82.setForeground(new java.awt.Color(255, 255, 255));
        lb_result82.setText("x");
        add(lb_result82);
        lb_result82.setBounds(310, 4394, 10, 20);

        lb_rodada17_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols9.setText("5");
        add(lb_rodada17_gols9);
        lb_rodada17_gols9.setBounds(260, 4454, 10, 20);

        lb_rodada17_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols4.setText("0");
        add(lb_rodada17_gols4);
        lb_rodada17_gols4.setBounds(350, 4364, 10, 20);

        lb_rodada17_logo5.setText("jLabel8");
        add(lb_rodada17_logo5);
        lb_rodada17_logo5.setBounds(20, 4384, 30, 30);

        lb_rodada17_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols2.setText("0");
        add(lb_rodada17_gols2);
        lb_rodada17_gols2.setBounds(350, 4334, 10, 25);

        lb_rodada17_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time3.setText("TIme3");
        add(lb_rodada17_Time3);
        lb_rodada17_Time3.setBounds(70, 4354, 150, 25);

        lb_result83.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result83.setForeground(new java.awt.Color(255, 255, 255));
        lb_result83.setText("x");
        add(lb_result83);
        lb_result83.setBounds(310, 4364, 10, 20);

        lb_rodada17_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols8.setText("3");
        add(lb_rodada17_gols8);
        lb_rodada17_gols8.setBounds(350, 4424, 10, 20);

        lb_rodada17_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time8.setText("Time8");
        add(lb_rodada17_Time8);
        lb_rodada17_Time8.setBounds(440, 4414, 151, 25);

        lb_rodada17_logo9.setText("jLabel10");
        add(lb_rodada17_logo9);
        lb_rodada17_logo9.setBounds(20, 4444, 30, 30);

        lb_rodada17_logo3.setText("jLabel7");
        add(lb_rodada17_logo3);
        lb_rodada17_logo3.setBounds(20, 4354, 30, 30);

        lb_rodada17_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time9.setText("Time9");
        add(lb_rodada17_Time9);
        lb_rodada17_Time9.setBounds(70, 4444, 156, 25);

        lb_result84.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result84.setForeground(new java.awt.Color(255, 255, 255));
        lb_result84.setText("x");
        add(lb_result84);
        lb_result84.setBounds(310, 4444, 10, 25);

        lb_rodada17_logo2.setText("jLabel11");
        add(lb_rodada17_logo2);
        lb_rodada17_logo2.setBounds(600, 4324, 30, 30);

        lb_rodada17_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols5.setText("2");
        add(lb_rodada17_gols5);
        lb_rodada17_gols5.setBounds(260, 4394, 10, 20);

        lb_rodada17_logo10.setText("jLabel15");
        add(lb_rodada17_logo10);
        lb_rodada17_logo10.setBounds(600, 4444, 30, 30);

        lb_rodada17_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time1.setText("Time1");
        add(lb_rodada17_Time1);
        lb_rodada17_Time1.setBounds(70, 4324, 150, 25);

        lb_result85.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result85.setForeground(new java.awt.Color(255, 255, 255));
        lb_result85.setText("x");
        add(lb_result85);
        lb_result85.setBounds(310, 4334, 10, 20);

        lb_rodada17_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time5.setText("Time5");
        add(lb_rodada17_Time5);
        lb_rodada17_Time5.setBounds(70, 4384, 150, 25);

        lb_rodada17_logo1.setText("jLabel6");
        add(lb_rodada17_logo1);
        lb_rodada17_logo1.setBounds(20, 4324, 30, 30);

        lb_rodada17_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time4.setText("Time4");
        add(lb_rodada17_Time4);
        lb_rodada17_Time4.setBounds(440, 4354, 151, 25);

        lb_rodada17_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols10.setText("3");
        add(lb_rodada17_gols10);
        lb_rodada17_gols10.setBounds(350, 4450, 10, 25);

        lb_rodada17_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_gols3.setText("1");
        add(lb_rodada17_gols3);
        lb_rodada17_gols3.setBounds(260, 4364, 20, 16);

        lb_rodada17_logo8.setText("jLabel14");
        add(lb_rodada17_logo8);
        lb_rodada17_logo8.setBounds(600, 4414, 30, 30);

        lb_rodada17_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time7.setText("Time7");
        add(lb_rodada17_Time7);
        lb_rodada17_Time7.setBounds(70, 4414, 156, 25);

        lb_rodada17_logo7.setText("jLabel1");
        add(lb_rodada17_logo7);
        lb_rodada17_logo7.setBounds(20, 4414, 30, 30);

        lb_rodada17_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada17_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada17_Time2.setText("Time2");
        add(lb_rodada17_Time2);
        lb_rodada17_Time2.setBounds(440, 4324, 150, 25);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Rodada 17");
        add(jLabel19);
        jLabel19.setBounds(260, 4280, 110, 27);

        lb_rodada17_logo4.setText("jLabel12");
        add(lb_rodada17_logo4);
        lb_rodada17_logo4.setBounds(600, 4354, 30, 30);

        lb_rodada18_logo5.setText("jLabel8");
        add(lb_rodada18_logo5);
        lb_rodada18_logo5.setBounds(20, 4643, 30, 30);

        lb_rodada18_logo9.setText("jLabel10");
        add(lb_rodada18_logo9);
        lb_rodada18_logo9.setBounds(20, 4703, 30, 30);

        lb_rodada18_logo4.setText("jLabel12");
        add(lb_rodada18_logo4);
        lb_rodada18_logo4.setBounds(600, 4613, 30, 30);

        lb_gols171.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols171.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols171.setText("0");
        add(lb_gols171);
        lb_gols171.setBounds(260, 4593, 20, 20);

        lb_rodada18_Time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time7.setText("Time7");
        add(lb_rodada18_Time7);
        lb_rodada18_Time7.setBounds(70, 4673, 156, 25);

        lb_result86.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result86.setForeground(new java.awt.Color(255, 255, 255));
        lb_result86.setText("x");
        add(lb_result86);
        lb_result86.setBounds(310, 4653, 10, 20);

        lb_rodada18_logo3.setText("jLabel7");
        add(lb_rodada18_logo3);
        lb_rodada18_logo3.setBounds(20, 4613, 30, 30);

        lb_rodada18_Time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time2.setText("Time2");
        add(lb_rodada18_Time2);
        lb_rodada18_Time2.setBounds(440, 4583, 150, 25);

        lb_rodada18_Time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time3.setText("TIme3");
        add(lb_rodada18_Time3);
        lb_rodada18_Time3.setBounds(70, 4613, 150, 25);

        lb_result87.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result87.setForeground(new java.awt.Color(255, 255, 255));
        lb_result87.setText("x");
        add(lb_result87);
        lb_result87.setBounds(310, 4703, 10, 25);

        lb_rodada18_logo2.setText("jLabel11");
        add(lb_rodada18_logo2);
        lb_rodada18_logo2.setBounds(600, 4583, 30, 30);

        lb_rodada18_Time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time1.setText("Time1");
        add(lb_rodada18_Time1);
        lb_rodada18_Time1.setBounds(70, 4583, 150, 25);

        lb_gols172.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols172.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols172.setText("0");
        add(lb_gols172);
        lb_gols172.setBounds(350, 4593, 10, 25);

        lb_rodada18_Time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time5.setText("Time5");
        add(lb_rodada18_Time5);
        lb_rodada18_Time5.setBounds(70, 4643, 150, 25);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Rodada 18");
        add(jLabel20);
        jLabel20.setBounds(260, 4539, 110, 27);

        lb_rodada18_Time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time9.setText("Time9");
        add(lb_rodada18_Time9);
        lb_rodada18_Time9.setBounds(70, 4703, 156, 25);

        lb_gols173.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols173.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols173.setText("3");
        add(lb_gols173);
        lb_gols173.setBounds(350, 4683, 10, 20);

        lb_rodada18_logo10.setText("jLabel15");
        add(lb_rodada18_logo10);
        lb_rodada18_logo10.setBounds(600, 4703, 30, 30);

        lb_rodada18_logo1.setText("jLabel6");
        add(lb_rodada18_logo1);
        lb_rodada18_logo1.setBounds(20, 4583, 30, 30);

        lb_rodada18_logo7.setText("jLabel1");
        add(lb_rodada18_logo7);
        lb_rodada18_logo7.setBounds(20, 4673, 30, 30);

        lb_rodada18_Time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time6.setText("Time6");
        add(lb_rodada18_Time6);
        lb_rodada18_Time6.setBounds(440, 4643, 151, 25);

        lb_rodada18_Time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time4.setText("Time4");
        add(lb_rodada18_Time4);
        lb_rodada18_Time4.setBounds(440, 4613, 151, 25);

        lb_gols174.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols174.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols174.setText("4");
        add(lb_gols174);
        lb_gols174.setBounds(260, 4683, 10, 20);

        lb_result88.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result88.setForeground(new java.awt.Color(255, 255, 255));
        lb_result88.setText("x");
        add(lb_result88);
        lb_result88.setBounds(310, 4623, 10, 20);

        lb_rodada18_Time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time8.setText("Time8");
        add(lb_rodada18_Time8);
        lb_rodada18_Time8.setBounds(440, 4673, 151, 25);

        lb_gols175.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols175.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols175.setText("2");
        add(lb_gols175);
        lb_gols175.setBounds(260, 4653, 10, 20);

        lb_rodada18_logo6.setText("jLabel13");
        add(lb_rodada18_logo6);
        lb_rodada18_logo6.setBounds(600, 4643, 30, 30);

        lb_result89.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result89.setForeground(new java.awt.Color(255, 255, 255));
        lb_result89.setText("x");
        add(lb_result89);
        lb_result89.setBounds(310, 4673, 10, 25);

        lb_gols176.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols176.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols176.setText("5");
        add(lb_gols176);
        lb_gols176.setBounds(260, 4713, 10, 20);

        lb_rodada18_Time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_rodada18_Time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_rodada18_Time10.setText("Time10");
        add(lb_rodada18_Time10);
        lb_rodada18_Time10.setBounds(440, 4703, 151, 25);

        lb_gols177.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols177.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols177.setText("1");
        add(lb_gols177);
        lb_gols177.setBounds(350, 4653, 10, 20);

        lb_result90.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result90.setForeground(new java.awt.Color(255, 255, 255));
        lb_result90.setText("x");
        add(lb_result90);
        lb_result90.setBounds(310, 4593, 10, 20);

        lb_gols178.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols178.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols178.setText("1");
        add(lb_gols178);
        lb_gols178.setBounds(260, 4623, 20, 16);

        lb_gols179.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols179.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols179.setText("0");
        add(lb_gols179);
        lb_gols179.setBounds(350, 4623, 10, 20);

        lb_rodada18_logo8.setText("jLabel14");
        add(lb_rodada18_logo8);
        lb_rodada18_logo8.setBounds(600, 4673, 30, 30);

        lb_gols180.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols180.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols180.setText("3");
        add(lb_gols180);
        lb_gols180.setBounds(350, 4703, 10, 25);

        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 0, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        add(bt_voltar);
        bt_voltar.setBounds(30, 4770, 129, 36);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagem_grande (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(650, 4827));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 4830);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_gols171;
    private javax.swing.JLabel lb_gols172;
    private javax.swing.JLabel lb_gols173;
    private javax.swing.JLabel lb_gols174;
    private javax.swing.JLabel lb_gols175;
    private javax.swing.JLabel lb_gols176;
    private javax.swing.JLabel lb_gols177;
    private javax.swing.JLabel lb_gols178;
    private javax.swing.JLabel lb_gols179;
    private javax.swing.JLabel lb_gols180;
    private javax.swing.JLabel lb_result1;
    private javax.swing.JLabel lb_result10;
    private javax.swing.JLabel lb_result11;
    private javax.swing.JLabel lb_result12;
    private javax.swing.JLabel lb_result13;
    private javax.swing.JLabel lb_result14;
    private javax.swing.JLabel lb_result15;
    private javax.swing.JLabel lb_result16;
    private javax.swing.JLabel lb_result17;
    private javax.swing.JLabel lb_result18;
    private javax.swing.JLabel lb_result19;
    private javax.swing.JLabel lb_result2;
    private javax.swing.JLabel lb_result20;
    private javax.swing.JLabel lb_result21;
    private javax.swing.JLabel lb_result22;
    private javax.swing.JLabel lb_result23;
    private javax.swing.JLabel lb_result24;
    private javax.swing.JLabel lb_result25;
    private javax.swing.JLabel lb_result26;
    private javax.swing.JLabel lb_result27;
    private javax.swing.JLabel lb_result28;
    private javax.swing.JLabel lb_result29;
    private javax.swing.JLabel lb_result3;
    private javax.swing.JLabel lb_result30;
    private javax.swing.JLabel lb_result31;
    private javax.swing.JLabel lb_result32;
    private javax.swing.JLabel lb_result33;
    private javax.swing.JLabel lb_result34;
    private javax.swing.JLabel lb_result35;
    private javax.swing.JLabel lb_result36;
    private javax.swing.JLabel lb_result37;
    private javax.swing.JLabel lb_result38;
    private javax.swing.JLabel lb_result39;
    private javax.swing.JLabel lb_result4;
    private javax.swing.JLabel lb_result40;
    private javax.swing.JLabel lb_result41;
    private javax.swing.JLabel lb_result42;
    private javax.swing.JLabel lb_result43;
    private javax.swing.JLabel lb_result44;
    private javax.swing.JLabel lb_result45;
    private javax.swing.JLabel lb_result46;
    private javax.swing.JLabel lb_result47;
    private javax.swing.JLabel lb_result48;
    private javax.swing.JLabel lb_result49;
    private javax.swing.JLabel lb_result5;
    private javax.swing.JLabel lb_result50;
    private javax.swing.JLabel lb_result51;
    private javax.swing.JLabel lb_result52;
    private javax.swing.JLabel lb_result53;
    private javax.swing.JLabel lb_result54;
    private javax.swing.JLabel lb_result55;
    private javax.swing.JLabel lb_result56;
    private javax.swing.JLabel lb_result57;
    private javax.swing.JLabel lb_result58;
    private javax.swing.JLabel lb_result59;
    private javax.swing.JLabel lb_result6;
    private javax.swing.JLabel lb_result60;
    private javax.swing.JLabel lb_result61;
    private javax.swing.JLabel lb_result62;
    private javax.swing.JLabel lb_result63;
    private javax.swing.JLabel lb_result64;
    private javax.swing.JLabel lb_result65;
    private javax.swing.JLabel lb_result66;
    private javax.swing.JLabel lb_result67;
    private javax.swing.JLabel lb_result68;
    private javax.swing.JLabel lb_result69;
    private javax.swing.JLabel lb_result7;
    private javax.swing.JLabel lb_result70;
    private javax.swing.JLabel lb_result71;
    private javax.swing.JLabel lb_result72;
    private javax.swing.JLabel lb_result73;
    private javax.swing.JLabel lb_result74;
    private javax.swing.JLabel lb_result75;
    private javax.swing.JLabel lb_result76;
    private javax.swing.JLabel lb_result77;
    private javax.swing.JLabel lb_result78;
    private javax.swing.JLabel lb_result79;
    private javax.swing.JLabel lb_result8;
    private javax.swing.JLabel lb_result80;
    private javax.swing.JLabel lb_result81;
    private javax.swing.JLabel lb_result82;
    private javax.swing.JLabel lb_result83;
    private javax.swing.JLabel lb_result84;
    private javax.swing.JLabel lb_result85;
    private javax.swing.JLabel lb_result86;
    private javax.swing.JLabel lb_result87;
    private javax.swing.JLabel lb_result88;
    private javax.swing.JLabel lb_result89;
    private javax.swing.JLabel lb_result9;
    private javax.swing.JLabel lb_result90;
    private javax.swing.JLabel lb_rodada10_Time1;
    private javax.swing.JLabel lb_rodada10_Time10;
    private javax.swing.JLabel lb_rodada10_Time2;
    private javax.swing.JLabel lb_rodada10_Time3;
    private javax.swing.JLabel lb_rodada10_Time4;
    private javax.swing.JLabel lb_rodada10_Time5;
    private javax.swing.JLabel lb_rodada10_Time6;
    private javax.swing.JLabel lb_rodada10_Time7;
    private javax.swing.JLabel lb_rodada10_Time8;
    private javax.swing.JLabel lb_rodada10_Time9;
    private javax.swing.JLabel lb_rodada10_gols1;
    private javax.swing.JLabel lb_rodada10_gols10;
    private javax.swing.JLabel lb_rodada10_gols2;
    private javax.swing.JLabel lb_rodada10_gols3;
    private javax.swing.JLabel lb_rodada10_gols4;
    private javax.swing.JLabel lb_rodada10_gols5;
    private javax.swing.JLabel lb_rodada10_gols6;
    private javax.swing.JLabel lb_rodada10_gols7;
    private javax.swing.JLabel lb_rodada10_gols8;
    private javax.swing.JLabel lb_rodada10_gols9;
    private javax.swing.JLabel lb_rodada10_logo1;
    private javax.swing.JLabel lb_rodada10_logo10;
    private javax.swing.JLabel lb_rodada10_logo2;
    private javax.swing.JLabel lb_rodada10_logo3;
    private javax.swing.JLabel lb_rodada10_logo4;
    private javax.swing.JLabel lb_rodada10_logo5;
    private javax.swing.JLabel lb_rodada10_logo6;
    private javax.swing.JLabel lb_rodada10_logo7;
    private javax.swing.JLabel lb_rodada10_logo8;
    private javax.swing.JLabel lb_rodada10_logo9;
    private javax.swing.JLabel lb_rodada11_Time1;
    private javax.swing.JLabel lb_rodada11_Time10;
    private javax.swing.JLabel lb_rodada11_Time2;
    private javax.swing.JLabel lb_rodada11_Time3;
    private javax.swing.JLabel lb_rodada11_Time4;
    private javax.swing.JLabel lb_rodada11_Time5;
    private javax.swing.JLabel lb_rodada11_Time6;
    private javax.swing.JLabel lb_rodada11_Time7;
    private javax.swing.JLabel lb_rodada11_Time8;
    private javax.swing.JLabel lb_rodada11_Time9;
    private javax.swing.JLabel lb_rodada11_gols1;
    private javax.swing.JLabel lb_rodada11_gols10;
    private javax.swing.JLabel lb_rodada11_gols2;
    private javax.swing.JLabel lb_rodada11_gols3;
    private javax.swing.JLabel lb_rodada11_gols4;
    private javax.swing.JLabel lb_rodada11_gols5;
    private javax.swing.JLabel lb_rodada11_gols6;
    private javax.swing.JLabel lb_rodada11_gols7;
    private javax.swing.JLabel lb_rodada11_gols8;
    private javax.swing.JLabel lb_rodada11_gols9;
    private javax.swing.JLabel lb_rodada11_logo1;
    private javax.swing.JLabel lb_rodada11_logo10;
    private javax.swing.JLabel lb_rodada11_logo2;
    private javax.swing.JLabel lb_rodada11_logo3;
    private javax.swing.JLabel lb_rodada11_logo4;
    private javax.swing.JLabel lb_rodada11_logo5;
    private javax.swing.JLabel lb_rodada11_logo6;
    private javax.swing.JLabel lb_rodada11_logo7;
    private javax.swing.JLabel lb_rodada11_logo8;
    private javax.swing.JLabel lb_rodada11_logo9;
    private javax.swing.JLabel lb_rodada12_Time1;
    private javax.swing.JLabel lb_rodada12_Time10;
    private javax.swing.JLabel lb_rodada12_Time2;
    private javax.swing.JLabel lb_rodada12_Time3;
    private javax.swing.JLabel lb_rodada12_Time4;
    private javax.swing.JLabel lb_rodada12_Time5;
    private javax.swing.JLabel lb_rodada12_Time6;
    private javax.swing.JLabel lb_rodada12_Time7;
    private javax.swing.JLabel lb_rodada12_Time8;
    private javax.swing.JLabel lb_rodada12_Time9;
    private javax.swing.JLabel lb_rodada12_gols1;
    private javax.swing.JLabel lb_rodada12_gols10;
    private javax.swing.JLabel lb_rodada12_gols2;
    private javax.swing.JLabel lb_rodada12_gols3;
    private javax.swing.JLabel lb_rodada12_gols4;
    private javax.swing.JLabel lb_rodada12_gols5;
    private javax.swing.JLabel lb_rodada12_gols6;
    private javax.swing.JLabel lb_rodada12_gols7;
    private javax.swing.JLabel lb_rodada12_gols8;
    private javax.swing.JLabel lb_rodada12_gols9;
    private javax.swing.JLabel lb_rodada12_logo1;
    private javax.swing.JLabel lb_rodada12_logo10;
    private javax.swing.JLabel lb_rodada12_logo2;
    private javax.swing.JLabel lb_rodada12_logo3;
    private javax.swing.JLabel lb_rodada12_logo4;
    private javax.swing.JLabel lb_rodada12_logo5;
    private javax.swing.JLabel lb_rodada12_logo6;
    private javax.swing.JLabel lb_rodada12_logo7;
    private javax.swing.JLabel lb_rodada12_logo8;
    private javax.swing.JLabel lb_rodada12_logo9;
    private javax.swing.JLabel lb_rodada13_Time1;
    private javax.swing.JLabel lb_rodada13_Time10;
    private javax.swing.JLabel lb_rodada13_Time2;
    private javax.swing.JLabel lb_rodada13_Time3;
    private javax.swing.JLabel lb_rodada13_Time4;
    private javax.swing.JLabel lb_rodada13_Time5;
    private javax.swing.JLabel lb_rodada13_Time6;
    private javax.swing.JLabel lb_rodada13_Time7;
    private javax.swing.JLabel lb_rodada13_Time8;
    private javax.swing.JLabel lb_rodada13_Time9;
    private javax.swing.JLabel lb_rodada13_gols1;
    private javax.swing.JLabel lb_rodada13_gols10;
    private javax.swing.JLabel lb_rodada13_gols2;
    private javax.swing.JLabel lb_rodada13_gols3;
    private javax.swing.JLabel lb_rodada13_gols4;
    private javax.swing.JLabel lb_rodada13_gols5;
    private javax.swing.JLabel lb_rodada13_gols6;
    private javax.swing.JLabel lb_rodada13_gols7;
    private javax.swing.JLabel lb_rodada13_gols8;
    private javax.swing.JLabel lb_rodada13_gols9;
    private javax.swing.JLabel lb_rodada13_logo1;
    private javax.swing.JLabel lb_rodada13_logo10;
    private javax.swing.JLabel lb_rodada13_logo2;
    private javax.swing.JLabel lb_rodada13_logo3;
    private javax.swing.JLabel lb_rodada13_logo4;
    private javax.swing.JLabel lb_rodada13_logo5;
    private javax.swing.JLabel lb_rodada13_logo6;
    private javax.swing.JLabel lb_rodada13_logo7;
    private javax.swing.JLabel lb_rodada13_logo8;
    private javax.swing.JLabel lb_rodada13_logo9;
    private javax.swing.JLabel lb_rodada14_Time1;
    private javax.swing.JLabel lb_rodada14_Time10;
    private javax.swing.JLabel lb_rodada14_Time2;
    private javax.swing.JLabel lb_rodada14_Time3;
    private javax.swing.JLabel lb_rodada14_Time4;
    private javax.swing.JLabel lb_rodada14_Time5;
    private javax.swing.JLabel lb_rodada14_Time6;
    private javax.swing.JLabel lb_rodada14_Time7;
    private javax.swing.JLabel lb_rodada14_Time8;
    private javax.swing.JLabel lb_rodada14_Time9;
    private javax.swing.JLabel lb_rodada14_gols1;
    private javax.swing.JLabel lb_rodada14_gols10;
    private javax.swing.JLabel lb_rodada14_gols2;
    private javax.swing.JLabel lb_rodada14_gols3;
    private javax.swing.JLabel lb_rodada14_gols4;
    private javax.swing.JLabel lb_rodada14_gols5;
    private javax.swing.JLabel lb_rodada14_gols6;
    private javax.swing.JLabel lb_rodada14_gols7;
    private javax.swing.JLabel lb_rodada14_gols8;
    private javax.swing.JLabel lb_rodada14_gols9;
    private javax.swing.JLabel lb_rodada14_logo1;
    private javax.swing.JLabel lb_rodada14_logo10;
    private javax.swing.JLabel lb_rodada14_logo2;
    private javax.swing.JLabel lb_rodada14_logo3;
    private javax.swing.JLabel lb_rodada14_logo4;
    private javax.swing.JLabel lb_rodada14_logo5;
    private javax.swing.JLabel lb_rodada14_logo6;
    private javax.swing.JLabel lb_rodada14_logo7;
    private javax.swing.JLabel lb_rodada14_logo8;
    private javax.swing.JLabel lb_rodada14_logo9;
    private javax.swing.JLabel lb_rodada15_Time1;
    private javax.swing.JLabel lb_rodada15_Time10;
    private javax.swing.JLabel lb_rodada15_Time2;
    private javax.swing.JLabel lb_rodada15_Time3;
    private javax.swing.JLabel lb_rodada15_Time4;
    private javax.swing.JLabel lb_rodada15_Time5;
    private javax.swing.JLabel lb_rodada15_Time6;
    private javax.swing.JLabel lb_rodada15_Time7;
    private javax.swing.JLabel lb_rodada15_Time8;
    private javax.swing.JLabel lb_rodada15_Time9;
    private javax.swing.JLabel lb_rodada15_gols1;
    private javax.swing.JLabel lb_rodada15_gols10;
    private javax.swing.JLabel lb_rodada15_gols2;
    private javax.swing.JLabel lb_rodada15_gols3;
    private javax.swing.JLabel lb_rodada15_gols4;
    private javax.swing.JLabel lb_rodada15_gols5;
    private javax.swing.JLabel lb_rodada15_gols6;
    private javax.swing.JLabel lb_rodada15_gols7;
    private javax.swing.JLabel lb_rodada15_gols8;
    private javax.swing.JLabel lb_rodada15_gols9;
    private javax.swing.JLabel lb_rodada15_logo1;
    private javax.swing.JLabel lb_rodada15_logo10;
    private javax.swing.JLabel lb_rodada15_logo2;
    private javax.swing.JLabel lb_rodada15_logo3;
    private javax.swing.JLabel lb_rodada15_logo4;
    private javax.swing.JLabel lb_rodada15_logo5;
    private javax.swing.JLabel lb_rodada15_logo6;
    private javax.swing.JLabel lb_rodada15_logo7;
    private javax.swing.JLabel lb_rodada15_logo8;
    private javax.swing.JLabel lb_rodada15_logo9;
    private javax.swing.JLabel lb_rodada16_Time1;
    private javax.swing.JLabel lb_rodada16_Time10;
    private javax.swing.JLabel lb_rodada16_Time2;
    private javax.swing.JLabel lb_rodada16_Time3;
    private javax.swing.JLabel lb_rodada16_Time4;
    private javax.swing.JLabel lb_rodada16_Time5;
    private javax.swing.JLabel lb_rodada16_Time6;
    private javax.swing.JLabel lb_rodada16_Time7;
    private javax.swing.JLabel lb_rodada16_Time8;
    private javax.swing.JLabel lb_rodada16_Time9;
    private javax.swing.JLabel lb_rodada16_gols1;
    private javax.swing.JLabel lb_rodada16_gols10;
    private javax.swing.JLabel lb_rodada16_gols2;
    private javax.swing.JLabel lb_rodada16_gols3;
    private javax.swing.JLabel lb_rodada16_gols4;
    private javax.swing.JLabel lb_rodada16_gols5;
    private javax.swing.JLabel lb_rodada16_gols6;
    private javax.swing.JLabel lb_rodada16_gols7;
    private javax.swing.JLabel lb_rodada16_gols8;
    private javax.swing.JLabel lb_rodada16_gols9;
    private javax.swing.JLabel lb_rodada16_logo1;
    private javax.swing.JLabel lb_rodada16_logo10;
    private javax.swing.JLabel lb_rodada16_logo2;
    private javax.swing.JLabel lb_rodada16_logo3;
    private javax.swing.JLabel lb_rodada16_logo4;
    private javax.swing.JLabel lb_rodada16_logo5;
    private javax.swing.JLabel lb_rodada16_logo6;
    private javax.swing.JLabel lb_rodada16_logo7;
    private javax.swing.JLabel lb_rodada16_logo8;
    private javax.swing.JLabel lb_rodada16_logo9;
    private javax.swing.JLabel lb_rodada17_Time1;
    private javax.swing.JLabel lb_rodada17_Time10;
    private javax.swing.JLabel lb_rodada17_Time2;
    private javax.swing.JLabel lb_rodada17_Time3;
    private javax.swing.JLabel lb_rodada17_Time4;
    private javax.swing.JLabel lb_rodada17_Time5;
    private javax.swing.JLabel lb_rodada17_Time6;
    private javax.swing.JLabel lb_rodada17_Time7;
    private javax.swing.JLabel lb_rodada17_Time8;
    private javax.swing.JLabel lb_rodada17_Time9;
    private javax.swing.JLabel lb_rodada17_gols1;
    private javax.swing.JLabel lb_rodada17_gols10;
    private javax.swing.JLabel lb_rodada17_gols2;
    private javax.swing.JLabel lb_rodada17_gols3;
    private javax.swing.JLabel lb_rodada17_gols4;
    private javax.swing.JLabel lb_rodada17_gols5;
    private javax.swing.JLabel lb_rodada17_gols6;
    private javax.swing.JLabel lb_rodada17_gols7;
    private javax.swing.JLabel lb_rodada17_gols8;
    private javax.swing.JLabel lb_rodada17_gols9;
    private javax.swing.JLabel lb_rodada17_logo1;
    private javax.swing.JLabel lb_rodada17_logo10;
    private javax.swing.JLabel lb_rodada17_logo2;
    private javax.swing.JLabel lb_rodada17_logo3;
    private javax.swing.JLabel lb_rodada17_logo4;
    private javax.swing.JLabel lb_rodada17_logo5;
    private javax.swing.JLabel lb_rodada17_logo6;
    private javax.swing.JLabel lb_rodada17_logo7;
    private javax.swing.JLabel lb_rodada17_logo8;
    private javax.swing.JLabel lb_rodada17_logo9;
    private javax.swing.JLabel lb_rodada18_Time1;
    private javax.swing.JLabel lb_rodada18_Time10;
    private javax.swing.JLabel lb_rodada18_Time2;
    private javax.swing.JLabel lb_rodada18_Time3;
    private javax.swing.JLabel lb_rodada18_Time4;
    private javax.swing.JLabel lb_rodada18_Time5;
    private javax.swing.JLabel lb_rodada18_Time6;
    private javax.swing.JLabel lb_rodada18_Time7;
    private javax.swing.JLabel lb_rodada18_Time8;
    private javax.swing.JLabel lb_rodada18_Time9;
    private javax.swing.JLabel lb_rodada18_logo1;
    private javax.swing.JLabel lb_rodada18_logo10;
    private javax.swing.JLabel lb_rodada18_logo2;
    private javax.swing.JLabel lb_rodada18_logo3;
    private javax.swing.JLabel lb_rodada18_logo4;
    private javax.swing.JLabel lb_rodada18_logo5;
    private javax.swing.JLabel lb_rodada18_logo6;
    private javax.swing.JLabel lb_rodada18_logo7;
    private javax.swing.JLabel lb_rodada18_logo8;
    private javax.swing.JLabel lb_rodada18_logo9;
    private javax.swing.JLabel lb_rodada1_gols1;
    private javax.swing.JLabel lb_rodada1_gols10;
    private javax.swing.JLabel lb_rodada1_gols2;
    private javax.swing.JLabel lb_rodada1_gols3;
    private javax.swing.JLabel lb_rodada1_gols4;
    private javax.swing.JLabel lb_rodada1_gols5;
    private javax.swing.JLabel lb_rodada1_gols6;
    private javax.swing.JLabel lb_rodada1_gols7;
    private javax.swing.JLabel lb_rodada1_gols8;
    private javax.swing.JLabel lb_rodada1_gols9;
    private javax.swing.JLabel lb_rodada1_logo1;
    private javax.swing.JLabel lb_rodada1_logo10;
    private javax.swing.JLabel lb_rodada1_logo2;
    private javax.swing.JLabel lb_rodada1_logo3;
    private javax.swing.JLabel lb_rodada1_logo4;
    private javax.swing.JLabel lb_rodada1_logo5;
    private javax.swing.JLabel lb_rodada1_logo6;
    private javax.swing.JLabel lb_rodada1_logo7;
    private javax.swing.JLabel lb_rodada1_logo8;
    private javax.swing.JLabel lb_rodada1_logo9;
    private javax.swing.JLabel lb_rodada1_time1;
    private javax.swing.JLabel lb_rodada1_time10;
    private javax.swing.JLabel lb_rodada1_time2;
    private javax.swing.JLabel lb_rodada1_time3;
    private javax.swing.JLabel lb_rodada1_time4;
    private javax.swing.JLabel lb_rodada1_time5;
    private javax.swing.JLabel lb_rodada1_time6;
    private javax.swing.JLabel lb_rodada1_time7;
    private javax.swing.JLabel lb_rodada1_time8;
    private javax.swing.JLabel lb_rodada1_time9;
    private javax.swing.JLabel lb_rodada2_Time1;
    private javax.swing.JLabel lb_rodada2_gols1;
    private javax.swing.JLabel lb_rodada2_gols10;
    private javax.swing.JLabel lb_rodada2_gols2;
    private javax.swing.JLabel lb_rodada2_gols3;
    private javax.swing.JLabel lb_rodada2_gols4;
    private javax.swing.JLabel lb_rodada2_gols5;
    private javax.swing.JLabel lb_rodada2_gols6;
    private javax.swing.JLabel lb_rodada2_gols7;
    private javax.swing.JLabel lb_rodada2_gols8;
    private javax.swing.JLabel lb_rodada2_gols9;
    private javax.swing.JLabel lb_rodada2_logo1;
    private javax.swing.JLabel lb_rodada2_logo10;
    private javax.swing.JLabel lb_rodada2_logo2;
    private javax.swing.JLabel lb_rodada2_logo3;
    private javax.swing.JLabel lb_rodada2_logo4;
    private javax.swing.JLabel lb_rodada2_logo5;
    private javax.swing.JLabel lb_rodada2_logo6;
    private javax.swing.JLabel lb_rodada2_logo7;
    private javax.swing.JLabel lb_rodada2_logo8;
    private javax.swing.JLabel lb_rodada2_logo9;
    private javax.swing.JLabel lb_rodada2_time10;
    private javax.swing.JLabel lb_rodada2_time2;
    private javax.swing.JLabel lb_rodada2_time3;
    private javax.swing.JLabel lb_rodada2_time4;
    private javax.swing.JLabel lb_rodada2_time5;
    private javax.swing.JLabel lb_rodada2_time6;
    private javax.swing.JLabel lb_rodada2_time7;
    private javax.swing.JLabel lb_rodada2_time8;
    private javax.swing.JLabel lb_rodada2_time9;
    private javax.swing.JLabel lb_rodada3_Time1;
    private javax.swing.JLabel lb_rodada3_Time10;
    private javax.swing.JLabel lb_rodada3_Time2;
    private javax.swing.JLabel lb_rodada3_Time3;
    private javax.swing.JLabel lb_rodada3_Time4;
    private javax.swing.JLabel lb_rodada3_Time5;
    private javax.swing.JLabel lb_rodada3_Time6;
    private javax.swing.JLabel lb_rodada3_Time7;
    private javax.swing.JLabel lb_rodada3_Time8;
    private javax.swing.JLabel lb_rodada3_Time9;
    private javax.swing.JLabel lb_rodada3_gols1;
    private javax.swing.JLabel lb_rodada3_gols10;
    private javax.swing.JLabel lb_rodada3_gols2;
    private javax.swing.JLabel lb_rodada3_gols3;
    private javax.swing.JLabel lb_rodada3_gols4;
    private javax.swing.JLabel lb_rodada3_gols5;
    private javax.swing.JLabel lb_rodada3_gols6;
    private javax.swing.JLabel lb_rodada3_gols7;
    private javax.swing.JLabel lb_rodada3_gols8;
    private javax.swing.JLabel lb_rodada3_gols9;
    private javax.swing.JLabel lb_rodada3_logo1;
    private javax.swing.JLabel lb_rodada3_logo10;
    private javax.swing.JLabel lb_rodada3_logo2;
    private javax.swing.JLabel lb_rodada3_logo3;
    private javax.swing.JLabel lb_rodada3_logo4;
    private javax.swing.JLabel lb_rodada3_logo5;
    private javax.swing.JLabel lb_rodada3_logo6;
    private javax.swing.JLabel lb_rodada3_logo7;
    private javax.swing.JLabel lb_rodada3_logo8;
    private javax.swing.JLabel lb_rodada3_logo9;
    private javax.swing.JLabel lb_rodada4_Time1;
    private javax.swing.JLabel lb_rodada4_Time10;
    private javax.swing.JLabel lb_rodada4_Time2;
    private javax.swing.JLabel lb_rodada4_Time3;
    private javax.swing.JLabel lb_rodada4_Time4;
    private javax.swing.JLabel lb_rodada4_Time5;
    private javax.swing.JLabel lb_rodada4_Time6;
    private javax.swing.JLabel lb_rodada4_Time7;
    private javax.swing.JLabel lb_rodada4_Time8;
    private javax.swing.JLabel lb_rodada4_Time9;
    private javax.swing.JLabel lb_rodada4_gols1;
    private javax.swing.JLabel lb_rodada4_gols10;
    private javax.swing.JLabel lb_rodada4_gols2;
    private javax.swing.JLabel lb_rodada4_gols3;
    private javax.swing.JLabel lb_rodada4_gols4;
    private javax.swing.JLabel lb_rodada4_gols5;
    private javax.swing.JLabel lb_rodada4_gols6;
    private javax.swing.JLabel lb_rodada4_gols7;
    private javax.swing.JLabel lb_rodada4_gols8;
    private javax.swing.JLabel lb_rodada4_gols9;
    private javax.swing.JLabel lb_rodada4_logo1;
    private javax.swing.JLabel lb_rodada4_logo10;
    private javax.swing.JLabel lb_rodada4_logo2;
    private javax.swing.JLabel lb_rodada4_logo3;
    private javax.swing.JLabel lb_rodada4_logo4;
    private javax.swing.JLabel lb_rodada4_logo5;
    private javax.swing.JLabel lb_rodada4_logo6;
    private javax.swing.JLabel lb_rodada4_logo7;
    private javax.swing.JLabel lb_rodada4_logo8;
    private javax.swing.JLabel lb_rodada4_logo9;
    private javax.swing.JLabel lb_rodada5_Time1;
    private javax.swing.JLabel lb_rodada5_Time10;
    private javax.swing.JLabel lb_rodada5_Time2;
    private javax.swing.JLabel lb_rodada5_Time3;
    private javax.swing.JLabel lb_rodada5_Time4;
    private javax.swing.JLabel lb_rodada5_Time5;
    private javax.swing.JLabel lb_rodada5_Time6;
    private javax.swing.JLabel lb_rodada5_Time7;
    private javax.swing.JLabel lb_rodada5_Time8;
    private javax.swing.JLabel lb_rodada5_Time9;
    private javax.swing.JLabel lb_rodada5_gols1;
    private javax.swing.JLabel lb_rodada5_gols10;
    private javax.swing.JLabel lb_rodada5_gols2;
    private javax.swing.JLabel lb_rodada5_gols3;
    private javax.swing.JLabel lb_rodada5_gols4;
    private javax.swing.JLabel lb_rodada5_gols5;
    private javax.swing.JLabel lb_rodada5_gols6;
    private javax.swing.JLabel lb_rodada5_gols7;
    private javax.swing.JLabel lb_rodada5_gols8;
    private javax.swing.JLabel lb_rodada5_gols9;
    private javax.swing.JLabel lb_rodada5_logo1;
    private javax.swing.JLabel lb_rodada5_logo10;
    private javax.swing.JLabel lb_rodada5_logo2;
    private javax.swing.JLabel lb_rodada5_logo3;
    private javax.swing.JLabel lb_rodada5_logo4;
    private javax.swing.JLabel lb_rodada5_logo5;
    private javax.swing.JLabel lb_rodada5_logo6;
    private javax.swing.JLabel lb_rodada5_logo7;
    private javax.swing.JLabel lb_rodada5_logo8;
    private javax.swing.JLabel lb_rodada5_logo9;
    private javax.swing.JLabel lb_rodada6_Time1;
    private javax.swing.JLabel lb_rodada6_Time10;
    private javax.swing.JLabel lb_rodada6_Time2;
    private javax.swing.JLabel lb_rodada6_Time3;
    private javax.swing.JLabel lb_rodada6_Time4;
    private javax.swing.JLabel lb_rodada6_Time5;
    private javax.swing.JLabel lb_rodada6_Time6;
    private javax.swing.JLabel lb_rodada6_Time7;
    private javax.swing.JLabel lb_rodada6_Time8;
    private javax.swing.JLabel lb_rodada6_Time9;
    private javax.swing.JLabel lb_rodada6_gols1;
    private javax.swing.JLabel lb_rodada6_gols10;
    private javax.swing.JLabel lb_rodada6_gols2;
    private javax.swing.JLabel lb_rodada6_gols3;
    private javax.swing.JLabel lb_rodada6_gols4;
    private javax.swing.JLabel lb_rodada6_gols5;
    private javax.swing.JLabel lb_rodada6_gols6;
    private javax.swing.JLabel lb_rodada6_gols7;
    private javax.swing.JLabel lb_rodada6_gols8;
    private javax.swing.JLabel lb_rodada6_gols9;
    private javax.swing.JLabel lb_rodada6_logo1;
    private javax.swing.JLabel lb_rodada6_logo10;
    private javax.swing.JLabel lb_rodada6_logo2;
    private javax.swing.JLabel lb_rodada6_logo3;
    private javax.swing.JLabel lb_rodada6_logo4;
    private javax.swing.JLabel lb_rodada6_logo5;
    private javax.swing.JLabel lb_rodada6_logo6;
    private javax.swing.JLabel lb_rodada6_logo7;
    private javax.swing.JLabel lb_rodada6_logo8;
    private javax.swing.JLabel lb_rodada6_logo9;
    private javax.swing.JLabel lb_rodada7_Time1;
    private javax.swing.JLabel lb_rodada7_Time10;
    private javax.swing.JLabel lb_rodada7_Time2;
    private javax.swing.JLabel lb_rodada7_Time3;
    private javax.swing.JLabel lb_rodada7_Time4;
    private javax.swing.JLabel lb_rodada7_Time5;
    private javax.swing.JLabel lb_rodada7_Time6;
    private javax.swing.JLabel lb_rodada7_Time7;
    private javax.swing.JLabel lb_rodada7_Time8;
    private javax.swing.JLabel lb_rodada7_Time9;
    private javax.swing.JLabel lb_rodada7_gols1;
    private javax.swing.JLabel lb_rodada7_gols10;
    private javax.swing.JLabel lb_rodada7_gols2;
    private javax.swing.JLabel lb_rodada7_gols3;
    private javax.swing.JLabel lb_rodada7_gols4;
    private javax.swing.JLabel lb_rodada7_gols5;
    private javax.swing.JLabel lb_rodada7_gols6;
    private javax.swing.JLabel lb_rodada7_gols7;
    private javax.swing.JLabel lb_rodada7_gols8;
    private javax.swing.JLabel lb_rodada7_gols9;
    private javax.swing.JLabel lb_rodada7_logo1;
    private javax.swing.JLabel lb_rodada7_logo10;
    private javax.swing.JLabel lb_rodada7_logo2;
    private javax.swing.JLabel lb_rodada7_logo3;
    private javax.swing.JLabel lb_rodada7_logo4;
    private javax.swing.JLabel lb_rodada7_logo5;
    private javax.swing.JLabel lb_rodada7_logo6;
    private javax.swing.JLabel lb_rodada7_logo7;
    private javax.swing.JLabel lb_rodada7_logo8;
    private javax.swing.JLabel lb_rodada7_logo9;
    private javax.swing.JLabel lb_rodada8_Time1;
    private javax.swing.JLabel lb_rodada8_Time10;
    private javax.swing.JLabel lb_rodada8_Time2;
    private javax.swing.JLabel lb_rodada8_Time3;
    private javax.swing.JLabel lb_rodada8_Time4;
    private javax.swing.JLabel lb_rodada8_Time5;
    private javax.swing.JLabel lb_rodada8_Time6;
    private javax.swing.JLabel lb_rodada8_Time7;
    private javax.swing.JLabel lb_rodada8_Time8;
    private javax.swing.JLabel lb_rodada8_Time9;
    private javax.swing.JLabel lb_rodada8_gols1;
    private javax.swing.JLabel lb_rodada8_gols10;
    private javax.swing.JLabel lb_rodada8_gols2;
    private javax.swing.JLabel lb_rodada8_gols3;
    private javax.swing.JLabel lb_rodada8_gols4;
    private javax.swing.JLabel lb_rodada8_gols5;
    private javax.swing.JLabel lb_rodada8_gols6;
    private javax.swing.JLabel lb_rodada8_gols7;
    private javax.swing.JLabel lb_rodada8_gols8;
    private javax.swing.JLabel lb_rodada8_gols9;
    private javax.swing.JLabel lb_rodada8_logo1;
    private javax.swing.JLabel lb_rodada8_logo110;
    private javax.swing.JLabel lb_rodada8_logo2;
    private javax.swing.JLabel lb_rodada8_logo3;
    private javax.swing.JLabel lb_rodada8_logo4;
    private javax.swing.JLabel lb_rodada8_logo5;
    private javax.swing.JLabel lb_rodada8_logo6;
    private javax.swing.JLabel lb_rodada8_logo7;
    private javax.swing.JLabel lb_rodada8_logo8;
    private javax.swing.JLabel lb_rodada8_logo9;
    private javax.swing.JLabel lb_rodada9_Time1;
    private javax.swing.JLabel lb_rodada9_Time10;
    private javax.swing.JLabel lb_rodada9_Time2;
    private javax.swing.JLabel lb_rodada9_Time3;
    private javax.swing.JLabel lb_rodada9_Time4;
    private javax.swing.JLabel lb_rodada9_Time5;
    private javax.swing.JLabel lb_rodada9_Time6;
    private javax.swing.JLabel lb_rodada9_Time7;
    private javax.swing.JLabel lb_rodada9_Time8;
    private javax.swing.JLabel lb_rodada9_Time9;
    private javax.swing.JLabel lb_rodada9_gols1;
    private javax.swing.JLabel lb_rodada9_gols10;
    private javax.swing.JLabel lb_rodada9_gols2;
    private javax.swing.JLabel lb_rodada9_gols3;
    private javax.swing.JLabel lb_rodada9_gols4;
    private javax.swing.JLabel lb_rodada9_gols5;
    private javax.swing.JLabel lb_rodada9_gols6;
    private javax.swing.JLabel lb_rodada9_gols7;
    private javax.swing.JLabel lb_rodada9_gols8;
    private javax.swing.JLabel lb_rodada9_gols9;
    private javax.swing.JLabel lb_rodada9_logo1;
    private javax.swing.JLabel lb_rodada9_logo10;
    private javax.swing.JLabel lb_rodada9_logo2;
    private javax.swing.JLabel lb_rodada9_logo3;
    private javax.swing.JLabel lb_rodada9_logo4;
    private javax.swing.JLabel lb_rodada9_logo5;
    private javax.swing.JLabel lb_rodada9_logo6;
    private javax.swing.JLabel lb_rodada9_logo7;
    private javax.swing.JLabel lb_rodada9_logo8;
    private javax.swing.JLabel lb_rodada9_logo9;
    // End of variables declaration//GEN-END:variables
}
