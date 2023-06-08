public class StyriCisla {
    public static void main(String[] args) {
        int cislo1 = 50;
        int cislo2 = 60;
        int cislo3 = 70;
        int cislo4 = 80;

        if (cislo1 > cislo2 && cislo1 > cislo3 && cislo1 > cislo4) {
            System.out.println("Cislo1 je najväčšie" + cislo1);
        } else if (cislo2 > cislo1 && cislo2 > cislo3 && cislo2 > cislo4) {
            System.out.println("Cislo2 je najväčšie" + cislo2);
        } else if (cislo3 > cislo1 && cislo3 > cislo2 && cislo3 > cislo4) {
            System.out.println("Cislo2 je najväčšie" + cislo2);
        } else if (cislo4 > cislo1 && cislo4 > cislo2 && cislo4 > cislo3) {
            System.out.println("Cislo4 je najväčšie" + cislo4);
        }


    }
}
