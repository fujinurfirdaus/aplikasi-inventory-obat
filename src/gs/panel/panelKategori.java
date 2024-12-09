
package gs.panel;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class panelKategori extends javax.swing.JPanel {

    public final Connection conn = new koneksi().configDB();
    private DefaultTableModel tabmode;
    public panelKategori() {
        initComponents();
        btnBatal.setVisible(false);
        btnHapus.setVisible(false);
        loadkategori();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pnTampilKategori = new gs.component.panelBoarder();
        btnTambah = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        scrollPaneWin111 = new gs.scroll.win11.ScrollPaneWin11();
        tableKategori = new gs.component.Table();
        fsdfd = new javax.swing.JLabel();
        btnCari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pnTambahKategori = new gs.component.panelBoarder();
        judul = new javax.swing.JLabel();
        btnTambah1 = new rojerusan.RSMaterialButtonRectangle();
        btnBatal1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaKat = new javax.swing.JTextField();
        kodeKat = new javax.swing.JLabel();

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        pnTampilKategori.setBackground(new java.awt.Color(255, 255, 255));

        btnTambah.setBackground(new java.awt.Color(38, 80, 115));
        btnTambah.setText("TAMBAH");
        btnTambah.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(204, 0, 0));
        btnHapus.setText("HAPUS");
        btnHapus.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(255, 204, 0));
        btnBatal.setText("BATAL");
        btnBatal.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        tableKategori.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKategoriMouseClicked(evt);
            }
        });
        scrollPaneWin111.setViewportView(tableKategori);

        fsdfd.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        fsdfd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fsdfd.setText("Form Tampil Kategori");
        fsdfd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnCari.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        btnCari.setForeground(new java.awt.Color(153, 153, 153));
        btnCari.setText("Cari Disini ...");
        btnCari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        btnCari.setOpaque(false);
        btnCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCariFocusGained(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnCariKeyTyped(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Search Folder.png"))); // NOI18N

        javax.swing.GroupLayout pnTampilKategoriLayout = new javax.swing.GroupLayout(pnTampilKategori);
        pnTampilKategori.setLayout(pnTampilKategoriLayout);
        pnTampilKategoriLayout.setHorizontalGroup(
            pnTampilKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTampilKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTampilKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                    .addGroup(pnTampilKategoriLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(fsdfd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnTampilKategoriLayout.setVerticalGroup(
            pnTampilKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTampilKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fsdfd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTampilKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnTampilKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(pnTampilKategori, "card2");

        pnTambahKategori.setBackground(new java.awt.Color(255, 255, 255));

        judul.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Form Tambah Kategori");

        btnTambah1.setBackground(new java.awt.Color(38, 80, 115));
        btnTambah1.setText("TAMBAH");
        btnTambah1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnBatal1.setBackground(new java.awt.Color(255, 204, 0));
        btnBatal1.setText("Batal");
        btnBatal1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setText("Kode Kategori");
        jLabel2.setPreferredSize(new java.awt.Dimension(62, 20));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Nama Kategori");

        namaKat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        namaKat.setPreferredSize(new java.awt.Dimension(7, 20));
        namaKat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaKatActionPerformed(evt);
            }
        });

        kodeKat.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N

        javax.swing.GroupLayout pnTambahKategoriLayout = new javax.swing.GroupLayout(pnTambahKategori);
        pnTambahKategori.setLayout(pnTambahKategoriLayout);
        pnTambahKategoriLayout.setHorizontalGroup(
            pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTambahKategoriLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTambahKategoriLayout.createSequentialGroup()
                        .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTambahKategoriLayout.createSequentialGroup()
                        .addGroup(pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kodeKat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaKat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87))
                    .addGroup(pnTambahKategoriLayout.createSequentialGroup()
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnTambahKategoriLayout.setVerticalGroup(
            pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTambahKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeKat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        mainPanel.add(pnTambahKategori, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(pnTambahKategori);
        mainPanel.repaint();
        mainPanel.revalidate();

        btnTambah1.setText("SIMPAN");
        

        if (btnTambah.getText().equals("UBAH")){
            judul.setText("Form Ubah Data Kategori");
            ubahDataTabel();
        } else if (btnTambah.getText().equals("TAMBAH")){
            judul.setText("Form Tambah Data Kategori");
            idAuto();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        btnTambah.setText("TAMBAH");
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tableKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKategoriMouseClicked
            if (btnTambah.getText().equals("TAMBAH")){
            btnTambah.setText("UBAH");

            btnBatal.setVisible(true);
            btnHapus.setVisible(true);
            idAuto();
        }
    }//GEN-LAST:event_tableKategoriMouseClicked

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        if (btnTambah1.getText().equals("TAMBAH")){
            btnTambah1.setText("SIMPAN");
            idAuto();
        }
        else if (btnTambah1.getText().equals("SIMPAN"))
        {
            simpanData();
        }
        else if (btnTambah1.getText().equals("PERBAHARUI"))
        {
            perbaruiData();
        }
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(pnTampilKategori);
        mainPanel.repaint();
        mainPanel.revalidate();
        resetForm();
        btnBatal.setVisible(false);
        btnHapus.setVisible(false);
        loadkategori();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void namaKatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaKatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaKatActionPerformed

    private void btnCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCariFocusGained
        btnCari.setText("");
    }//GEN-LAST:event_btnCariFocusGained

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyTyped
        String sqlPencarian = "select * from tb_kategori where kode_kategori like '%"+btnCari.getText()+"%' or nama_kategori like '%"+btnCari.getText()+"%'";
        pencarian(sqlPencarian);
        

    }//GEN-LAST:event_btnCariKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private javax.swing.JTextField btnCari;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private rojerusan.RSMaterialButtonRectangle btnTambah1;
    private javax.swing.JLabel fsdfd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel kodeKat;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField namaKat;
    private gs.component.panelBoarder pnTambahKategori;
    private gs.component.panelBoarder pnTampilKategori;
    private gs.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private gs.component.Table tableKategori;
    // End of variables declaration//GEN-END:variables

    private void loadkategori() {
        Object[] Baris = {"No","Kode Kategori","Nama Kategori"};
        tabmode = new DefaultTableModel(null, Baris);
        tableKategori.setModel(tabmode);
        String sql = "select * from tb_kategori order by kode_kategori asc";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_kategori = hasil.getString("kode_kategori");
                String nama_kategori = hasil.getString("nama_kategori");
                String[] data = {"",kode_kategori,nama_kategori};
                tabmode.addRow(data);
                noTable();
            }
        } catch (Exception e){
        }
    }
    
    private void idAuto() {
     PreparedStatement st = null;
       ResultSet rs = null;
       String urutan = null;
       
       Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);
        
        String sql = "SELECT RIGHT (kode_kategori,3) AS Nomor FROM tb_kategori WHERE kode_kategori LIKE 'KAT" +no+"%' ORDER BY kode_kategori DESC LIMIT 1";
        
        try {
            st =conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if (rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "KAT" + no + String.format("%03d", nomor);
                kodeKat.setText(urutan);
                
            } else{
                urutan = "KAT" +no + "001";
                kodeKat.setText(urutan);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    

    private void simpanData() {
        if(kodeKat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Kategori tidak boleh kosong");
        } else if (namaKat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Kategori tidak boleh kosong");
        }
        
        else {
        String sql = "insert into tb_kategori values (?,?)";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kodeKat.getText());
            stat.setString(2, namaKat.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            //            String refresh = "select * from tb_barang";
            resetForm();
            loadkategori();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
        }
    }

    private void resetForm() {
       btnHapus.setVisible(false);
        btnTambah.setText("TAMBAH");
        kodeKat.setText("");
        namaKat.setText("");
        
    }

    private void perbaruiData() {
        String sql = "UPDATE tb_kategori SET kode_kategori=?,nama_kategori=? WHERE kode_kategori='"+kodeKat.getText()+"'";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kodeKat.getText());
            stat.setString(2, namaKat.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
            //            String refresh = "select * from tb_barang";
            
            resetForm();
            loadkategori();
            namaKat.requestFocus();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah "+e);
        }
    }

    private void hapusData() {
        int bar = tableKategori.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        

        int ok = JOptionPane.showConfirmDialog (null," Apakah Anda Yakin Ingin "
            + "Menghapus Data","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql="delete from tb_kategori where kode_kategori='"+b+"'";
            try {
                PreparedStatement stat=conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
               
                loadkategori();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+ex);
            }
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

    private void ubahDataTabel() {
      pnTambahKategori.setVisible(false);
        pnTambahKategori.setVisible(false);
        int bar = tableKategori.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        

//        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
//        Date dateValue = null;
//        try{
//            dateValue = date.parse((String)tableKategori.getValueAt(bar, 1));
//        } catch (ParseException ex){
//            Logger.getLogger(panelKategori.class.getName()).log(Level.SEVERE, null, ex);
//        }

        kodeKat.setText(b);
        namaKat.setText(c);
        
        
       
        btnTambah1.setText("PERBAHARUI");
        btnBatal1.setVisible(true);
    }

    private void pencarian(String sqlPencarian) {
      Object[] Baris = {"No","Kode Kategori","Nama Kategori"};
        tabmode = new DefaultTableModel(null, Baris);
        tableKategori.setModel(tabmode);
        int brs = tableKategori.getRowCount();
        for (int i = 0; 1 < brs; i++){
            tabmode.removeRow(1);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sqlPencarian);
            while (hasil.next()){
                String kode_kategori = hasil.getString("kode_kategori");
                String nama_kategori = hasil.getString("nama_kategori");
                
                String[] data = {"",kode_kategori,nama_kategori};
                tabmode.addRow(data);
                noTable();
            }
        } catch (Exception e){
        }
    }
}
