package Coding2025;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Latihan menentukan bilangan ganjil atau genap
        System.out.println("===Program Menentukan Bilangan Ganjil atau Genap===");
        System.out.print("Masukan bilangan bulat = ");
        int num = in.nextInt();
        if (num == 0) {
            System.out.println("0 adalah bilangan netral");

        } else if (num % 2 == 0) {
            if (num < 0 && num % 2 == 0) {
                System.out.println(num + " adalah bilangan bulat negatif dan genap");
            } else {
                System.out.println(num + "adalah bilangan bulat genap");
            }
        } else if (num % 2 != 0) {
            if (num < 0 && num % 2 != 0) {
                System.out.println(num + " adalah bilangan bulat negatif dan ganjil");
            } else {
                System.out.println(num + "adalah bilangan bulat ganjil");
            }
        } else {
            System.out.println("invalid! Masukan bilangan bulat");

        }
    }
}
