/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mgw.main;

import mgw.gameplay.Player;

/**
 *
 * @author mejap
 */
public class StatusBarRight extends javax.swing.JPanel {

    private Player player;
    /**
     * Creates new form StatusBar
     */
    public StatusBarRight() {
        initComponents();
    }
    
    public void setPlayer(Player player)
    {
        this.player = player;
        jl_PlayerName.setText(player.user.username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_PlayerName = new javax.swing.JLabel();
        jp_HealthBarMax = new javax.swing.JPanel();
        jp_HealthBar = new javax.swing.JPanel();
        jl_HealthBar = new javax.swing.JLabel();
        jp_SkillPointBarMax = new javax.swing.JPanel();
        jp_SkillPointBar = new javax.swing.JPanel();
        jl_SkillPointBar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(0, 0, 0));

        jl_PlayerName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_PlayerName.setForeground(new java.awt.Color(255, 255, 255));
        jl_PlayerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_PlayerName.setText("jLabel1");

        jp_HealthBar.setBackground(new java.awt.Color(153, 255, 153));

        jl_HealthBar.setBackground(new java.awt.Color(0, 0, 0));
        jl_HealthBar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_HealthBar.setForeground(new java.awt.Color(0, 0, 0));
        jl_HealthBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_HealthBar.setText("100");

        javax.swing.GroupLayout jp_HealthBarLayout = new javax.swing.GroupLayout(jp_HealthBar);
        jp_HealthBar.setLayout(jp_HealthBarLayout);
        jp_HealthBarLayout.setHorizontalGroup(
            jp_HealthBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_HealthBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_HealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_HealthBarLayout.setVerticalGroup(
            jp_HealthBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_HealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_HealthBarMaxLayout = new javax.swing.GroupLayout(jp_HealthBarMax);
        jp_HealthBarMax.setLayout(jp_HealthBarMaxLayout);
        jp_HealthBarMaxLayout.setHorizontalGroup(
            jp_HealthBarMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_HealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_HealthBarMaxLayout.setVerticalGroup(
            jp_HealthBarMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_HealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jp_SkillPointBar.setBackground(new java.awt.Color(204, 204, 255));

        jl_SkillPointBar.setBackground(new java.awt.Color(0, 0, 0));
        jl_SkillPointBar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_SkillPointBar.setForeground(new java.awt.Color(0, 0, 0));
        jl_SkillPointBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_SkillPointBar.setText("100");

        javax.swing.GroupLayout jp_SkillPointBarLayout = new javax.swing.GroupLayout(jp_SkillPointBar);
        jp_SkillPointBar.setLayout(jp_SkillPointBarLayout);
        jp_SkillPointBarLayout.setHorizontalGroup(
            jp_SkillPointBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_SkillPointBarLayout.createSequentialGroup()
                .addGap(0, 357, Short.MAX_VALUE)
                .addComponent(jl_SkillPointBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_SkillPointBarLayout.setVerticalGroup(
            jp_SkillPointBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_SkillPointBar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_SkillPointBarMaxLayout = new javax.swing.GroupLayout(jp_SkillPointBarMax);
        jp_SkillPointBarMax.setLayout(jp_SkillPointBarMaxLayout);
        jp_SkillPointBarMaxLayout.setHorizontalGroup(
            jp_SkillPointBarMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_SkillPointBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_SkillPointBarMaxLayout.setVerticalGroup(
            jp_SkillPointBarMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_SkillPointBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_SkillPointBarMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_HealthBarMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_PlayerName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jl_PlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_HealthBarMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jp_SkillPointBarMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_HealthBar;
    private javax.swing.JLabel jl_PlayerName;
    private javax.swing.JLabel jl_SkillPointBar;
    private javax.swing.JPanel jp_HealthBar;
    private javax.swing.JPanel jp_HealthBarMax;
    private javax.swing.JPanel jp_SkillPointBar;
    private javax.swing.JPanel jp_SkillPointBarMax;
    // End of variables declaration//GEN-END:variables
}