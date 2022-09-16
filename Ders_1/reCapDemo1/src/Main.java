public class Main {
    public static void main(String[] args) {

        int sayi1 = 28;
        int sayi2 = 25;
        int sayi3 = 20;
        int max = sayi3;

        if (max < sayi2){
            max = sayi2;
        }
        if (max < sayi1) {
            max = sayi1;
        }
        System.out.println("Max Sayı ->" + max);

    }
}