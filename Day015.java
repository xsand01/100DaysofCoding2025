package Coding2025;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        //Operator Aritmatika penjumlahan dan pengurangan
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka Pertama = ");
        int angka1 = in.nextInt();
        System.out.print("Masukan Angka Kedua = ");
        int angka2 = in.nextInt();

        int penj = angka1 + angka2;
        int peng = angka1 - angka2;
        System.out.println("Hasil Penjumlahan = " + penj);
        System.out.println("Hasil Pengurangan = " + peng);

    }
}
