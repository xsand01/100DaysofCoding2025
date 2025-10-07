package Coding2025;

import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Pilih Salah Satu Operasi Berikut ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Keluar");
        System.out.print("Masukan Pilihan : ");
        int pil = in.nextInt();

        if (pil == 1) {
            System.out.println("===Anda Memilih Luas Persegi===");
            System.out.print("Masukan sisi = ");
            int sisi = in.nextInt();
            if (sisi <= 0) {
                System.out.println("sisi tidak boleh lebih kecil dari 0");
            } else {
                System.out.println("Hasil Luas Persegi = " + (sisi * sisi));
            }

        } else if (pil == 2) {
            System.out.println("=== Anda Memilih Luas Persegi Panjang ===");
            System.out.print("Masukan Panjang = ");
            int p = in.nextInt();
            System.out.print("Masukan Lebar = ");
            int l = in.nextInt();

            if (p <= 0 || l <= 0) {
                System.out.println("Nilai panjang atau lebar tidak boleh lebih kecil atau sama dengan 0");
            } else {
                System.out.println("Hasil Persegi Panjang = " + (p * l));
            }

        } else if (pil == 3) {
            System.out.println("=== Anda Memilih Luas Lingkaran ===");
            double pi = Math.PI;
            System.out.print("Masukan Jari-jari = ");
            double r = in.nextDouble();
            if (r <= 0) {
                System.out.println("Jari-jari harus lebih besar dari 0");
            } else {
                System.out.printf("Luas Lingkaran = %.2f \n ", (pi * r * r));
            }

        } else if (pil == 4) {
            System.out.println("=== Kamu memilih keluar, sampai jumpa lagi ya ===");
        } else {
            System.out.println("Input tidak valid, masukan inputan dari 1 - 4");
        }

    }
}
