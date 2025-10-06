package Coding2025;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        //Operator Penugasan (=, +=, -=, dll).
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        int angka = in.nextInt();

        System.out.println("Nilai awal = " + angka);
        System.out.println("Setelah angka += 5 -> " + (angka += 5));
        System.out.println("Setelah angka -= 3 -> " + (angka -= 3));
        System.out.println("Setelah angka *= 2 -> " + (angka *= 2));
        System.out.println("Setelah angka /= 4 -> " + (angka /= 4));
        System.out.println("Setelah angka %= 3 -> " + (angka %= 3));
        System.out.println("Hasil akhir = " + angka);

    }
}

