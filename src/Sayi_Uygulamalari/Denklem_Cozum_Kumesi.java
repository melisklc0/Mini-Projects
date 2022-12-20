package Sayi_Uygulamalari;

import java.util.Scanner;

public class Denklem_Cozum_Kumesi {

    //girilen ikinci dereceden bir bilinmeyenli denklemin çözüm kümesi bulan prg

        public static void main(String[] args) {
            System.out.println("ax²+bx+c=0 denklemindeki a,b,c sayılarını giriniz.");
            System.out.print("a sayısı:");
            Scanner veri1=new Scanner(System.in);
            int a=veri1.nextInt();

            System.out.print("b sayısı:");
            Scanner veri2=new Scanner(System.in);
            int b=veri2.nextInt();

            System.out.print("c sayısı:");
            Scanner veri3=new Scanner(System.in);
            int c=veri3.nextInt();

            double delta=(Math.pow(b,2)-(4*a*c));

            if (delta<0){
                System.out.println("Reel kök yoktur.");
            }
            else if(delta==0){
                double tekkok=(-b)/(2*a);
                System.out.println("Tek kök vardır: "+String.format("%.2f",tekkok));
            }
            else{
                double kok1=(-b+(Math.sqrt(delta)))/(2*a);
                double kok2=(-b-(Math.sqrt(delta)))/(2*a);
                System.out.println("İki kök vardır: "+String.format("%.2f",kok1)+" ve "+String.format("%.2f",kok2));
            }
        }

}
