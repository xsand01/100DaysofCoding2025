package Coding2025;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Menghitung luas persegi");
        System.out.println("2. Menghitung luas persegi panjang");
        System.out.println("3. Menghitung luas segitiga");
        System.out.println("4. Keluar");

        System.out.print("Masukan pilihan anda : ");
        int pil = in.nextInt();

        if (pil == 1) {
            System.out.println("===Menghitung Luas Persegi===");
            System.out.print("masukan sisi = ");
            double sisi = in.nextDouble();
            double hasil = sisi * sisi;
            System.out.println("Hasil = " + hasil);
        } else if (pil == 2) {
            System.out.println("===Menghitung Luas Persegi Panjang=== ");
            System.out.print("Masukan panjang = ");
            double panjang = in.nextDouble();
            System.out.print("Masukan lebar = ");
            double lebar = in.nextDouble();
            double hasil = panjang * lebar;
            System.out.println("Hasil = " + hasil);

        } else if (pil == 3) {
            System.out.println("===Menghitung Luas Lingkaran=== ");
            double pi = 3.14;
            System.out.print("Masukan jari-jari = ");
            double r = in.nextDouble();
            double hasil = pi * r * r;
            System.out.println("Hasil = " + hasil);
        } else {
            System.out.println("Sampai jumpa lagi yaaa");
        }
    }

}
