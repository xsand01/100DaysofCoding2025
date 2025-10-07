package Coding2025;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {
        //Operator Perbandingan <= dan >=.
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka pertama = ");
        int a = in.nextInt();
        System.out.print("Masukan angka kedua   = ");
        int b = in.nextInt();

        System.out.println("Apakah angka pertama <= dari angka kedua ? = " + (a <= b));
        System.out.println("Apakah angka pertama >= dari angka kedua ? = " + (a >= b));
    }

}

