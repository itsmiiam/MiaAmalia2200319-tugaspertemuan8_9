package soal1_pert8;

public class Segitiga extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Segitiga() {
        this(1.0, 1.0, 1.0);
    }

    public Segitiga(double side1, double side2, double side3) {
        super(); // Memanggil konstruktor tanpa argumen dari GeometricObject
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Segitiga(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled); // Memanggil konstruktor GeometricObject dengan argumen
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {//luas
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {//keliling
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSegitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}
