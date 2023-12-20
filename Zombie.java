class Zombie {
        private String name;
        private double health;

        public Zombie(String name, double health) {
            this.name = name;
            this.health = health;
        }

        // ім'я
        public String getName() {
            return name;
        }

        public double getHealth() {
            return health;
        }
        // Урон
        public void takeDamage(double damage) {
            health -= damage;
            System.out.println("\u001B[34m" + name +"\u001B[32m" +  " отримав " + "\u001B[31m" + damage +"\u001B[32m" +  " шкоди. \n Загальне здоров'я противника: " +"\u001B[31m" +  health);
        }

        // void
        public void move(String direction) {
            System.out.println("\u001B[34m" + name + "\u001B[32m" + " рухається у напрямку " + "\u001B[31m" + direction);
        }

        // Метод для атаки гравця
        public void attack(String target) {
            Zombie targetZombie = new Zombie(target, 50);
            int damage = 20;
            targetZombie.takeDamage(damage);
        }
    public static void performAction(String action, String target, String value) {
        switch (action) {
            case "Attack":
                System.out.println(target + " атакує гравця.");
                break;
            case "Move":
                System.out.println(target + " рухається в напрямку " + value);
                break;
            default:
                System.out.println("Недопустима дія для зомбі.");
        }
    }
    public static void doSomething(Zombie zombie) {
        System.out.println(zombie.getName() + " щось зробив.");
    }

}