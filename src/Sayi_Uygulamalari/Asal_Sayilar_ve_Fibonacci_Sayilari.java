package Sayi_Uygulamalari;

public class Asal_Sayilar_ve_Fibonacci_Sayilari {

    // 1 ile 200 arasındaki asal sayıları yazdıran prg

        public static void main(String[] args) {
            System.out.println("\n1 ile 200 Arasındaki Asal Sayılar");
            int x=2;
            for(x=2;x<201;x++) {
                int toplam = 0;
                int s=1;
                for(s=1;s<x+1;s++){
                    int kontrol=x%s;
                    if(kontrol==0){
                        toplam+=s;
                    }
                }
                if(toplam==x+1){
                    System.out.print(x+" ");
                }
            }

// 1 ile 100 arasındaki fibonacci sayılarını yazdıran prg
            System.out.println("\n\n1 ile 100 Arasındaki Fibonacci Sayıları");
            int sayi1=1, sayi2=1, temp;
            System.out.print(sayi1+" ");
            for(int s=1;s<=8;s++){
                temp=sayi1+sayi2;
                System.out.print(temp+" ");
                if(s%2==0)
                    sayi2=temp;
                else
                    sayi1=temp;
            }
        }
}
