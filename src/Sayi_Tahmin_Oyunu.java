import java.util.Scanner;
public class Sayi_Tahmin_Oyunu {

    public static void main(String[] args) {
        sayiTahminOyunu();

    }
    public static void sayiTahminOyunu (){
        Scanner klavye = new Scanner(System.in);
        System.out.print("\nSayı tahmin oyununa hoş geldiniz!\nSayı giriniz:");
        int sayi= (int) (Math.random()*98+1);
        int tahmin= klavye.nextInt();
        int tur=1;
        while (!tahminDogruMu(sayi,tahmin)){
            sayiTahmin(sayi,tahmin);
            if (!tahminDogruMu(sayi,tahmin))
                tahmin= klavye.nextInt();
            tur++;
        }
        System.out.println(tur+". tahminde bildiniz!");
    }
    static void sayiTahmin (int sayi,int tahmin){
        if (sayi==tahmin)
            System.out.println("Tahmin doğrudur!");
        else if (sayi>tahmin)
            System.out.print("Daha büyük bir sayı tahmin edin:");
        else System.out.print("Daha küçük bir sayı tahmin edin:");
    }
    static boolean tahminDogruMu (int sayi, int tahmin){
        return sayi==tahmin;
    }


}
