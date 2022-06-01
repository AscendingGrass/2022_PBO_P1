/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mgw.main;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mejap
 */
public class ExitPoppup extends javax.swing.JPanel {

    /**
     * Creates new form ExitPoppup
     */
    public ExitPoppup() {
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

        jl_ExitConfirmation = new javax.swing.JLabel();
        jp_ExitOKButton = new javax.swing.JPanel();
        jl_ExitOk = new javax.swing.JLabel();
        jp_ExitCancelButton = new javax.swing.JPanel();
        jl_ExitCancel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jl_ExitConfirmation.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jl_ExitConfirmation.setForeground(new java.awt.Color(255, 255, 255));
        jl_ExitConfirmation.setText("Are you sure you want to quit?");

        jp_ExitOKButton.setBackground(new java.awt.Color(255, 255, 255));
        jp_ExitOKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_ExitOKButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PoppupButtonEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PoppupButtonExited(evt);
            }
        });

        jl_ExitOk.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jl_ExitOk.setForeground(new java.awt.Color(0, 0, 0));
        jl_ExitOk.setText("Exit");

        javax.swing.GroupLayout jp_ExitOKButtonLayout = new javax.swing.GroupLayout(jp_ExitOKButton);
        jp_ExitOKButton.setLayout(jp_ExitOKButtonLayout);
        jp_ExitOKButtonLayout.setHorizontalGroup(
            jp_ExitOKButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExitOKButtonLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jl_ExitOk)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jp_ExitOKButtonLayout.setVerticalGroup(
            jp_ExitOKButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExitOKButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_ExitOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_ExitCancelButton.setBackground(new java.awt.Color(255, 255, 255));
        jp_ExitCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_ExitCancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PoppupButtonEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PoppupButtonExited(evt);
            }
        });

        jl_ExitCancel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jl_ExitCancel.setForeground(new java.awt.Color(0, 0, 0));
        jl_ExitCancel.setText("Cancel");

        javax.swing.GroupLayout jp_ExitCancelButtonLayout = new javax.swing.GroupLayout(jp_ExitCancelButton);
        jp_ExitCancelButton.setLayout(jp_ExitCancelButtonLayout);
        jp_ExitCancelButtonLayout.setHorizontalGroup(
            jp_ExitCancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExitCancelButtonLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jl_ExitCancel)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jp_ExitCancelButtonLayout.setVerticalGroup(
            jp_ExitCancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExitCancelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_ExitCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jp_ExitOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jp_ExitCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jl_ExitConfirmation)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jl_ExitConfirmation)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_ExitOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_ExitCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PoppupButtonEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoppupButtonEntered
        // TODO add your handling code here:
        if(evt.getSource() instanceof JPanel jp)
        {
            ((JLabel)jp.getComponent(0)).setForeground(Color.WHITE);
            jp.setBackground(Color.BLACK);
        }
    }//GEN-LAST:event_PoppupButtonEntered

    private void PoppupButtonExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoppupButtonExited
        // TODO add your handling code here:
        if(evt.getSource() instanceof JPanel jp)
        {
            ((JLabel)jp.getComponent(0)).setForeground(Color.BLACK);
            jp.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_PoppupButtonExited

    private void jp_ExitOKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_ExitOKButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jp_ExitOKButtonMouseClicked

    private void jp_ExitCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_ExitCancelButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_ExitCancelButtonMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_ExitCancel;
    private javax.swing.JLabel jl_ExitConfirmation;
    private javax.swing.JLabel jl_ExitOk;
    private javax.swing.JPanel jp_ExitCancelButton;
    private javax.swing.JPanel jp_ExitOKButton;
    // End of variables declaration//GEN-END:variables
}
