package Coding2025;

public class Day20 {

    public static void main(String[] args) {
        //Mengubah Tipe Data Primitif menjadi String.
        int umur = 18;
        double tb = 171.0;
        boolean mhs = true;

        String s1 = String.valueOf(umur);
        String s2 = String.valueOf(tb);
        String s3 = String.valueOf(mhs);
        System.out.println("int -> String" + s1);
        System.out.println("doublw -> String" + s2);
        System.out.println("boolean -> String" + s3);
    }
}
