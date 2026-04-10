package perusahaan;

public class Manajer extends Karyawan {
    // Atribut khusus untuk peran manajerial
    private String divisi;
    private int jumlahAnggotaTim;

    // Konstruktor Manajer
    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        // Mengirim data ke konstruktor Karyawan menggunakan super()
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal() {
        // Mendapatkan gaji dasar dari logika induk (Karyawan)
        double gajiDasar = super.hitungGajiTotal();
        
        // Tunjangan manajerial dihitung berdasarkan jumlah anggota (Rp 300.000/orang)
        double tunjanganManajerial = jumlahAnggotaTim * 300000;
        
        // Total sementara sebelum bonus kinerja ekstra
        double totalGajiSementara = gajiDasar + tunjanganManajerial;
        double bonusKinerjaEkstra = 0.15; // Bonus 15%

        // Bonus tambahan hanya diberikan jika rating kinerja > 4.5
        if (getRatingKinerja() > 4.5) { // Memanggil metode getRatingKinerja() dari kelas Karyawan
            // Menambahkan bonus kinerja ekstra
            totalGajiSementara = totalGajiSementara + (totalGajiSementara * bonusKinerjaEkstra);
        }

        return totalGajiSementara;
    }

    // Menampilkan informasi tambahan terkait divisi dan tim yang dipimpin
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Posisi: Manajer Divisi " + divisi);
        System.out.println("Jumlah Anggota Tim: " + jumlahAnggotaTim);
    }
}
