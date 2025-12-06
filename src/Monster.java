public class Monster {
    int hp; // camelCase
    int attack;

    public Monster(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
    }

    public void takeDamage(int amount) {
        if (Math.random() < 0.1) {
            System.out.println("Орк увернулся от атаки.");
            return;
        }
        hp -= amount;
        System.out.println("Орк получил " + amount + "ед. урона");
    }

    public void angry() {
        System.out.println("Орк злится.");
        attack++;
    }

    public void info() {
        System.out.println("Орк HP: " + hp + " ATT: " + attack + " DEF: ");
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
