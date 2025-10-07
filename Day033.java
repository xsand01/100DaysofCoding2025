package Coding2025;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
        //Operator Logika NOT (!).
        Scanner in = new Scanner(System.in);
        System.out.println("=== Program Logika NOT(!) ===");
        System.out.print("Apakah pengguna sudah login (true/false) = ");
        boolean input = in.nextBoolean();

        if (input) {
            System.out.println("Status Login = " + input);
            System.out.println("Selamat Datang Pengguna");
        } else {
            System.out.println("Status Login = " + input);
            System.out.println("Silahkan Login Terlebih Dahulu");
        }

    }
}



