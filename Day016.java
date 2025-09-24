package Coding2025;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        //Operator Aritmatika perkalian dan pembagian
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka Pertama = ");
        int angka1 = in.nextInt();
        System.out.print("Masukan Angka Kedua = ");
        int angka2 = in.nextInt();

        int perk = angka1 * angka2;
        int pemb = angka1 / angka2;
        System.out.println("Hasil Perkalian = " + perk);
        System.out.println("Hasil Pembagian = " + pemb);

    }
}
