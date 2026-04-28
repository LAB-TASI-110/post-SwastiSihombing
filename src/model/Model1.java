package model;

public class Model1 {
    private String kodeKota;
    private String namaKota;
    private int ongkirPerKg;
    private String keterangan;

    // Constructor
    public Model1(String kodeKota, String namaKota, int ongkirPerKg, String keterangan) {
        this.kodeKota = kodeKota;
        this.namaKota = namaKota;
        this.ongkirPerKg = ongkirPerKg;
        this.keterangan = keterangan;
    }

    // Getter
    public String getKodeKota() {
        return kodeKota;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public int getOngkirPerKg() {
        return ongkirPerKg;
    }

    public String getKeterangan() {
        return keterangan;
    }

    // Method tampilkan data
    public void tampilkanData() {
        System.out.println(kodeKota + " | " + namaKota + " | Rp " + ongkirPerKg + "/kg | " + keterangan);
    }
}