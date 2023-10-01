
package Viwe;

import Controler.Main;
import Model.Serialização;
import javax.swing.ImageIcon;

public class Tela_mostraResultado extends javax.swing.JPanel {
    Serialização obj;
    int[][]tabelaJogos;
    int[][] resultados;
    int jogosRodada = 5;
    ImageIcon[] vetorImagens;
    
    public Tela_mostraResultado() {
        initComponents();
        this.obj = Main.c1.Desserealiza();
        this.tabelaJogos = obj.getTabelaJogos();
        this.resultados = obj.getResultados();
        iniciaLb_Times();
        iniciarLb_results();
        iniciaLb_logos();
        
    }
    
    public void iniciaLb_Times(){
        lb_titulo.setText("Rodada " + String.valueOf(obj.getRodada()));
        int jogoAtual = (obj.getRodada()-1) * jogosRodada;
            lb_time1.setText(obj.getListaTime().get(tabelaJogos[jogoAtual][0]).getNome());
            lb_time2.setText(obj.getListaTime().get(tabelaJogos[jogoAtual][1]).getNome());
            lb_time3.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+1][0]).getNome());
            lb_time4.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+1][1]).getNome());
            lb_time5.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+2][0]).getNome());
            lb_time6.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+2][1]).getNome());
            lb_time7.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+3][0]).getNome());
            lb_time8.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+3][1]).getNome());
            lb_time9.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+4][0]).getNome());
            lb_time10.setText(obj.getListaTime().get(tabelaJogos[jogoAtual+4][1]).getNome());
    }
    
    public void iniciarLb_results(){
        int jogoAtual = (obj.getRodada() - 1) * jogosRodada;
        lb_gols1.setText(String.valueOf(resultados[jogoAtual][0]));
        lb_gols2.setText(String.valueOf(resultados[jogoAtual][1]));
        lb_gols3.setText(String.valueOf(resultados[jogoAtual+1][0]));
        lb_gols4.setText(String.valueOf(resultados[jogoAtual+1][1]));
        lb_gols5.setText(String.valueOf(resultados[jogoAtual+2][0]));
        lb_gols6.setText(String.valueOf(resultados[jogoAtual+2][1]));
        lb_gols7.setText(String.valueOf(resultados[jogoAtual+3][0]));
        lb_gols8.setText(String.valueOf(resultados[jogoAtual+3][1]));
        lb_gols9.setText(String.valueOf(resultados[jogoAtual+4][0]));
        lb_gols10.setText(String.valueOf(resultados[jogoAtual+4][1]));
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
    
    public void iniciaLb_logos(){
        inicializaVetorImagens();
        
        int jogoAtual = (obj.getRodada()-1) * jogosRodada;
        lb_logo1.setIcon(vetorImagens[tabelaJogos[jogoAtual][0]]);
        lb_logo2.setIcon(vetorImagens[tabelaJogos[jogoAtual][1]]);
        lb_logo3.setIcon(vetorImagens[tabelaJogos[jogoAtual+1][0]]);
        lb_logo4.setIcon(vetorImagens[tabelaJogos[jogoAtual+1][1]]);
        lb_logo5.setIcon(vetorImagens[tabelaJogos[jogoAtual+2][0]]);
        lb_logo6.setIcon(vetorImagens[tabelaJogos[jogoAtual+2][1]]);
        lb_logo7.setIcon(vetorImagens[tabelaJogos[jogoAtual+3][0]]);
        lb_logo8.setIcon(vetorImagens[tabelaJogos[jogoAtual+3][1]]);
        lb_logo9.setIcon(vetorImagens[tabelaJogos[jogoAtual+4][0]]);
        lb_logo10.setIcon(vetorImagens[tabelaJogos[jogoAtual+4][1]]);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_logo3 = new javax.swing.JLabel();
        lb_logo5 = new javax.swing.JLabel();
        lb_logo9 = new javax.swing.JLabel();
        lb_logo2 = new javax.swing.JLabel();
        lb_logo4 = new javax.swing.JLabel();
        lb_logo6 = new javax.swing.JLabel();
        lb_logo8 = new javax.swing.JLabel();
        lb_logo10 = new javax.swing.JLabel();
        lb_time6 = new javax.swing.JLabel();
        lb_time7 = new javax.swing.JLabel();
        lb_time8 = new javax.swing.JLabel();
        lb_time9 = new javax.swing.JLabel();
        lb_time10 = new javax.swing.JLabel();
        lb_result1 = new javax.swing.JLabel();
        lb_result2 = new javax.swing.JLabel();
        lb_result3 = new javax.swing.JLabel();
        lb_result4 = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_time1 = new javax.swing.JLabel();
        lb_time2 = new javax.swing.JLabel();
        lb_time3 = new javax.swing.JLabel();
        lb_time4 = new javax.swing.JLabel();
        lb_time5 = new javax.swing.JLabel();
        bt_proximaRodada = new javax.swing.JButton();
        lb_result5 = new javax.swing.JLabel();
        lb_logo1 = new javax.swing.JLabel();
        lb_logo7 = new javax.swing.JLabel();
        lb_gols1 = new javax.swing.JLabel();
        lb_gols3 = new javax.swing.JLabel();
        lb_gols5 = new javax.swing.JLabel();
        lb_gols7 = new javax.swing.JLabel();
        lb_gols9 = new javax.swing.JLabel();
        lb_gols2 = new javax.swing.JLabel();
        lb_gols4 = new javax.swing.JLabel();
        lb_gols6 = new javax.swing.JLabel();
        lb_gols8 = new javax.swing.JLabel();
        lb_gols10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(652, 447));
        setRequestFocusEnabled(false);
        setLayout(null);

        lb_logo3.setText("jLabel7");
        add(lb_logo3);
        lb_logo3.setBounds(30, 110, 30, 30);

        lb_logo5.setText("jLabel8");
        add(lb_logo5);
        lb_logo5.setBounds(30, 140, 30, 30);

        lb_logo9.setText("jLabel10");
        add(lb_logo9);
        lb_logo9.setBounds(30, 200, 30, 30);

        lb_logo2.setText("jLabel11");
        add(lb_logo2);
        lb_logo2.setBounds(610, 80, 30, 30);

        lb_logo4.setText("jLabel12");
        add(lb_logo4);
        lb_logo4.setBounds(610, 110, 30, 30);

        lb_logo6.setText("jLabel13");
        add(lb_logo6);
        lb_logo6.setBounds(610, 140, 30, 30);

        lb_logo8.setText("jLabel14");
        add(lb_logo8);
        lb_logo8.setBounds(610, 170, 30, 30);

        lb_logo10.setText("jLabel15");
        add(lb_logo10);
        lb_logo10.setBounds(610, 200, 30, 30);

        lb_time6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time6.setForeground(new java.awt.Color(255, 255, 255));
        lb_time6.setText("Time6");
        add(lb_time6);
        lb_time6.setBounds(450, 140, 151, 25);

        lb_time7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time7.setForeground(new java.awt.Color(255, 255, 255));
        lb_time7.setText("Time7");
        add(lb_time7);
        lb_time7.setBounds(80, 170, 156, 25);

        lb_time8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time8.setForeground(new java.awt.Color(255, 255, 255));
        lb_time8.setText("Time8");
        add(lb_time8);
        lb_time8.setBounds(450, 170, 151, 25);

        lb_time9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time9.setForeground(new java.awt.Color(255, 255, 255));
        lb_time9.setText("Time9");
        add(lb_time9);
        lb_time9.setBounds(80, 200, 156, 25);

        lb_time10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time10.setForeground(new java.awt.Color(255, 255, 255));
        lb_time10.setText("Time10");
        add(lb_time10);
        lb_time10.setBounds(450, 200, 151, 25);

        lb_result1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result1.setForeground(new java.awt.Color(255, 255, 255));
        lb_result1.setText("x");
        add(lb_result1);
        lb_result1.setBounds(320, 90, 10, 20);

        lb_result2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result2.setForeground(new java.awt.Color(255, 255, 255));
        lb_result2.setText("x");
        add(lb_result2);
        lb_result2.setBounds(320, 120, 10, 20);

        lb_result3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result3.setForeground(new java.awt.Color(255, 255, 255));
        lb_result3.setText("x");
        add(lb_result3);
        lb_result3.setBounds(320, 150, 10, 20);

        lb_result4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result4.setForeground(new java.awt.Color(255, 255, 255));
        lb_result4.setText("x");
        add(lb_result4);
        lb_result4.setBounds(320, 170, 10, 25);

        lb_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Rodada <x>");
        add(lb_titulo);
        lb_titulo.setBounds(270, 20, 147, 22);

        lb_time1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time1.setForeground(new java.awt.Color(255, 255, 255));
        lb_time1.setText("Time1");
        add(lb_time1);
        lb_time1.setBounds(80, 80, 150, 25);

        lb_time2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time2.setForeground(new java.awt.Color(255, 255, 255));
        lb_time2.setText("Time2");
        add(lb_time2);
        lb_time2.setBounds(450, 80, 150, 25);

        lb_time3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time3.setForeground(new java.awt.Color(255, 255, 255));
        lb_time3.setText("TIme3");
        add(lb_time3);
        lb_time3.setBounds(80, 110, 150, 25);

        lb_time4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time4.setForeground(new java.awt.Color(255, 255, 255));
        lb_time4.setText("Time4");
        add(lb_time4);
        lb_time4.setBounds(450, 110, 151, 25);

        lb_time5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_time5.setForeground(new java.awt.Color(255, 255, 255));
        lb_time5.setText("Time5");
        add(lb_time5);
        lb_time5.setBounds(80, 140, 150, 25);

        bt_proximaRodada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_proximaRodada.setForeground(new java.awt.Color(0, 0, 0));
        bt_proximaRodada.setText("Proxima Rodada");
        bt_proximaRodada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_proximaRodadaMouseClicked(evt);
            }
        });
        add(bt_proximaRodada);
        bt_proximaRodada.setBounds(220, 300, 210, 50);

        lb_result5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_result5.setForeground(new java.awt.Color(255, 255, 255));
        lb_result5.setText("x");
        add(lb_result5);
        lb_result5.setBounds(320, 200, 10, 25);

        lb_logo1.setText("jLabel6");
        add(lb_logo1);
        lb_logo1.setBounds(30, 80, 30, 30);

        lb_logo7.setText("jLabel1");
        add(lb_logo7);
        lb_logo7.setBounds(30, 170, 30, 30);

        lb_gols1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols1.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols1.setText("0");
        add(lb_gols1);
        lb_gols1.setBounds(270, 90, 20, 20);

        lb_gols3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols3.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols3.setText("1");
        add(lb_gols3);
        lb_gols3.setBounds(270, 120, 20, 16);

        lb_gols5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols5.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols5.setText("2");
        add(lb_gols5);
        lb_gols5.setBounds(270, 150, 10, 20);

        lb_gols7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols7.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols7.setText("4");
        add(lb_gols7);
        lb_gols7.setBounds(270, 180, 10, 20);

        lb_gols9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols9.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols9.setText("5");
        add(lb_gols9);
        lb_gols9.setBounds(270, 210, 10, 20);

        lb_gols2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols2.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols2.setText("0");
        add(lb_gols2);
        lb_gols2.setBounds(360, 90, 10, 25);

        lb_gols4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols4.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols4.setText("0");
        add(lb_gols4);
        lb_gols4.setBounds(360, 120, 10, 20);

        lb_gols6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols6.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols6.setText("1");
        add(lb_gols6);
        lb_gols6.setBounds(360, 150, 10, 20);

        lb_gols8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols8.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols8.setText("3");
        add(lb_gols8);
        lb_gols8.setBounds(360, 180, 10, 20);

        lb_gols10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_gols10.setForeground(new java.awt.Color(255, 255, 255));
        lb_gols10.setText("3");
        add(lb_gols10);
        lb_gols10.setBounds(360, 210, 10, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo estadio_executaRodada.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_proximaRodadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_proximaRodadaMouseClicked
        Main.c1.getControlerMostraResultado().bt_proximaRodadaMouseClicked();
    }//GEN-LAST:event_bt_proximaRodadaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_proximaRodada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_gols1;
    private javax.swing.JLabel lb_gols10;
    private javax.swing.JLabel lb_gols2;
    private javax.swing.JLabel lb_gols3;
    private javax.swing.JLabel lb_gols4;
    private javax.swing.JLabel lb_gols5;
    private javax.swing.JLabel lb_gols6;
    private javax.swing.JLabel lb_gols7;
    private javax.swing.JLabel lb_gols8;
    private javax.swing.JLabel lb_gols9;
    private javax.swing.JLabel lb_logo1;
    private javax.swing.JLabel lb_logo10;
    private javax.swing.JLabel lb_logo2;
    private javax.swing.JLabel lb_logo3;
    private javax.swing.JLabel lb_logo4;
    private javax.swing.JLabel lb_logo5;
    private javax.swing.JLabel lb_logo6;
    private javax.swing.JLabel lb_logo7;
    private javax.swing.JLabel lb_logo8;
    private javax.swing.JLabel lb_logo9;
    private javax.swing.JLabel lb_result1;
    private javax.swing.JLabel lb_result2;
    private javax.swing.JLabel lb_result3;
    private javax.swing.JLabel lb_result4;
    private javax.swing.JLabel lb_result5;
    private javax.swing.JLabel lb_time1;
    private javax.swing.JLabel lb_time10;
    private javax.swing.JLabel lb_time2;
    private javax.swing.JLabel lb_time3;
    private javax.swing.JLabel lb_time4;
    private javax.swing.JLabel lb_time5;
    private javax.swing.JLabel lb_time6;
    private javax.swing.JLabel lb_time7;
    private javax.swing.JLabel lb_time8;
    private javax.swing.JLabel lb_time9;
    private javax.swing.JLabel lb_titulo;
    // End of variables declaration//GEN-END:variables
}
