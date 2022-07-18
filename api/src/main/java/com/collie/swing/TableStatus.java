/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collie.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author JoséRobertoFernandes
 */
public class TableStatus extends JLabel{
    
    public TableStatus(){
        setForeground(Color.WHITE);
    }
    
    private StatusType type;

    public StatusType getType() {
        return type;
    }
    
    public void setType(StatusType type){
        this.type = type;
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (type != null){
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint grad;
            if(type == StatusType.CONCLUIDO){
                grad = new GradientPaint(0, 0, Color.decode("#43cea2"), 0, getHeight(), Color.decode("#185a9d"));
            } else {
                grad = new GradientPaint(0, 0, Color.decode("#EE0979"), 0, getHeight(), Color.decode("#FF6A00"));
            }
            g2.setPaint(grad);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
            //g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        }
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
