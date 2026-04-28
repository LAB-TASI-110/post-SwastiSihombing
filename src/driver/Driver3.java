package driver;

import java.util.Scanner;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model3 kafe = new Model3();

        // Data awal
        kafe.tambahMenu("Nasi Goreng", 15000, true);
        kafe.tambahMenu("Mie Goreng", 12000, true);
        kafe.tambahMenu("Teh Manis", 5000, true);
        kafe.tambahMenu("Kopi", 7000, false);

        int total = 0;

        while (true) {
            kafe.tampilkanMenu();

            System.out.print("Pilih menu (0 untuk selesai): ");
            int pilih;

            if (input.hasNextInt()) {
                pilih = input.nextInt();
            } else {
                System.out.println("Input harus angka!");
                input.next(); // buang input salah
                continue;
            }

            if (pilih == 0) break;

            Model3.Menu m = kafe.pilihMenu(pilih - 1);

            if (m == null) {
                System.out.println("Menu tidak ditemukan!");
                continue;
            }

            if (!m.tersedia) {
                System.out.println("Menu sedang habis!");
                continue;
            }

            System.out.print("Jumlah: ");
            int jumlah;

            if (input.hasNextInt()) {
                jumlah = input.nextInt();
            } else {
                System.out.println("Jumlah harus angka!");
                input.next();
                continue;
            }

            if (jumlah <= 0) {
                System.out.println("Jumlah tidak valid!");
                continue;
            }

            int subtotal = jumlah * m.harga;
            total += subtotal;

            System.out.println("Ditambahkan: " + m.nama + " x" + jumlah + " = Rp " + subtotal);
        }

        System.out.println("\n=== STRUK PEMESANAN ===");
        System.out.println("Total Bayar: Rp " + total);

        input.close();
    }
}