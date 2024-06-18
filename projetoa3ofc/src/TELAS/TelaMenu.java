/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TELAS;

import DAO.ConnectionFactory.ConnectionFactory;
import MODEL.Bdproj;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class TelaMenu extends javax.swing.JFrame {

    private JComboBox<Bdproj> comboBox;
    private JTextField textField;
    private List<Bdproj> projs;

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
        txt_id.setEditable(false);
        txt_nome.setEditable(false);
        txt_dono.setEditable(false);
        txt_data.setEditable(false);
        txt_ods.setEditable(false);
        txt_desc.setEditable(false);
        btn_cadproj.setVisible(false);
        btn_sair.setVisible(false);
        btn_analusu.setVisible(false);
        comboBox = new JComboBox<>();
        textField = new JTextField(20);
        projs = new ArrayList<>();

        // Conecta ao banco de dados e preenche o comboBox
        populateComboBox();
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 270, -1));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_analusu = new javax.swing.JButton();
        btn_cadproj = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        txt_dono = new javax.swing.JTextField();
        txt_ods = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        box_proj = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel5.setText("Data");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 20));

        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        btn_analusu.setFont(new java.awt.Font("Yu Gothic Medium", 0, 10)); // NOI18N
        btn_analusu.setText("Analisar Usuário");
        btn_analusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analusuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_analusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 36));

        btn_cadproj.setFont(new java.awt.Font("Yu Gothic Medium", 0, 10)); // NOI18N
        btn_cadproj.setText("Cadastrar Projeto");
        btn_cadproj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadprojActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadproj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 36));

        btn_sair.setFont(new java.awt.Font("Yu Gothic Medium", 0, 10)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 36));

        btn_menu.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel4.setText("Descrição");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel8.setText("Nome do Projeto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel6.setText("ODS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\ssss.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel9.setText("Dono");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));
        getContentPane().add(txt_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 390, 90));
        getContentPane().add(txt_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 170, -1));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, -1));

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 390, -1));
        getContentPane().add(txt_dono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 170, -1));
        getContentPane().add(txt_ods, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 170, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel1.setText("Projetos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        box_proj.setSelectedItem(toString());
        box_proj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_projActionPerformed(evt);
            }
        });
        getContentPane().add(box_proj, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 330, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\aa.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        btn_sair.setVisible(!btn_sair.isVisible());
        btn_cadproj.setVisible(!btn_cadproj.isVisible());
        btn_analusu.setVisible(!btn_analusu.isVisible());
    }//GEN-LAST:event_btn_menuActionPerformed


    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed
    private void populateComboBox() {

        try (java.sql.Connection con = new ConnectionFactory().obtemConexao()) {
            String selectSql = "SELECT nomeproj FROM bdproj";  // Consulta para selecionar os nomes dos projetos
            java.sql.PreparedStatement selectStmt = con.prepareStatement(selectSql);
            java.sql.ResultSet rs = selectStmt.executeQuery();

            while (rs.next()) {
                String nomeProjeto = rs.getString("nomeproj");
                box_proj.addItem(nomeProjeto);  // Adiciona o nome do projeto ao JComboBox
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    private void exibirDetalhesProjeto(String nomeProjeto) {
        
        try (java.sql.Connection con = new ConnectionFactory().obtemConexao()) {
            String selectSql = "SELECT * FROM bdproj WHERE nomeproj = ?";
            java.sql.PreparedStatement selectStmt = con.prepareStatement(selectSql);
            selectStmt.setString(1, nomeProjeto);
            java.sql.ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                int idproj = rs.getInt("idproj");
                String nomeproj = rs.getString("nomeproj");
                String donoproj = rs.getString("donoproj");
                String dataproj = rs.getString("dataproj");
                String ods = rs.getString("ods");
                String descproj = rs.getString("descproj");

                // Exibe as informações do projeto nos campos de texto correspondentes
                txt_id.setText(String.valueOf(idproj));
                txt_nome.setText(nomeproj);
                txt_dono.setText(donoproj);
                txt_data.setText(dataproj);
                txt_ods.setText(ods);
                txt_desc.setText(descproj);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    private void btn_analusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analusuActionPerformed
        // TODO add your handling code here:
        TelaAnaliseUsuario analusutel = new TelaAnaliseUsuario();
        analusutel.setVisible(true);
        analusutel.pack();
        analusutel.setLocationRelativeTo(null);
        analusutel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btn_analusuActionPerformed

    private void btn_cadprojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadprojActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaCadastroProj cadp = new TelaCadastroProj();
        cadp.setVisible(true);
        cadp.pack();
        cadp.setLocationRelativeTo(null);
        cadp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btn_cadprojActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void box_projActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_projActionPerformed
        // TODO add your handling code here:
        String nomeSelecionado = (String) box_proj.getSelectedItem();

        // Exibe as informações do projeto selecionado nos campos de texto
        exibirDetalhesProjeto(nomeSelecionado);
    }//GEN-LAST:event_box_projActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_proj;
    private javax.swing.JButton btn_analusu;
    private javax.swing.JButton btn_cadproj;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_dono;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_ods;
    // End of variables declaration//GEN-END:variables
}