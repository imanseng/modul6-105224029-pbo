package minimarket;

public class MakananRingan extends Produk {
    private String rasa;

    public MakananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Rasa: " + rasa);
    }
}
