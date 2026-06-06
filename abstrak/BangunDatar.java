package abstrak;

public abstract class BangunDatar {
    private int jumlahSisi;
    private int x;
    private int y;

    public BangunDatar(int sisi) {
        this.jumlahSisi = sisi;
    }

    public void pindahkan(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Posisi dipindahkan ke x: " + this.x + ", y: " + this.y);
    }

    public void draw() {
        System.out.println("Menggambar bangun datar");
    }

    public void resize() {
        System.out.println("Mengubah ukuran pada bangun datar");
    }

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }

    public abstract double getLuas();
    public abstract double getKeliling();
}