package abstrak;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring; 

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        super(3); 
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        return alas + tinggi + sisiMiring; 
    }
}
