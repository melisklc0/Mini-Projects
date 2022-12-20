import java.util.Scanner;

public class Erasmus_Puan_Hesaplama {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);

        System.out.print("\nMod yazın (1-2) :");
        int mod= klavye.nextInt();

        if (mod==1) { //doğru sayısını biliniyor, puan merak ediliyor
            System.out.print("\nNot ortalaması:");
            double ortalama = klavye.nextDouble();
            System.out.print("Doğru sayısı:");
            double dogru = klavye.nextDouble();
            double puan = ((dogru * 50) / 80) + (ortalama * 12.5);
            System.out.println("Puan: " + puan);
        }
        else { //istenen puan biliniyor, gereken doğru sayısı merak ediliyor
            System.out.print("\nNot ortalaması:");
            double ortalama = klavye.nextDouble();
            System.out.print("İstenen Puan:");
            double puan = klavye.nextDouble();
            double dogru = 80 * (puan - (ortalama * 12.5)) / 50;
            System.out.println("Gereken Doğru Sayısı: " + dogru);
        }
    }
}
