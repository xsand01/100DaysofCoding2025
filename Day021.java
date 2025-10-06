package Coding2025;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Menukar nilai 2 variable tanpa menggunakan variabel tambahan 
        System.out.print("Masukan nilai a = ");
        int a = in.nextInt();
        System.out.print("Masukan nilai b = ");
        int b = in.nextInt();

        System.out.println("");

        a = a + b;
        System.out.println("a + b = " + a);
        b = b - a;
        System.out.println("b - a = " + b);
        a = a + b;
        System.out.println("a + b = " + a);
        System.out.println("Setelah di tukar a = " + a);

        System.out.println("");

        a = a - b;
        System.out.println("a - b = " + a);
        b = b + a;
        System.out.println("b + a = " + b);
        b = a - b;
        System.out.println("a - b =  " + b);
        System.out.println("Setelah di tukar b = " + b);
    }

}
