import game.Hero;
import game.HeroStrength;

public class Utama {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Hero 1", 100, 10);
        HeroStrength hero2 = new HeroStrength("Hero 2", 100, 10);
        hero1.display();
        hero2.display();
        hero1.berlatih();
        hero2.berlatih();
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);
        hero1.display();
        hero2.display();
    }
}
