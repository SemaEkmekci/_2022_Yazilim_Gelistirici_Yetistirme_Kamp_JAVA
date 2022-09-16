public class Main {
    public static void main(String[] args) {
        String metin = "    Bugün hava çok güzel.   ";
        System.out.println(metin);

       /* System.out.println("Eleman Sayısı : " + metin.length());
        System.out.println("5. Eleman : " + metin.charAt(4));
        System.out.println(metin.concat("Yaşasın"));
        System.out.println(metin.startsWith("B"));
        System.out.println(metin.endsWith("."));
        char[] karakterler = new char[8];
        metin.getChars(0,8,karakterler,0);
        System.out.println(karakterler);
        System.out.println(metin.indexOf("av"));
        System.out.println(metin.lastIndexOf("a"));*/

        String yeniMetin = metin.replace(' ', '-');
        //Metindeki boşluk karakterini(' ') tire işareti ile değiştirir('-')
        System.out.println(yeniMetin);


        System.out.println(metin.substring(1, 5));
        // 1.indexten 4. indexe kadar olan karakterleri getirir. 5.indeksi almaz.

        for (String kelime : metin.split(" ")) {
            //split metini boşluk karakterinden ayırır. for düngüsü ile bütün kelimeleri ekrana alt alta yazar.
            System.out.println(kelime);
        }

        System.out.println(metin.toLowerCase());
        // Bütün harfler küçük olur lakin metnin orjinali bozulmaz
        System.out.println(metin.toUpperCase());
        // Bütün harfler BÜYÜK olur lakin metnin orjinali bozulmaz

        System.out.println(metin.trim());
        //trim ile metinin başındaki ve sonundaki boşluklar silinir. lakin metne etki etmez çünkü metine tekrar bi atama yapmadık

    }
}