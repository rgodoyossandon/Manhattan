/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rgodo
 */
public class Admin extends javax.swing.JFrame {
    private DefaultTableModel modelTable = new DefaultTableModel();
    private static Double usadivisa;
    private static Double usadivisasell;
    private static Double taxusa;
    public static Double usatotal; 
    private static Double eurdivisa;
    private static Double eurdivisasell;
    private static Double taxeur;    
    public static Double eurtotal;
    private static Double boldivisa;
    private static Double boldivisasell;
    private static Double taxbol;  
    public static Double boltotal;
    private static Double soldivisa;
    private static Double soldivisasell;
    private static Double taxsol;  
    public static Double soltotal;
    private static Double argdivisa;
    private static Double argdivisasell;
    private static Double taxarg;  
    public static Double argtotal;
    private static Double coldivisa;
    private static Double coldivisasell;
    private static Double taxcol;  
    public static Double coltotal;
    private static Double candivisa;
    private static Double candivisasell;
    private static Double taxcan;  
    public static Double cantotal;
    private static Double mexdivisa;
    private static Double mexdivisasell;
    private static Double taxmex;  
    public static Double mextotal;
    public Admin() {
        initComponents();
        setLocationRelativeTo(null);
       
    }

    private void addModelTable(){
        modelTable.addColumn("Valor Dolar");
        modelTable.addColumn("Valor Euro");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buysell = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        usatextfield = new javax.swing.JTextField();
        usataxfield = new javax.swing.JTextField();
        eurtextfield = new javax.swing.JTextField();
        eurtaxfield = new javax.swing.JTextField();
        boltextfield = new javax.swing.JTextField();
        boltaxfield = new javax.swing.JTextField();
        soltextfield = new javax.swing.JTextField();
        soltaxfield = new javax.swing.JTextField();
        argtextfield = new javax.swing.JTextField();
        argtaxfield = new javax.swing.JTextField();
        coltextfield = new javax.swing.JTextField();
        coltaxfield = new javax.swing.JTextField();
        cantextfield = new javax.swing.JTextField();
        cantaxfield = new javax.swing.JTextField();
        mextextfield = new javax.swing.JTextField();
        mextaxfield = new javax.swing.JTextField();
        moneytext = new javax.swing.JLabel();
        adiciotext = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        reports = new javax.swing.JLabel();
        reportday = new javax.swing.JButton();
        reportweek = new javax.swing.JButton();
        reportmont = new javax.swing.JButton();
        usasave = new javax.swing.JButton();
        eursave = new javax.swing.JButton();
        bolsave = new javax.swing.JButton();
        solsave = new javax.swing.JButton();
        argsave = new javax.swing.JButton();
        colsave = new javax.swing.JButton();
        cansave = new javax.swing.JButton();
        mexsave = new javax.swing.JButton();
        usaconcat = new javax.swing.JLabel();
        eurconcat = new javax.swing.JLabel();
        eurconcat1 = new javax.swing.JLabel();
        eurconcat2 = new javax.swing.JLabel();
        eurconcat3 = new javax.swing.JLabel();
        eurconcat4 = new javax.swing.JLabel();
        eurconcat5 = new javax.swing.JLabel();
        eurconcat6 = new javax.swing.JLabel();
        buymoney = new javax.swing.JRadioButton();
        sellmoney = new javax.swing.JRadioButton();
        optionmenu = new javax.swing.JMenuBar();
        menubar = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usatextfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        usatextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usatextfieldMouseClicked(evt);
            }
        });
        usatextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usatextfieldActionPerformed(evt);
            }
        });
        panel.add(usatextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        usataxfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(usataxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, 30));

        eurtextfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        eurtextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eurtextfieldMouseClicked(evt);
            }
        });
        panel.add(eurtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));
        panel.add(eurtaxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 30));
        panel.add(boltextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 30));
        panel.add(boltaxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, 30));
        panel.add(soltextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 30));
        panel.add(soltaxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 100, 30));

        argtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                argtextfieldActionPerformed(evt);
            }
        });
        panel.add(argtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 100, 30));
        panel.add(argtaxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 100, 30));
        panel.add(coltextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 100, 30));
        panel.add(coltaxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 100, 30));
        panel.add(cantextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 100, 30));
        panel.add(cantaxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 100, 30));
        panel.add(mextextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, 30));
        panel.add(mextaxfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 100, 30));

        moneytext.setBackground(new java.awt.Color(0, 0, 0));
        moneytext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        moneytext.setText("Valor Dolar");
        panel.add(moneytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        adiciotext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        adiciotext.setText(" Adicional");
        panel.add(adiciotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 710, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 10, 230));

        reports.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reports.setText("Reportes Ventas");
        panel.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        reportday.setBackground(new java.awt.Color(255, 255, 153));
        reportday.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportday.setText("Reporte Diario");
        reportday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportdayActionPerformed(evt);
            }
        });
        panel.add(reportday, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 150, 40));

        reportweek.setBackground(new java.awt.Color(255, 255, 153));
        reportweek.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportweek.setText("Reporte Semanal");
        reportweek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportweekActionPerformed(evt);
            }
        });
        panel.add(reportweek, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 170, 40));

        reportmont.setBackground(new java.awt.Color(255, 255, 153));
        reportmont.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportmont.setText("Reporte Mensual");
        reportmont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportmontActionPerformed(evt);
            }
        });
        panel.add(reportmont, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 160, 40));

        usasave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinyflagusa.png"))); // NOI18N
        usasave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usasaveActionPerformed(evt);
            }
        });
        panel.add(usasave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 40, 30));

        eursave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinyeurflag.png"))); // NOI18N
        eursave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eursaveActionPerformed(evt);
            }
        });
        panel.add(eursave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 40, 30));

        bolsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinybolivianflagpng.png"))); // NOI18N
        bolsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolsaveActionPerformed(evt);
            }
        });
        panel.add(bolsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 40, 30));

        solsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinyperuflag.png"))); // NOI18N
        solsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solsaveActionPerformed(evt);
            }
        });
        panel.add(solsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 40, 30));

        argsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinyargenflag.png"))); // NOI18N
        argsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                argsaveActionPerformed(evt);
            }
        });
        panel.add(argsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 40, 30));

        colsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinycolombiaflag.png"))); // NOI18N
        colsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colsaveActionPerformed(evt);
            }
        });
        panel.add(colsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 40, 30));

        cansave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinycanadaflag.png"))); // NOI18N
        cansave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cansaveActionPerformed(evt);
            }
        });
        panel.add(cansave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 40, 30));

        mexsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tinymexicanflag.png"))); // NOI18N
        mexsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexsaveActionPerformed(evt);
            }
        });
        panel.add(mexsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 40, 30));

        usaconcat.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        usaconcat.setText("+");
        panel.add(usaconcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 30, 30));

        eurconcat.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        eurconcat.setText("+");
        panel.add(eurconcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 30, 40));

        eurconcat1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        eurconcat1.setText("+");
        panel.add(eurconcat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 30, 40));

        eurconcat2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        eurconcat2.setText("+");
        panel.add(eurconcat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 30, 40));

        eurconcat3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        eurconcat3.setText("+");
        panel.add(eurconcat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 30, 40));

        eurconcat4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        eurconcat4.setText("+");
        panel.add(eurconcat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 30, 40));

        eurconcat5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        eurconcat5.setText("+");
        panel.add(eurconcat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 30, 40));

        eurconcat6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        eurconcat6.setText("+");
        panel.add(eurconcat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 30, 40));

        buysell.add(buymoney);
        buymoney.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buymoney.setText("Compra");
        panel.add(buymoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        buysell.add(sellmoney);
        sellmoney.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sellmoney.setText("Venta");
        panel.add(sellmoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 480));

        menubar.setText("Archivo");

        logout.setText("Cerrar Sesion");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        menubar.add(logout);

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menubar.add(exit);

        optionmenu.add(menubar);

        setJMenuBar(optionmenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login logout = new Login();
        logout.setVisible(true);
        
        dispose();
        
        
        
        
    }//GEN-LAST:event_logoutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    //Reporte mensual
    private void reportmontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportmontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportmontActionPerformed

    //Reporte Diario
    private void reportdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportdayActionPerformed

    private void eurtextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eurtextfieldMouseClicked
        eurtextfield.setText("");
        usatextfield.setText("0");
    }//GEN-LAST:event_eurtextfieldMouseClicked

    private void usatextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usatextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usatextfieldActionPerformed

    private void usatextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usatextfieldMouseClicked
        usatextfield.setText("");
        eurtextfield.setText("0");
    }//GEN-LAST:event_usatextfieldMouseClicked

    private void usasaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usasaveActionPerformed
        if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        usadivisa = Double.parseDouble(usatextfield.getText());
        taxusa = Double.parseDouble(usataxfield.getText());
        usatotal = usadivisa+taxusa;
        
        if(usadivisa <=0 || taxusa <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            usatextfield.setText("");
            usataxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            usatextfield.setText("");
            usataxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        usadivisasell = Double.parseDouble(usatextfield.getText());
        taxusa = Double.parseDouble(usataxfield.getText());
        usatotal = usadivisasell+taxusa;
        
        if(usadivisasell <=0 || taxusa <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            usatextfield.setText("");
            usataxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            usatextfield.setText("");
            usataxfield.setText(""); 
        }
        }
    }//GEN-LAST:event_usasaveActionPerformed

    private void eursaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eursaveActionPerformed
        if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        eurdivisa = Double.parseDouble(eurtextfield.getText());
        taxeur = Double.parseDouble(eurtaxfield.getText());
        eurtotal = eurdivisa+taxeur;
        
        if(eurdivisa <=0 || taxeur <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            eurtextfield.setText("");
            eurtaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            eurtextfield.setText("");
            eurtaxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        eurdivisasell = Double.parseDouble(eurtextfield.getText());
        taxeur = Double.parseDouble(eurtaxfield.getText());
        eurtotal = eurdivisasell+taxeur;
        
        if(eurdivisasell <=0 || taxeur <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            eurtextfield.setText("");
            eurtaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            eurtextfield.setText("");
            eurtaxfield.setText(""); 
        
        }
        }    }//GEN-LAST:event_eursaveActionPerformed

    private void bolsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolsaveActionPerformed
          if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        boldivisa = Double.parseDouble(boltextfield.getText());
        taxbol = Double.parseDouble(boltaxfield.getText());
        eurtotal = boldivisa+taxbol;
        
        if(boldivisa <=0 || taxbol <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            boltextfield.setText("");
            boltaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            boltextfield.setText("");
            boltaxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        boldivisasell = Double.parseDouble(boltextfield.getText());
        taxbol = Double.parseDouble(boltaxfield.getText());
        boltotal = boldivisasell+taxbol;
        
        if(boldivisasell <=0 || taxbol <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            boltextfield.setText("");
            boltaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            boltextfield.setText("");
            boltaxfield.setText(""); 
        
        }
        }    }//GEN-LAST:event_bolsaveActionPerformed

    private void solsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solsaveActionPerformed
        if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        soldivisa = Double.parseDouble(soltextfield.getText());
        taxsol = Double.parseDouble(soltaxfield.getText());
        soltotal = soldivisa+taxsol;
        
        if(soldivisa <=0 || taxsol <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            soltextfield.setText("");
            soltaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            soltextfield.setText("");
            soltaxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        soldivisasell = Double.parseDouble(soltextfield.getText());
        taxsol = Double.parseDouble(soltaxfield.getText());
        soltotal = soldivisasell+taxsol;
        
        if(soldivisasell <=0 || taxsol <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            soltextfield.setText("");
            soltaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            soltextfield.setText("");
            soltaxfield.setText(""); 
        
        }
        }    }//GEN-LAST:event_solsaveActionPerformed

    private void argsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_argsaveActionPerformed
         if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        argdivisa = Double.parseDouble(argtextfield.getText());
        taxarg = Double.parseDouble(argtaxfield.getText());
        argtotal = argdivisa+taxarg;
        
        if(argdivisa <=0 || taxarg <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            argtextfield.setText("");
            argtaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            argtextfield.setText("");
            argtaxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        argdivisasell = Double.parseDouble(argtextfield.getText());
        taxarg = Double.parseDouble(argtaxfield.getText());
        argtotal = argdivisasell+taxarg;
        
        if(argdivisasell <=0 || taxarg <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            argtextfield.setText("");
            argtaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            argtextfield.setText("");
            argtaxfield.setText(""); 
        
        }
        }    }//GEN-LAST:event_argsaveActionPerformed

    private void colsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colsaveActionPerformed
      if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        coldivisa = Double.parseDouble(coltextfield.getText());
        taxcol = Double.parseDouble(coltaxfield.getText());
        coltotal = coldivisa+taxcol;
        
        if(coldivisa <=0 || taxcol <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            coltextfield.setText("");
            coltaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            coltextfield.setText("");
            coltaxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        coldivisasell = Double.parseDouble(coltextfield.getText());
        taxcol = Double.parseDouble(coltaxfield.getText());
        coltotal = coldivisasell+taxcol;
        
        if(eurdivisasell <=0 || taxeur <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            coltextfield.setText("");
            coltaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            coltextfield.setText("");
            coltaxfield.setText(""); 
        
        }
        }    }//GEN-LAST:event_colsaveActionPerformed

    private void cansaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cansaveActionPerformed
       if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        candivisa = Double.parseDouble(cantextfield.getText());
        taxcan = Double.parseDouble(cantaxfield.getText());
        cantotal = candivisa+taxcan;
        
        if(candivisa <=0 || taxcan <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            cantextfield.setText("");
            cantaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            cantextfield.setText("");
            cantaxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        candivisasell = Double.parseDouble(cantextfield.getText());
        taxcan = Double.parseDouble(cantaxfield.getText());
        cantotal = candivisasell+taxcan;
        
        if(candivisasell <=0 || taxcan <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            cantextfield.setText("");
            cantaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            cantextfield.setText("");
            cantaxfield.setText(""); 
        
        }
        }    }//GEN-LAST:event_cansaveActionPerformed

    //Comprobacion e ingreso de divisa a la variable, generar cambio para funcionar con la API
    private void mexsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexsaveActionPerformed
  if(buymoney.isSelected()==false && sellmoney.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null,"No selecciono ninguna opción");
        }else if((buymoney.isSelected()==true && sellmoney.isSelected()==false))
        {
        mexdivisa = Double.parseDouble(mextextfield.getText());
        taxmex = Double.parseDouble(mextaxfield.getText());
        mextotal = mexdivisa+taxmex;
        
        if(mexdivisa <=0 || taxmex <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            mextextfield.setText("");
            mextaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            mextextfield.setText("");
            mextaxfield.setText("");
        }
        }
        else if(buymoney.isSelected()==false && sellmoney.isSelected()==true)
        {
        mexdivisasell = Double.parseDouble(mextextfield.getText());
        taxmex = Double.parseDouble(mextaxfield.getText());
        mextotal = mexdivisasell+taxmex;
        
        if(mexdivisasell <=0 || taxmex <=0){
            JOptionPane.showMessageDialog(null,"El valor no puede ser inferior a 0, vuelva a intentar");
            mextextfield.setText("");
            mextaxfield.setText("");

        }else{
            JOptionPane.showMessageDialog(null,"Valor archivado");
            mextextfield.setText("");
            mextaxfield.setText(""); 
        
        }
        }
    }//GEN-LAST:event_mexsaveActionPerformed

    private void argtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_argtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_argtextfieldActionPerformed

    // Evento de reporte semanal
    private void reportweekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportweekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportweekActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adiciotext;
    private javax.swing.JButton argsave;
    private javax.swing.JTextField argtaxfield;
    private javax.swing.JTextField argtextfield;
    private javax.swing.JButton bolsave;
    private javax.swing.JTextField boltaxfield;
    private javax.swing.JTextField boltextfield;
    private javax.swing.JRadioButton buymoney;
    private javax.swing.ButtonGroup buysell;
    private javax.swing.JButton cansave;
    private javax.swing.JTextField cantaxfield;
    private javax.swing.JTextField cantextfield;
    private javax.swing.JButton colsave;
    private javax.swing.JTextField coltaxfield;
    private javax.swing.JTextField coltextfield;
    private javax.swing.JLabel eurconcat;
    private javax.swing.JLabel eurconcat1;
    private javax.swing.JLabel eurconcat2;
    private javax.swing.JLabel eurconcat3;
    private javax.swing.JLabel eurconcat4;
    private javax.swing.JLabel eurconcat5;
    private javax.swing.JLabel eurconcat6;
    private javax.swing.JButton eursave;
    private javax.swing.JTextField eurtaxfield;
    private javax.swing.JTextField eurtextfield;
    private javax.swing.JMenuItem exit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu menubar;
    private javax.swing.JButton mexsave;
    private javax.swing.JTextField mextaxfield;
    private javax.swing.JTextField mextextfield;
    private javax.swing.JLabel moneytext;
    private javax.swing.JMenuBar optionmenu;
    private javax.swing.JPanel panel;
    private javax.swing.JButton reportday;
    private javax.swing.JButton reportmont;
    private javax.swing.JLabel reports;
    private javax.swing.JButton reportweek;
    private javax.swing.JRadioButton sellmoney;
    private javax.swing.JButton solsave;
    private javax.swing.JTextField soltaxfield;
    private javax.swing.JTextField soltextfield;
    private javax.swing.JLabel usaconcat;
    private javax.swing.JButton usasave;
    private javax.swing.JTextField usataxfield;
    private javax.swing.JTextField usatextfield;
    // End of variables declaration//GEN-END:variables

    private int parseInt(JTextField usatextfield) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
