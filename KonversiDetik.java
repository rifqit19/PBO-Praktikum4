/* 
Praktikum 4 - Latihan 3
Created by rifqitriginandri on 30/03/23.
*/

import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan = "Y";
        while (pilihan.equals("Y")) {
            System.out.print("Masukkan jumlah detik: ");
            int detik = input.nextInt();

            int hari = detik / 86400;
            detik %= 86400;

            int jam = detik / 3600;
            detik %= 3600;

            int menit = detik / 60;
            detik %= 60;

            System.out.println("Hasil konversi:");
            System.out.println("Hari: " + hari);
            System.out.println("Jam: " + jam);
            System.out.println("Menit: " + menit);
            System.out.println("Detik: " + detik);

            System.out.print("Input data lagi [Y/T]? ");
            pilihan = input.next();
        }
        input.close();
    }
}
