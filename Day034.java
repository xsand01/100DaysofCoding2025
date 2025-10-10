package Coding2025;

import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        //Latihan: Mengkombinasikan berbagai operator.
        Scanner in = new Scanner(System.in);
        System.out.println("=== Program Evaluasi Siswa ===");
        System.out.print("Masukan nilai akhir = ");
        int na = in.nextInt();
        System.out.print("Masukan kehadiran (%) = ");
        int nk = in.nextInt();

        System.out.println("==================================================");
        if (na >= 90 && nk >= 80) {
            System.out.println("Nilai Awal = " + na);
            System.out.println("Nilai Bonus (+5) = " + (na += 5));
            System.out.println("Status = Selamat anda lulus ujian dengan nilai istimewa");
        } else if (na >= 80 && na <= 90 && nk >= 80) {
            System.out.println("Nilai Awal = " + na);
            System.out.println("Nilai Setelah Bonus = - ");
            System.out.println("Status = Selamat anda lulus dengan nilai standar");
        } else {
            System.out.println("Tidak lulus karena nilai atau kehadiran kurang");

        }
        System.out.println("==================================================");
    }

}
