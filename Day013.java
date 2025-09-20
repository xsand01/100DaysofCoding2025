package Coding2025;

import java.util.*;

public class Day13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===Selamat Datang di Program Evaluasi Java===");
        System.out.print("Masukan nama lengkap = ");
        String nama = in.nextLine();
        System.out.print("Masukan NIM          = ");
        String nim = in.nextLine();
        System.out.print("Masukan Usia         = ");
        int usia = in.nextInt();
        System.out.print("Masukan Tinggi Badan = ");
        float tb = in.nextFloat();
        in.nextLine();
        System.out.print("Masukan Hobi         = ");
        String hobi = in.nextLine();
        System.out.print("Masukan status Mahasiswa (true jika aktif dan false jika tidak) = ");
        boolean status = in.nextBoolean();
        System.out.println("");

        System.out.println("========================================================");
        int tabungan = 1000_000;
        System.out.println("Tabungan awal             = " + tabungan);
        tabungan += 500_000; // Uang saku masuk
        System.out.println("di tambah uang saku masuk = " + tabungan);
        tabungan -= 200_000; // Untuk belanja     

        System.out.println("di kurang uang belanjaan " + tabungan);

        System.out.println("========================================================");

        final double phi = 3.14159;
        System.out.print("Masukan jari-jari (r) = ");
        float r = in.nextFloat();
        double luas = phi * r * r;

        System.out.println("---Biodata Mahasiswa---");
        System.out.println("Nama Lengkap     = " + nama);
        System.out.println("NIM              = " + nim);
        System.out.println("Usia             = " + usia + "Tahun");
        System.out.println("Tinggi Badan     = " + tb);
        System.out.println("Hobi             = " + hobi);
        System.out.println("Status Mahasiswa = " + status);
        System.out.println("Tabungan         = " + tabungan);
        System.out.printf("Luas Lingkaran    = %.2f\n ", luas);

    }
}

}
