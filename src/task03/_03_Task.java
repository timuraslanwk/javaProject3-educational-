package task03;

import java.util.Scanner;

public class _03_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oluşturmak istediğiniz satır sayısını tam sayı olarak girininiz= ");
        int satir = scanner.nextInt();

        pascalYap(satir);


    }

    public static void pascalYap(int gelen) {

        int rakam;
        int sayi;

        for (int i = 0; i <= gelen; i++) {
            rakam = 1;
            sayi = i + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(rakam + " ");
                rakam = rakam * (sayi - j) / j;
            }
            System.out.println();
        }
    }
}
