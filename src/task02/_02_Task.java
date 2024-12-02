package task02;

import java.util.Scanner;

public class _02_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle yazınız: ");
        String cumle = scanner.nextLine();

        palindrom(cumle);

    }

    public static void palindrom(String yazilan) {

        boolean isPalindrom = false;
        String[] duzYazilan = new String[yazilan.length()];
        String[] tersYazilan = new String[yazilan.length()];

        for (int i = 0; i < yazilan.length(); i++) {
            duzYazilan[i] = (String.valueOf(yazilan.charAt(i)));
        }

        for (int i = 0; i < yazilan.length(); i++) {
            tersYazilan[i] = (String.valueOf
                    (yazilan.charAt(yazilan.length() -
                            (i + 1))));
        }

      for (int i = 0; i < yazilan.length(); i++) {
            if (duzYazilan[i].equals(tersYazilan[i])) {
                isPalindrom = true;
            } else { isPalindrom=false;
                break;}
      }

      if (isPalindrom){
          System.out.println("Girilen ifade bir palindromdur.");
      } else System.out.println("Girilen ifade bir palindrom değildir.");

    }


}








