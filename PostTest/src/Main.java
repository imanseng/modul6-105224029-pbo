import rental.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarSewa = new ArrayList<>();

        // 1. Mobil lama (di bawah 2015) berkapasitas > 5
        daftarSewa.add(new Mobil("AA 1234 OLD", "Honda Brio", 2010, 300000, 7));

        // 2. Mobil baru (>= 2015) berkapasitas <= 5
        daftarSewa.add(new Mobil("AA 1234 NEW", "Toyota Vios", 2022, 500000, 5));

        // 3. Motor ber-CC >= 250
        daftarSewa.add(new Motor("AA 1234 MOT", "Kawasaki Ninja", 2021, 200000, 260));

        // 4. Motor standar ber-CC < 250
        daftarSewa.add(new Motor("AA 1234 STD", "Honda Beat", 2019, 75000, 125));

        int jumlahHari = 5;
        for (Kendaraan kendaraan : daftarSewa) {
            kendaraan.displayInfo();
            System.out.println("Harga Sewa: Rp. " + kendaraan.hitungHargaSewa(jumlahHari));
        }
    }
}
