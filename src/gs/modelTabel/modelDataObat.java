
package gs.modelTabel;

import gs.component.*;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class modelDataObat {

    public String getKode_obat() {
        return kode_obat;
    }

    public void setKode_obat(String kode_obat) {
        this.kode_obat = kode_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getSatuan() {
        return Satuan;
    }

    public void setSatuan(String Satuan) {
        this.Satuan = Satuan;
    }
    
    String kode_obat;
    String nama_obat;
    String Satuan;

}
