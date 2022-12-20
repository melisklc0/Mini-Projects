package Sayi_Uygulamalari;

import java.util.Scanner;

public class Uygulama_1 {

    //verilen iki sayı arasındaki sayıları,sayıların toplamını ve sayı adedini veren prg

        public static void main(String[] args){
            System.out.println("\nİki sayı giriniz:");
            Scanner veri1=new Scanner(System.in);
            Scanner veri2=new Scanner(System.in);
            int sayi1=veri1.nextInt(),sayi2=veri2.nextInt();
            int toplam=0,adet=0,buyukSayi,kucukSayi;
            if(sayi1==sayi2)
                System.out.println("Aralarındaki sayı adedi: 0");
            else{
                if(sayi1>sayi2){
                    kucukSayi=sayi2;
                    buyukSayi=sayi1;
                }
                else{
                    kucukSayi=sayi1;
                    buyukSayi=sayi2;
                }
                System.out.print("Aralarındaki sayılar: ");
                while(kucukSayi!=buyukSayi-1){
                    toplam=toplam+kucukSayi;
                    adet++;
                    kucukSayi++;
                    System.out.print(kucukSayi+" ");
                }
            }
            System.out.println("\nAralarındaki toplam sayı adedi: "+adet);
            System.out.println("Aralarındaki sayıların toplamı: "+toplam);


        }
}
