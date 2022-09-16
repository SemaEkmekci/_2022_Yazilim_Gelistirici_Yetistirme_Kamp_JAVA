public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];

        ogrenciler[0] = "Sema";
        ogrenciler[1] = "Ebrar";
        ogrenciler[2] = "Kezban";
        ogrenciler[3] = "Emin";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (String ogrencilergez : ogrenciler) {

            System.out.println(ogrencilergez);

        }

    }
}