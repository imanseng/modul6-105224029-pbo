import perusahaan.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menampung objek Karyawan, Developer, dan Manajer
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();

        // Menambahkan 5 data objek ke dalam list
        listKaryawan.add(new Karyawan("K1", "Gio", 2020, 5000000, 2.0));
        listKaryawan.add(new Developer("D1", "Syauqi", 2018, 8000000, 4.0, "Senior", 20));
        listKaryawan.add(new Developer("D2", "Danu", 2024, 6000000, 2.8, "Mid", 15));
        listKaryawan.add(new Manajer("M1", "Zaidan", 2015, 12000000, 4.8, "IT", 10));
        listKaryawan.add(new Manajer("M2", "Robby", 2025, 10000000, 3.5, "HR", 3));

        double totalAnggaranGaji = 0; // Inisialisasi variabel untuk total anggaran gaji
        double totalRating = 0; // Inisialisasi variabel untuk total rating (rata-rata)
        
        // Inisialisasi awal untuk mencari karyawan dengan gaji tertinggi (asumsinya karyawan pertama)
        Karyawan highestEarner = listKaryawan.get(0);

        // Perulangan untuk memproses setiap karyawan dalam list
        for (Karyawan k : listKaryawan) {
            // Menampilkan informasi dasar dan spesifik setiap jabatan
            k.displayInfo();
            
            // Menghitung gaji total menggunakan metode hitungGajiTotal() dari masing-masing kelas
            double gaji = k.hitungGajiTotal();
            System.out.println("Total Gaji Bulan Ini: Rp" + String.format("%.2f", gaji)); // Menampilkan total gaji (pake format)
            System.out.println(); // Spasi antar data karyawan

            // Akumulasi data karyawan untuk menghitung total anggaran gaji dan rata-rata rating
            totalAnggaranGaji += gaji;
            totalRating += k.getRatingKinerja();

            // Membandingkan gaji setiap karyawan dengan gaji tertinggi
            if (gaji > highestEarner.hitungGajiTotal()) {
                highestEarner = k;
            }
        }

        System.out.println("Total Anggaran Gaji: Rp" + String.format("%.2f", totalAnggaranGaji));
        System.out.println("Highest Earner: " + highestEarner.getNama() + " (Rp" + String.format("%.2f", highestEarner.hitungGajiTotal()) + ")");
        System.out.println("Rata-rata Rating Kinerja: " + (totalRating / listKaryawan.size()));
    }
}
