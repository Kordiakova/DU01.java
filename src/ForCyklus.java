public class ForCyklus {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int n = 6;
        String hviezda = "*";
        for (int i = 1; i < n+1; i++ ){
            System.out.println(hviezda);
            hviezda = hviezda + "*";
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println(" Vysledok je" + j + j + j + j + j);
        }
        for (int b = 1; b <= 5; b++) {
            System.out.println("Vysledok je " + b);
        }

        int a = 6;
        int sucet = 0;
        for (int i = 1; i < n+1; i++) {
            sucet = sucet + 1;
        }
        System.out.println("Sucet vysledny je = " + sucet);

        n = 3;
        hviezda = "*";
        String medzera = " ";
        String vypis = "";
        for (int i = 1; i < n+1; i++){
            vypis = medzera.repeat(n-i) + hviezda.repeat((2*i-1));
            System.out.println(vypis);
        }
        String t = "*";
        String s = " ";
        String o = "";
        for (int i = 0; i < 3; i++) {
            o = s.repeat(2 - i).concat(t);
            System.out.println(o);
            t += "**";
        }
        }

    }
