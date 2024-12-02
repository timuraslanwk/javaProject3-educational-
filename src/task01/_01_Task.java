package task01;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle yazınız: ");
        String okunan = scanner.nextLine();
        buyukHarfFormati(okunan);
        kucukHarfFormati(okunan);
    }

    public static void buyukHarfFormati(String cumle) {
        System.out.println("Büyük harf formatı: " + cumle.toUpperCase());
    }

    public static void kucukHarfFormati(String cumle) {
        System.out.println("Küçük harf formatı: " + cumle.toLowerCase());
    }
}
