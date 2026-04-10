package perusahaan;

public class Karyawan {
    // Atribut privat agar tidak bisa diakses langsung dari luar kelas (Encapsulation)
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    // Konstruktor untuk inisialisasi objek Karyawan
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        
        // Validasi rating. Jika di luar rentang 1.0 - 5.0, di set ke default 3.0
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0;
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    // Getter untuk mengambil nilai atribut privat
    public String getNama() {
        return nama;
    }

    public double getRatingKinerja() {
        return ratingKinerja;
    }

    public double hitungGajiTotal() {
        // Menghitung masa kerja sampai tahun 2026
        int masaKerja = 2026 - tahunMasuk;
        
        // Bonus loyalitas = 5% dari gaji pokok dikali jumlah tahun masa kerja
        double bonusLoyalitas = (0.05 * gajiPokok) * masaKerja;
        // Total gaji = gaji pokok + bonus loyalitas
        double totalGaji = gajiPokok + bonusLoyalitas;

        // Penalti performa = Jika rating < 2.5, gaji dipotong 10%
        if (ratingKinerja < 2.5) {
            totalGaji = totalGaji - (0.1 * totalGaji);
        }
        return totalGaji;
    }

    // Menampilkan informasi detail karyawan
    public void displayInfo() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        // Format dua angka di belakang koma untuk mata uang
        System.out.println("Gaji Pokok: Rp. " + String.format("%.2f", gajiPokok));
        System.out.println("Rating Kinerja: " + ratingKinerja);
    }
}
