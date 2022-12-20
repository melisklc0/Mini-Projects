package Sayi_Uygulamalari;

import java.util.Scanner;

public class Fibonacci_2 {

    public static void main(String[] args) {

	    /*int [] dizi=new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*99+1);
        }
        System.out.println(Arrays.toString(dizi));
        for (int j = 1; j < dizi.length+1; j++) {
            int temp = dizi[dizi.length - 1];
            for (int i = dizi.length - 1; i > 0; i--) {
                dizi[i] = dizi[i - 1];
            }
            dizi[0] = temp;
            System.out.println(Arrays.toString(dizi));
        }*/

        Scanner klavye=new Scanner(System.in);
        System.out.println("Kaçıncı Fibonacci sayısını bulmak istiyorsunuz?");
        int n=klavye.nextInt();
        System.out.println(n+". Fibonacci sayısı: "+fibonacciBulma(n));
    }
    //n. fibonacci sayısını yazdıran metod
    static int fibonacciBulma (int n){
        int sayi1=1, sayi2=1, temp=0;
        for (int i = 1; i <= n-1; i++){
            temp=sayi1+sayi2;
            if (i%2==0) sayi2=temp;
            else sayi1=temp;
        }
        return temp;
    }

    //dizide, bir sayıdan küçük kaç tane sayı olduğunu bulma
    static int sayiBulma (int [] dizi,int sayi){
        int sayac=0;
        for (int j : dizi) {
            if (j < sayi) sayac++;
        }
        return sayac;
    }
}
