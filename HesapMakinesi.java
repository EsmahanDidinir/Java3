
import java.util.Scanner;

public class HesapMakinesi {
    static void toplama() {
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            sayi = scan.nextInt();
            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    static void cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            sayi = scan.nextInt();
            if (i == 1) {
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    static void carpma() {
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            sayi = scan.nextInt();

            if (sayi == 1) {
                break;
            }
            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    static void usAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int us = scan.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void fakt() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int x = scan.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int y = scan.nextInt();

        int sonuc = x % y;
        System.out.println("Sonuç: " + sonuc);
    }

    static void dikDort() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kısa kenarı girin: ");
        int k = scan.nextInt();
        System.out.println("Uzun kenarı girin: ");
        int u = scan.nextInt();
        int alan = k * u;
        int cevre = (k + u) * 2;
        System.out.println("Dikdörtgenin Çevresi: " + cevre +
        "\nDikdörtgenin Alanı: " + alan);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int islem;

        String menu = "1- Toplama İşlemi\n" +
        "2- Çıkarma İşlemi\n" +
        "3- Çarpma İşlemi\n" +
        "4- Bölme İşlemi\n" +
        "5- Üslü Sayı Hesaplama\n" +
        "6- Faktöriyel Hesaplama\n" +
        "7- Mod Alma\n" +
        "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
        "0- Çıkış Yap";
        
        do {
            System.out.println(menu);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            islem = scan.nextInt();
            switch (islem) {
                case 1:
                toplama();
                break;
                case 2:
                cikarma();
                break;
                case 3:
                carpma();
                break;
                case 4:
                bolme();
                break;
                case 5:
                usAlma();
                break;
                case 6:
                fakt();
                break;
                case 7:
                mod();
                break;
                case 8:
                dikDort();
                break;
                default:
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (islem != 0);
    }
}