
package Viwe;

import Controler.Main;
import Model.Serialização;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Tela_Classificacao extends javax.swing.JPanel {
    Serialização obj;
    int[] posicoes;
    DefaultTableModel model;
    int pontosVitoria = 3;
    int pontosEmpate = 1;
    
    public Tela_Classificacao() {
        initComponents();
        Tb_classificaçao.getColumnModel().getColumn(1).setPreferredWidth(200);
        model = new DefaultTableModel();
        Tb_classificaçao.setModel(model);
        obj = Main.c1.Desserealiza();
        posicoes = Main.c1.getControlerClassificacao().ordenaClassificacao();
        inicializaTabela();
        alteraTamanhoTabela();
        deixaTransparente();
        
    }
    
    public void deixaTransparente(){
        
    }
    public void alteraTamanhoTabela(){
        Tb_classificaçao.getColumnModel().getColumn(0).setPreferredWidth(20);
        Tb_classificaçao.getColumnModel().getColumn(1).setPreferredWidth(100);
        Tb_classificaçao.getColumnModel().getColumn(2).setPreferredWidth(20);
        Tb_classificaçao.getColumnModel().getColumn(3).setPreferredWidth(20);
        Tb_classificaçao.getColumnModel().getColumn(4).setPreferredWidth(20);
        Tb_classificaçao.getColumnModel().getColumn(5).setPreferredWidth(20);
        Tb_classificaçao.getColumnModel().getColumn(6).setPreferredWidth(20);
        
        Tb_classificaçao.setRowHeight(30);
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        Tb_classificaçao.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
    }
    
    public void inicializaTabela(){
        addRow();
        addColun();
        setaColococao();
        setaTimes();
        setaPontos();
        setaPartidasJogadas();
        setaVitorias();
        setaDerrotas();
        setaEmpates();
    }
    
    public void addRow(){
        for(int i=0; i<posicoes.length;i++){
        model.addRow(new Object[]{});
        }
    }
    
    public void addColun(){
        model.addColumn("Colocação");
        model.addColumn("Times");
        model.addColumn("Pts");
        model.addColumn("PJ");
        model.addColumn("Vit");
        model.addColumn("Der");
        model.addColumn("Emp");
    }
    
    public void setaColococao(){
        for(int i=0; i<posicoes.length; i++){
        model.setValueAt(String.valueOf(i + 1), i, 0);
        }
    }
    
    public void setaTimes(){
        for(int i=0; i<posicoes.length; i++){
        model.setValueAt(String.valueOf(obj.getListaTime().get(posicoes[i]).getNome()), i, 1);
        }
    }
    
    public void setaPontos(){
        for(int i=0; i<posicoes.length; i++){
            model.setValueAt(String.valueOf(calculaPontos(posicoes[i])), i, 2);
        }
    }
    
    public void setaPartidasJogadas(){
        for(int i=0; i<posicoes.length; i++){
            model.setValueAt(String.valueOf(obj.getRodada()), i, 3);
        }
    }
    
    public void setaVitorias(){
        for(int i=0; i<posicoes.length; i++){
            model.setValueAt(String.valueOf(obj.getVitorias()[posicoes[i]]), i, 4);
        }
    }
    
    public void setaDerrotas(){
        for(int i=0; i<posicoes.length; i++){
            model.setValueAt(String.valueOf(obj.getDerrotas()[posicoes[i]]), i, 5);
        }
    }
    
    public void setaEmpates(){
        for(int i=0; i<posicoes.length; i++){
            model.setValueAt(String.valueOf(obj.getEmpates()[posicoes[i]]), i, 6);
        }
    }
    
    public int calculaPontos(int i){
        int pontos = (obj.getVitorias()[i] * pontosVitoria) + (obj.getEmpates()[i] * pontosEmpate);
        
        return pontos;
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tb_classificaçao = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lb_fundo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setPreferredSize(new java.awt.Dimension(693, 485));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Classificação");
        add(jLabel2);
        jLabel2.setBounds(254, 20, 157, 32);

        Tb_classificaçao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Tb_classificaçao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Colocação", "Times", "Pts", "PJ", "Vit", "Der", "Emp"
            }
        ));
        Tb_classificaçao.setRowHeight(30);
        jScrollPane3.setViewportView(Tb_classificaçao);

        add(jScrollPane3);
        jScrollPane3.setBounds(40, 60, 611, 326);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(40, 440, 120, 30);

        lb_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/escanteio imagem (1).jpg"))); // NOI18N
        lb_fundo.setText("jLabel4");
        add(lb_fundo);
        lb_fundo.setBounds(0, 0, 690, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       Main.c1.getControlerClassificacao().bt_voltarMouseClicked();
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tb_classificaçao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_fundo;
    // End of variables declaration//GEN-END:variables
}
