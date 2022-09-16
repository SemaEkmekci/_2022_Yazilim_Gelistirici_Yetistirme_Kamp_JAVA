public class Main {
    public static void main(String[] args) {
         System.out.println("\nFor Döngüsü\n");

        for(int i=2;i<=10;i++){
            if (i%2==0){
                System.out.println(i);
            }}

        System.out.println("\nDöngü Bitti\n");


        System.out.println("\nWhile Döngüsü\n");
        int i=1;
        while (i<=10) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        //Do-While

        int j =1 ;

        do{
            System.out.println("Loglandı");
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While dögüsü bitti");

    }
}