import java.util.Scanner;

public class d13 {
    public static void main(String[] args) {
        // Klavyeden girilen 2 sayıyı toplayıp sonucunu ekrana yazdıktan sonra,
        // kullanıcıya “Tekrar Hesaplama Yapmak İstiyormusunuz?” diye soru sorup, eğer
        // kullanıcı “e” tuşuna basarsa yeniden işlemleri gerçekleştiren program
        // kodlarını yazınız.

        int sayi1, sayi2, toplam;
        char secim;

        Scanner giris = new Scanner(System.in);

        do {
            System.out.print("1.Sayı:");
            sayi1 = giris.nextInt();

            System.out.print("2.Sayı:");
            sayi2=giris.nextInt();

            toplam = sayi1 + sayi2;
            System.out.println(toplam);

            System.out.println("Tekrar hesaplama yapmak istiyor musunuz?(e/h):");
            secim = giris.next().charAt(0);
        } while (secim=='e');

    }
}
