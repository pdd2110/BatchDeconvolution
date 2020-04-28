/*
 * Copyright (C) 2020 Mechanobiology Lab UJ
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tools;


/**
 *
 * @author Zbigniew Baster
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Info2
     */
    public Info() {
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

        jButton_Close = new javax.swing.JButton();
        jScrollPane_Info = new javax.swing.JScrollPane();
        jTextArea_Info = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BatchDeconvolution - Info");

        jButton_Close.setText("Close");
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });

        jScrollPane_Info.setEnabled(false);

        jTextArea_Info.setEditable(false);
        jTextArea_Info.setColumns(20);
        jTextArea_Info.setLineWrap(true);
        jTextArea_Info.setRows(5);
        jTextArea_Info.setText("BatchDeconvolution 1.00\n\nAuthor: Zbigniew Baster\n\nCopyright (C) 2020 Mechanobiology Lab UJ\n \nThis program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.\n \nThis program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.\n \nYou should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.\n\nGithub repository @\nhttps://github.com/Mechanobiology-Lab/BatchDeconvolution/\n\nPublished as:\nZ. Baster, Z. Rajfur, BatchDeconvolution: A Fiji Plugin for Icreasing Deconvolution Workflow\nPrep. (2020)");
        jTextArea_Info.setWrapStyleWord(true);
        jScrollPane_Info.setViewportView(jTextArea_Info);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(jButton_Close)
                .addContainerGap())
            .addComponent(jScrollPane_Info)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane_Info, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Close)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CloseActionPerformed

    /**
     * @param args the command line arguments
     */
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
    public static void run() {
        new Info().setVisible(true);
    }
       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton_Close;
    private static javax.swing.JScrollPane jScrollPane_Info;
    private static javax.swing.JTextArea jTextArea_Info;
    // End of variables declaration//GEN-END:variables
}
