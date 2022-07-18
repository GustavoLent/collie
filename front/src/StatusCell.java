/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author JoséRobertoFernandes
 */
public class StatusCell extends javax.swing.JPanel {

        /**
         * Creates new form StatusCell
         */
        public StatusCell(StatusType type) {
                initComponents();
                status.setType(type);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */

        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                status = new TableStatus();

                setBackground(new java.awt.Color(255, 255, 255));

                status.setBackground(new java.awt.Color(255, 255, 255));
                status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                status.setText("tableStatus1");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(status,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(16, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(status,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                28, Short.MAX_VALUE)
                                                                .addContainerGap()));
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private TableStatus status;
        // End of variables declaration//GEN-END:variables
}