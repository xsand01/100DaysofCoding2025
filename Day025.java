package Coding2025;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {
        //Operator Increment dan Decrement (++, --)
        Scanner in = new Scanner(System.in);

        System.out.println("=== Program Increment dan Decrement ===");
        System.out.print("Masukan angka = ");
        int angka = in.nextInt();
        System.out.println("");
        System.out.println("Nilai awal = " + angka);
        System.out.println("===Increment===");
        angka++;
        System.out.println("Setelah angka++ = " + angka);
        System.out.println("Setelah ++angka = " + (++angka));
        System.out.println("");
        System.out.println("===Decrement===");
        System.out.println("setelah angka-- = " + (angka--));
        System.out.println("Setelah --angka = " + (--angka));
        System.out.println("");
        System.out.println("===Setelah semua operasi selesai=== ");
        System.out.println("Hasil = " + angka);

    }

}
