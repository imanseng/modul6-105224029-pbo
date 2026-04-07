package minimarket;

public class Produk {
    private String namaProduk;
    private double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public void getNamaProduk() {
        System.out.println("Nama Produk: " + namaProduk);
    }

    public void getHarga() {
        System.out.println("Harga: Rp. " + harga);
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanDetail() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
    }
}
