package Coding2025;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        //Percabangan (if)
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai ujian teori mengemudi = ");
        int nilai = in.nextInt();
        if (nilai >= 75) {
            System.out.println("Selamat anda lulus ujian teori mengemudi");
        } else {
            System.out.println("Yahhhh kamu tidak lulus ujian, coba lagi lain waktu yaaa");
        }
    }

}
