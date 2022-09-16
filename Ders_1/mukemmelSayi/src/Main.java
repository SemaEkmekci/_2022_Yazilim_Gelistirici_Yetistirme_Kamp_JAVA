public class Main {
    public static void main(String[] args) {

        int num = 30;
        int total = 0;

        for(int i = 1; i <num;i++ ){
         if(num%i == 0){
             total+=i;
         }
        }
        if (total == num){
            System.out.println(num +" --> Mükemmel Sayıdır.");
        }else {
            System.out.println(num + " --> Mükemmel Sayı Değildir.");
        }



    }
}