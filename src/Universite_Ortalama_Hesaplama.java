import java.util.Scanner;

public class Universite_Ortalama_Hesaplama {

    //üniversite dönem ortalamasını hesaplayan program

        public static void main(String[] args) {
            System.out.println("\nÜniversite Dönem Ortalamasını Hesaplama");
            System.out.println("(Ondalık sayıları virgül ile giriniz.)");
            System.out.print("\nToplam ders sayısını giriniz:");
            Scanner klavye=new Scanner(System.in);
            int n= klavye.nextInt();
            double [] krediDizi=new double[n];
            double [] ortNotDizi=new double[n];

            double toplamKredi=0;
            double ortNot, toplamNot=0;

            for (int s=0;s<=n-1;s++) {
                System.out.print("\n"+(s+1)+".dersin kredisini giriniz:");
                double kredi=klavye.nextDouble();

                krediDizi [s]= kredi;
                toplamKredi=toplamKredi+kredi;

                System.out.print((s+1)+".dersin vize notunu giriniz:");
                int vizeNot=klavye.nextInt();

                System.out.print((s+1)+".dersin final notunu giriniz:");
                int finalNot=klavye.nextInt();

                double dersNotu=(vizeNot*0.4)+(finalNot*0.6);
                if (finalNot<50)
                    ortNot=0;
                else{
                    if(dersNotu>=90)
                        ortNot=4;
                    else if(90>dersNotu && dersNotu>=80)
                        ortNot=3.5;
                    else if(80>dersNotu && dersNotu>=70)
                        ortNot=3;
                    else if(70>dersNotu && dersNotu>=60)
                        ortNot=2.5;
                    else if(60>dersNotu && dersNotu>=50)
                        ortNot=2;
                    else
                        ortNot=0;
                }
                ortNotDizi [s]=ortNot;
            }
            for (int s=0;s<=n-1;s++){
                double kr= krediDizi[s];
                double on= ortNotDizi[s];
                toplamNot=toplamNot+(kr*on);
            }
            System.out.println("\nDönem ortalamanız: "+
                    String.format("%.2f",(toplamNot/toplamKredi)));
        }

}
