package Sayi_Uygulamalari;

public class Uygulama_5 {

    public static void main(String[] args) {
        int sayi=(int) (Math.random()*9990+10);
        System.out.println("\nÜretilen sayı: "+sayi);
        int kalan=0, yeniSayi=0;
        while(sayi>0){
            kalan=sayi%10;
            sayi=(sayi-kalan)/10;
            yeniSayi=(yeniSayi*10)+kalan;
        }
        System.out.println("Sayının tersi: "+yeniSayi);

    }
}
