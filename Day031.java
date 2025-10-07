package Coding2025;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
        //Operator Logika AND (&&).

        Scanner in = new Scanner(System.in);
        System.out.println("=== Program Logika AND(&&) ===");
        System.out.print("Masukan nilai teori = ");
        int teori = in.nextInt();
        System.out.print("Masukan nilai praktik = ");
        int praktik = in.nextInt();

        boolean lulus = teori >= 75 && praktik >= 75;
        System.out.println("Apakah lulus seleksi ? = " + lulus);
        if (lulus == true) {
            System.out.println("Keterangan = Selamat anda lulus seleksi");
        } else {
            System.out.println("Keterangan = Gagal karena salah satu nilai kurang dari 75");

        }
    }
}
