/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JavaCredit.java
 *
 * Created on 08 24, 11, 2:48:36 PM
 */

package crisostomojavacreditphase3;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author arscariosus
 */
public class JavaCredit extends javax.swing.JFrame {
    Client cl = new Client();
    TravelCredit tc = new TravelCredit();

    /** Creates new form JavaCredit */
    public JavaCredit() {
        super("Java Credit Phase 3 - Crisostomo, John Dominic S., W23");
        initComponents();
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBday = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnBalance = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(146, 249, 230));
        jPanel1.setForeground(new java.awt.Color(242, 241, 237));

        jLabel2.setText("Address : ");

        jLabel1.setText("Name : ");

        btnSubmit.setBackground(new java.awt.Color(102, 224, 125));
        btnSubmit.setForeground(new java.awt.Color(244, 243, 238));
        btnSubmit.setText("Create Account!");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel3.setText("Birthday : ");

        jLabel5.setText("Annual Salary :");

        jLabel4.setText("Contact : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtBday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        btnBalance.setBackground(new java.awt.Color(51, 213, 55));
        btnBalance.setForeground(new java.awt.Color(254, 252, 247));
        btnBalance.setText("Check Balance");
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });

        btnPurchase.setBackground(new java.awt.Color(51, 213, 55));
        btnPurchase.setForeground(new java.awt.Color(254, 252, 247));
        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        btnPay.setBackground(new java.awt.Color(51, 213, 55));
        btnPay.setForeground(new java.awt.Color(254, 252, 247));
        btnPay.setText("Pay Balance");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(51, 213, 55));
        btnProfile.setForeground(new java.awt.Color(254, 252, 247));
        btnProfile.setText("View Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(51, 213, 55));
        btnClose.setForeground(new java.awt.Color(254, 252, 247));
        btnClose.setText("Close Account");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(236, 83, 49));
        btnExit.setForeground(new java.awt.Color(254, 252, 247));
        btnExit.setText("Quit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        cl.setTc(tc);
        if(cl.getTc().getCreditAcctNo() ==0) {
        try {
            if(!txtName.getText().equals("") && !txtAddress.getText().equals("") && !txtBday.getText().equals("")) {
                cl.setName(txtName.getText());
                cl.setAddress(txtAddress.getText());
                cl.setBday(txtBday.getText());
            
                cl.setContact(Integer.parseInt(txtContact.getText()));

                if(Integer.parseInt(txtSalary.getText())< 300000 && Integer.parseInt(txtSalary.getText()) >= 200000)
                    cl.getTc().setCreditLimit(30000);
                else if(Integer.parseInt(txtSalary.getText()) >= 300000 && Integer.parseInt(txtSalary.getText()) <= 500000)
                    cl.getTc().setCreditLimit(50000);
                else if(Integer.parseInt(txtSalary.getText()) > 500000)
                    cl.getTc().setCreditLimit(100000);
                else {
                    JOptionPane.showMessageDialog(this, "Income is too low!", "Failed!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Fields cannot be blank", "Exception Caught!", JOptionPane.ERROR_MESSAGE);
            }
            if(cl.getTc().getCreditLimit() != 0) {
                cl.getTc().setCreditAcctNo((int) (Math.random() * 9999) + 1000);
                JOptionPane.showMessageDialog(this, "Congratulations, your account has been created!\nYour account number is " +
                        cl.getTc().getCreditAcctNo() + "\nCredit Limit : " + cl.getTc().getCreditLimit(), "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NullPointerException e) {
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "NumberFormatException caught!" + e.getMessage(), "Exception Caught!", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(this, "You already have an account!", "Error", JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        if(tc.getCreditAcctNo() != 0) {
            String acctNum = JOptionPane.showInputDialog(this, "Enter account number : ");
            if(cl.getTc().validateCreditAccount(Integer.parseInt(acctNum))) {
                JOptionPane.showMessageDialog(this, cl.getTc().creditInquiry(), "Account Balance", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid or Incorrect Account Number.", "Error!", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "You have to create an acccount first!", "Reminder", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        if(tc.getCreditAcctNo() != 0) {
            String acctNum = JOptionPane.showInputDialog(this, "Enter account number : ");
            if(cl.getTc().validateCreditAccount(Integer.parseInt(acctNum))) {
                String amt = JOptionPane.showInputDialog(this, "Please enter the amount : ");
                if(cl.getTc().purchase(Double.parseDouble(amt))) {
                    JOptionPane.showMessageDialog(this, "You have sucessfully purchased the item!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }  else {
                    JOptionPane.showMessageDialog(this, "You have reached your credit limit or have entered an invalid amount.", "Error!", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Invalid or Incorrect Account Number.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to create an acccount first!", "Reminder", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if(tc.getCreditAcctNo() != 0) {
            String acctNum = JOptionPane.showInputDialog(this, "Enter account number : ");
            if(cl.getTc().validateCreditAccount(Integer.parseInt(acctNum))) {
                String amt = JOptionPane.showInputDialog(this, "Please enter the amount : ");
                if(cl.getTc().payBalance(Double.parseDouble(amt))) {
                    JOptionPane.showMessageDialog(this, "You have sucessfully paid " + amt, "Success", JOptionPane.INFORMATION_MESSAGE);
                }  else {
                    JOptionPane.showMessageDialog(this, "You have reached your credit limit or have entered an invalid amount.", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid or Incorrect Account Number.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to create an acccount first!", "Reminder", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        if(tc.getCreditAcctNo() != 0) {
            String acctNum = JOptionPane.showInputDialog(this, "Enter account number : ");
            if(cl.getTc().validateCreditAccount(Integer.parseInt(acctNum))) {
                JOptionPane.showMessageDialog(this, cl, "Account Profile", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid or Incorrect Account Number.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to create an acccount first!", "Reminder", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if(tc.getCreditAcctNo() != 0) {
            String acctNum = JOptionPane.showInputDialog(this, "Enter account number : ");
            if(cl.getTc().validateCreditAccount(Integer.parseInt(acctNum))) {
                cl.getTc().setCreditAcctNo(0);
                cl.getTc().setCreditBalance(0);
                cl.getTc().setCreditLimit(0);
                JOptionPane.showMessageDialog(this, "You have successfully closed your account.", "Reminder", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid or Incorrect Account Number.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to create an acccount first!", "Reminder", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showMessageDialog(this, "Goodbye!", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed



    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JavaCredit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBday;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

}
