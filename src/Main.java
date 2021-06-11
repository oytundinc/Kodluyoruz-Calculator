import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        double n1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz : ");
        double n2 = input.nextDouble();

        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();


        /* if-else kullanımı ile

        if (select == 1) {
            System.out.println("Toplama sonucu : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma sonucu : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma sonucu : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Bölme sonucu : " + (n1 / n2));
            } else {
                System.out.println("Bir sayı 0'a bölünemez !!");
            }
        } else  {
            System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }

        */

        //switch kullanımı ile (ödev)
        switch ((select)) {
            case 1:
                System.out.println("Toplama sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma sonucu : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme sonucu : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez !!");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}
