
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author randi
 */
public class Ambasewana extends javax.swing.JFrame {

    
    /**
     * Creates new form Ambasewana
     */
    public Ambasewana() {
        initComponents();
         SwingUtilities.invokeLater(() -> {
            setupTabSwitcher();
            // Set initial focus on the 3rd column of jTable8
            int columnIndex = 2; // Assuming the 3rd column index is 2
            jTable8.requestFocusInWindow();
            jTable8.changeSelection(0, columnIndex, false, false);
           
        });
    }
  
   private void setupTabSwitcher() {
        jtxtDisplay.setFocusTraversalKeysEnabled(false);
        jTable8.setFocusTraversalKeysEnabled(false);

        // Create a custom Action for handling Tab key
         // Create a custom Action for handling Tab key
    Action tabAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the currently selected tab index
            int tabIndex = jTabbedPane1.getSelectedIndex();

            // Handle tab switching based on the selected tab
            switch (tabIndex) {
                case 0: // First tab
                    handleTabSwitching(jTable8, 2, jtxtDisplay);
                    break;
                case 1: // Second tab
                    handleTabSwitching(jTable9, 2, jtxtDisplay);
                    break;
                case 2: // Third tab
                    handleTabSwitching(jTable10, 2, jtxtDisplay);
                    break;
                // Add more cases if you have additional tabs
            }
        }
    };

        // Bind the custom Action to the Tab key for jtxtDisplay
    jtxtDisplay.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "tabAction");
    jtxtDisplay.getActionMap().put("tabAction", tabAction);

    // Bind the custom Action to the Tab key for each JTable
    jTable8.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "tabAction");
    jTable8.getActionMap().put("tabAction", tabAction);

    jTable9.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "tabAction");
    jTable9.getActionMap().put("tabAction", tabAction);

    jTable10.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "tabAction");
    jTable10.getActionMap().put("tabAction", tabAction);


        jtxtDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the Enter key press in jtxtDisplay if needed
            }
        });
    }
   
   
   // Helper method to handle tab switching logic
