import javax.swing.event.InternalFrameAdapter;

public class ShooterGame {
    public static void main(String[] args) {
        Player player1 = new Player();

        // Ініціалізація з одним параметром
        Player player2 = new Player("Bogdan");

        // Ініціалізація з двома параметрами
        Player player3 = new Player(50);

        // Ініціалізація з трьома параметрами
        Player player4 = new Player("Bogdan", 50);
        Zombie zombie1 = new Zombie("Zombie", 50);
        Weapon gun1 = new Weapon("Mini Uzi", 30);

        gun1.recursiveFire(zombie1, 3);// виклик рекурсивного методу

        System.out.println("Ім'я гравця 1: " + player1.getName());
        System.out.println("Здоров'я гравця 1: " + player1.getHealth());

        Weapon.performAction("Reload", "Mini Uzi", 0);
        Zombie.performAction("Move", "Zombie", "вліво");
        Player.performAction("Left","Player", 15);


        player1.move("вперед");
        zombie1.move("вліво");

        doSomething("Player"); // Гравець щось зробив.#перевантажений метод

        gun1.fire(zombie1);
        gun1.reload();
        zombie1.attack(player1.getName());

        double playerHealth = player1.getHealth();
        String zombieName = zombie1.getName();
        double zombieHealth = zombie1.getHealth();

        System.out.println(player1.getName() + " має " + playerHealth + " здоров'я.");
        System.out.println(zombieName + " має " + zombieHealth + " здоров'я.");

        Player player = new Player("Alfa", 100);
        Zombie zombie = new Zombie("Bogdan", 50);
        Weapon weapon = new Weapon("Mini Uzi", 30);

        // Перевизначення методу takeDamage() у класі Player
        player.takeDamage("50");

        // Перевизначення методу attack() у класі Zombie
        zombie.attack("Alfa");

        // Перевизначення методу fire() у класі Weapon
        weapon.fire(zombie);

        // Перевантаження методу doSomething() у класі Player
        doSomething("Alfa");

        // Перевантаження методу doSomething() у класі Zombie
        doSomething("Zombie");

        // Перевантаження методу doSomething() у класі Weapon
        doSomething("Mini Uzi");
    }




    public static void doSomething(String name) {
        switch (name) {
            case "Player":
                System.out.println("Гравець щось зробив.");
                break;
            case "Zombie":
                System.out.println("Зомбі щось зробив.");
                break;
            case "Weapon":
                System.out.println("Зброя щось зробила.");
                break;
            default:
                System.out.println("Невідома дія.");
        }
    }


}