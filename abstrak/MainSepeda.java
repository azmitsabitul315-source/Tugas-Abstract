package abstrak;

public class MainSepeda {
    public static void main(String[] args) {
    
        Sepeda sepedaOtomatis = new Sepeda(true);
        Sepeda sepedaKayuh = new Sepeda(false);

        sepedaOtomatis.setMerk("Yamaha");
        sepedaKayuh.setMerk("Win Cycle");

        System.out.println("Merk Sepeda 1: " + sepedaOtomatis.getMerk());
        sepedaOtomatis.jenis();
        sepedaOtomatis.nyalakan();
        
        System.out.println("-------------------------");

        System.out.println("Merk Sepeda 2: " + sepedaKayuh.getMerk());
        sepedaKayuh.jenis();
        sepedaKayuh.nyalakan();
    }
}