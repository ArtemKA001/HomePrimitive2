public class main {
    public static void main(String[] args) {
        int score = 200;
        int replenishment = 3000;
        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        ;
        System.out.println(bonus);
        int amount = score + replenishment + bonus;
        System.out.println(amount);
    }
}
