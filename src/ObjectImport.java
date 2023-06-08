import java.util.Scanner;

public class ObjectImport {
    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in);

        System.out.print("Tvoje meno:");
        String meno = mojObjekt.nextLine();

        System.out.println("Ahojky " + meno);

    }

}
