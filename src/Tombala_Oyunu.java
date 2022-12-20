import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tombala_Oyunu {

        public static void main(String[] args) throws InterruptedException {

//rastgele sayılardan oluşan 2 tane dizi oluşturacak
//dizinin biri kullanıcıya görünür
//torbadan sayı çekilecek
//çekilen sayı iki dizide kontrol edilecek
//tüm sayılar bulundu mu diye kontrol

            Scanner klavye = new Scanner(System.in);
            TimeUnit.SECONDS.sleep(1);
            System.out.print("\nTombala oyununa hoş geldiniz!\n");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Bulduğunuz sayıları 0 ile işaretleyeceğiz.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Sayı çekmek için enter'a basmalısınız.");
            TimeUnit.SECONDS.sleep(1);

            int[] bilgTablo = diziOlustur(8);
            int[] oyuncuTablo = diziOlustur(8);
            int[] cekilenSayilar=new int[99];

            System.out.println("\nSayılarınız:");
            tabloYazdir(oyuncuTablo, 8);
            System.out.println("----------------------");
            TimeUnit.SECONDS.sleep(2);

            boolean oyunBittiMi = false;
            int tur = 0;
            while (!oyunBittiMi) {

                tur++;
                System.out.print(tur + ". tur");
                int sayi = sayiCek(cekilenSayilar);
                cekilenSayilar[tur-1]=sayi;

                klavye.nextLine();
                System.out.println("Çekilen sayı: " + sayi);
                TimeUnit.SECONDS.sleep(1);

                if (sayiVarMi(bilgTablo, sayi)) {
                    System.out.println("Bilgisayar sayı buldu!");
                    sifirYap(bilgTablo,sayi);
                }
                if (sayiVarMi(oyuncuTablo, sayi)) {
                    System.out.println("Sayı buldunuz!");
                    TimeUnit.SECONDS.sleep(1);
                    sifirYap(oyuncuTablo,sayi);
                }
                tabloYazdir(oyuncuTablo,8);
                System.out.println("---------------");

                if (bittiMi(oyuncuTablo)&&bittiMi(bilgTablo)){
                    System.out.println("Berabere!");
                    oyunBittiMi=true;
                }

                else if (bittiMi(oyuncuTablo)) {
                    System.out.println("Kazandınız!");
                    oyunBittiMi=true;
                }
                else if (bittiMi(bilgTablo)) {
                    System.out.println("Bilgisayar Kazandı!");
                    oyunBittiMi=true;
                }
            }
        }


        static boolean sayiVarMi(int[] dizi, int sayi) {
            boolean girdiMi = false;
            for (int j : dizi) {
                if (j == sayi) {
                    girdiMi = true;
                    break;
                }
            }
            return girdiMi;
        }

        static int [] sifirYap(int [] dizi, int sayi){
            for (int i = 0; i < dizi.length; i++) {
                if (dizi[i]==sayi){
                    dizi[i]=0;
                }
            }
            return dizi;
        }

        static int sayiCek(int [] dizi) {
            boolean cekilmisMi=false;
            int sayi= (int) (Math.random() * 18 + 1);
            do {
                for (int i = 0; i < dizi.length; i++) {
                    if (dizi[i] == sayi) {
                        cekilmisMi = true;
                        break;
                    } else cekilmisMi = false;
                }
                if (cekilmisMi) sayi = (int) (Math.random() * 18 + 1);
            } while (cekilmisMi);
            return sayi;
        }

        static boolean bittiMi(int[] dizi) {
            boolean kontrol=true;
            for (int i = 0; i < dizi.length; i++) {
                if (dizi[i]!=0){
                    kontrol=false;
                    break;
                }
            }
            return kontrol;
        }

        static int[] diziOlustur(int eleman) {
            int[] dizi = new int[eleman];
            for (int i = 0; i < eleman; i++) {
                dizi[i] = (int) (Math.random() * 18 + 1);
            }
            return dizi;
        }

        static void tabloYazdir(int[] dizi, int bosluk) {
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i] + "\t");
                if ((i + 1) % bosluk == 0) System.out.println();
            }
        }

}
