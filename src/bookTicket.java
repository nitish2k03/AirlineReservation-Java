/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author mahaj
 */
import java.sql.*;
import java.util.ArrayList;
public class bookTicket extends javax.swing.JFrame {

    /**
     * Creates new form bookTicket
     */
    public bookTicket() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listModel1 = new javax.swing.DefaultListModel<>();
        jList1 = new javax.swing.JList<>();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listModel2 = new javax.swing.DefaultListModel<>();
        jList2 = new javax.swing.JList<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField17 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book Ticket");
        setBounds(new java.awt.Rectangle(0, 50, 413, 480));

        jTextField1.setText("Source");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jList1.setModel(listModel1);
        try{var s=database.myCon().createStatement();
            java.sql.ResultSet rs=s.executeQuery("Select * from cities");
            while(rs.next()){
                listModel1.addElement(rs.getString(1)+" - "+rs.getString(2));
                listModel2.addElement(rs.getString(1)+" - "+rs.getString(2));
            }}catch(Exception e){
                e.printStackTrace();
            }
            jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    jList1ValueChanged(evt);
                }
            });
            jScrollPane1.setViewportView(jList1);

            jTextField2.setText("Destination");
            jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTextField2MouseClicked(evt);
                }
            });
            jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    jTextField2KeyPressed(evt);
                }
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField2KeyReleased(evt);
                }
            });

            jList2.setModel(listModel2);
            //try{var s=database.myCon().createStatement();
                //java.sql.ResultSet rs=s.executeQuery("Select * from cities");
                //while(rs.next()){
                    //listModel2.addElement(rs.getString(1)+" - "+rs.getString(2));
                    //}}catch(Exception e){
                //e.printStackTrace();
                //}
            jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    jList2ValueChanged(evt);
                }
            });
            jScrollPane2.setViewportView(jList2);

            jDateChooser1.setDate(new java.util.Date());
            jDateChooser1.setMinSelectableDate(new java.util.Date());

            jLabel1.setText("Journey Date ");

            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Premium Economy", "Business" }));

            jLabel5.setText("Class");

            jLabel6.setText("Departure Time");

            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01:00 AM", "09:00 AM", "05:00 PM" }));

            jLabel7.setText("No of Passengers");

            jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
            jSpinner1.setName(""); // NOI18N
            jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    jSpinner1StateChanged(evt);
                }
            });

            jLabel2.setForeground(new java.awt.Color(255, 51, 51));
            jLabel2.setText("(max 5)*");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(57, 57, 57)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSpinner1)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(32, 32, 32))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(73, 73, 73))
            );

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel3.setText("<html><b>Enter Passenger Details : </b>");

            jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanel2.setLayout(new java.awt.GridLayout(6, 4, 20, 6));

            jLabel4.setText("Name");
            jPanel2.add(jLabel4);

            jLabel8.setText("Age");
            jPanel2.add(jLabel8);

            jLabel9.setText("Gender");
            jPanel2.add(jLabel9);

            jLabel10.setText("Passport No");
            jPanel2.add(jLabel10);

            jTextField3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField3ActionPerformed(evt);
                }
            });
            jPanel2.add(jTextField3);

            jTextField4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField4ActionPerformed(evt);
                }
            });
            jPanel2.add(jTextField4);

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
            jPanel2.add(jComboBox1);
            jPanel2.add(jTextField5);

            jTextField6.setVisible(false);
            jTextField6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField6ActionPerformed(evt);
                }
            });
            jPanel2.add(jTextField6);

            jTextField7.setVisible(false);
            jPanel2.add(jTextField7);

            jComboBox2.setVisible(false);
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
            jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox2ActionPerformed(evt);
                }
            });
            jPanel2.add(jComboBox2);

            jTextField8.setVisible(false);
            jTextField8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField8ActionPerformed(evt);
                }
            });
            jPanel2.add(jTextField8);

            jTextField9.setVisible(false);
            jPanel2.add(jTextField9);

            jTextField10.setVisible(false);
            jPanel2.add(jTextField10);

            jComboBox5.setVisible(false);
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
            jPanel2.add(jComboBox5);

            jTextField11.setVisible(false);
            jPanel2.add(jTextField11);

            jTextField12.setVisible(false);
            jPanel2.add(jTextField12);

            jTextField13.setVisible(false);
            jTextField13.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField13ActionPerformed(evt);
                }
            });
            jPanel2.add(jTextField13);

            jComboBox6.setVisible(false);
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
            jPanel2.add(jComboBox6);

            jTextField14.setVisible(false);
            jPanel2.add(jTextField14);

            jTextField15.setVisible(false);
            jPanel2.add(jTextField15);

            jTextField16.setVisible(false);
            jPanel2.add(jTextField16);

            jComboBox7.setVisible(false);
            jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
            jPanel2.add(jComboBox7);

            jTextField17.setVisible(false);
            jPanel2.add(jTextField17);

            jButton2.setText("Book Ticket");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setText("Clear");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton3))
                            .addGap(121, 121, 121))))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        listModel1.clear();
        try{var s=database.myCon().createStatement();
        java.sql.ResultSet rs=s.executeQuery("Select * from cities where city like '%"+jTextField1.getText()+"%'");  
        while(rs.next()){
        listModel1.addElement(rs.getString(1)+" - "+rs.getString(2));
        }}catch(Exception e){
        e.printStackTrace();
        }
       
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Source")){
            jTextField1.setText("");
        }
        
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        jTextField1.setText(jList1.getSelectedValue());
    }//GEN-LAST:event_jList1ValueChanged

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
        jTextField2.setText(jList2.getSelectedValue());
    }//GEN-LAST:event_jList2ValueChanged

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        if(jTextField2.getText().equals("Destination")){
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        listModel2.clear();
        try{var s=database.myCon().createStatement();
        java.sql.ResultSet rs=s.executeQuery("Select * from cities where city like '%"+jTextField2.getText()+"%'");  
        while(rs.next()){
        listModel2.addElement(rs.getString(1)+" - "+rs.getString(2));
        }}catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed
    private boolean checkAge(int n){
               if(n<1||n>110){
                   return false;
               }
               return true;
        }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int total=0;
        String totalPassengers=String.valueOf(jSpinner1.getValue());
        String selectedClass,src=jTextField1.getText(),dest=jTextField2.getText(),fcode="";
        String[] options=new String[]{"Pay","Cancel"};
        if(jList1.isSelectionEmpty()||jList2.isSelectionEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "Please Select Source and Destination", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(jList1.getSelectedIndex()==jList2.getSelectedIndex()){
            javax.swing.JOptionPane.showMessageDialog(null, "Source and Destination cant be same", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill out all the Passenger Details", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for (javax.swing.JTextField textField : textFields) {
        if (textField.isVisible() && textField.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please fill out all the Passenger Details", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        }
        
        if(!checkAge(Integer.parseInt(jTextField4.getText()))){
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter Age correctly between 1 and 110", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(textFields.size()>0){
            for(int i=1;i<textFields.size();i++){
                if(textFields.get(i).isVisible()){
                    if(!checkAge(Integer.parseInt(textFields.get(i).getText()))){
                        javax.swing.JOptionPane.showMessageDialog(null, "Please enter Age correctly between 1 and 110", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    }
                i+=2;
            }
        }
        if(jComboBox3.getSelectedIndex()==0){
            selectedClass="EconomyPrice";
        }else if(jComboBox3.getSelectedIndex()==1){
            selectedClass="PremEcoPrice";
        }
        else{
            selectedClass="BusinessPrice";
        }
        ResultSet rs;
        Statement s=null ;        
        try{
        s=database.myCon().createStatement();
        rs=s.executeQuery("select fcode,"+selectedClass+" from flights where Src like '"+ src.substring(src.length()-3, src.length())+"' and Dest like '"+ dest.substring(dest.length()-3, dest.length())+"'");
        while(rs.next()){
            fcode=rs.getString(1);
            total=Integer.valueOf(rs.getString(2))*Integer.valueOf(totalPassengers);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        int result = javax.swing.JOptionPane.showOptionDialog(null, "<html>Your total is : <b>"+total+"</b><br>(incl of GST)<br><b>Proceed to Pay ?</b>", "Payment Portal", 0, 1, null, options, options[0]);
        int newPNR=0;
        java.text.SimpleDateFormat df=new java.text.SimpleDateFormat("dd-MMM-yy");
        if(result==0){
            try{
            rs=s.executeQuery("select max(PNR) from tickets");
            while(rs.next()){
                newPNR=rs.getInt(1)+1;
            }}
            catch(Exception e){
                    e.printStackTrace();
        }}
        else{
            return;
        }
        try{
            s.executeUpdate("insert into passengerInfo values("+newPNR+",'"+jTextField3.getText()+"',"+Integer.parseInt(jTextField4.getText())+",'"+String.valueOf(jComboBox1.getSelectedItem())+"','"+jTextField5.getText()+"')");
            
        }catch(Exception e){
               javax.swing.JOptionPane.showMessageDialog(null, "Please enter all the Passenger Details Correctly !", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
        
        int todo=((int)jSpinner1.getValue()-1)*3;
        if(todo>0){
        int j=0;
        for(int i=0;i<todo;i++){
        try{
            s.executeUpdate("insert into passengerInfo values("+newPNR+",'"+textFields.get(i++).getText()+"',"+Integer.parseInt(textFields.get(i++).getText())+",'"+String.valueOf(genderBox.get(j++).getSelectedItem())+"','"+textFields.get(i).getText()+"')");          
        }catch(Exception e){
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter all the Passenger Details Correctly !", "Error !", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        }}
        try{s.executeUpdate("insert into tickets values("+newPNR+",'"+fcode+"','"+jComboBox3.getSelectedItem()+"',"+total+",'"+df.format(new java.util.Date())+"','"+df.format(jDateChooser1.getDate())+"','"+jComboBox4.getSelectedItem()+"',"+Integer.valueOf(totalPassengers)+")");
            }catch(Exception e){
                e.printStackTrace();
            }
        javax.swing.JOptionPane.showMessageDialog(null, "Ticket Booked Successfully", "Success !", javax.swing.JOptionPane.PLAIN_MESSAGE);
        this.dispose();
        new viewTicket(newPNR).setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new bookTicket().setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
    ArrayList<javax.swing.JTextField> textFields=new ArrayList<>();
    ArrayList<javax.swing.JComboBox> genderBox=new ArrayList<>();
    private void decrPassengerFields(){
        for(int i=0;i<textFields.size();i++){
            textFields.get(i).setVisible(false);
        }
        for(int i=0;i<genderBox.size();i++){
            genderBox.get(i).setVisible(false);
        }
        incrPassengerFields();
    }
     
    private void incrPassengerFields(){
        textFields.add(jTextField6);
        textFields.add(jTextField7);
        textFields.add(jTextField8);
        textFields.add(jTextField9);
        textFields.add(jTextField10);
        textFields.add(jTextField11);
        textFields.add(jTextField12);
        textFields.add(jTextField13);
        textFields.add(jTextField14);
        textFields.add(jTextField15);
        textFields.add(jTextField16);
        textFields.add(jTextField17);
        genderBox.add(jComboBox2);
        genderBox.add(jComboBox5);
        genderBox.add(jComboBox6);
        genderBox.add(jComboBox7);
        int genderTodo=(int)jSpinner1.getValue()-1;
        int todo=((int)jSpinner1.getValue()-1)*3;
        for(int i=0;i<todo;i++){
            textFields.get(i).setVisible(true);
        }
        for(int i=0;i<genderTodo;i++){
            genderBox.get(i).setVisible(true);
        }        
    }
    Object previousValue;
    boolean isFirst=true;
    
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
         Object currentValue = jSpinner1.getValue();
        if(isFirst){
            isFirst=false;
            previousValue=1;
        }
        if (currentValue instanceof Comparable && previousValue instanceof Comparable) {
                    int compareResult = ((Comparable)currentValue).compareTo((Comparable)previousValue);

                    if (compareResult > 0) {
                        incrPassengerFields();
                    } else if (compareResult < 0) {
                        decrPassengerFields();
                    }
                }
                previousValue = currentValue;
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

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
            java.util.logging.Logger.getLogger(bookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookTicket().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.DefaultListModel<String> listModel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.DefaultListModel<String> listModel2;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
