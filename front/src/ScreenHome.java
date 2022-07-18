/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author JoséRobertoFernandes
 */
public class ScreenHome extends javax.swing.JPanel {

        /**
         * Creates new form ScreenHome
         */
        public ScreenHome() {
                initComponents();
                // CARDS
                card1.setData(new CardModel(new ImageIcon(getClass().getResource("resources/ico/user.png")), "Total",
                                "10",
                                "Lorem ipsum dolor sit amet"));
                card2.setData(new CardModel(new ImageIcon(getClass().getResource("resources/ico/profit.png")), "Gato",
                                "20",
                                "Lorem ipsum dolor sit amet"));
                card3.setData(new CardModel(new ImageIcon(getClass().getResource("resources/ico/flag.png")), "Cachorro",
                                "30",
                                "Lorem ipsum dolor sit amet"));
                // TABELA
                jScrollPane1.getViewport().setBackground(Color.white);
                JPanel p = new JPanel();
                p.setBackground(Color.white);
                jScrollPane1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
                // ID NOME TELEFONE VALOR SERVICO STATUS
                table1.addRow(new Object[] { "1", "Jose", "19912345678", "90", "Banho", StatusType.PENDENTE });
                table1.addRow(new Object[] { "1", "Jose", "19912345678", "120", "Tosa", StatusType.CONCLUIDO });
                table1.addRow(new Object[] { "1", "Jose", "19912345678", "90", "Banho", StatusType.PENDENTE });
                /*
                 * table1.addRow(new Object[]{"1", "Jose", "19912345678","120", "Tosa",
                 * StatusType.CONCLUIDO});
                 * table1.addRow(new Object[]{"1", "Jose", "19912345678","90", "Banho",
                 * StatusType.PENDENTE});;
                 */

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */

        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                cardgrid = new javax.swing.JLayeredPane();
                card1 = new Card();
                card2 = new Card();
                card3 = new Card();
                panelBorder1 = new PanelBorder();
                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                table1 = new Table();

                setBackground(new java.awt.Color(255, 255, 255));
                setPreferredSize(new java.awt.Dimension(1016, 531));

                cardgrid.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
                cardgrid.add(card1);
                cardgrid.add(card2);
                cardgrid.add(card3);

                panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

                jLabel1.setText("Agendamentos");

                jScrollPane1.setBorder(null);

                table1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "ID", "Nome", "Telefone", "Valor", "Serviço", "Status"
                                }) {
                        boolean[] canEdit = new boolean[] {
                                        false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                jScrollPane1.setViewportView(table1);

                javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
                panelBorder1.setLayout(panelBorder1Layout);
                panelBorder1Layout.setHorizontalGroup(
                                panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(panelBorder1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                974,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                panelBorder1Layout.setVerticalGroup(
                                panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1)
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(panelBorder1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(cardgrid))
                                                                .addContainerGap(15, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(cardgrid,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(panelBorder1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private Card card1;
        private Card card2;
        private Card card3;
        private javax.swing.JLayeredPane cardgrid;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private PanelBorder panelBorder1;
        private Table table1;
        // End of variables declaration//GEN-END:variables
}
