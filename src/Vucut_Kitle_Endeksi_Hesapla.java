import java.util.Scanner;

public class Vucut_Kitle_Endeksi_Hesapla {

    public static void main(String[] args) {
        vucutKitleIndeksi();
    }

    public static void vucutKitleIndeksi(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bu program 19-34 yaş aralığı için doğru sonuç vermektedir.");
        System.out.print("Boyunuzu cm cinsinden giriniz:");
        double boy= klavye.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz:");
        double kilo= klavye.nextDouble();
        double hesap=hesapla(boy,kilo);
        System.out.println("Vücut kitle endeksiniz "+String.format("%.1f",hesap)+" BMI dır. Peki bu ne anlama geliyor?");
        karsilastir(hesap);
    }

    static double hesapla(double boy, double kilo){
        boy=boy*0.01;
        return (kilo)/(Math.pow(boy,2));
    }

    static void karsilastir(double sayi){
        if (0<=sayi && sayi<=18.4)
            System.out.println("""
                    Zayıf.
                    Kişinin boyuna oranla ağırlığının yetersiz olduğunu ifade eden bu değer ile karşılaşılması
                    durumunda kişinin diyetisyen eşliğinde sağlıklı bir şekilde kilo alması önerilir.""");

        else if (18.5<=sayi && sayi<=24.9)
            System.out.println("""
                    Normal.
                    Bu değer aralığı kişinin ideal kiloda olduğunu gösterir. Bu değere sahip olan kişilerin
                    düzenli, dengeli ve sağlıklı beslenmeye devam etmeleri önerilir.""");

        else if (25<=sayi && sayi<=29.9)
            System.out.println("""
                    Fazla Kilolu.
                    Kişinin boyuna oranla kilosunun fazla olduğunu gösteren bu değer aralığında kişinin uygun
                    diyet ile fazla kilolarından kurtulması önerilir.""");

        else if (30<=sayi && sayi<=34.9)
            System.out.println("""
                    Şişman.
                    Birinci derece obez kategorisinde değerlendiren değer aralığında, kişinin kilosunun sağlık açısından
                    risk oluşturabilecek düzeyde olduğu anlaşılır. Bu kişilerin diyetisyen yardımıyla kilo vermesi önerilir.""");

        else if (35<=sayi && sayi<=44.9)
            System.out.println("""
                    Fazla Şişman.
                    İkinci derece obez olarak tanımlanan bu değerlere sahip olan kişilerde kalp ve damar hastalıkları
                    bakımından risk artar. Kişinin kilo vermek için diyetisyene başvurması önerilir.""");

        else if (45<=sayi)
            System.out.println("""
                    Aşırı Fazla Şişman.
                    Üçüncü derece obez kategorisinde olan bu kişilerde hastalık gelişme riski çok yüksektir.
                    Hekim ve diyetisyen eşliğinde kilo verilmesi önerilir.""");
    }
}
