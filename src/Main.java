import java.util.Scanner;

public class Main {
    // System.out.println() - вывести сообщение в консоль
    // int - целочисленный тип данных

    static Scanner scanner = new Scanner(System.in);
    static Hero hero = new Hero(20, 4, 1);
    static Monster monster = new Monster(20, 2);

    public static void main(String[] args) {

        System.out.println("Игра началась. Отважный рыцарь попал в лес.");


        hero.info();
        monster.info();

        while (true) {
            playerTurn();
            if (monster.isDead()) {
                System.out.println("Орк повержен, Рыцарь молодец!");
                break;
            }

            aiTurn();

            if (hero.isDead()) {
                System.out.println("Рыцарь повержен, Орк молодец!");
                break;
            }
        }


        System.out.println("Игра завершена.");
    }

    public static void playerTurn() {
        System.out.println("Ход Рыцаря. Выберите: 1 - атаковать, 2 - отдохнуть.");
        int heroAction = scanner.nextInt();
        if (heroAction == 1) {
            System.out.println("Рыцарь атаковал Орка");
            monster.takeDamage(hero.attack);

        } else if (heroAction == 2) {
            hero.rest();
        } else {
            hero.skipTurn();
        }
    }

    public static void aiTurn() {
        System.out.println("Ход Орка.");
        if (Math.random() < 0.6) {
            System.out.println("Орк атаковал Рыцаря.");
            hero.takeDamage(monster.attack);
            hero.info();
        } else {
            monster.angry();
        }
    }
}
