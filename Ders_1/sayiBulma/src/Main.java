public class Main {
    public static void main(String[] args) {

        int[] sayi_dizisi = {1, 2, 5, 7, 9, 0};
        int aranan = 9;
        boolean durum = false;
        for (int bu_mu : sayi_dizisi) {
            if (bu_mu == aranan) {
                durum = true;
                break;
            }
        }
        if (durum) {
            System.out.println(aranan + " sayısı dizi içinde Var");

        } else {
            System.out.println(aranan + " sayısı dizi içinde Yok");

        }

    }
}