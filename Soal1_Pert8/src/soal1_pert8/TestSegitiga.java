package soal1_pert8;

import java.util.Scanner;

public class TestSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();
        
        System.out.print("Masukkan warna: ");
        String color = input.next();
        
        System.out.print("Apakah segitiga diisi (true/false)? ");
        boolean filled = input.nextBoolean();
        
        Segitiga segitiga = new Segitiga(side1, side2, side3, color, filled);

        System.out.println(segitiga.toString());
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("Apakah segitiga diisi? " + segitiga.isFilled());
    }
}
