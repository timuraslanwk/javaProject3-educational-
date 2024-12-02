package task04;

import java.util.Scanner;

public class _04_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);


        String[] urunler = {"Peynir", "Süt", "Yumurta", "Zeytin"};
        double[] fiyatlar = {50.50, 24.45, 3.75, 79.50};
        int[] stok = {10, 20, 180, 15};
        String cevap;
        int secim;
        double toplamFiyat = 0;

        System.out.println("*** BREAKFAST CENTER *** \n");

        do {

            System.out.println("Peynir için 1'i tuşlayınız.");
            System.out.println("Süt için 2'i tuşlayınız.");
            System.out.println("Yumurta için 3'i tuşlayınız.");
            System.out.println("Zeytin için 4'i tuşlayınız.");
            System.out.println("Sepetiniz onaylamak ve ödeme yapmak için 5'i tuşlayınız");
            System.out.println("Alışverişinizi iptal etmek için 6'yı tuşlayınız.");
            System.out.print("Seçiminiz= ");
            secim = scanner.nextInt();
            cevap="";

            switch (secim) {

                case 1:

                    do {
                        System.out.print("Kaç paket peynir almak istersiniz?= ");
                        int peynirAdet = scanner.nextInt();
                        if (peynirAdet <= stok[0]) {
                            toplamFiyat = (peynirAdet * fiyatlar[0])+toplamFiyat;
                            stok[0]= stok[0]-peynirAdet;
                            System.out.println("\n"+peynirAdet + " paket peynir sepetinize eklenmiştir.\n" +urunler[0]+ " ile güncel fiyat= " + toplamFiyat+"\n");
                            break;
                        } else {
                            System.out.println("\nMalesef stoğumuz " + (peynirAdet - stok[0] + " paket yetersizdir.\n"));
                            System.out.println("\nÜrünü tekrardan kontrol etmek ister misiniz? (Evet/Hayır)\n");
                            cevap = scannerStr.nextLine();
                        }

                    } while (cevap.equalsIgnoreCase("evet") || cevap.equalsIgnoreCase("yes"));
                    break;

                case 2:

                    do {
                        System.out.print("Almak istediğiniz paket süt sayısını giriniz: ");
                        int sutAdet = scanner.nextInt();
                        if (sutAdet <= stok[1]) {
                            toplamFiyat = (sutAdet * fiyatlar[1])+toplamFiyat;
                            stok[1]= stok[1]-sutAdet;
                            System.out.println("\n"+sutAdet + " paket süt sepetinize eklenmiştir.\n" +urunler[1]+" ile güncel fiyat= " + toplamFiyat+"\n");
                            break;
                        } else {
                            System.out.println("\nMalesef stoğumuz " + (sutAdet - stok[1] + " paket yetersizdir.\n"));
                            System.out.print("\nÜrünü tekrardan kontrol etmek ister misiniz? (Evet/Hayır)\n");
                            cevap = scannerStr.nextLine();
                        }
                    } while (cevap.equalsIgnoreCase("evet") || cevap.equalsIgnoreCase("yes"));
                    break;

                case 3:

                    do {
                        System.out.print("Almak istediğiniz yumurta(adet) sayısını giriniz: ");
                        int yumurtaAdet = scanner.nextInt();
                        if (yumurtaAdet <= stok[2]) {
                            toplamFiyat = (yumurtaAdet * fiyatlar[2])+toplamFiyat;
                            stok[2]= stok[2]-yumurtaAdet;
                            System.out.println("\n"+yumurtaAdet + " adet yumurta sepetinize eklenmiştir.\n" +urunler[2]+" ile güncel fiyat= " + toplamFiyat+"\n");
                            break;
                        } else {
                            System.out.println("\nMalesef stoğumuz " + (yumurtaAdet - stok[2] + " adet yetersizdir.\n"));
                            System.out.print("\nÜrünü tekrardan kontrol etmek ister misiniz? (Evet/Hayır)\n");
                            cevap = scannerStr.nextLine();
                        }
                    } while (cevap.equalsIgnoreCase("evet") || cevap.equalsIgnoreCase("yes"));
                    break;

                case 4:

                    do {
                        System.out.print("Kaç kavanoz zeytin almak istersiniz? ");
                        int zeytinKavanoz = scanner.nextInt();
                        if (zeytinKavanoz <= stok[3]) {
                            stok[3]= stok[3]-zeytinKavanoz;
                            toplamFiyat = (zeytinKavanoz * fiyatlar[3])+toplamFiyat;
                            System.out.println("\n"+zeytinKavanoz + " kavanoz zeytin sepetinize eklenmiştir.\n" +urunler[3]+" ile güncel fiyat= " + toplamFiyat+"\n");
                            break;
                        } else {
                            System.out.println("\nMalesef stoğumuz " + (zeytinKavanoz - stok[3] + " adet yetersizdir.\n"));
                            System.out.println("\nÜrünü tekrardan kontrol etmek ister misiniz? (Evet/Hayır)\n");
                            cevap = scannerStr.nextLine();
                        }
                    } while (cevap.equalsIgnoreCase("evet") || cevap.equalsIgnoreCase("yes"));
                    break;

                default:
                    System.out.println("\nLütfen geçerli bir tuşlama yapınız.\n");
            }
        } while (secim != 5 && secim!=6);

        if (secim==5) {
            System.out.println("+\nToplam fiyat= "+toplamFiyat);
            System.out.println("\n\n Bizi tercih ettiğiniz için teşekkür ederiz.");
        } else System.out.println("Sepetiniz iptal edilmiştir. Yine bekleriz.");
    }
}
