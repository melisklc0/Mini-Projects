package Sayi_Uygulamalari;

import java.util.Scanner;

public class Standart_Sapma_Hesapla {

    // girilen pozitif sayıların standart sapma ve geometrik ortalamasını hesaplayan prg

        public static void main(String[] args) {
            System.out.print("\nToplam sayı adedi giriniz:");
            Scanner veri1=new Scanner(System.in);
            int n=veri1.nextInt();

            int toplam=0;
            int [] dizi=new int [n];

            for(int s=0;s<=n-1;s++) {
                System.out.print("Sayı giriniz:");
                Scanner veri2 = new Scanner(System.in);
                int sayi = veri2.nextInt();
                while (sayi <= 0) {
                    System.out.print("Lütfen pozitif sayı giriniz:");
                    Scanner veri3 = new Scanner(System.in);
                    sayi = veri3.nextInt();
                }
                dizi[s]=sayi;
                toplam=toplam+sayi;
            }
            int aritOrt=toplam/10, geoCarp=1;
            double stToplam=0;
            for(int s=0;s<=n-1;s++){
                int x=dizi[s];
                stToplam=stToplam+((x-aritOrt)*(x-aritOrt));
                geoCarp=geoCarp*x;
            }
            double geoOrt=Math.pow(geoCarp,(1.0/n));
            double stSapma=Math.sqrt(stToplam/9);
            System.out.println("\nStandart Sapma: "+String.format("%.2f",stSapma));
            System.out.println("Geometrik Ortalama: "+String.format("%.2f",geoOrt));

        }

}
