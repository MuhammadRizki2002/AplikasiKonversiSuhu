
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus0
 */
public class suhu extends javax.swing.JFrame {

    /**
     * Creates new form suhu
     */
    public suhu() {
        initComponents();
        scaleComboBox.addItem("Celsius");
        scaleComboBox.addItem("Fahrenheit");
        scaleComboBox.addItem("Kelvin");
        scaleComboBox.addItem("Reamur");
         toCelsiusButton.addItemListener(e -> updateConversionResult());
         toFahrenheitButton.addItemListener(e -> updateConversionResult());
         toKelvinButton.addItemListener(e -> updateConversionResult());
         toReamurButton.addItemListener(e -> updateConversionResult());

    }
    
    private void updateConversionResult() {
    try {
        double temperature = Double.parseDouble(inputField.getText());
        String scale = (String) scaleComboBox.getSelectedItem();
        double result = 0;

        if (toCelsiusButton.isSelected()) {
            if (scale.equals("Fahrenheit")) {
                result = (temperature - 32) * 5 / 9;
            } else if (scale.equals("Kelvin")) {
                result = temperature - 273.15;
            } else if (scale.equals("Reamur")) {
                result = temperature * 5 / 4;
            }
        } else if (toFahrenheitButton.isSelected()) {
            if (scale.equals("Celsius")) {
                result = (temperature * 9 / 5) + 32;
            } else if (scale.equals("Kelvin")) {
                result = (temperature - 273.15) * 9 / 5 + 32;
            } else if (scale.equals("Reamur")) {
                result = (temperature * 9 / 4) + 32;
            }
        } else if (toKelvinButton.isSelected()) {
            if (scale.equals("Celsius")) {
                result = temperature + 273.15;
            } else if (scale.equals("Fahrenheit")) {
                result = (temperature - 32) * 5 / 9 + 273.15;
            } else if (scale.equals("Reamur")) {
                result = temperature * 5 / 4 + 273.15;
            }
        } else if (toReamurButton.isSelected()) {
            if (scale.equals("Celsius")) {
                result = temperature * 4 / 5;
            } else if (scale.equals("Fahrenheit")) {
                result = (temperature - 32) * 4 / 9;
            } else if (scale.equals("Kelvin")) {
                result = (temperature - 273.15) * 4 / 5;
            }
        }

        resultLabel.setText("Hasil: " + result);
    } catch (NumberFormatException ex) {
        resultLabel.setText("Masukkan nilai suhu yang valid.");
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        toKelvinButton = new javax.swing.JRadioButton();
        toFahrenheitButton = new javax.swing.JRadioButton();
        toReamurButton = new javax.swing.JRadioButton();
        resultLabel = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        scaleComboBox = new javax.swing.JComboBox<>();
        toCelsiusButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Suhu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N

        buttonGroup1.add(toKelvinButton);
        toKelvinButton.setText("Kelvin");

        buttonGroup1.add(toFahrenheitButton);
        toFahrenheitButton.setSelected(true);
        toFahrenheitButton.setText("Farenhet");
        toFahrenheitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFahrenheitButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(toReamurButton);
        toReamurButton.setText("Reamur");

        resultLabel.setText("Hasil");

        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Hasil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        scaleComboBox.setEditable(true);
        scaleComboBox.setForeground(java.awt.SystemColor.activeCaption);
        scaleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Temperatur" }));

        buttonGroup1.add(toCelsiusButton);
        toCelsiusButton.setText("Celcius");
        toCelsiusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCelsiusButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Suhu");

        jLabel2.setText("Pilih suhu");

        jLabel3.setText("Konversi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(resultLabel))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(toCelsiusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toFahrenheitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toKelvinButton))
                    .addComponent(scaleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toReamurButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scaleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toCelsiusButton)
                    .addComponent(jLabel3)
                    .addComponent(toFahrenheitButton)
                    .addComponent(toKelvinButton)
                    .addComponent(toReamurButton))
                .addGap(18, 18, 18)
                .addComponent(resultLabel)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toFahrenheitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFahrenheitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toFahrenheitButtonActionPerformed

    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateConversionResult();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void toCelsiusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCelsiusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toCelsiusButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField inputField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JComboBox<String> scaleComboBox;
    private javax.swing.JRadioButton toCelsiusButton;
    private javax.swing.JRadioButton toFahrenheitButton;
    private javax.swing.JRadioButton toKelvinButton;
    private javax.swing.JRadioButton toReamurButton;
    // End of variables declaration//GEN-END:variables
}