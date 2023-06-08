public class DU01 {
    public static void main(String[] args) {

        // 01 uloha:
        int r = 4;
        int s = (int) (3.14 * (r * r));
        int o = (int) (2 * (3.14 * r));

        System.out.println("Obsahu kruhu je" + " " + s);
        System.out.println("Obvod kruhu je" + " " + o);

        // 02 uloha:
        int vek = 12;
        int vek1 = 12 + 1;
        int vek10 = 12 + 10;
        String meno = "Viliam Kordiak";

        System.out.println("Student sa vola " + meno + " " + "a jeho vek je" + " " + vek + " rokov.");
        System.out.println("Student bude mat buduci rok o 1 rok viac a jeho vek bude " + vek1 + " " + "rokov." );
        System.out.println("Student bude mat o 10 rokov viac a jeho vek bude " + vek10 + " rokov.");

        // 03 uloha:
        String name = "Lucia";
        String priezvisko = "Kordiakova";
        System.out.println(name.concat(priezvisko));

        // 04abc
        String text = "Od hlavy k pätám,\n" +
                "so zemou spätá, oooh oooh oooh.Môžem kračáť slobodná, oooh oooh oooh.Od hlavy k pätám, so zemou spätá, oooh oooh oooh.\n" +
                "Aj ty si mi podobná, uuuu, uuu, uuuuuu";

        System.out.println(text.toUpperCase());
        System.out.println("so zemou spata, \" oooh oooh oooh.\" Mozem kracat slobodna, \" oooh oooh oooh \".");

        //05
        int NC1 = (int) (Math.random() * 101);
        int NC2 = (int) (Math.random() * 101);
        System.out.println("Vacsie nahodne cislo je" + " " + Math.max(NC1, NC2));
        System.out.println("Mansie nahodne cislo je" + " " + Math.min(NC1, NC2));



    }
}
