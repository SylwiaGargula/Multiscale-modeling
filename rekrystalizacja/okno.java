/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naiwny.rozrost.ziaren;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Sylwik
 */
public class okno extends javax.swing.JFrame {
    Naiwny naiwny;
    
    int X=10;
    int Y=10;
    public int ilosciteracji;
    public int rozmiarX;
  public  int rozmiarY;
boolean init=false;
    Graphics g;
    int iloscRand;
    
    Color color;
    private boolean isStopped;
    /**
     * Creates new form okno
     */
    public okno() {
        initComponents();
         
    }
    

    
    
    
   
    
    public void przerysuj(int x,int y,Color color)
    {
        g.setColor(color);
        
        g.fillRect(x*rozmiarX, y*rozmiarY, rozmiarX, rozmiarY);
    }
    
   
    
   
    
    public int getWymiarX()
    {
    return Integer.parseInt(WymiarX.getText());
    }
    
    public int getWymiarY()
    {
    return Integer.parseInt(WymiarY.getText());
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        mapa = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WymiarX = new javax.swing.JTextField();
        WymiarY = new javax.swing.JTextField();
        wymiary = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ilosc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        iteracje = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mapaLayout = new javax.swing.GroupLayout(mapa);
        mapa.setLayout(mapaLayout);
        mapaLayout.setHorizontalGroup(
            mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        mapaLayout.setVerticalGroup(
            mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel4.setText("Wymiary");

        jLabel5.setText("X");

        jLabel6.setText("Y");

        WymiarX.setText("100");
        WymiarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WymiarXActionPerformed(evt);
            }
        });

        WymiarY.setText("100");

        wymiary.setText("OK");
        wymiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wymiaryActionPerformed(evt);
            }
        });

        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        jLabel2.setText("Ilość");

        jLabel1.setText("Iteracje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(WymiarX, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wymiary)
                            .addComponent(WymiarY, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Start)
                        .addGap(150, 150, 150))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(iteracje, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ilosc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(303, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(WymiarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iteracje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ilosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(WymiarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wymiary)
                    .addComponent(Start))
                .addGap(53, 90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WymiarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WymiarXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WymiarXActionPerformed

    public int getMapaX()
    {
    return mapa.getWidth();
    }
    
    public int getMapaY()
    {
    return mapa.getHeight();
    }
    
    private void wymiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wymiaryActionPerformed
        // TODO add your handling code here:
        
               
         X=Integer.parseInt(WymiarX.getText());
        System.out.println("wymiar X "+X);
       
         Y=Integer.parseInt(WymiarY.getText());
        System.out.println("wymiar Y "+Y);
          

        rozmiarX=1+mapa.getWidth()/X;
       
        rozmiarY=1+mapa.getHeight()/Y;
       
        g= mapa.getGraphics();
        g.setColor(Color.black);
        for(int i=0; i<X; i++)
        {
        for(int j=0; j<Y; j++)
        {
        g.fillRect(i*rozmiarX, j*rozmiarY, rozmiarX, rozmiarY);
        }
        }
        naiwny=new Naiwny(X, Y);
    }//GEN-LAST:event_wymiaryActionPerformed

    private void mapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapaMouseClicked
        // TODO add your handling code here:
       
              
    }//GEN-LAST:event_mapaMouseClicked



    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
     
            iloscRand=Integer.parseInt(ilosc.getText());
            ilosciteracji=Integer.parseInt(iteracje.getText());
             MC monteCarlo=new MC(ilosciteracji,iloscRand,naiwny,this);
               monteCarlo.rozdzielKoloryZarodkom();
             monteCarlo.zmienStan();

      

        
    }//GEN-LAST:event_StartActionPerformed

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
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                okno okno1=new okno();
                okno1.setVisible(true);
                okno1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start;
    private javax.swing.JTextField WymiarX;
    private javax.swing.JTextField WymiarY;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField ilosc;
    private javax.swing.JTextField iteracje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mapa;
    private javax.swing.JButton wymiary;
    // End of variables declaration//GEN-END:variables
}
