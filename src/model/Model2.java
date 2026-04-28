package model;

public class Model2 {
    int[] stok;

    public Model2(int[] stok) {
        this.stok = stok;
    }

    public int hitungKategori(int kategori) {
        int total = 0;

        for (int i = 0; i < stok.length; i++) {
            if ((i + 1) % kategori == 0) {
                total += stok[i];
            }
        }

        return total;
    }
}