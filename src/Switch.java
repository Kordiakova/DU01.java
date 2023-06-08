public class Switch {
    public static void main(String[] args) {

        int den = 10;

        switch (den){
            case 1:
                System.out.println("Pondelok");
                break;
            case 2:
            System.out.println("Utorok");
                break;
            case 3:
                System.out.println("Streda");
                break;
            case 4:
                System.out.println("Štvrtok");
                break;
            case 5:
                System.out.println("Piatok");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Nedela");
                break;
            case 8:
                System.out.println("Neexistuje");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
