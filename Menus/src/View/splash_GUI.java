/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laboratorio-Info
 */
public class splash_GUI extends javax.swing.JFrame {

    /**
     * Creates new form splash_GUI
     */
    public splash_GUI() {
        initComponents();
        //inicio dódigo
        
                new Thread(){
        
            public void run() {
        
        
        for (int i=0; i<101; i++){
                    try {
                        sleep(60); 
                        
                        barra.setValue(i);
                        
                        if(barra.getValue() == 10){
                        
                            mensagem.setText("Fazendo a conexao com o banco de dados");
                            sleep(2000);
                                                       
                        
                        }else if (barra.getValue() <=30){
                            mensagem.setText("Carregando o sistema");
                          sleep(100);  
                        } else if (barra.getValue() <=99){
                            mensagem.setText("Carregamento quase completo");
                            
                        }else{
                            mensagem.setText("Carregamento completo. Seu programa sera iniciado.");
                        
                        sleep(3000);
                        
                        new Login_GUI().setVisible(true);
                        dispose();
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
        
        }        
        }
        
        }.start();
        
    
    //término códig
    }

    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mensagem = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);
        jPanel1.add(mensagem);
        mensagem.setBounds(30, 230, 350, 20);

        barra.setBackground(new java.awt.Color(204, 204, 204));
        barra.setForeground(new java.awt.Color(51, 51, 255));
        barra.setStringPainted(true);
        jPanel1.add(barra);
        barra.setBounds(70, 200, 260, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar barra;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel mensagem;
    // End of variables declaration//GEN-END:variables
}
