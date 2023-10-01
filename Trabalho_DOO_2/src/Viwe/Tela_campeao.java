
package Viwe;

import Controler.Main;
import javax.swing.ImageIcon;

public class Tela_campeao extends javax.swing.JPanel {
    int[] posicoes;
    int campeao;
    public Tela_campeao(int[] posicoes) {
        initComponents();
        this.posicoes = posicoes;
        campeao = posicoes[0];
        iniciaLogo_e_Time();
    }
    
    public void iniciaLogo_e_Time(){
        ImageIcon i0 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/saoPaulo_100x100.png"));
        ImageIcon i1 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/santos_100x100.png"));
        ImageIcon i2 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/palmeiras_100x100.png"));
        ImageIcon i3 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/corinthias_100x100.png"));
        ImageIcon i4 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/flamengo_100x100.png"));
        ImageIcon i5 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/fluminense_100x100.png"));
        ImageIcon i6 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/botafogo_100x100.png"));
        ImageIcon i7 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/cruzeiro_100x100.png"));
        ImageIcon i8 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/atleticoMineiro_100x100.png"));
        ImageIcon i9 = new ImageIcon(getClass().getResource("/imagens_escudos_times_100x100/bahia_100x100.png"));
        
        ImageIcon[] vetorImagens = new ImageIcon[10];
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
        
        lb_logo.setIcon(vetorImagens[campeao]);
        lb_time.setText(Main.c1.Desserealiza().getListaTime().get(campeao).getNome());
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bt_classificacao = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(513, 499));
        setLayout(null);

        bt_classificacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_classificacao.setForeground(new java.awt.Color(0, 0, 0));
        bt_classificacao.setText("Classificacao");
        bt_classificacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_classificacaoMouseClicked(evt);
            }
        });
        add(bt_classificacao);
        bt_classificacao.setBounds(340, 440, 150, 32);

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
        bt_voltar.setBounds(60, 440, 150, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAMPEÃO");
        add(jLabel2);
        jLabel2.setBounds(130, 30, 270, 40);

        lb_logo.setText("Foto do logo do campeao");
        lb_logo.setPreferredSize(new java.awt.Dimension(100, 100));
        add(lb_logo);
        lb_logo.setBounds(200, 120, 120, 110);

        lb_time.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_time.setForeground(new java.awt.Color(255, 255, 255));
        lb_time.setText("<TIME>");
        add(lb_time);
        lb_time.setBounds(180, 240, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagem.campeao.png"))); // NOI18N
        jLabel1.setText("fundo");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
       Main.c1.getControlerCampeao().bt_voltarMOuseClicked();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_classificacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_classificacaoMouseClicked
       Main.c1.getControlerCampeao().btClassificacaoMouseCliecked();
    }//GEN-LAST:event_bt_classificacaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_classificacao;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_time;
    // End of variables declaration//GEN-END:variables
}
