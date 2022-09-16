public class Main {
    public static void main(String[] args) {
        int sayi = 1;
        int durum = 1;

        if (sayi == 1) {
            System.out.println("1 Sayısı asal değildir.");
            return;
        }

        for (int i = sayi / 2; i > 2; i--) {

            if (sayi % i == 0) {
                durum = 0;
            }

        }
        if (durum == 1) {
            System.out.println(sayi + " sayısı asal sayıdır.");
        } else {
            System.out.println(sayi + " sayısı asal değil");

        }
    }
}