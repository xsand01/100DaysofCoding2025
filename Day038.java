package Coding2025;

import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Latihan: Menentukan bilangan positif, negatif dan nol
        System.out.println("===Program Menentukan Bilangan Positif, Negatif, dan Nol===");
        System.out.print("Masukan bilangan bulat = ");
        int num = in.nextInt();
        if (num == 0) {
            System.out.println("Nol adalah bilangan netral");

        } else if (num > 0) {
            System.out.println(num + " adalah bilangan bulat Positif");

        } else if (num < 0) {
            System.out.println(num + " adalah bilangan bulat Negatif");

        }
    }

}
