package Coding2025;

import java.util.Scanner;

public class Day6 {

    /*Buatlah program Java untuk menghitung luas dan keliling lingkaran dengan jari-jari bertipe float. Gunakan nilai π (pi) bertipe double. Program harus:

Meminta input jari-jari dari pengguna (float).

Menghitung luas lingkaran dengan rumus π × r × r.

Menghitung keliling lingkaran dengan rumus 2 × π × r.

Menampilkan hasil perhitungan dengan 2 angka di belakang koma.*/
    public static void main(String[] args) {

        float r = 20.5f;
        double phi = 3.14;

        double luas = phi * r * r;
        double keliling = 2 * phi * r;

        System.out.printf("Luas Lingkaran = %.2f \n", luas);
        System.out.printf("Keliling Lingkaran = %.2f \n", keliling);

    }

}
