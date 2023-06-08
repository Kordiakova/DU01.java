public class Matematic {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        int s = a * b;
        int o = 2 * (a + b);

        System.out.println(a * b);
        System.out.println((a + b) * 2);

        System.out.println("Obsah je rovny " + s);
        System.out.println("Obvod je rovny " + o);

        System.out.println(a == b);

        int c = 23456;
        int d = 46802;
        int max = Math.max(c,d);
        int min = Math.min(c,d);
        int absHodnota = Math.abs(d);


        System.out.println( max );
        System.out.println( min );
        System.out.println( absHodnota );

        int nahCislo1 = (int) (Math.random() * 101);
        int nahCislo2 = (int) (Math.random() * 101);
        System.out.println("Nase nahodne cisla su" + " " + nahCislo1 + " a " + nahCislo2 );
        System.out.println("Vacsie nahodne cislo je" + " " + Math.max(nahCislo1, nahCislo2));
    }
}
