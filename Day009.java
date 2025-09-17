package Coding2025;

public class Day9 {

    public static void main(String[] args) {
        int tabungan;
        tabungan = 1000_000;
        System.out.println("Tabungan sebelum di update = Rp" + tabungan);
        tabungan += 500_000; //Gaji masuk
        System.out.println("Tabungan setelah gaji masuk = Rp" + tabungan);
        tabungan -= 200_000; // untuk belanja
        System.out.println("Tabungan setelah di pakai belanja = Rp" + tabungan);

    }

}
