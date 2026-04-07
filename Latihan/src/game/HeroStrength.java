package game;

public class HeroStrength extends Hero {
    String tipe = "Strength";

    public HeroStrength(String name, double health, double attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipe: " + tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        this.health -= damage * 0.5;
        System.out.println("Serangan diterima " + damage);
        System.out.println("Health berubah menjadi " + this.health);
    }
}
