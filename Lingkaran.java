public class Lingkaran extends Bentuk {
    public static final double PHI = 3.14159;

    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-13s: warna = %s, luas = %.2f%n", "Lingkaran", warna, hitungLuas());
    }
}