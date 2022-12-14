
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class OWNER_WINDOW extends javax.swing.JFrame {

    private Object owner;

    /**
     * Creates new form OWNER_WINDOW
     */
    public OWNER_WINDOW() {
        initComponents();
        fillJtableWithOwnersData();
    }
    public void fillJtableWithOwnersData(){
        
        Property_Owner owner = new Property_Owner();
        ArrayList<Property_Owner> ownersList = owner.ownersList();
        
        String[] colNames = {"ID","First Name","Last Name","Phone","Email","Address"};
        
        Object[][] rows = new Object[ownersList.size()][6];
        
        for(int i=0;i<ownersList.size(); i++){
            rows[i][0] = ownersList.get(i).getId();
            rows[i][1] = ownersList.get(i).getFname();
            rows[i][2] = ownersList.get(i).getLname();
            rows[i][3] = ownersList.get(i).getPhone();
            rows[i][4] = ownersList.get(i).getEmail();
            rows[i][5] = ownersList.get(i).getAddress();

        }
        DefaultTableModel model  = new DefaultTableModel(rows,colNames);
        jTable1.setModel(model);
        
        jTable1.setRowHeight(40);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jButton_Add_Owner = new javax.swing.JButton();
        jButton_Edit_Owner = new javax.swing.JButton();
        jButton_Refresh_Owner = new javax.swing.JButton();
        jButton_Remove_Owner = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_OwnerProperties = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("First Name :");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 200, 216));

        jPanel_Title.setBackground(new java.awt.Color(210, 145, 188));
        jPanel_Title.setPreferredSize(new java.awt.Dimension(530, 73));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Owners");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(528, 528, 528)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Phone :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("First Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address :");

        jTextField_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jTextField_Phone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jButton_Add_Owner.setBackground(new java.awt.Color(210, 145, 188));
        jButton_Add_Owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Add_Owner.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Add_Owner.setText("ADD");
        jButton_Add_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_OwnerActionPerformed(evt);
            }
        });

        jButton_Edit_Owner.setBackground(new java.awt.Color(210, 145, 188));
        jButton_Edit_Owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Edit_Owner.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Edit_Owner.setText("EDIT");
        jButton_Edit_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_OwnerActionPerformed(evt);
            }
        });

        jButton_Refresh_Owner.setBackground(new java.awt.Color(210, 145, 188));
        jButton_Refresh_Owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Refresh_Owner.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Refresh_Owner.setText("REFRESH");
        jButton_Refresh_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_OwnerActionPerformed(evt);
            }
        });

        jButton_Remove_Owner.setBackground(new java.awt.Color(210, 145, 188));
        jButton_Remove_Owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Remove_Owner.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Remove_Owner.setText("REMOVE");
        jButton_Remove_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_OwnerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID :");

        jTextField_LastName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Last Name :");

        jTextField_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email :");

        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(210, 145, 188));
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jButton_OwnerProperties.setBackground(new java.awt.Color(210, 145, 188));
        jButton_OwnerProperties.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_OwnerProperties.setForeground(new java.awt.Color(0, 0, 0));
        jButton_OwnerProperties.setText("OWNER PROPERTIES");
        jButton_OwnerProperties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_OwnerProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OwnerPropertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 1155, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_FirstName))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                            .addComponent(jTextField_LastName)
                                            .addComponent(jTextField_Phone)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton_Refresh_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton_OwnerProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_OwnerProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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

    private void jButton_Add_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_OwnerActionPerformed
        // TODO add your handling code here:
        //add a new property owner
        String Fname = jTextField_FirstName.getText();
        String Lname = jTextField_LastName.getText();
        String Phone = jTextField_Phone.getText();
        String Email = jTextField_Email.getText();
        String Address = jTextArea_Address.getText();
        
        Property_Owner owner = new Property_Owner();
        if(Fname.trim().equals("") || Lname.trim().equals("") || Phone.trim().equals("") || Address.trim().equals("")){
                JOptionPane.showMessageDialog(null,"Enter the required Information!","Add Owner",2);
            }
        else{
            if(owner.addNewOwner(new Property_Owner(0,Fname,Lname,Phone,Email,Address)))
        {
            JOptionPane.showMessageDialog(null,"New Owner Added","Add Owner",1);
        }
        else{
             JOptionPane.showMessageDialog(null,"Operation Failed","Add Owner",2);
            }
        }
    }//GEN-LAST:event_jButton_Add_OwnerActionPerformed

    private void jButton_Edit_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_OwnerActionPerformed
        // TODO add your handling code here:
        //edit the property ownwer
        String Fname = jTextField_FirstName.getText();
        String Lname = jTextField_LastName.getText();
        String Phone = jTextField_Phone.getText();
        String Email = jTextField_Email.getText();
        String Address = jTextArea_Address.getText();
        
        Property_Owner owner = new Property_Owner();
        
        try{
            int ownerId = Integer.valueOf(jTextField_id.getText());
            if(Fname.trim().equals("") || Lname.trim().equals("") || Phone.trim().equals("") || Address.trim().equals("")){
                JOptionPane.showMessageDialog(null,"Enter the required Information!","Edit Owner",2);
            }
            else{
                if(owner.editOwnerData(new Property_Owner(ownerId,Fname,Lname,Phone,Email,Address))){
                   JOptionPane.showMessageDialog(null,"Owner Edited","Edit Owner",1);
                   }
                 else{
                    JOptionPane.showMessageDialog(null,"Operation Failed","Edit Owner",2);
                   }
            }
        }
         catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Enter the Valid Owner Id","Invalid ID",0);
        }
    }//GEN-LAST:event_jButton_Edit_OwnerActionPerformed

    private void jButton_Remove_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_OwnerActionPerformed
        // TODO add your handling code here:
        //delete the selected property owner
        try{
            int ownerId = Integer.valueOf(jTextField_id.getText());

            Property_Owner owner = new Property_Owner();

            if(jTextField_id.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null,"Enter the owner ID","Empty ID",2);

            }
            else{
                int yes_or_no = JOptionPane.showConfirmDialog(null,"Do you want to delete the owner","Delete Owner",JOptionPane.YES_NO_OPTION);
                 if(yes_or_no == JOptionPane.YES_OPTION){
                     if(owner.deleteOwnerData(ownerId)){
                         JOptionPane.showMessageDialog(null,"Owner Deleted","Delete Owner",1);
                    }
                    else{
                         JOptionPane.showMessageDialog(null,"Operation Failed","Delete Owner",2);

                     }
                  }
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Enter the Valid Owner Id","Invalid ID",0);
        }        
    }//GEN-LAST:event_jButton_Remove_OwnerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        jTextField_id.setText(jTable1.getValueAt(selectedRowIndex,0).toString());
        jTextField_FirstName.setText(jTable1.getValueAt(selectedRowIndex,1).toString());
        jTextField_LastName.setText(jTable1.getValueAt(selectedRowIndex,2).toString());
        jTextField_Phone.setText(jTable1.getValueAt(selectedRowIndex,3).toString());
        jTextField_Email.setText(jTable1.getValueAt(selectedRowIndex,4).toString());
        jTextArea_Address.setText(jTable1.getValueAt(selectedRowIndex,5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_Refresh_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_OwnerActionPerformed
        // TODO add your handling code here:
        fillJtableWithOwnersData();
    }//GEN-LAST:event_jButton_Refresh_OwnerActionPerformed

    private void jButton_OwnerPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OwnerPropertiesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton_OwnerPropertiesActionPerformed

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
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OWNER_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Owner;
    private javax.swing.JButton jButton_Edit_Owner;
    private javax.swing.JButton jButton_OwnerProperties;
    private javax.swing.JButton jButton_Refresh_Owner;
    private javax.swing.JButton jButton_Remove_Owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
