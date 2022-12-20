package Sayi_Uygulamalari;

public class Uygulama_3 {

    public static void main(String[] args) {
        System.out.print("\n---------------");

//4. slayt, 4. soru
        int sonDeger=(int) (Math.random()*10+1);
        int x=(int) (Math.random()*10+1);
        System.out.println("\nX değeri: "+x+"\nN değeri: "+sonDeger);
        double toplam=1;
        for (int i = 1; i <=sonDeger ; i++) {
            int faktor=1;
            for (int j = 1; j <=i ; j++) {
                faktor=faktor*j;
            }
            toplam= toplam+(Math.pow(x,i))/faktor;
        }
        System.out.println("Hesaplanan değer: "+String.format("%.2f",toplam));
        System.out.println("---------------");

//4. slayt, 5. soru
        int n=(int) (Math.random()*10+1);
        System.out.println("N değeri: "+n);
        double hesap=1;
        int sayac=2;
        while(sayac<=n) {
            hesap= hesap+(double) sayac/(sayac+1);
            sayac++;
        }
        System.out.println("Hesaplanan değer: "+String.format("%.2f",hesap));
        System.out.println("---------------");

//145=1!+4!+5! gibi faktoriyon sayılarını bulma
        int fsayi=(int) (Math.random()*1000+1);
        System.out.println("Üretilen sayı: "+fsayi);
        int basamak=0, temp=fsayi, temp2=fsayi, ftoplam=0, faktor2=1;
        while (temp>0){
            temp=temp/10;
            basamak++;
        }
        for (int i = 1; i <= basamak; i++) {
            int kalan=temp2%10;
            temp2=(temp2-kalan)/10;
            for (int j = 1; j <=kalan ; j++) {
                faktor2=faktor2*j;
            }
            ftoplam= ftoplam+faktor2;
            faktor2=1;
        }
        if (ftoplam==fsayi)
            System.out.println("Faktoriyon sayısıdır.");
        else
            System.out.println("Faktoriyon sayısı değildir.");
        System.out.println("---------------");
    }
}