private void handleTabSwitching(JTable currentTable, int columnIndex, JTextField nextField) {
    // If the current table has focus, move to the next field
    if (currentTable.isFocusOwner()) {
        nextField.requestFocusInWindow();
    } else {
        // If the next field has focus or neither component has focus, move to the current table's specified column
        currentTable.requestFocusInWindow();
        currentTable.changeSelection(currentTable.getSelectedRow(), columnIndex, false, false);
    }
}
   
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtn9 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTax = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtChange = new javax.swing.JTextField();
        jtxtDisplay = new javax.swing.JTextField();
        jcboPayment = new javax.swing.JComboBox<>();
        jtxtBarCode = new javax.swing.JTextField();
        jbtnItemClear = new javax.swing.JButton();
        jbtnAdditems = new javax.swing.JButton();
        jbtnRemoveItems = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 80, 100));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, 100));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 100));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 100));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, 100));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 100));

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 80, 100));

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 100));

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 100));

        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 80, 100));

        jbtnClear.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnClear.setText("C");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, 100));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 450));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 260, 370));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Total");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Sub Total");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Tax");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 250, -1));

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, -1));

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 150));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, -1));

        jbtnPay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPay.setText("Pay");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, 390, -1));

        jbtnRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRemove.setText("Remove");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 420, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Change");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Cash");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Payment Method");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jtxtChange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(jtxtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 230, -1));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 230, -1));

        jcboPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Visa Card", "Master Card" }));
        jPanel4.add(jcboPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 230, -1));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 460, 150));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1350, 170));

        jtxtBarCode.setFont(new java.awt.Font("C39HrP24DhTt", 0, 36)); // NOI18N
        jtxtBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBarCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 260, 80));

        jbtnItemClear.setText("Clear");
        jbtnItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnItemClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnItemClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 220, 90, 30));

        jbtnAdditems.setMnemonic('+');
        jbtnAdditems.setText("Add");
        jbtnAdditems.setActionCommand("Add");
        jbtnAdditems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdditemsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAdditems, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 140, 90, 30));

        jbtnRemoveItems.setMnemonic('-');
        jbtnRemoveItems.setText("Remove");
        jbtnRemoveItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveItemsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRemoveItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 180, 90, 30));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rice & Curry", "250.00", null},
                {"Chicken", "180.00", null},
                {"Pork", "250.00", null},
                {null, null, null}
            },
            new String [] {
                "Item", "Unit Price(Rs)", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));

        jTabbedPane1.addTab("Breakfast", jPanel1);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rice & Curry", "250.00", null},
                {"Chicken", "180.00", null},
                {"Pork", "250.00", null},
                {null, null, null}
            },
            new String [] {
                "Item", "Unit Price(Rs)", "Quantity"
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        jPanel7.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));

        jTabbedPane1.addTab("Lunch", jPanel7);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rice & Curry", "250.00", null},
                {"Chicken", "180.00", null},
                {"Pork", "250.00", null},
                {null, null, null}
            },
            new String [] {
                "Item", "Unit Price(Rs)", "Quantity"
            }
        ));
        jScrollPane10.setViewportView(jTable10);

        jPanel9.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));

        jTabbedPane1.addTab("Dinner", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 790, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void ItemCost(){
        double sum=0;
        for(int i =0;i<jTable1.getRowCount();i++){
            sum = sum + Double.parseDouble(jTable1.getValueAt(i,2).toString()) ;
            
        }
        jtxtSubTotal.setText(Double.toString(sum));
        double cTotal1 = Double.parseDouble(jtxtSubTotal.getText());
        
        double cTax = (cTotal1*3.9)/100;
        String iTaxTotal = String.format("Rs %.2f", cTax);
        jtxtTax.setText(iTaxTotal);
        
        String iSubTotal = String.format("Rs %.2f", cTotal1);
        jtxtSubTotal.setText(iSubTotal);
        
        String iTotal = String.format("Rs %.2f", cTotal1+ cTax);
        jtxtTotal.setText(iTotal);
        
         String BarCode = String.format("Total is  %.2f", cTotal1+ cTax);
        jtxtBarCode.setText(BarCode);
        
    }
    
    //change
    public void Change(){
        double sum = 0 ;
        double tax = 3.9;
        double cash = Double.parseDouble(jtxtDisplay.getText());
        for(int i =0;i<jTable1.getRowCount();i++){
            sum = sum + Double.parseDouble(jTable1.getValueAt(i,2).toString()) ;
            
        }
        double cTax = (sum*3.9)/100;
        double cChange = (cash-(sum+cTax));
        
        String ChangeGiven = String.format("Rs %.2f",cChange);
        jtxtChange.setText(ChangeGiven);
        
        
    }
    
    ///////////////
    public static void printReceipt(JTable table, String title, String address, String cash, String change) {
        JTextArea billTextArea = new JTextArea();
        billTextArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));

        // Add title, address, and header information
        billTextArea.append(title + "\n");
        billTextArea.append(address + "\n\n");
        billTextArea.append("Transaction Date: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\n");
        billTextArea.append(String.format("%-20s %-10s %-10s\n", "Item", "Quantity", "Total Price"));
        billTextArea.append("--------------------------------------------\n");

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();

        // Add items to the bill
        for (int i = 0; i < rowCount; i++) {
            String item = (String) model.getValueAt(i, 0);
            int quantity = (int) model.getValueAt(i, 1);
            double totalPrice = (double) model.getValueAt(i, 2);
            billTextArea.append(String.format("%-20s %-10d %-10.2f\n", item, quantity, totalPrice));
        }

        // Add footer information
        billTextArea.append("--------------------------------------------\n");
        billTextArea.append(String.format("%-20s %-10.2f\n", "Total Price(Rs)", calculateTotalPrice(table)));
        billTextArea.append(String.format("%-20s %-10s\n", "Cash(Rs)",cash));
        billTextArea.append(String.format("%-20s %-10s\n", "Change", change));

        // Print the bill
        try {
            billTextArea.print();
        } catch (PrinterException e) {
            System.err.format("Error during printing: %s%n", e.getMessage());
        }
    }
    
    private static double calculateTotalPrice(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        double total = 0;

        for (int i = 0; i < rowCount; i++) {
            Object value = model.getValueAt(i, 2); // Assuming the total price is in the 3rd column
            if (value instanceof Number) {
                total += ((Number) value).doubleValue();
            }
        }

        return total;
    }
    
 private final Set<String> addedItems = new HashSet<>();
private boolean itemsRemoved = false; // Flag to track if items are removed

private void addItemToTable(JTable sourceTable) {
    DefaultTableModel sourceModel = (DefaultTableModel) sourceTable.getModel();
    DefaultTableModel targetModel = (DefaultTableModel) jTable1.getModel();

    int rowCount = sourceModel.getRowCount();

    if (itemsRemoved) {
        // If items are removed, only add selected items
        int[] selectedRows = sourceTable.getSelectedRows();

        for (int selectedRow : selectedRows) {
            String item = (String) sourceModel.getValueAt(selectedRow, 0);
            String unitPriceStr = (String) sourceModel.getValueAt(selectedRow, 1);
            String quantityStr = (String) sourceModel.getValueAt(selectedRow, 2);

            // Check if the quantity is not null or empty
            if (quantityStr != null && !quantityStr.isEmpty()) {
                // Check if the item has already been added
                if (!addedItems.contains(item)) {
                    // Convert unitPrice to double
                    double unitPrice = Double.parseDouble(unitPriceStr);

                    // Convert quantity to integer
                    int quantity = Integer.parseInt(quantityStr);

                    // Calculate the total price
                    double totalPrice = unitPrice * quantity;

                    // Add the item to jTable1
                    targetModel.addRow(new Object[]{item, quantity, totalPrice});

                    // Mark the item as added
                    addedItems.add(item);

                    // Remove the value from the quantity column in the source table
                    sourceModel.setValueAt(null, selectedRow, 2);
                }
            }
        }
    } else {
        // If no items are removed, add items in the present way
        for (int i = 0; i < rowCount; i++) {
            String item = (String) sourceModel.getValueAt(i, 0);
            String unitPriceStr = (String) sourceModel.getValueAt(i, 1);
            String quantityStr = (String) sourceModel.getValueAt(i, 2);

            // Check if the quantity is not null or empty
            if (quantityStr != null && !quantityStr.isEmpty()) {
                // Check if the item has already been added
                if (!addedItems.contains(item)) {
                    // Convert unitPrice to double
                    double unitPrice = Double.parseDouble(unitPriceStr);

                    // Convert quantity to integer
                    int quantity = Integer.parseInt(quantityStr);

                    // Calculate the total price
                    double totalPrice = unitPrice * quantity;

                    // Add the item to jTable1
                    targetModel.addRow(new Object[]{item, quantity, totalPrice});

                    // Mark the item as added
                    addedItems.add(item);

                    // Remove the value from the quantity column in the source table
                    sourceModel.setValueAt(null, i, 2);
                }
            }
        }
    }

    ItemCost();
}

