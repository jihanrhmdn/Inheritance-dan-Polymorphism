public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-13s: warna = %s, luas = %.2f%n", "BujurSangkar", warna, hitungLuas());
    }
}