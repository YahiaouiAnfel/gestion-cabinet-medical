/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medecin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class CHOISIRANALYSE extends javax.swing.JFrame {
DefaultTableModel bbb=new DefaultTableModel();

Statement stmt;
connexionBD conn = new connexionBD();
    /** Creates new form CHOISIRANALYSE */
    public CHOISIRANALYSE() {
        initComponents();   this.setIconImage(new ImageIcon(getClass().getResource("Cabinet.png")).getImage());
        this.setTitle("ANALYSES");//nom de la fenetre 
    //Nous demandons maintenant à notre objet de se positionner au centre
    this.setLocationRelativeTo(null);
     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        principale2 = new javax.swing.JPanel();
        nomcabinet2 = new javax.swing.JLabel();
        ordo2 = new javax.swing.JLabel();
        pat2 = new javax.swing.JLabel();
        nompren2 = new javax.swing.JLabel();
        nomprenom2 = new javax.swing.JTextPane();
        dr2 = new javax.swing.JLabel();
        nommed2 = new javax.swing.JTextPane();
        num2 = new javax.swing.JLabel();
        codepatient2 = new javax.swing.JTextPane();
        photo2 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        dateorg2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(0, 51, 102));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(50, 50));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(50, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("ID  Analyse:");
        jLabel4.setAutoscrolls(true);

        jScrollPane1.setViewportView(jTextPane1);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medecin/ajouter-crayon-icone-4828-32.png"))); // NOI18N
        jButton7.setText("          Ajouter");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 51, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medecin/imprimante-icone-6110-32.png"))); // NOI18N
        jButton8.setText("     Imprimer");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 150, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        principale2.setBackground(new java.awt.Color(255, 255, 255));
        principale2.setAutoscrolls(true);
        principale2.setEnabled(false);
        principale2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principale2MouseClicked(evt);
            }
        });

        nomcabinet2.setBackground(new java.awt.Color(153, 153, 153));
        nomcabinet2.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        nomcabinet2.setText("Cabinet Medical ");
        nomcabinet2.setToolTipText("");

        ordo2.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        ordo2.setText("Ordonnance ");

        pat2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        pat2.setText("patient (e);");

        nompren2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        nompren2.setText("Nom et prenom:");

        nomprenom2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nomprenom2.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        nomprenom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomprenom2MouseClicked(evt);
            }
        });
        nomprenom2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomprenom2KeyPressed(evt);
            }
        });

        dr2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        dr2.setText("Dr.");

        nommed2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nommed2.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N

        num2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        num2.setText("Numero :");

        codepatient2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        codepatient2.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N

        date2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        date2.setText("Le:");

        dateorg2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dateorg2.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        dateorg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateorg2MouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Analyse A Faire:"); // NOI18N
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout principale2Layout = new javax.swing.GroupLayout(principale2);
        principale2.setLayout(principale2Layout);
        principale2Layout.setHorizontalGroup(
            principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principale2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principale2Layout.createSequentialGroup()
                        .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principale2Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(nomcabinet2))
                            .addGroup(principale2Layout.createSequentialGroup()
                                .addComponent(dr2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nommed2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principale2Layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(ordo2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(principale2Layout.createSequentialGroup()
                        .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(principale2Layout.createSequentialGroup()
                                .addComponent(photo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date2)
                                .addGap(18, 18, 18)
                                .addComponent(dateorg2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principale2Layout.createSequentialGroup()
                                        .addComponent(num2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(codepatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principale2Layout.createSequentialGroup()
                                        .addComponent(nompren2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomprenom2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(pat2)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE))))
        );
        principale2Layout.setVerticalGroup(
            principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principale2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomcabinet2)
                .addGap(8, 8, 8)
                .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(principale2Layout.createSequentialGroup()
                        .addComponent(photo2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(dr2))
                    .addGroup(principale2Layout.createSequentialGroup()
                        .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateorg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date2))
                        .addGap(27, 27, 27)
                        .addComponent(nommed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pat2)
                .addGap(18, 18, 18)
                .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num2)
                    .addComponent(codepatient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(principale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nompren2)
                    .addComponent(nomprenom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Analyses Medicales");
        jLabel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(principale2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(203, 203, 203)
                .addComponent(principale2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 63, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane4.setViewportView(jPanel1);

        jMenu1.setText("ANALYSES ");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Ajouter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed




        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened






















        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        jButton7.setBackground(new java.awt.Color(204,0,51));         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String ID= jTextPane1.getText();
        String nomA="";String idA="";
        try {//verifier d abord si l email existe deja
            stmt =conn.getconnexionBD().createStatement();
            ResultSet result =stmt.executeQuery("SELECT * FROM analyses;" );

            int x=0;
            while (( result.next())&&( x==0)){
                idA= result.getString( "id" );
                nomA= result.getString( "nom" );
                if (ID.equals(idA)){
                    x=1;
                }
            }

            if(x==1)
            {
                String T="";
                T=jTextArea1.getText();
                jTextArea1.setText(T+"\n"+"** "+nomA);

            }
            else{
            JOptionPane.showMessageDialog(null,"INTROUVABLE");
            }

        }catch(SQLException ex){//le type de l exception ici c est SQLException qui est predefinie dans la class exception
            System.out.println(ex);//il t affiche la raison pk le try ne marche pas
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        jButton8.setBackground(new java.awt.Color(204,0,51));         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MPanelPrinter printP = new  MPanelPrinter(principale2);
        printP.print();
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void nomprenom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomprenom2MouseClicked
        String codepatientt =codepatient2.getText();

        try {

            stmt =conn.getconnexionBD().createStatement();
            ResultSet result =stmt.executeQuery("SELECT * FROM patient;" );//execute la requete
            //JOptionPane.showMessageDialog(null,"requete succes");afiche que la requete a marcher

            int x=0;
            String NOM="";
            String PRENOM="";

            while (( result.next())&&( x==0)){

                String codep = result.getString( "idPatient" )+"";

                if (codep.equals(codepatientt)){
                    x=1;
                    NOM = result.getString( "nom" );
                    PRENOM = result.getString("prenom" );}
            }
            if(x==1)
            {
                nomprenom2.setText(NOM+"    "+PRENOM);

            }else{
                codepatient2.setText("");
            }

        }catch(SQLException ex){//le type de l exception ici c est SQLException qui est predefinie dans la class exception
            System.out.println(ex);//il t affiche la raison pk le try ne marche pas
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_nomprenom2MouseClicked

    private void nomprenom2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomprenom2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomprenom2KeyPressed

    private void dateorg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateorg2MouseClicked
        Date aujourdhui = new Date();
        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        String t=shortDateFormat+"";
        dateorg2.setText(shortDateFormat.format(aujourdhui));        // TODO add your handling code here:
    }//GEN-LAST:event_dateorg2MouseClicked

    private void principale2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principale2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_principale2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new ANALYSES().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(CHOISIRANALYSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHOISIRANALYSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHOISIRANALYSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHOISIRANALYSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CHOISIRANALYSE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane codepatient2;
    private javax.swing.JLabel date2;
    private javax.swing.JTextPane dateorg2;
    private javax.swing.JLabel dr2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel nomcabinet2;
    private javax.swing.JTextPane nommed2;
    private javax.swing.JLabel nompren2;
    private javax.swing.JTextPane nomprenom2;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel ordo2;
    private javax.swing.JLabel pat2;
    private javax.swing.JLabel photo2;
    private javax.swing.JPanel principale2;
    // End of variables declaration//GEN-END:variables

}
