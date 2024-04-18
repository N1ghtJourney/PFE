package Forms;


import Code.Besoin;
import Code.Branch;

import Code.CompteComptabilite;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import table.TableCustom;
import java.awt.*;
import java.lang.String;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Year;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import Code.ConnectionDB;
import Code.Utilisateur;
import component.Inputsframe;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import main.Login;
import static main.Login.user;
import main.Main;
import table.TableScrollButton;
public class Collect extends javax.swing.JPanel implements ActionListener,MouseListener{

    public Collect() {
        myUser=Login.user;
        currentYear = Year.now();
        currentYearValue = LocalDate.now().getYear();
        besoinN.setYear(currentYearValue);
        initComponents();
        setOpaque(false);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
        menubar();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        branchLabel = new javax.swing.JLabel();
        Integer[] years = new Integer[50]; // Assuming you want to select from 1922 to 2021
        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }
        yearComboBox = new JComboBox<>(years);
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        cgField = new javax.swing.JTextField();
        coutField = new javax.swing.JTextField();
        qteField = new javax.swing.JTextField();
        intialDAField = new javax.swing.JTextField();
        initialDEVField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        libelleField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clotureDAField = new javax.swing.JTextField();
        clotureDEVField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cmdEdit = new com.raven.swing.Button();
        ajouterbtn = new javax.swing.JButton();
        cmdDelete = new com.raven.swing.Button();
        tableScrollButton1 = new table.TableScrollButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(951, 513));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(294, 220));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setVisible(true);
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        branchLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branchLabel.setForeground(Color.decode("#232F34"));
        branchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        branchLabel.setMaximumSize(new java.awt.Dimension(16, 20));
        branchLabel.setMinimumSize(new java.awt.Dimension(16, 20));
        branchLabel.setPreferredSize(new java.awt.Dimension(16, 20));

        // Assuming you want to select from 1922 to 2021
        yearComboBox.setSelectedItem(currentYearValue);
        yearComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer selectedYear = (Integer) yearComboBox.getSelectedItem();
                besoinN.setYear(selectedYear);
                clearTable();
                try {

                    showData(jTable1);
                } catch (SQLException ex) {
                    Logger.getLogger(Collect.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Collect();
                tableCreate();
            }
        });

        jLabel1.setText("Anneé :");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setMaximumSize(new java.awt.Dimension(418, 114));
        jPanel9.setMinimumSize(new java.awt.Dimension(718, 98));
        jPanel9.setPreferredSize(new java.awt.Dimension(418, 114));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jPanel3.setVisible(true);
        jPanel3.setBackground(Color.decode("#4A6572"));
        jPanel3.setMaximumSize(new java.awt.Dimension(818, 98));
        jPanel3.setMinimumSize(new java.awt.Dimension(818, 98));
        jPanel3.setPreferredSize(new java.awt.Dimension(818, 98));
        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setBackground(Color.decode("#4A6572"));
        jPanel4.setLayout(new java.awt.GridLayout(2, 6));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Code:");
        jLabel3.setPreferredSize(new java.awt.Dimension(35, 16));
        jPanel4.add(jLabel3);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CG:");
        jLabel2.setPreferredSize(new java.awt.Dimension(35, 16));
        jPanel4.add(jLabel2);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cout:");
        jLabel4.setMinimumSize(new java.awt.Dimension(35, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(35, 16));
        jPanel4.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Qte:");
        jPanel4.add(jLabel5);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Initial :");
        jPanel4.add(jLabel7);
        jPanel4.add(jLabel9);

        codeField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        codeField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(codeField);
        jPanel4.add(cgField);

        coutField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coutFieldActionPerformed(evt);
            }
        });
        jPanel4.add(coutField);
        jPanel4.add(qteField);

        intialDAField.setToolTipText("DA");
        initialDEVField.setToolTipText("DA");
        jPanel4.add(intialDAField);

        initialDEVField.setToolTipText("DEV");
        initialDEVField.setPreferredSize(null);
        initialDEVField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialDEVFieldActionPerformed(evt);
            }
        });
        jPanel4.add(initialDEVField);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(Color.decode("#4A6572"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 3));

        jPanel6.setBackground(Color.decode("#4A6572"));
        jPanel6.setLayout(new java.awt.GridLayout(2, 2));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Libelle:");
        jPanel6.add(jLabel6);
        jPanel6.add(libelleField);

        jPanel5.add(jPanel6);

        jPanel7.setBackground(Color.decode("#4A6572"));
        jPanel7.setLayout(new java.awt.GridLayout(2, 2));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cloture :");
        jLabel8.setToolTipText("");
        jPanel7.add(jLabel8);
        jPanel7.add(jLabel10);

        clotureDAField.setToolTipText("DA");
        clotureDAField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clotureDAFieldActionPerformed(evt);
            }
        });
        jPanel7.add(clotureDAField);

        clotureDEVField.setToolTipText("DEV");
        clotureDEVField.setMaximumSize(new java.awt.Dimension(68, 26));
        jPanel7.add(clotureDEVField);

        jPanel5.add(jPanel7);

        jPanel8.setBackground(Color.decode("#4A6572"));

        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        cmdEdit.setVisible(false);
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        ajouterbtn.setText("Ajouter");
        ajouterbtn.setVisible(false);
        ajouterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterbtnActionPerformed(evt);
            }
        });

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        cmdDelete.setVisible(false);
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajouterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ajouterbtn))
        );

        jPanel5.add(jPanel8);

        jPanel3.add(jPanel5);

        jPanel9.add(jPanel3, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(branchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1372, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(branchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "CG", "Cout", "LIbelle", "qte "+(besoinN.getYear()-1), "qte "+besoinN.getYear(), "Cloture DA "+(besoinN.getYear()-1), "DEV", "Initial DA "+besoinN.getYear(), "DEV", "utilisateur"
            }

        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = jTable1.getSelectedRow();
                    if (selectedRow != -1) {
                        // Get data from the selected row
                        Object code = jTable1.getValueAt(selectedRow, 0);
                        Object cg = jTable1.getValueAt(selectedRow, 1);
                        Object cout = jTable1.getValueAt(selectedRow, 2);
                        Object libelle = jTable1.getValueAt(selectedRow, 3);
                        Object qteN1 = jTable1.getValueAt(selectedRow, 4);
                        Object qteN = jTable1.getValueAt(selectedRow, 5);
                        Object clotureDA = jTable1.getValueAt(selectedRow, 6);
                        Object clotureDEV = jTable1.getValueAt(selectedRow, 7);
                        Object initialDA = jTable1.getValueAt(selectedRow, 8);
                        Object initialDEV = jTable1.getValueAt(selectedRow, 9);

                        // Set data to text fields
                        codeField.setText(code.toString());
                        cgField.setText(cg.toString());
                        coutField.setText(cout.toString());
                        libelleField.setText(libelle.toString());
                        qteField.setText(qteN.toString());
                        intialDAField.setText(initialDA.toString());
                        initialDEVField.setText(initialDEV.toString());
                        clotureDAField.setText(clotureDA.toString());
                        clotureDEVField.setText(clotureDEV.toString());

                        ajouterbtn.setVisible(false);
                        cmdDelete.setVisible(true);
                        cmdEdit.setVisible(true);
                    }
                }
            }

        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(220);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(80);
        }

        tableScrollButton1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(tableScrollButton1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterbtnActionPerformed
            ajouterBesoin();
            clearTable();
            try {
                showData(jTable1);
            } catch (SQLException ex) {
                Logger.getLogger(Collect.class.getName()).log(Level.SEVERE, null, ex);
            }
            clearTextField();
            
        
    }//GEN-LAST:event_ajouterbtnActionPerformed

    private void initialDEVFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialDEVFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialDEVFieldActionPerformed

    private void coutFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coutFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coutFieldActionPerformed

    private void clotureDAFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clotureDAFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clotureDAFieldActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
       
                if (selectedRow != -1) {
                   
                    int option = JOptionPane.showConfirmDialog(Collect.this, "Are you sure you want to delete this row?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        
                        
                        Object[] rowData=new Object[11];
                        for (int i=0;i<11;i++){
                            rowData[i]=jTable1.getValueAt(selectedRow,i);
                        }
                        try {
                            
                            updateRowInDatabase(rowData);
                        } catch (SQLException ex) {
                            Logger.getLogger(Collect.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        clearTable();
                        try {
                            showData(jTable1);
                        } catch (SQLException ex) {
                            Logger.getLogger(Collect.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        clearTextField();
                        ajouterbtn.setVisible(true);
                        cmdDelete.setVisible(false);
                        cmdEdit.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(Collect.this, "Please select a row to delete.");
                }
        
    
    }//GEN-LAST:event_cmdEditActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
        int primaryKey = (int) jTable1.getValueAt(selectedRow, 0);
        
        int option = JOptionPane.showConfirmDialog(Collect.this, "Are you sure you want to delete this row?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) { 
            
            deleteRowFromDatabase(primaryKey);
            
            model.removeRow(selectedRow);
        }
    }     
        clearTextField();
        clearTable();
                try {
                    showData(jTable1);
                } catch (SQLException ex) {
                    Logger.getLogger(Collect.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ajouterbtn.setVisible(true);
                cmdDelete.setVisible(false);
                cmdEdit.setVisible(false);
                   
    }//GEN-LAST:event_cmdDeleteActionPerformed
    
                        
    private void menubar(){
       JMenuBar menuBar = new JMenuBar();

        
        JMenu BranchMenu = new JMenu("Choisir le branch");
        customizeMenuItem(BranchMenu);
        
        JMenuItem menuItem=new JMenuItem("Assistant Sureté interne");
        menuItem.addActionListener(this);
        
        JMenu menu1=new JMenu("Département Qualité HSE");
        JMenuItem menu1Item1=new JMenuItem("Service Qualité");
        JMenuItem menu1Item2=new JMenuItem("Service Sécurité");
        menu1.add(menu1Item1);menu1.add(menu1Item2);
        
        JMenu menu2=new JMenu("Département Technologie de L'information");
        JMenuItem menu2Item1=new JMenuItem("Service Documentation Technique");
        JMenuItem menu2Item2=new JMenuItem("Service Support logiciels");
        JMenuItem menu2Item3=new JMenuItem("Service Réseaux");
        menu2.add(menu2Item1);;menu2.add(menu2Item2);menu2.add(menu2Item3);
        
        
        
        
        
        BranchMenu.add(menuItem);
        BranchMenu.add(menu1);
        BranchMenu.add(menu2);
        

        
        menuBar.add(BranchMenu);

        
        jPanel1.add(menuBar, BorderLayout.NORTH);
        
        
        menu1.addMouseListener(this);menu2.addMouseListener(this);
        menu1Item1.addActionListener(this);menu1Item2.addActionListener(this);
        ;menu2Item1.addActionListener((ActionListener) this);
        menu2Item2.addActionListener((ActionListener) this);menu2Item3.addActionListener((ActionListener) this);
        
          
   }
    private void showData(JTable table) throws SQLException {
        
        
        
        model = (DefaultTableModel) table.getModel();
        Connection con = null;
        try {
            con = ConnectionDB.getConnection();
           
                String query = "SELECT " +
                "b1.CODE, u.USERNAME, b1.CPTE, b1.CG, b1.ANNEE, b1.LIBELLE, b1.CLOTUREDEV, b1.CLOTUREDA, " +
                "b1.COUT AS COUT_CURRENT_YEAR, b1.QTE AS QTE_CURRENT_YEAR, b1.INITIALDA AS INITIALDA_CURRENT_YEAR, b1.INITIALDEV AS INITIALDEV_CURRENT_YEAR, " +
                "b2.COUT AS COUT_PREVIOUS_YEAR, b2.QTE AS QTE_PREVIOUS_YEAR " +
                "FROM besoin b1 " +
                "LEFT JOIN besoin b2 ON b1.LIBELLE = b2.LIBELLE AND b1.CPTE = b2.CPTE AND b1.CG = b2.CG AND b1.ANNEE - 1 = b2.ANNEE " +
                "JOIN branch br ON b1.CPTE = br.CPTE " +
                "JOIN utilisateur u ON b1.USER_ID = u.USER_ID " +
                "WHERE br.BRANCHNOM = ? AND b1.ANNEE = ?";

            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1,branch.getBranchName());
                
                preparedStatement.setInt(2, besoinN.getYear());

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                       
                       Besoin besoinN1=new Besoin();
                    
                    
                           besoinN.setCode(resultSet.getInt("CODE"));
                        besoinN.setCout(resultSet.getDouble("COUT_CURRENT_YEAR"));
                        
                        cc.setCG(resultSet.getInt("CG"));
                        besoinN.setLibelle(resultSet.getString("LIBELLE"));
                            user.setUserName(resultSet.getString("USERNAME"));
                        besoinN.setQte(resultSet.getInt("QTE_CURRENT_YEAR"));
                        besoinN1.setQte(resultSet.getInt("QTE_PREVIOUS_YEAR"));
                        besoinN.setInitialDEV(resultSet.getDouble("INITIALDEV_CURRENT_YEAR"));
                        
                        besoinN.setClotureDA(resultSet.getDouble("CLOTUREDA"));
                        besoinN.setClotureDEV(resultSet.getDouble("CLOTUREDEV"));
                        
                        double n=besoinN.getCout()*besoinN.getQte();
                        besoinN.setInitialDA(n);
                        model.addRow(new Object[]{besoinN.getCode(), cc.getCG(), besoinN.getCout(), besoinN.getLibelle(), besoinN1.getQte(), besoinN.getQte(),besoinN.getClotureDA(), besoinN.getClotureDEV(), besoinN.getInitialDA(), besoinN.getInitialDEV(),user.getUserName()});

                    }
                } 
            }   
        
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void clearTable() {
        if (model != null) {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
        }
    }
    
    private static void customizeMenuItem(JMenuItem menuItem) {
   
        Font newFont = new Font("Arial Black", Font.BOLD, 14);
        menuItem.setFont(newFont);
        menuItem.setForeground(Color.decode("#232F34"));
    }
    private void deleteRowFromDatabase(int primarykey) {
        System.out.println(primarykey);
        try {


                // Prepare SQL statement
                try ( // Establish database connection
                    Connection conn = ConnectionDB.getConnection()) {
                    // Prepare SQL statement
                    String deleteQuery = "DELETE FROM besoin WHERE CODE = ?";
                    PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
                    deleteStatement.setInt(1,  primarykey); // Assuming CODE is the primary key

                    // Execute delete query
                    deleteStatement.executeUpdate();

                    // Close resources
                    deleteStatement.close();
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   private void updateRowInDatabase(Object[] rowData) throws SQLException {
    System.out.println("Forms.Collect.updateRowInDatabase()");
    Connection conn = null;
    try {
        // Establish database connection
        conn = ConnectionDB.getConnection();

        // Disable auto-commit mode
        conn.setAutoCommit(false);

        // Prepare SQL statement for updating besoin table
        String updateQuery_b1 = "UPDATE besoin " +
                                "SET CODE = ?, CG = ?, COUT = ?, LIBELLE = ?, INITIALDEV = ?, CLOTUREDA = ?, CLOTUREDEV = ?, USER_ID = ?, QTE = ?, INITIALDA = ?" +
                                "WHERE ANNEE = ? AND CODE = ?";
        PreparedStatement updateStatement_b1 = conn.prepareStatement(updateQuery_b1);
              updateStatement_b1.setInt(1, Integer.parseInt(codeField.getText())); // CODE
            updateStatement_b1.setInt(2, Integer.parseInt(cgField.getText())); // CG
            updateStatement_b1.setDouble(3, Double.parseDouble(coutField.getText())); // COUT
        updateStatement_b1.setString(4, libelleField.getText()); // LIBELLE
         updateStatement_b1.setDouble(5, Double.parseDouble(initialDEVField.getText())); // INITIALDEV
        updateStatement_b1.setDouble(6, Double.parseDouble(clotureDAField.getText())); // CLOTUREDA
        updateStatement_b1.setDouble(7, Double.parseDouble(clotureDEVField.getText())); // CLOTUREDEV
        updateStatement_b1.setInt(8, myUser.getUserID()); // USER_ID
        updateStatement_b1.setInt(9, Integer.parseInt(qteField.getText())); 
        updateStatement_b1.setDouble(10, Double.parseDouble(intialDAField.getText()));
        updateStatement_b1.setInt(11, besoinN.getYear()); // ANNEE
        updateStatement_b1.setInt(12, (Integer) rowData[0]); // CODE
        updateStatement_b1.executeUpdate();

        conn.commit();
        System.out.println("Updates committed successfully.");
    } catch (SQLException e) {
        // Handle any SQL exceptions
        if (conn != null) {
            conn.rollback(); // Rollback changes if an exception occurs
        }
        e.printStackTrace();
    } finally {
        // Close resources in finally block to ensure they're always closed
        if (conn != null) {
            conn.setAutoCommit(true); // Re-enable auto-commit mode
            conn.close();
        }
    }
}


    public void ajouterBesoin() {
    String cpte = null;
    System.out.println("Forms.Collect.ajouterBesoin()");
    try {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        
        conn = ConnectionDB.getConnection();
        if (conn == null) {
            System.out.println("Failed to establish database connection.");
            return;
        }

        
        String selectQuery = "SELECT CPTE FROM branch WHERE UPPER(BRANCHNOM) = ?";
        pstmt = conn.prepareStatement(selectQuery);
        String branchName = branchLabel.getText().toUpperCase(); 
        pstmt.setString(1, branchName);
        rs = pstmt.executeQuery();

        
        if (rs.next()) {
            cpte = rs.getString("CPTE");
            System.out.println("CPTE: " + cpte);
        } else {
            System.out.println("No record found for the specified BRANCHNAME.");
            return;
        }
        System.out.println("CPTE: " + cpte);
        String insertQuery = "INSERT INTO besoin (CODE, USER_ID, CPTE, CG, ANNEE, COUT, QTE, INITIALDA, INITIALDEV, LIBELLE, CLOTUREDA, CLOTUREDEV) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
        try {
          insertStatement.setInt(1, Integer.parseInt(codeField.getText())); // CODE
        } catch (NumberFormatException ex) {
            
            System.err.println("Invalid input for CODE field: " + ex.getMessage());
            
        }
        
         insertStatement.setInt(2, myUser.getUserID()); // USER_ID
        insertStatement.setString(3, cpte); // CPTE
        insertStatement.setInt(4, Integer.parseInt(cgField.getText())); // CG
        insertStatement.setInt(5, besoinN.getYear()); // ANNEE
        insertStatement.setDouble(6, Double.parseDouble(coutField.getText())); // COUT
        insertStatement.setDouble(7, Double.parseDouble(qteField.getText())); // QTE
        insertStatement.setDouble(8, Double.parseDouble(intialDAField.getText())); // INITIALDA
        insertStatement.setDouble(9, Double.parseDouble(initialDEVField.getText())); // INITIALDEV
        insertStatement.setString(10, libelleField.getText()); // LIBELLE
        insertStatement.setDouble(11, Double.parseDouble(clotureDAField.getText())); // CLOTUREDA
        insertStatement.setDouble(12, Double.parseDouble(clotureDEVField.getText())); // CLOTUREDEV

        
        int rowsAffected = insertStatement.executeUpdate();
        System.out.println(rowsAffected + " rows inserted.");

        
        
        insertStatement.close();
        conn.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void clearTextField() {
    codeField.setText("");
    cgField.setText("");
    coutField.setText("");
    libelleField.setText("");
    qteField.setText("");
    intialDAField.setText("");
    initialDEVField.setText("");
    clotureDAField.setText("");
    clotureDEVField.setText("");
}

    
    
    Besoin MYbesoin=new Besoin();
    CompteComptabilite cc=new CompteComptabilite();
    Utilisateur user=new Utilisateur();
    Branch branch=new Branch();
    Besoin besoinN=new Besoin();
    Integer currentYearValue;
    Year currentYear;
    DefaultTableModel model;
    private Utilisateur myUser;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterbtn;
    private javax.swing.JLabel branchLabel;
    private javax.swing.JTextField cgField;
    private javax.swing.JTextField clotureDAField;
    private javax.swing.JTextField clotureDEVField;
    private com.raven.swing.Button cmdDelete;
    private com.raven.swing.Button cmdEdit;
    private javax.swing.JTextField codeField;
    private javax.swing.JTextField coutField;
    private javax.swing.JTextField initialDEVField;
    private javax.swing.JTextField intialDAField;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField libelleField;
    private javax.swing.JTextField qteField;
    private table.TableScrollButton tableScrollButton1;
    private javax.swing.JComboBox<Integer> yearComboBox;
    // End of variables declaration//GEN-END:variables
         private static ImageIcon createImageIcon(String path) {
            java.net.URL imgURL = Collect.class.getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL);
            } else {
                System.out.println("Could not find image file: " + path);
                return null;
            }
        
    }

    public void branchEvent(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JMenuItem source = (JMenuItem) e.getSource();
        branchLabel.setText(source.getText());
        branch.setBranchName(source.getText());
        try {
            clearTable();
            showData(jTable1);
        } catch (SQLException ex) {
            Logger.getLogger(Collect.class.getName()).log(Level.SEVERE, null, ex);
        }
        jPanel3.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        JMenuItem source = (JMenuItem) e.getSource();
        branchLabel.setText(source.getText());
        branch.setBranchName(source.getText());
        try {
            clearTable();
            showData(jTable1);
        } catch (SQLException ex) {
            Logger.getLogger(Collect.class.getName()).log(Level.SEVERE, null, ex);
        }
        jPanel3.setVisible(true);
        ajouterbtn.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void tableCreate(){
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "CG", "Cout", "LIbelle", "qte "+(besoinN.getYear()-1), "qte "+besoinN.getYear(), "Cloture DA "+(besoinN.getYear()-1), "DEV", "Initial DA "+besoinN.getYear(), "DEV", "utilisateur"
            }

        ));

        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (!e.getValueIsAdjusting()) {
                            int selectedRow = jTable1.getSelectedRow();
                            if (selectedRow != -1) {
                                // Get data from the selected row
                                Object code = jTable1.getValueAt(selectedRow, 0);
                                Object cg = jTable1.getValueAt(selectedRow, 1);
                                Object cout = jTable1.getValueAt(selectedRow, 2);
                                Object libelle = jTable1.getValueAt(selectedRow, 3);
                                Object qteN1 = jTable1.getValueAt(selectedRow, 4);
                                Object qteN = jTable1.getValueAt(selectedRow, 5);
                                Object clotureDA = jTable1.getValueAt(selectedRow, 6);
                                Object clotureDEV = jTable1.getValueAt(selectedRow, 7);
                                Object initialDA = jTable1.getValueAt(selectedRow, 8);
                                Object initialDEV = jTable1.getValueAt(selectedRow, 9);

                                // Set data to text fields
                                codeField.setText(code.toString());
                                cgField.setText(cg.toString());
                                coutField.setText(cout.toString());
                                libelleField.setText(libelle.toString());
                                qteField.setText(qteN.toString());
                                intialDAField.setText(initialDA.toString());
                                initialDEVField.setText(initialDEV.toString());
                                clotureDAField.setText(clotureDA.toString());
                                clotureDEVField.setText(clotureDEV.toString());


                                ajouterbtn.setVisible(false);
                                cmdDelete.setVisible(true);
                                cmdEdit.setVisible(true);
                            }
                        }
                    }

                });


        jScrollPane1.setViewportView(jTable1);

        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(220);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(80);
        }
            }

}
