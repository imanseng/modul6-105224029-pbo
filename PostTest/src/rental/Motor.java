package rental;

public class Motor extends Kendaraan {
    int kapasitasMesin;

    public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public double hitungHargaSewa(int hari) {
        double hargaSewa = super.hitungHargaSewa(hari);
        if (kapasitasMesin >= 250) {
            double pajakBarangMewah = 25000 * hari;
            hargaSewa = hargaSewa + pajakBarangMewah;
        }
        return hargaSewa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " CC");
    }
}
