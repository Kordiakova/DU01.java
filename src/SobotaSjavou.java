public class SobotaSjavou {
    public static void main(String[] args) {
        int min = 1;
        int max = 50;

        int randomCis01= (int)Math.floor(Math.random() * (max - min + 1) + min);
        int randomCis02= (int)Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("Naše vygenerované čísla sú: " + randomCis01 + " " + randomCis02);

        if (randomCis01 >  randomCis02) {
            System.out.println("Vašie číslo je " + randomCis01);
        } else {
            System.out.println("Vaacsie cislo je " + randomCis02);
        }
    }
}
