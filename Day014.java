package Coding2025;

public class Day14 {

    public static void main(String[] args) {
        //Mengubah String ke tipe data primitif
        String a1 = "3";
        byte a = Byte.parseByte(a1);
        short b = Short.parseShort(a1);
        int c = Integer.parseInt(a1);
        long d = Long.parseLong(a1);
        float e = Float.parseFloat(a1);
        double f = Double.parseDouble(a1);
        boolean g = Boolean.parseBoolean(a1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }

}
