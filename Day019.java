package Coding2025;

import java.util.Scanner;

public class Day19 {

    public static void main(String[] args) {
        /*1. Buatlah program Java yang menerima input berupa sebuah bilangan bertipe double.   
          Konversikan bilangan tersebut menjadi int secara manual (paksa), lalu tampilkan 
          hasil sebelum dan sesudah konversi.*/
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan desimal = ");
        double num1 = in.nextDouble();
        int num2 = (int) num1;
        System.out.println("Nilai Double = " + num1);
        System.out.println("Nilai int = " + num2);

        System.out.println("====================================================");

        /*2. Buatlah program Java yang menyimpan nilai dalam variabel bertipe long, kemudian konversikan menjadi short menggunakan type casting, 
        lalu tampilkan hasilnya. Apakah ada perubahan nilai jika angka terlalu besar?
         */
        System.out.print("Masukan bilangan bulat = ");
        long num3 = in.nextLong();
        short num4 = (short) num3;
        System.out.println("Hasil tipe data long = " + num3);
        System.out.println("Hasil tipe data short = " + num4);
        System.out.println("====================================================");

        /*3. Buatlah sebuah program sederhana yang:

             Menginputkan nilai double dari user.

            Mengkonversinya ke dalam tipe float, long, dan int.

            Menampilkan semua hasil konversinya ke layar.*/
        System.out.print("Masukan angka = ");
        double input = in.nextDouble();
        float konv1 = (float) input;
        long konv2 = (long) input;
        int konv3 = (int) input;
        System.out.println("Sebelum di konversi = " + input);
        System.out.println("Konversi float = " + konv1);
        System.out.println("Konversi long = " + konv2);
        System.out.println("Konvesi int = " + konv3);
        System.out.println("====================================================");

    }

}
