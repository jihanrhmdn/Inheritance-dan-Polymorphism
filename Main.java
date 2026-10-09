public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Bentuk b = new Bentuk("merah");
        b.printInfo();

        BujurSangkar bs = new BujurSangkar(4, "biru");
        bs.printInfo();

        // Exercise 2
        Lingkaran l = new Lingkaran(7, "hijau");
        l.printInfo();

        // Exercise 3
        Silinder s = new Silinder(10, 7, "kuning");
        s.printInfo();

        // Uji setter
        s.setTinggi(5);
        s.setRadius(2);
        s.setWarna("ungu");
        s.printInfo();
    }
}