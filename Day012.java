package Coding2025;

import java.util.Scanner;

public class Day12 {
    //Latihan: Membuat Program Biodata Sederhana.

    /*Seorang mahasiswa baru diminta untuk membuat program Java sederhana yang dapat menampilkan biodata diri 
    dengan memanfaatkan class Scanner untuk menerima input dari keyboard.
    Instruksi

Buat program Java dengan nama class Biodata.

Program harus meminta input dari pengguna berupa:

Nama Lengkap (String)

NIM (String)

Usia (int)

Tinggi Badan (float)

Hobi (String)

Setelah semua data dimasukkan, program menampilkan biodata dalam format rapi*/
    public static void main(String[] args) {
      
        System.out.println("===Program Biodata Sederhana===");
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nama lengkap = ");
        String nama = in.nextLine();
        System.out.print("Masukan NIM = ");
        String nim = in.nextLine();
        System.out.print("Masukan Usia Anda = ");
        int usia = in.nextInt();
        System.out.print("Masukan Tinggi Badan = ");
        float tb = in.nextFloat();
        System.out.print("Masukan Hobi Anda = ");
        String hobi = in.next();
        System.out.println("");
        System.out.println("====================================================");
        System.out.println("---Biodata---");
        System.out.println("Nama Lengkap = " + nama);
        System.out.println("NIM          = " + nim);
        System.out.println("Usia         = " + usia);
        System.out.println("Tinggi Badan = " + tb);
        System.out.println("Hobi         = " + hobi);

    }
}
