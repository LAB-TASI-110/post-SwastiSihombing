package model;

import java.util.ArrayList;

public class Model3 {

    public static class Menu {
        public String nama;
        public int harga;
        public boolean tersedia;

        public Menu(String nama, int harga, boolean tersedia) {
            this.nama = nama;
            this.harga = harga;
            this.tersedia = tersedia;
        }
    }

    private ArrayList<Menu> daftarMenu = new ArrayList<>();

    public void tambahMenu(String nama, int harga, boolean tersedia) {
        daftarMenu.add(new Menu(nama, harga, tersedia));
    }

    public void tampilkanMenu() {
        System.out.println("\n=== DAFTAR MENU ===");
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            String status = m.tersedia ? "Tersedia" : "Habis";
            System.out.println((i + 1) + ". " + m.nama + " | Rp " + m.harga + " | " + status);
        }
    }

    public Menu pilihMenu(int index) {
        if (index >= 0 && index < daftarMenu.size()) {
            return daftarMenu.get(index);
        }
        return null;
    }
}