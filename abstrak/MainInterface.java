package abstrak;

public class MainInterface {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(2, 7);

        System.out.println("Sebelum Resize: ");
        System.out.println("Luas: " + kotak.getLuas());
        System.out.println("Keliling: " + kotak.getKeliling());

        kotak.resize(2.0);

        System.out.println("\nSetelah Resize:");
        System.out.println("Luas: " + kotak.getLuas());
        System.out.println("Keliling: " + kotak.getKeliling());
    }
}