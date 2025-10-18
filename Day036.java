package Coding2025;

import java.util.Scanner;

public class Day36 {
    // nested if

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ipkmin = 3.0;
        double ipkminC = 3.5;
        System.out.println("===Program Penentuan Beasiswa (Nested if)===");
        System.out.print("Masukan IPK = ");
        double ipk = in.nextDouble();
        in.nextLine();
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("input tidak valid (Rentang ipk 0.0 - 4.0)");
        } else {
            System.out.print("Masukan status ekonomi (Kurang/Cukup/Kaya) = ");
            String se = in.nextLine();
            System.out.println("====================================================");
            if (ipk >= ipkmin && ipk < ipkminC) {

                if (se.equalsIgnoreCase("kurang")) {
                    System.out.println("Keputusan = Layak");
                    System.out.println("Alasan = (IPK >= 3.0) dan (Status Ekonomi = Kurang)");
                    System.out.println("Keterangan Beasiswa = Prioritas");

                } else if (se.equalsIgnoreCase("Cukup")) {

                    System.out.println("Keputusan = Tidak Layak");
                    System.out.println("Alasan =  (IPK < 3.5)");
                    System.out.println("Keterangan Beasiswa = -");

                } else if (se.equalsIgnoreCase("Kaya")) {
                    System.out.println("Keputusan = Tidak Layak");
                    System.out.println("Alasan =  (Status Ekonomi = Kaya)");
                    System.out.println("Keterangan Beasiswa = -");
                } else {
                    System.out.println("Input invalid, Masukan status ekonomi dengan benar");

                }

            } else if (ipk >= ipkminC) {
                if (se.equalsIgnoreCase("Kurang")) {
                    System.out.println("Keputusan = Layak");
                    System.out.println("Alasan = (IPK >= 3.0) dan (Status Ekonomi = Kurang)");
                    System.out.println("Keterangan Beasiswa = Prioritas");

                } else if (se.equalsIgnoreCase("cukup")) {
                    System.out.println("Keputusan = Layak");
                    System.out.println("Alasan = (IPK >= 3.5) dan (Status Ekonomi = cukup)");
                    System.out.println("Keterangan Beasiswa = No Prioritas");

                } else if (se.equalsIgnoreCase("Kaya")) {
                    System.out.println("Keputusan = Tidak Layak");
                    System.out.println("Alasan =  (Status Ekonomi = Kaya)");
                    System.out.println("Keterangan Beasiswa = -");
                } else {
                    System.out.println("Input invalid, Masukan status ekonomi dengan benar");
                }
            } else if (ipk < ipkmin) {
                System.out.println("Keputusan = Tidak Layak");
                System.out.println("Alasan = (IPK < 3.0)");
                System.out.println("Keterangan Beasiswa = -");
            }

        }
    }
}
