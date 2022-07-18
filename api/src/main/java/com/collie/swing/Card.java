/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.collie.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author JoséRobertoFernandes
 */
public class Card extends javax.swing.JPanel {
    
    /**
     * Creates new form Card
     */
    public Card() {
        initComponents();
        setOpaque(false);
    }

    public void setData(CardModel data){
        cardicon.setIcon(data.getIcon());
        cardtitle.setText(data.getTitle());
        cardvalue.setText(data.getValue());
        carddescription.setText(data.getDescription());
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grad;
        grad = new GradientPaint(0, 0, Color.decode("#F2994A"), 0, getHeight(), Color.decode("#F2C94C"));
        g2.setPaint(grad);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        g2.setColor(new Color(255, 255, 255, 30));
        g2.fillOval(getWidth() - (getHeight() / 2), 0, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) -30, getHeight() / 2 + 20, getHeight(), getHeight());

        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardicon = new javax.swing.JLabel();
        cardtitle = new javax.swing.JLabel();
        cardvalue = new javax.swing.JLabel();
        carddescription = new javax.swing.JLabel();

        cardicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/logo.png"))); // NOI18N

        cardtitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardtitle.setForeground(new java.awt.Color(255, 255, 255));
        cardtitle.setText("jLabel2");

        cardvalue.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cardvalue.setForeground(new java.awt.Color(255, 255, 255));
        cardvalue.setText("jLabel3");

        carddescription.setForeground(new java.awt.Color(255, 255, 255));
        carddescription.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carddescription, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardicon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 74, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(cardvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cardicon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(carddescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carddescription;
    private javax.swing.JLabel cardicon;
    private javax.swing.JLabel cardtitle;
    private javax.swing.JLabel cardvalue;
    // End of variables declaration//GEN-END:variables
}
