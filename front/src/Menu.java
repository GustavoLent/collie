/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author JoséRobertoFernandes
 */
public class Menu extends javax.swing.JPanel {

        private EventMenuSelected event;

        public void addEventMenuSelected(EventMenuSelected event) {
                this.event = event;
                menuList1.addEventMenuSelected(event);
        }

        /**
         * Creates new form Menu
         */
        public Menu() {
                initComponents();
                setOpaque(false);
                menuList1.setOpaque(false);
                init();
        }

        private void init() {
                menuList1.addItem(new MenuModel("dash", "Dashboard", MenuModel.MenuType.MENU));
                menuList1.addItem(new MenuModel("stock", "Cadastrar", MenuModel.MenuType.MENU));
                // menuList1.addItem(new MenuModel("", "Subtitulo",MenuModel.MenuType.TITLE));
                menuList1.addItem(new MenuModel("", "", MenuModel.MenuType.EMPTY));
                menuList1.addItem(new MenuModel("", "", MenuModel.MenuType.EMPTY));
                menuList1.addItem(new MenuModel("user", "Encerrar", MenuModel.MenuType.MENU));
                menuList1.addItem(new MenuModel("", "", MenuModel.MenuType.EMPTY));
        }

        @Override
        protected void paintChildren(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint grad;
                grad = new GradientPaint(0, 0, Color.decode("#F37335"), 0, getHeight(), Color.decode("#FDC830"));
                g2.setPaint(grad);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
                g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
                super.paintChildren(g); // Generated from
                                        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        private int x;
        private int y;

        public void initMoving(JFrame fram) {
                PanelMoving.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                                x = e.getX();
                                y = e.getY();
                        }

                });
                PanelMoving.addMouseMotionListener(new MouseMotionAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                                fram.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
                        }

                });
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */

        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                PanelMoving = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                menuList1 = new MenuList<>();

                PanelMoving.setOpaque(false);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/ico/logo.png"))); // NOI18N
                jLabel1.setText("   Collie");

                javax.swing.GroupLayout PanelMovingLayout = new javax.swing.GroupLayout(PanelMoving);
                PanelMoving.setLayout(PanelMovingLayout);
                PanelMovingLayout.setHorizontalGroup(
                                PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovingLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(28, Short.MAX_VALUE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                164,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)));
                PanelMovingLayout.setVerticalGroup(
                                PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovingLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                65,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PanelMoving, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(menuList1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(PanelMoving,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(menuList1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                631, Short.MAX_VALUE)
                                                                .addContainerGap()));
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel PanelMoving;
        private javax.swing.JLabel jLabel1;
        private MenuList<String> menuList1;
        // End of variables declaration//GEN-END:variables
}