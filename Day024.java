package Coding2025;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        //Latihan: Program Luas Lingkaran.
        Scanner in = new Scanner(System.in);
        System.out.println("=== Program Menghitung Luas Lingkaran ===");
        double pi = Math.PI;
        System.out.print("Masukan jari-jari(cm) = ");
        double r = in.nextDouble();

        if (r <= 0) {
            System.out.println("Jari-jari harus lebih besar dari 0");
        } else {
            double luas = pi * r * r;
            System.out.printf("Luas lingkaran adalah = %.2f cm²", luas);
        }
    }
}

