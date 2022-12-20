package Sayi_Uygulamalari;

import java.util.Scanner;

public class Uygulama_4 {

    //girilen 3 sayıdan en büyüğünü bulan prg

        public static void main(String[] args) {

            System.out.print("Sayı Giriniz:");
            Scanner veri1=new Scanner(System.in);
            int sayi1;
            sayi1=veri1.nextInt();

            System.out.print("Sayı Giriniz:");
            Scanner veri2=new Scanner(System.in);
            int sayi2;
            sayi2=veri2.nextInt();

            System.out.print("Sayı Giriniz:");
            Scanner veri3=new Scanner(System.in);
            int sayi3;
            sayi3=veri3.nextInt();

            int enBuyuk=sayi1;
            if(enBuyuk<sayi2) {
                enBuyuk=sayi2;
            }
            if(enBuyuk<sayi3){
                enBuyuk=sayi3;
            }
            System.out.println("En büyük sayı:"+enBuyuk);

        }

}
