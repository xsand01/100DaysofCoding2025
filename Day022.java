package Coding2025;

import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {
        // Latihan menghitung luas persegi 
        Scanner in = new Scanner(System.in);
        System.out.println("===Program Menghitung Luas Persegi===");
        System.out.print("Masukan sisi = ");
        int sisi = in.nextInt();

        if (sisi <= 0) {
            System.out.println("Sisi harus lebih besar dari 0");

        } else {
            System.out.println("Luas Persegi = " + (sisi * sisi));

        }

    }

}
