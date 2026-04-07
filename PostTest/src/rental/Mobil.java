package rental;

public class Mobil extends Kendaraan {
    int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public double hitungHargaSewa(int hari) {
        double hargaSewa = super.hitungHargaSewa(hari);
        double asuransi = 50000 * hari;
        double totalHarga = hargaSewa + asuransi;
        if (kapasitasPenumpang > 5) {
            totalHarga = totalHarga + 50000;
        }
        return totalHarga;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas     : " + kapasitasPenumpang + " orang");
    }
}
