package Coding2025;

import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {
        //Operator Aritmatika Modulo(sisa bagi)
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka Pertama = ");
        int angka1 = in.nextInt();
        System.out.print("Masukan Angka Kedua = ");
        int angka2 = in.nextInt();

        int mod = angka1 % angka2;
        System.out.println("Hasil sisa bagi = " + mod);

    }
}
