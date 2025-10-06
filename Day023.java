package Coding2025;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        //Latihan: Program Luas Persegi Panjang.
        Scanner in = new Scanner(System.in);

        System.out.println("=== Program Menghitung Luas Persegi Panjang ===");
        System.out.print("Masukan panjang = ");
        int p = in.nextInt();
        System.out.print("Masukan lebar = ");
        int l = in.nextInt();

        if (p == 0 || l == 0) {
            System.out.println("input harus lebih besar dari 0");
        } else {
            System.out.println("Luas Persegi Panjang = " + (p * l));
        }

    }

}
