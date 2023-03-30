/* 
Praktikum 4 - Latihan 1
Created by rifqitriginandri on 30/03/23.
*/

import java.util.Scanner;

public class Penjualan {
    
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    private float totalPembelian;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Penjualan[] daftarBarang = new Penjualan[10];
        int i = 0;
        String pilihan = "Y";
        float totalPembelianSemua = 0;

        System.out.println("====Penjualan Barang====");
        while (pilihan.equalsIgnoreCase("Y")) {
            Penjualan penjualan = new Penjualan();
            System.out.print("Kode barang: ");
            penjualan.kode = input.nextLine();
            System.out.print("Nama barang: ");
            penjualan.nama = input.nextLine();
            System.out.print("Harga barang: ");
            penjualan.harga = input.nextFloat();
            System.out.print("Jumlah barang: ");
            penjualan.jumlah = input.nextInt();
            input.nextLine();
            penjualan.setData(penjualan.kode, penjualan.nama, penjualan.harga, penjualan.jumlah);
            daftarBarang[i] = penjualan;
            i++;

            System.out.print("Input data lagi [Y/T]? ");
            pilihan = input.nextLine();
        }

        
        System.out.println("\n==========================");
        System.out.println("===== NOTA PENJUALAN =====");
        for (int j = 0; j < i; j++) {
            Penjualan penjualan = daftarBarang[j];
            penjualan.cetakNota();
            totalPembelianSemua += penjualan.getTotalPembelian();
        }
        System.out.println("==========================");
        System.out.println("TOTAL PEMBELIAN SEMUA: " + totalPembelianSemua);
    }

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.totalPembelian = harga * jumlah;
    }

    public float getTotalPembelian() {
        return this.totalPembelian;
    }

    public String getBonus() {

        if (totalPembelian >= 500000 && jumlah > 5) {
            return "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            return "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada bonus";
        }
    }

    public void cetakNota() {
        System.out.println("Kode Barang: " + this.kode);
        System.out.println("Nama Barang: " + this.nama);
        System.out.println("Harga Barang: " + this.harga);
        System.out.println("Jumlah Barang: " + this.jumlah);
        System.out.println("Total Pembelian: " + this.totalPembelian);
        System.out.println("Bonus: " + this.getBonus());
        System.out.println("==========================");
    }
}
