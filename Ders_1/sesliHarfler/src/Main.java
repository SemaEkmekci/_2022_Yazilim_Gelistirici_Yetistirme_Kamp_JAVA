public class Main {
    public static void main(String[] args) {

/*
    //Sesli sessiz harf buluyor.
        char[] sesliHarfler = {'A','E','I','İ','O','Ö','U','Ü','a','e','ı','i','o','ö','u','ü'};
        char arananHarf = 'c';

        boolean durum = false;

        for (char sesliHarf:sesliHarfler){

            if(arananHarf == sesliHarf){
                durum = true;
                break;
            }
        }

        if (durum){
            System.out.println(arananHarf + " --> sesli harftir.");
        }else {
            System.out.println(arananHarf + " --> sessiz harftir.");
        }*/



        String[] sesliHarfler = {"A","E","I","İ","O","Ö","U","Ü","a","e","ı","i","o","ö","u","ü"};

        String[] kalinSesliHarfler = {"A","I","O","U","a","ı","o","u"};

        String arananKarakter = "e";

        boolean sesliHarfMi = false;
        char durum = 'i';

        for (String sesliHarf:sesliHarfler){

            if(arananKarakter == sesliHarf){
                sesliHarfMi = true;
                break;
            }
        }

        if (sesliHarfMi){
        for(String harf:kalinSesliHarfler){
            if (arananKarakter == harf) {
                durum = 'k';
                System.out.println(arananKarakter +" --> Kalın sesli harftir.");
                break;
            }
        }


        if (durum == 'i'){
            System.out.println(arananKarakter +" --> İnce sesli harftir.");

        }}
}

}