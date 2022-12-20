public class Diziler_Ders_Notu {

    public static void main(String[] args) {

        //diziler
        double[] myList2 = new double[4]; //eleman sayısı tanımladık
        double[] myList = {1, 2, 3, 4, 5, 6}; //elemanları tanımladık

//dizideki elemanları okuma 2 yolla yapılabilir:
        for (int i = 0; i < myList.length; i++) { //length eleman sayısı
            System.out.println(myList[i]);
        }
        System.out.println("---------------");

        for (double liste : myList) {
            System.out.println(liste);
        }
        System.out.println("---------------");

        //dizideki elemanların toplamını yazdırmak istersek
        double toplam = 0;
        for (double numara : myList) {
            toplam = toplam + numara;
        }
        System.out.println("Toplam: " + toplam);

        //en büyük sayıyı bulmak için
        double enBuyuk = myList[0];
        for (double numara : myList) {
            if (enBuyuk < numara)
                enBuyuk = numara;
        }
        System.out.println("En büyük sayı: " + enBuyuk);

        //çok boyutlu diziler
        String[][] sehirler = new String[3][3];
        //satır-sütun tablosu gibi tutacak (bu dizi 9 elemanlı)

        for (int i = 0; i <= 2; i++) {
            //satırları gezecek (i bu döngüde değişiyor)
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
                //burda sütunları gezecek (i bu döngüde sabit)
            }
        }

    }
}
