import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
        // Klavyeden girilen 2 sayıyı toplayıp sonucunu ekrana yazdıktan sonra,
        // kullanıcıya “Tekrar Hesaplama Yapmak İstiyormusunuz?” diye soru sorup, eğer
        // kullanıcı “e” tuşuna basarsa yeniden işlemleri gerçekleştiren program
        // kodlarını yazınız.

        int sayi1, sayi2, sonuc;
        char secim='e';

        Scanner giris = new Scanner(System.in);

        while (secim == 'e' || secim=='E'){ //e ve E dışında program sonlanır
            System.out.print("1.Sayı: ");
            sayi1 = giris.nextInt();

            System.out.print("2.Sayı: ");
            sayi2 = giris.nextInt();

            sonuc = sayi1 + sayi2;
            System.out.println("Toplam= " + sonuc);

            System.out.print("Tekrar hesaplama yapmak istiyormusunuz?(e/h):");
            secim = giris.next().charAt(0);

        } 

    }
}
