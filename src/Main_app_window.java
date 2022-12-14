
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main_app_window extends javax.swing.JFrame {
    
    /**
     * Creates new form Main_app_window
     */
    public Main_app_window() {
        initComponents();
        
        //set the logo icon
        jLabel_APP_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_resized.jpeg")));
        //logo borders
        Border logo_border = BorderFactory.createMatteBorder(1,1,1,1,new Color(254,200,216));
        jLabel_APP_ICON.setBorder(logo_border);
        
        //seting border for the name
        Border appname_border = BorderFactory.createMatteBorder(0,0,3,0,new Color(254,200,216));
        jLabel_App.setBorder(appname_border);
        
        Border menu_border = BorderFactory.createMatteBorder(0,0,1,0,new Color(210,145,188));
        jLabel_Property.setBorder(menu_border);
        jLabel_PropertyType.setBorder(menu_border);
        jLabel_PropertyImages.setBorder(menu_border);
        jLabel_Owner.setBorder(menu_border);
        jLabel_Client.setBorder(menu_border);

        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_APP_ICON = new javax.swing.JLabel();
        jLabel_App = new javax.swing.JLabel();
        jLabel_PropertyType = new javax.swing.JLabel();
        jLabel_Property = new javax.swing.JLabel();
        jLabel_PropertyImages = new javax.swing.JLabel();
        jLabel_Owner = new javax.swing.JLabel();
        jLabel_Client = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(254, 200, 216));

        jPanel3.setBackground(new java.awt.Color(210, 145, 188));

        jLabel_APP_ICON.setBackground(new java.awt.Color(224, 187, 228));
        jLabel_APP_ICON.setOpaque(true);

        jLabel_App.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_App.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_App.setText("MY APP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_APP_ICON, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_App)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_APP_ICON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel_App, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel_PropertyType.setBackground(new java.awt.Color(254, 200, 216));
        jLabel_PropertyType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_PropertyType.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_PropertyType.setText("   Property - Type ");
        jLabel_PropertyType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropertyType.setOpaque(true);
        jLabel_PropertyType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseExited(evt);
            }
        });

        jLabel_Property.setBackground(new java.awt.Color(254, 200, 216));
        jLabel_Property.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Property.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Property.setText("   Property");
        jLabel_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Property.setOpaque(true);
        jLabel_Property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseExited(evt);
            }
        });

        jLabel_PropertyImages.setBackground(new java.awt.Color(254, 200, 216));
        jLabel_PropertyImages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_PropertyImages.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_PropertyImages.setText("   Property - Images");
        jLabel_PropertyImages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropertyImages.setOpaque(true);
        jLabel_PropertyImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseExited(evt);
            }
        });

        jLabel_Owner.setBackground(new java.awt.Color(254, 200, 216));
        jLabel_Owner.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Owner.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Owner.setText("   Owner");
        jLabel_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Owner.setOpaque(true);
        jLabel_Owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseExited(evt);
            }
        });

        jLabel_Client.setBackground(new java.awt.Color(254, 200, 216));
        jLabel_Client.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Client.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Client.setText("   Client");
        jLabel_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Client.setOpaque(true);
        jLabel_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ClientMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_PropertyImages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_PropertyType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Property, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Owner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PropertyImages, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 380, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_PropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseEntered
        // TODO add your handling code here:
        jLabel_Property.setBackground(new Color(210, 145, 188));
        jLabel_Property.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jLabel_PropertyMouseEntered

    private void jLabel_PropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseExited
        // TODO add your handling code here:
        jLabel_Property.setBackground(new Color(254, 200, 216));
        jLabel_Property.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_PropertyMouseExited

    private void jLabel_PropertyTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseEntered
        // TODO add your handling code here:
        jLabel_PropertyType.setBackground(new Color(210, 145, 188));
        jLabel_PropertyType.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_PropertyTypeMouseEntered

    private void jLabel_PropertyTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseExited
        // TODO add your handling code here:
        jLabel_PropertyType.setBackground(new Color(254, 200, 216));
        jLabel_PropertyType.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_PropertyTypeMouseExited

    private void jLabel_PropertyImagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseEntered
        // TODO add your handling code here:
        jLabel_PropertyImages.setBackground(new Color(210, 145, 188));
        jLabel_PropertyImages.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_PropertyImagesMouseEntered

    private void jLabel_PropertyImagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseExited
        // TODO add your handling code here:
        jLabel_PropertyImages.setBackground(new Color(254, 200, 216));
        jLabel_PropertyImages.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_PropertyImagesMouseExited

    private void jLabel_OwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseEntered
        // TODO add your handling code here:
         jLabel_Owner.setBackground(new Color(210, 145, 188));
        jLabel_Owner.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_OwnerMouseEntered

    private void jLabel_OwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseExited
        // TODO add your handling code here:
         jLabel_Owner.setBackground(new Color(254, 200, 216));
        jLabel_Owner.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_OwnerMouseExited

    private void jLabel_ClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientMouseEntered
        // TODO add your handling code here:
         jLabel_Client.setBackground(new Color(210, 145, 188));
        jLabel_Client.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_ClientMouseEntered

    private void jLabel_ClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientMouseExited
        // TODO add your handling code here:
         jLabel_Client.setBackground(new Color(254, 200, 216));
        jLabel_Client.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_ClientMouseExited

    private void jLabel_PropertyTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseClicked
        // TODO add your handling code here:
         PROPERTY_TYPE_WINDOW typeform = new PROPERTY_TYPE_WINDOW();
         typeform.setVisible(true);
         typeform.pack();
         typeform.setLocationRelativeTo(null);
         typeform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel_PropertyTypeMouseClicked

    private void jLabel_OwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseClicked
        // TODO add your handling code here:
         OWNER_WINDOW ownerform = new OWNER_WINDOW();
         ownerform.setVisible(true);
         ownerform.pack();
         ownerform.setLocationRelativeTo(null);
         ownerform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel_OwnerMouseClicked

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
            java.util.logging.Logger.getLogger(Main_app_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_app_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_app_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_app_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_app_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_APP_ICON;
    private javax.swing.JLabel jLabel_App;
    private javax.swing.JLabel jLabel_Client;
    private javax.swing.JLabel jLabel_Owner;
    private javax.swing.JLabel jLabel_Property;
    private javax.swing.JLabel jLabel_PropertyImages;
    private javax.swing.JLabel jLabel_PropertyType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}