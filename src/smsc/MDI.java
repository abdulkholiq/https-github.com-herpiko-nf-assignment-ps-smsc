/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsc;

/**
 *
 * @author herpiko
 */
public class MDI extends javax.swing.JFrame {

    /**
     * Creates new form MDI
     */
    public MDI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        MainMenu = new javax.swing.JMenu();
        contactMenuItem = new javax.swing.JMenuItem();
        groupMenuItem = new javax.swing.JMenuItem();
        inboxMenuItem = new javax.swing.JMenuItem();
        outboxMenuItem = new javax.swing.JMenuItem();
        sentMenuItem = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainMenu.setMnemonic('f');
        MainMenu.setText("Menu");

        contactMenuItem.setMnemonic('o');
        contactMenuItem.setText("Kontak");
        contactMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactMenuItemActionPerformed(evt);
            }
        });
        MainMenu.add(contactMenuItem);

        groupMenuItem.setMnemonic('s');
        groupMenuItem.setText("Grup");
        groupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupMenuItemActionPerformed(evt);
            }
        });
        MainMenu.add(groupMenuItem);

        inboxMenuItem.setMnemonic('a');
        inboxMenuItem.setText("Inbox");
        inboxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inboxMenuItemActionPerformed(evt);
            }
        });
        MainMenu.add(inboxMenuItem);

        outboxMenuItem.setMnemonic('x');
        outboxMenuItem.setText("Outbox");
        outboxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outboxMenuItemActionPerformed(evt);
            }
        });
        MainMenu.add(outboxMenuItem);

        sentMenuItem.setMnemonic('x');
        sentMenuItem.setText("Sent");
        sentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentMenuItemActionPerformed(evt);
            }
        });
        MainMenu.add(sentMenuItem);

        exit.setMnemonic('x');
        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        MainMenu.add(exit);

        menuBar.add(MainMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outboxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outboxMenuItemActionPerformed
        
        Outbox frm = new Outbox();
        frm.setTitle("Outbox");
        frm.setClosable(true);
        frm.setVisible(true);
        desktopPane.add(frm);  
    }//GEN-LAST:event_outboxMenuItemActionPerformed

    private void contactMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactMenuItemActionPerformed
        Contact frm = new Contact();
        frm.setTitle("Kontak");
        frm.setClosable(true);
        frm.setVisible(true);
        desktopPane.add(frm);        // TODO add your handling code here:
    }//GEN-LAST:event_contactMenuItemActionPerformed

    private void groupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupMenuItemActionPerformed
        // TODO add your handling code here:
        Group frm = new Group();
        frm.setTitle("Grup");
        frm.setClosable(true);
        frm.setVisible(true);
        desktopPane.add(frm);   
    }//GEN-LAST:event_groupMenuItemActionPerformed

    private void inboxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inboxMenuItemActionPerformed
        // TODO add your handling code here:
        Inbox frm = new Inbox();
        frm.setTitle("Inbox");
        frm.setClosable(true);
        frm.setVisible(true);
        desktopPane.add(frm);
    }//GEN-LAST:event_inboxMenuItemActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void sentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentMenuItemActionPerformed
        // TODO add your handling code here:
        Sent frm = new Sent();
        frm.setTitle("Sent Items");
        frm.setClosable(true);
        frm.setVisible(true);
        desktopPane.add(frm);
    }//GEN-LAST:event_sentMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MDI mdi = new MDI();
                mdi.setVisible(true);
                mdi.pack();
                mdi.setSize(1024, 740);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MainMenu;
    private javax.swing.JMenuItem contactMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem groupMenuItem;
    private javax.swing.JMenuItem inboxMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem outboxMenuItem;
    private javax.swing.JMenuItem sentMenuItem;
    // End of variables declaration//GEN-END:variables

}
