import java.util.Arrays;

public class Dizi_Uygulama {

    //dizinin en küçük ikinci en küçük ve büyüğü

        public static void main(String[] args) {
            int [] dizi=new int[10];
            for (int i = 0; i < dizi.length; i++) {
                dizi[i]=(int) (Math.random()*9+1);
            }
            Arrays.sort(dizi);
            System.out.println(Arrays.toString(dizi));

            int kucuk=dizi[0];
            for (int i = 0; i < dizi.length-1; i++) {
                int sayac=1;
                while(kucuk==dizi[i]){
                    kucuk=dizi[sayac];
                    sayac++;
                }
                if(kucuk!=dizi[0]){
                    break;
                }
            }
            int buyuk=dizi[dizi.length-1];
            for (int i = dizi.length-1; i > 0; i--) {
                int sayac=dizi.length-2;
                while(buyuk==dizi[i]){
                    buyuk=dizi[sayac];
                    sayac--;
                }
                if(buyuk!=dizi[dizi.length-1]){
                    break;
                }
            }

            System.out.println("Dizinin ikinci en küçüğü: " +kucuk);
            System.out.println("Dizinin ikinci en büyüğü: " +buyuk);
        }

}
