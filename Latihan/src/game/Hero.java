package game;

public class Hero {
    String name;
    double health;
    double attackPower;

    public Hero(String name, double health, double attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    public void berlatih() {
        this.attackPower += 10;
        System.out.println("Attack Power berubah menjadi " + this.attackPower);
    }

    public void terimaSerangan(double damage) {
        this.health -= damage;
        System.out.println("Serangan diterima " + damage);
        System.out.println("Health berubah menjadi " + this.health);
    }
}
