package Coding2025;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===Menghitung Luas Lingkaran===");
        System.out.print("Masukan jari-jari = ");
        float r = in.nextFloat();
        final double phi = 3.14159;

        double luas = phi * r * r;
        System.out.printf("Luas Lingkaran = %.2f\n", luas);
    }

}
