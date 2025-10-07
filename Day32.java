package Coding2025;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
        //Operator Logika OR (||).
        Scanner in = new Scanner(System.in);
        System.out.println("=== Program Logika OR (||) ===");
        System.out.print("Masukan Nilai Tes = ");
        int tes = in.nextInt();
        System.out.print("Masukan Pengalaman Kerja (Tahun) = ");
        int thn = in.nextInt();
        boolean ketentuan = tes >= 80 || thn >= 2;
        System.out.println("Apakah di terima = " + ketentuan);

        if (ketentuan == true) {
            System.out.println("Keterangan = Anda di terima karena memenuhi salah satu syarat");
        } else {
            System.out.println("Anda tidak di terima, tidak ada syarat yang terpenuhi");

        }
    }
}
