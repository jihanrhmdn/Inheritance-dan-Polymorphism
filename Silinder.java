public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    // volume = luas alas (warisan dari Lingkaran) x tinggi
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-13s: warna = %s, volume = %.2f%n", "Silinder", warna, hitungVolume());
    }
}