package Coding2025;

import java.util.Scanner;

public class Day11 {

    /*Buatlah program Java yang menggunakan class Scanner untuk menerima input dari keyboard:

Minta pengguna memasukkan nama (String).

Minta pengguna memasukkan usia (int).

Minta pengguna memasukkan tinggi badan (float).

Setelah semua data diinput, tampilkan kalimat perkenalan:*/
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan Nama = ");
        String nama = inp.nextLine();
        System.out.print("Masukan Usia = ");
        int usia = inp.nextInt();
        System.out.print("Masukan Tinggi Badan = ");
        float tb = inp.nextFloat();

        System.out.println("Halo, nama saya " + nama + " saya berusia " + usia + " Tahun," + " tinggi badan saya " + tb + "cm");

    }
}
