package rental;

public class Kendaraan {
    String nomorPolisi;
    String merk;
    int tahunProduksi;
    double hargaSewaDasar;

    public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo() {
        System.out.println("No. Polisi: " + nomorPolisi);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Sewa Dasar/hari: Rp. " + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari) {
        double total = hargaSewaDasar * hari;
        if (tahunProduksi < 2015) {
            total = total - (0.1 * total);
        }
        return total;
    }
}
