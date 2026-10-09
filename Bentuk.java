public class Bentuk {
    // warna dibuat protected supaya bisa diakses subclass,
    // tetap disediakan getter dan setter
    protected String warna;

    public Bentuk(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void printInfo() {
        System.out.printf("%-13s: warna = %s%n", "Bentuk", warna);
    }
}