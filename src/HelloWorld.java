public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("ahoj svet");
        // TODO  nezabudnút dokončiť
        System.out.println(98514);
        System.out.println("Lucia");

        String retazec = "Ahoj Ahoj Ahoj if Ahoj";
        System.out.println("Dlzka retazca je" + " " + retazec.length() + " " + "znakov");
        System.out.println(retazec.toUpperCase());
        System.out.println(retazec.toLowerCase());
        System.out.println(retazec.indexOf("if"));

        String meno = "Milan";
        String priezvisko = "Kordiak";
        System.out.println(meno + priezvisko);
        System.out.println(meno.concat(priezvisko));

        System.out.println("Nejaky text, ktory chcem dat do \"uvozdoviek\", ale uvodzovky lenn vypisat." );


    }
}
