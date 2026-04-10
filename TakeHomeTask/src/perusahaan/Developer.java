package perusahaan;

// Kelas ini mewarisi semua atribut dan metode dari kelas Karyawan
public class Developer extends Karyawan {
    // Atribut tambahan khusus untuk objek Developer
    private String level;
    private int jumlahBugFix;

    // Konstruktor Developer
    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        // super() digunakan untuk memanggil konstruktor superclass (Karyawan)
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        setLevel(level); // Validasi level saat objek dibuat
        this.jumlahBugFix = jumlahBugFix;
    }

    // Setter untuk atribut level agar hanya nilai tertentu yang bisa masuk ke atribut level
    public void setLevel(String level) {
        if (level.equalsIgnoreCase("Junior") || level.equalsIgnoreCase("Mid") || level.equalsIgnoreCase("Senior")) {
            this.level = level;
        } else {
            System.out.println("Posisi tidak valid. Set ke default: Junior");
            this.level = "Junior"; // Set default jika level tidak valid
        }
    }

    // Mengubah logika hitungGajiTotal khusus untuk Developer.
    @Override
    public double hitungGajiTotal() {
        // Mengambil hasil perhitungan gaji dasar dari kelas Karyawan (super)
        double gajiDasar = super.hitungGajiTotal();
        double tunjanganLevel = 0; // Inisialisasi tunjangan level

        // Penentuan tunjangan berdasarkan tingkatan posisi
        if (level.equalsIgnoreCase("Junior")) {
            tunjanganLevel = 0;
        } else if (level.equalsIgnoreCase("Mid")) {
            tunjanganLevel = 1500000;
        } else if (level.equalsIgnoreCase("Senior")) {
            tunjanganLevel = 3000000;
        }

        double bonusBug = 0; // Inisialisasi bonus bug fix
        // Bonus bug fix hanya diberikan jika performa (rating) >= 3
        if (getRatingKinerja() >= 3.0) { // Memanggil metode getRatingKinerja() dari kelas Karyawan
            bonusBug = jumlahBugFix * 50000;
        }

        return gajiDasar + tunjanganLevel + bonusBug;
    }

    // Menambahkan informasi spesifik Developer pada tampilan data
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil tampilan info dasar dari kelas Karyawan
        System.out.println("Posisi: Developer " + level);
        System.out.println("Jumlah Bug Fix: " + jumlahBugFix);
    }
}
