public class MesicaCisloDni {
    public static void main(String[] args) {
        int mesiac = 1;

        switch (mesiac){
            case 1:
                System.out.println("Január");
                System.out.println("Má 31 dní");
                break;
            case 2:
                System.out.println("Február - 28 dní");
                break;
            case 3:
                System.out.println("Marec - 31 dní");
                break;
            case 4:
                System.out.println("Apríl - 30 dní");
                break;
            case 5:
                System.out.println("Máj - 31 dní");
                break;
            case 6:
                System.out.println("Jún - 30 dní");
                break;
            case 7:
                System.out.println("Júl - 31 dní");
                break;
            case 8:
                System.out.println("August - 31 dní");
                break;
            case 9:
                System.out.println("September - 30 dní");
                break;
            case 10:
                System.out.println("Október - 31 dní");
                break;
            case 11:
                System.out.println("November - 30 dní");
                break;
            case 12:
                System.out.println("December - 31 dní");
                break;
            default:
                System.out.println("Tento mesiac neexistuje.");
                break;
        }
    }
}
