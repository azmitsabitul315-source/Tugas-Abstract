package abstrak;

public class MainBangunDatar {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(20, 3);
        Segitiga segitiga = new Segitiga(3, 5, 10);

        System.out.println("Luas Kotak: " + kotak.getLuas());
        System.out.println("Keliling Kotak: " + kotak.getKeliling());
        System.out.println("Jumlah sisi kotak: " + kotak.getJumlahSisi());

        System.out.println("\nLuas Segitiga: " + segitiga.getLuas());
        System.out.println("Keliling Segitiga: " + segitiga.getKeliling());
    }
}
