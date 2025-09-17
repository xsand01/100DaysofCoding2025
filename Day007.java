package Coding2025;

import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Huuf Vokal = ");
        char huruf = in.next().charAt(0);
        
        char h = Character.toLowerCase(huruf);
        boolean cek = (h == 'a' || h == 'i' || h == 'u' || h == 'e' || h == 'o');
        
        System.out.println("Apakah huruf " + huruf + " adalah huruf vokal ?");
        System.out.println("jawaban = " + cek);

    }
}

