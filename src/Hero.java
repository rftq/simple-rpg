public class Hero {
    int hp; // camelCase
    int attack;
    int defence;

    public Hero(int hp, int attack, int defence) {
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    public void takeDamage(int amount) {
        int actualAttackAmount = amount - defence;
        if (actualAttackAmount < 1) {
            actualAttackAmount = 1;
        }
        hp -= (actualAttackAmount);
        System.out.println("Рыцарь получил " + actualAttackAmount + "ед. урона");
    }

    public void rest() {
        System.out.println("Рыцарь решил отдохнуть и залечить свои раны.");
        hp += 2;
    }
    public void skipTurn() {
        System.out.println("Рыцарь решил пропустить свой ход.");
    }

    public void info() {
        System.out.println("Рыцарь HP: " + hp + " ATT: " + attack + " DEF: " + defence);
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
