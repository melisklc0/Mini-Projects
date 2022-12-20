package Sayi_Uygulamalari;

public class Uygulama_2 {

    public static void main(String[] args) {
        System.out.println("\n--------------------");

//sayı asal mı değil mi?
        int asalSayi=(int) (Math.random()*100+1);
        System.out.println("Üretilen sayı: "+asalSayi);
        int asalToplam=0;
        for (int i = 1; i <= asalSayi; i++) {
            if (asalSayi%i==0)
                asalToplam=asalToplam+i;

        }
        if (asalToplam==asalSayi+1)
            System.out.println("Sayı asaldır.");
        else
            System.out.println("Sayı asal değildir.");
        System.out.println("--------------------");

//üretilen 15 adet sayının küpleri toplamı
        int kupToplam=0;
        System.out.print("Sayılar: ");
        for (int i = 0; i < 15; i++) {
            int kupSayi=(int) (Math.random()*20+1);
            System.out.print(kupSayi+" ");
            kupToplam=kupToplam+ (int) Math.pow(kupSayi,3);
        }
        System.out.println("\nKüpler toplamı: "+kupToplam);
        System.out.println("--------------------");

//üretilen sayının basamak sayısı
        int bSayi=(int) (Math.random         ()*10000+1);
        System.out.println("Üretilen sayı: "+bSayi);
        int basamak=0, kalan;
        while (bSayi>0){
            kalan=(bSayi%10);
            bSayi=((bSayi-kalan)/10);
            basamak++;
        }
        System.out.println("Basamak sayısı: "+basamak);
        System.out.println("--------------------");

//palidrom sayısı mı değil mi? (101,141,22 gibi ..)
        int pSayi=(int) (Math.random()*1000+1);
        System.out.println("Üretilen sayı: "+pSayi);
        int pKalan,pYeniSayi=0;
        int temp=pSayi;
        while (temp>0){
            pKalan=(temp%10);
            temp=((temp-pKalan)/10);
            pYeniSayi=((pYeniSayi*10)+pKalan);
        }
        if (pYeniSayi==pSayi)
            System.out.println("Palidrom sayısıdır.");
        else
            System.out.println("Palidrom sayısı değildir.");
        System.out.println("--------------------");


//dost sayılar? (kendileri hariç kalansız bölenlerin toplamı bir-
//birine eşit olan sayılar)
        int dsayi1=(int) (Math.random()*10000+1);
        int dsayi2=(int) (Math.random()*10000+1);
        System.out.println("Üretilen sayılar: "+dsayi1+", "+dsayi2);
        int toplam1=0, toplam2=0;
        for (int i = 1; i <dsayi1 ; i++) {
            if (dsayi1%i==0)
                toplam1=toplam1+i;
        }
        for (int i = 1; i <dsayi2; i++) {
            if (dsayi2%i==0)
                toplam2=toplam2+i;
        }
        if (toplam1==dsayi2 && toplam2==dsayi1)
            System.out.println("Dost sayılardır.");
        else
            System.out.println("Dost sayılar değillerdir.");
        System.out.println("--------------------");
    }
}
