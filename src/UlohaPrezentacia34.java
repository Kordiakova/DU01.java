public class UlohaPrezentacia34 {
    public static void main(String[] args) {

        int cislo01 = 10;
        int cislo02 = 12;
        int max = -999;

        if (cislo01 > cislo02) {
            System.out.println("Je to pravda.");

        } else if (cislo02 > cislo01){
            System.out.println("Nie je to pravda.");

        } else {
            max = cislo01;
            System.out.println(max);
        }
    }
}
