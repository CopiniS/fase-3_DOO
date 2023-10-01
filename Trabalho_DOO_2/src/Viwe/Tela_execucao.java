
package Viwe;

import Controler.Main;
import java.awt.Color;

public class Tela_execucao extends javax.swing.JPanel {

    public Tela_execucao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_iniciarSimulacao = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(536, 474));
        setLayout(null);

        bt_iniciarSimulacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_iniciarSimulacao.setForeground(new java.awt.Color(0, 0, 0));
        bt_iniciarSimulacao.setText("Iniciar Simulação");
        bt_iniciarSimulacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarSimulacaoMouseClicked(evt);
            }
        });
        add(bt_iniciarSimulacao);
        bt_iniciarSimulacao.setBounds(130, 280, 294, 35);

        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 0, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        add(bt_voltar);
        bt_voltar.setBounds(130, 340, 294, 35);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-Sao Paulo.png"))); // NOI18N
        jLabel28.setText("jLabel1");
        add(jLabel28);
        jLabel28.setBounds(90, 80, 54, 51);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-do-corinthians-4096.png"))); // NOI18N
        jLabel29.setText("jLabel1");
        add(jLabel29);
        jLabel29.setBounds(240, 80, 54, 51);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-palmeiras-4096.png"))); // NOI18N
        jLabel31.setText("jLabel1");
        add(jLabel31);
        jLabel31.setBounds(310, 80, 54, 51);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-santos-4096.png"))); // NOI18N
        jLabel32.setText("jLabel1");
        add(jLabel32);
        jLabel32.setBounds(160, 80, 54, 51);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-flamengo-15.png"))); // NOI18N
        add(jLabel33);
        jLabel33.setBounds(400, 170, 54, 51);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-fluminense-4096.png"))); // NOI18N
        jLabel34.setText("jLabel1");
        add(jLabel34);
        jLabel34.setBounds(90, 170, 54, 51);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-cruzeiro-2048.png"))); // NOI18N
        jLabel36.setText("jLabel1");
        add(jLabel36);
        jLabel36.setBounds(390, 80, 54, 51);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-bahia-2048.png"))); // NOI18N
        jLabel37.setText("jLabel1");
        add(jLabel37);
        jLabel37.setBounds(240, 170, 54, 51);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/escudo-do-botafogo.png"))); // NOI18N
        add(jLabel38);
        jLabel38.setBounds(160, 170, 54, 51);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_escudos_times/logo-atletico-mineiro-2048.png"))); // NOI18N
        jLabel40.setText("jLabel1");
        add(jLabel40);
        jLabel40.setBounds(320, 170, 54, 51);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo estadio_execucao.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_iniciarSimulacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarSimulacaoMouseClicked
        Main.c1.getControlerExecucao1().iniciarSilulacaoMouseClicked();
    }//GEN-LAST:event_bt_iniciarSimulacaoMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
       Main.c1.getControlerExecucao1().bt_voltarMOuseClicked();
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_iniciarSimulacao;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    // End of variables declaration//GEN-END:variables
}
