import java.util.Scanner;
import model.Model1;

public class Driver1 {

    public static Model1 cariKota(Model1[] daftar, String kode) {
        for (Model1 k : daftar) {
            if (k.getKodeKota().equalsIgnoreCase(kode)) {
                return k;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Model1[] daftarKota = {
            new Model1("MDN", "Medan", 10000, "Dalam Pulau"),
            new Model1("BLG", "Balige", 8000, "Dalam Pulau"),
            new Model1("JKT", "Jakarta", 15000, "Luar Pulau"),
            new Model1("SBY", "Surabaya", 14000, "Luar Pulau")
        };

        System.out.println("=== DAFTAR ONGKIR DEL-EXPRESS ===");
        for (Model1 k : daftarKota) {
            k.tampilkanData();
        }

        int totalBerat = 0;
        int totalBiaya = 0;
        boolean dapatAsuransi = false;

        System.out.println("\nMasukkan data (ketik END untuk selesai)");

        while (true) {
            System.out.print("\nKode Kota: ");
            String kode = input.nextLine();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            Model1 kota = cariKota(daftarKota, kode);

            if (kota == null) {
                System.out.println("Kode tidak ditemukan!");
                continue;
            }

            System.out.print("Berat paket (kg): ");
            int berat = input.nextInt();
            input.nextLine(); // buang newline

            int biaya = berat * kota.getOngkirPerKg();

            totalBerat += berat;
            totalBiaya += biaya;

            if (kota.getKeterangan().equalsIgnoreCase("Luar Pulau")) {
                dapatAsuransi = true;
            }
        }

        double diskon = 0;
        if (totalBerat > 10) {
            diskon = totalBiaya * 0.10;
        }

        double totalBayar = totalBiaya - diskon;

        System.out.println("\n===== STRUK =====");
        System.out.println("Total Berat : " + totalBerat + " kg");
        System.out.println("Total Ongkir: Rp " + totalBiaya);
        System.out.println("Diskon      : Rp " + (int) diskon);
        System.out.println("Total Bayar : Rp " + (int) totalBayar);

        if (dapatAsuransi) {
            System.out.println("Bonus       : Asuransi Gratis");
        }

        input.close();
    }
}