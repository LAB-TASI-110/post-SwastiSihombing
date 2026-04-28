package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] stok = new int[n];

        for (int i = 0; i < n; i++) {
            stok[i] = input.nextInt();
        }

        int kategori = input.nextInt();

        Model2 data = new Model2(stok);

        int hasil = data.hitungKategori(kategori);

        System.out.println(hasil);

        input.close();
    }
}