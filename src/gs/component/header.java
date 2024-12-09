/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gs.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.Timer;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class header extends javax.swing.JPanel {
    /**
     * Creates new form header
     */
    public header() {
        initComponents();
        setJam();
        Locale.setDefault(new Locale("id", "ID"));
        tanggal.setText(new WaktuSekarang().getTgl());
    }

    private void setJam(){
        ActionListener listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                jam.setText(new WaktuSekarang().getWkt());
            }
        };
        new Timer(1000, listener).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jam = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(45, 149, 150));

        jam.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jam.setForeground(new java.awt.Color(255, 255, 255));
        jam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jam.setText("JAM");

        tanggal.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tanggal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tanggal.setText("Hari, tanggal");

        namaOrang.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        namaOrang.setForeground(new java.awt.Color(255, 255, 255));
        namaOrang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namaOrang.setText("nama orang");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/AKM2_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaOrang, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namaOrang, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tanggal)
                        .addGap(0, 0, 0)
                        .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jam;
    public static final javax.swing.JLabel namaOrang = new javax.swing.JLabel();
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}
