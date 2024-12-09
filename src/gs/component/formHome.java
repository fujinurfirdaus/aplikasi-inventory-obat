
package gs.component;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class formHome extends javax.swing.JPanel {
    private DefaultTableModel tabmode;
    public final Connection conn = new koneksi().configDB();

    public formHome() {
        initComponents();
        dataTable();
        dataTablesering();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableExpired = new gs.component.Table();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        jPanel1 = new javax.swing.JPanel();
        jmlObat = new gs.component.panelBoarder();
        lblJumlahObat = new javax.swing.JLabel();
        lblJumlahObat1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jmlKategori = new gs.component.panelBoarder();
        jLabel6 = new javax.swing.JLabel();
        jmlExpiredObat = new javax.swing.JLabel();
        lblJumlahExp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jmlBagian = new gs.component.panelBoarder();
        lblJumlahMasuk = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblJumlahMasuk1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jmlUser = new gs.component.panelBoarder();
        lblJumlahKeluar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblJumlahKeluar1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesering = new gs.component.Table();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIMANO Versi 1.0.0 Copyright Peserta Kuliah Kerja Praktek (KKP) UNINDRA 2024");

        tableExpired.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableExpired);

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 153, 153));
        rSMaterialButtonRectangle1.setText("CETAK data obat hampir expired");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jmlObat.setBackground(new java.awt.Color(0, 204, 204));
        jmlObat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        lblJumlahObat.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblJumlahObat.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahObat.setText("Order Obat");

        lblJumlahObat1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        lblJumlahObat1.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahObat1.setText("999");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Add Shopping Cart.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("pesanan ke supplier");

        javax.swing.GroupLayout jmlObatLayout = new javax.swing.GroupLayout(jmlObat);
        jmlObat.setLayout(jmlObatLayout);
        jmlObatLayout.setHorizontalGroup(
            jmlObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmlObatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJumlahObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJumlahObat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jmlObatLayout.setVerticalGroup(
            jmlObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmlObatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addGroup(jmlObatLayout.createSequentialGroup()
                        .addComponent(lblJumlahObat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblJumlahObat1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel1.add(jmlObat);

        jmlKategori.setBackground(new java.awt.Color(0, 204, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Capsule_2.png"))); // NOI18N

        jmlExpiredObat.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jmlExpiredObat.setForeground(new java.awt.Color(255, 255, 255));
        jmlExpiredObat.setText("Obat Expired");

        lblJumlahExp.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        lblJumlahExp.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahExp.setText("999");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Jumlah Obat hampir Expired");

        javax.swing.GroupLayout jmlKategoriLayout = new javax.swing.GroupLayout(jmlKategori);
        jmlKategori.setLayout(jmlKategoriLayout);
        jmlKategoriLayout.setHorizontalGroup(
            jmlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jmlKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jmlExpiredObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJumlahExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jmlKategoriLayout.setVerticalGroup(
            jmlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmlKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jmlKategoriLayout.createSequentialGroup()
                        .addComponent(jmlExpiredObat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblJumlahExp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jmlKategori);

        jmlBagian.setBackground(new java.awt.Color(0, 204, 204));

        lblJumlahMasuk.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblJumlahMasuk.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahMasuk.setText("Obat Masuk");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Cash in Hand.png"))); // NOI18N

        lblJumlahMasuk1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        lblJumlahMasuk1.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahMasuk1.setText("999");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("masuk bulan ini");

        javax.swing.GroupLayout jmlBagianLayout = new javax.swing.GroupLayout(jmlBagian);
        jmlBagian.setLayout(jmlBagianLayout);
        jmlBagianLayout.setHorizontalGroup(
            jmlBagianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmlBagianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlBagianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJumlahMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJumlahMasuk1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jmlBagianLayout.setVerticalGroup(
            jmlBagianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmlBagianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlBagianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jmlBagianLayout.createSequentialGroup()
                        .addComponent(lblJumlahMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblJumlahMasuk1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel1.add(jmlBagian);

        jmlUser.setBackground(new java.awt.Color(0, 204, 204));

        lblJumlahKeluar.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblJumlahKeluar.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahKeluar.setText("Distribusi Obat");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Accounting.png"))); // NOI18N

        lblJumlahKeluar1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        lblJumlahKeluar1.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahKeluar1.setText("999");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Distribusi Bulan ini");

        javax.swing.GroupLayout jmlUserLayout = new javax.swing.GroupLayout(jmlUser);
        jmlUser.setLayout(jmlUserLayout);
        jmlUserLayout.setHorizontalGroup(
            jmlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jmlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJumlahKeluar1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblJumlahKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        jmlUserLayout.setVerticalGroup(
            jmlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jmlUserLayout.createSequentialGroup()
                        .addComponent(lblJumlahKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblJumlahKeluar1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        jPanel1.add(jmlUser);

        tablesering.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablesering);

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(0, 153, 153));
        rSMaterialButtonRectangle2.setText("CETAK data stok < 20");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Obat - Obat yang mendekati atau sudah Expired (h- 3 Bulan) , harap Cek!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Stok obat <20, Harap segera lakukan Order ke Supplier !!!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        tampilLaporanExp();
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
       tampilLaporanStokKurang();
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private gs.component.panelBoarder jmlBagian;
    private javax.swing.JLabel jmlExpiredObat;
    private gs.component.panelBoarder jmlKategori;
    private gs.component.panelBoarder jmlObat;
    private gs.component.panelBoarder jmlUser;
    private javax.swing.JLabel lblJumlahExp;
    private javax.swing.JLabel lblJumlahKeluar;
    private javax.swing.JLabel lblJumlahKeluar1;
    private javax.swing.JLabel lblJumlahMasuk;
    private javax.swing.JLabel lblJumlahMasuk1;
    private javax.swing.JLabel lblJumlahObat;
    private javax.swing.JLabel lblJumlahObat1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private gs.component.Table tableExpired;
    private gs.component.Table tablesering;
    // End of variables declaration//GEN-END:variables

    private void dataTable() {
        Object[] Baris = {"Kode Obat","Nama Obat","Jumlah","Expired"};
        tabmode = new DefaultTableModel(null, Baris);
        tableExpired.setModel(tabmode);
        String sql = "SELECT * FROM tb_obat\n" +
"WHERE tglexp <= LAST_DAY(CURRENT_DATE + INTERVAL 3 MONTH)\n" +
"ORDER BY tglexp ASC;";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_obat = hasil.getString("kode_obat");
                String nama_obat = hasil.getString("nama_obat");
//                String kode_kategori = hasil.getString("kode_kategori");
//                String nama_kategori = hasil.getString("nama_kategori");
                String jumlah = hasil.getString("jumlah");
//                String satuan = hasil.getString("satuan");
//                String keterangan = hasil.getString("keterangan");
                String tanggaled = hasil.getString("tglexp");
                String[] data = {kode_obat,nama_obat,jumlah,tanggaled};
                tabmode.addRow(data);
//                noTable();
//                lebarKolom();
            }
        } catch (Exception e){
        }
        
    }
    
    private void dataTablesering() {
        Object[] Baris = {"Kode Obat","Nama Obat","Jumlah","Satuan","Expired"};
        tabmode = new DefaultTableModel(null, Baris);
        tablesering.setModel(tabmode);
        String sql = "SELECT * FROM tb_obat WHERE jumlah < 20 ORDER BY jumlah ASC;";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_obat = hasil.getString("kode_obat");
                String nama_obat = hasil.getString("nama_obat");
//                String kode_kategori = hasil.getString("kode_kategori");
//                String nama_kategori = hasil.getString("nama_kategori");
                String jumlah = hasil.getString("jumlah");
                String satuan = hasil.getString("satuan");
//                String keterangan = hasil.getString("keterangan");
                String tanggaled = hasil.getString("tglexp");
                String[] data = {kode_obat,nama_obat,jumlah,satuan,tanggaled};
                tabmode.addRow(data);
//                noTable();
//                lebarKolom();
            }
        } catch (Exception e){
        }
        
    }

    private void noTable() {
        int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor +".",a,0);
        }
    }

//    private void lebarKolom() {
//    TableColumn column;
//        tableExpired.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
//        column = tableExpired.getColumnModel().getColumn(0);
//        column.setPreferredWidth(50);
//        column = tableExpired.getColumnModel().getColumn(1);
//        column.setPreferredWidth(100);
//        column = tableExpired.getColumnModel().getColumn(2);
//        column.setPreferredWidth(200);
//        column = tableExpired.getColumnModel().getColumn(3);
//        column.setPreferredWidth(150);
//        column = tableExpired.getColumnModel().getColumn(4);
//        column.setPreferredWidth(200);
//        column = tableExpired.getColumnModel().getColumn(5);
//        column.setPreferredWidth(250);
//        column = tableExpired.getColumnModel().getColumn(6);
//        column.setPreferredWidth(120);
//        column = tableExpired.getColumnModel().getColumn(7);
//        column.setPreferredWidth(100);
//        column = tableExpired.getColumnModel().getColumn(8);
//        column.setPreferredWidth(100);    
//    }
    
    private int jumlahObat() {
    int jumlahObat = 0;
    try {
        String sql = "SELECT COUNT(*) AS total FROM tb_pemesanan;";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        
        if (rs.next()){
            jumlahObat = rs.getInt("total");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
        return jumlahObat;
    
}
    
     private int jumlahexp() {
    int jumlahexp = 0;
    try {
        String sql = "SELECT COUNT(*) AS jumlah_obat_expired\n" +
"FROM tb_obat\n" +
"WHERE tglexp < CURDATE();";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        
        if (rs.next()){
            jumlahexp = rs.getInt("jumlah_obat_expired");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
        return jumlahexp;
    
}
     
     private int jumlahMasuk() {
    int jumlahMasuk = 0;
    try {
        String sql = "SELECT COUNT(*) AS jumlah_trx_masuk FROM tb_obat_masuk WHERE MONTH(tanggal) = MONTH(CURDATE()) AND YEAR(tanggal) = YEAR(CURDATE());";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        
        if (rs.next()){
            jumlahMasuk = rs.getInt("jumlah_trx_masuk");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
        return jumlahMasuk;
    
}
     
      private int jumlahKeluar() {
    int jumlahKeluar = 0;
    try {
        String sql = "SELECT COUNT(*) AS jumlah_trx_keluar FROM tb_obatkeluar WHERE MONTH(tanggal) = MONTH(CURDATE()) AND YEAR(tanggal) = YEAR(CURDATE());";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        
        if (rs.next()){
            jumlahKeluar = rs.getInt("jumlah_trx_keluar");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
        return jumlahKeluar;
    
}
     
     
    
    private void loadData() {
       lblJumlahObat1.setText(String.valueOf(jumlahObat()));
       lblJumlahExp.setText(String.valueOf(jumlahexp()));
       lblJumlahMasuk1.setText(String.valueOf(jumlahMasuk()));
       lblJumlahKeluar1.setText(String.valueOf(jumlahKeluar()));
    }

    private void tampilLaporanExp() {
                try {
                       String reportPath = "src/gs/Laporan/laporanExp.jasper";
                       Connection conn = new koneksi().configDB();

                       HashMap<String, Object> parameters = new HashMap<>();
                       JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                       JasperViewer viewer = new JasperViewer(print, false);
                       viewer.setVisible(true);
//                           JRViewer jr=new JRViewer(print); 
//                        body.removeAll();
//                        body.setLayout(new BorderLayout());
//                        body.repaint();
//                        body.add(jr);
//                        body.revalidate();

                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"Error menampilkan Laporan " + e);
                   }
  
    }

    private void tampilLaporanStokKurang() {
         try {
                       String reportPath = "src/gs/Laporan/laporanstokkurang.jasper";
                       Connection conn = new koneksi().configDB();

                       HashMap<String, Object> parameters = new HashMap<>();
                       JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                       JasperViewer viewer = new JasperViewer(print, false);
                       viewer.setVisible(true);
//                           JRViewer jr=new JRViewer(print); 
//                        body.removeAll();
//                        body.setLayout(new BorderLayout());
//                        body.repaint();
//                        body.add(jr);
//                        body.revalidate();

                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"Error menampilkan Laporan " + e);
                   }
    }
}
