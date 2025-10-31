package pkg2024_exambrief_q2;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class TechnicianForm extends javax.swing.JFrame {

    public TechnicianForm()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBox_Location = new javax.swing.JComboBox<>();
        TextField_TechnicianName = new javax.swing.JTextField();
        TextField_RepairCost = new javax.swing.JTextField();
        TextField_TechnicianRate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItem_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItem_ProcessReport = new javax.swing.JMenuItem();
        jMenuItem_Clear = new javax.swing.JMenuItem();
        MenuItem_Save = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBox_Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("TECHNICIAN LOCOATION:");

        jLabel2.setText("TECHNICIAN NAME:");

        jLabel3.setText("REPAIR COST:");

        jLabel4.setText("TECHNICIAN RATE:");

        jLabel5.setText("TECHNICIAN LOCOATION:");

        jMenu1.setText("File");

        MenuItem_Exit.setText("Exit");
        jMenu1.add(MenuItem_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        MenuItem_ProcessReport.setText("Process Report");
        MenuItem_ProcessReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ProcessReportActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_ProcessReport);

        jMenuItem_Clear.setText("Clear");
        jMenuItem_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ClearActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Clear);

        MenuItem_Save.setText("Save Report");
        MenuItem_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_SaveActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_Save);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ComboBox_Location, 0, 116, Short.MAX_VALUE)
                    .addComponent(TextField_TechnicianName)
                    .addComponent(TextField_RepairCost)
                    .addComponent(TextField_TechnicianRate))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_TechnicianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_RepairCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_TechnicianRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_ProcessReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ProcessReportActionPerformed
    
        //Get the actual user input to pass the classes and methods
        String location = ComboBox_Location.getSelectedItem().toString();
     
        String name = TextField_TechnicianName.getText();

        String cost = TextField_RepairCost.getText();

        String rate = TextField_TechnicianRate.getText();
        
        String output = "";
        
        //Create the object of Data class to test the user input validation
        Data data = new Data (location, name, Double.parseDouble(cost), Double.parseDouble(rate));
        
        //To access the 2 methods to calcualte the totals and validations we need to make instance of the class
        Technician tech = new Technician();
        
        //ValidateData method takes in an object holding values of Technition data
        if(tech.ValidateData(data) == true)//if the method returns a true that means the data is valid and we can then calculate the total pay
        {
           //We can only calculate the total pay if the data is valid
           double pay = tech.CalculatePay(cost, rate);
           
            output = "Technician Report\n"
            + "--------------------\n"
            + "Location: " + data.Technician_Location + "\n"
            + "Name: " + data.Technician_Name + "\n"
            + "Repair Cost: R" + data.Repair_Cost + "\n"
            + "Rate: " + data.Technician_Rate + "\n"
            + "Calculated Pay: R" + String.format("%.2f", pay);
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid input! Check your entries.");
            return; //Ends the programs here does not proceed to write wrong data to the text area or text file
        }

        //Set the text area with the report
        jTextArea1.setText(output);
     
    }//GEN-LAST:event_MenuItem_ProcessReportActionPerformed

    private void MenuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_SaveActionPerformed
        
        try
        {
        //Copy pasted from above 
        String location = ComboBox_Location.getSelectedItem().toString();
     
        String name = TextField_TechnicianName.getText();

        String cost = TextField_RepairCost.getText();

        String rate = TextField_TechnicianRate.getText();
        
        String output = "";
        
        //Create the actual object of MovideTicketData class that holds actual values
        Data data = new Data (location, name, Double.parseDouble(cost), Double.parseDouble(rate));
        
        //To access the 2 methods to calcualte the totals and validations we need to make instance of the class
        Technician tech = new Technician();
        
        //ValidateData method takes in an object holding values of Movie Tickets
        if(tech.ValidateData(data) == true)//if the method returns a true that means the data is valid and we can then calculate the total price
        {
           //We can only calculate the total price if the data is valid
           double pay = tech.CalculatePay(cost, rate);
           
            output = "Technician Report\n"
            + "--------------------\n"
            + "Location: " + data.Technician_Location + "\n"
            + "Name: " + data.Technician_Name + "\n"
            + "Repair Cost: R" + data.Repair_Cost + "\n"
            + "Rate: " + data.Technician_Rate + "\n"
            + "Calculated Pay: R" + String.format("%.2f", pay);
        }
        
       //Write the same output report to the text file
        FileWriter writer = new FileWriter("report.txt", true);
        
        writer.write("TECHNICIAN REPORT \n"
                + "*********************************** \n"
                + output + "\n"
                + "**********************************\n");
        writer.close();//Very important
        
        JOptionPane.showMessageDialog(this, "Record saved successfully!");
        }
        catch(IOException e)
        {
           JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage());
        }
    }//GEN-LAST:event_MenuItem_SaveActionPerformed

    private void jMenuItem_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ClearActionPerformed
        TextField_TechnicianName.setText("");
        TextField_RepairCost.setText("");
        TextField_TechnicianRate.setText("");
    }//GEN-LAST:event_jMenuItem_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnicianForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Location;
    private javax.swing.JMenuItem MenuItem_Exit;
    private javax.swing.JMenuItem MenuItem_ProcessReport;
    private javax.swing.JMenuItem MenuItem_Save;
    private javax.swing.JTextField TextField_RepairCost;
    private javax.swing.JTextField TextField_TechnicianName;
    private javax.swing.JTextField TextField_TechnicianRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Clear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