private void clearQuantityColumn(JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();

    int rowCount = model.getRowCount();

    for (int i = 0; i < rowCount; i++) {
        // Set the value in the quantity column to null
        model.setValueAt(null, i, 2);
    }
}


    
    private void jtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalActionPerformed

    private void jtxtBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBarCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBarCodeActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
       String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn9.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn9.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
        if(jcboPayment.getSelectedItem().equals("Cash"))
        {
            Change();
        }else{
                jtxtChange.setText("");
                jtxtDisplay.setText("");
            }
        
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
      // Get values from your text fields
        String cashValue = jtxtDisplay.getText(); // Replace with your actual text field name
        String changeValue = jtxtChange.getText(); // Replace with your actual text field name

        // Call the printReceipt method
        printReceipt(jTable1, "Abasewana", "Your Address", cashValue, changeValue);
        
    }//GEN-LAST:event_jbtnPrintActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Abasewana",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
              int RemoveItem = jTable1.getSelectedRow();
              if(RemoveItem >= 0 ){
                  model.removeRow(RemoveItem);
              }
              
               ItemCost();
                if(jcboPayment.getSelectedItem().equals("Cash"))
        {
            Change();
        }else{
                jtxtChange.setText("");
                jtxtDisplay.setText("");
                        }
    }//GEN-LAST:event_jbtnRemoveActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
               model.setRowCount(0);
        jtxtChange.setText("");
        jtxtTax.setText("");
        jtxtTotal.setText("");
        jtxtSubTotal.setText("");
        jtxtDisplay.setText("");
        jtxtBarCode.setText("");
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
         String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn5.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn5.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn6.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn6.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
       if(! jtxtDisplay.getText().contains(".")){
           jtxtDisplay.setText(jtxtDisplay.getText()+jbtnDot.getText());
       }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
              String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn7.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn7.getText();
           jtxtDisplay.setText(Enternumber);
              }
              
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
         String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn4.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn4.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtnItemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnItemClearActionPerformed
 clearQuantityColumn(jTable8);
    clearQuantityColumn(jTable9);
    clearQuantityColumn(jTable10);         

    }//GEN-LAST:event_jbtnItemClearActionPerformed

    private void jbtnAdditemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdditemsActionPerformed
  addedItems.clear();
    
    itemsRemoved = false; // Reset the flag

    addItemToTable(jTable8);
    addItemToTable(jTable9);
    addItemToTable(jTable10);
    }//GEN-LAST:event_jbtnAdditemsActionPerformed

    private void jbtnRemoveItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveItemsActionPerformed
  DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    int[] selectedRows = jTable1.getSelectedRows();

    // Iterate in reverse order to avoid issues with indices
    for (int i = selectedRows.length - 1; i >= 0; i--) {
        // Remove the item from the addedItems set
        addedItems.remove((String) model.getValueAt(selectedRows[i], 0));

        // Remove the selected row from the model
        model.removeRow(selectedRows[i]);
    }

    itemsRemoved = true; // Set the flag to true

    ItemCost(); // Assuming this method calculates some total cost
    }//GEN-LAST:event_jbtnRemoveItemsActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
         String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn8.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn8.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
         String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn1.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn1.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
         String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn2.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn2.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
         String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn3.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn3.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
         String Enternumber = jtxtDisplay.getText();
              if (Enternumber == ""){
jtxtDisplay.setText(jbtn0.getText());
}else{
           Enternumber = jtxtDisplay.getText()+jbtn0.getText();
           jtxtDisplay.setText(Enternumber);
              }
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtDisplay.setText("");
        jtxtChange.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ambasewana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ambasewana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ambasewana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ambasewana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ambasewana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAdditems;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnItemClear;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnRemoveItems;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcboPayment;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
