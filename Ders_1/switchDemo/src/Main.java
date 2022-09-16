public class Main {
    public static void main(String[] args) {

        char grade = 'H';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;

            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");

        }






       /* char karakter = 'C';

        switch (karakter){
                case 'A':
                        System.out.println("Karakter A");
                        break;
                case 'B':
                        System.out.println("Karakter" + karakter);
                        break;
                default:
                        System.out.println("Karakter A veya B değil\nKarakter --> "+ karakter);
        }*/


    }
}