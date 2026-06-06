package abstrak; 

public class Sepeda extends Kendaraan {
    private boolean isAuto;

    public Sepeda(boolean isAuto) {
        this.isAuto = isAuto;
    }

    public void jenis() {
        if (this.isAuto == true) {
            System.out.println("Sepeda otomatis");
        } else {
            System.out.println("Sepeda kayuh");
        }
    }

    @Override
    public void nyalakan() {
        if (this.isAuto) {
            System.out.println("Mesin sepeda akan otomatis dinyalakan.");
        } else {
            System.out.println("Sepeda kayuh siap untuk dikayuh.");
        }
    }
}