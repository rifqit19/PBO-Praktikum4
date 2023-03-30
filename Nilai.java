
import java.util.Scanner;

public class Nilai{

    public static void main(String[] args){

            boolean running = true;
            float nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
            char ulang;
            Scanner nilai = new Scanner(System.in);

        do{


            System.out.println("Masukan NIM: ");
            String nim = nilai.next();
    
            System.out.println("Masukan Nama: ");
            String nama = nilai.next();
    
            System.out.println("Masukan Nilai Tugas: ");
            Float nTugas = nilai.nextFloat();
    
            System.out.println("Masukan Nilai Uts: ");
            Float nUts = nilai.nextFloat();
    
            System.out.println("Masukan Nilai Uas: ");
            Float nUas = nilai.nextFloat();
            
            nilaiTugas = nTugas * 20 / 100;
            nilaiUts = nUts * 35 / 100;
            nilaiUas = nUas * 45 / 100;
            nilaiAkhir = nilaiTugas + nilaiUts + nilaiUas;
            
            System.out.println("\nData Mahasiswa");
            System.out.println("NIM         : " + nim);
            System.out.println("Nama        : " + nama);
            System.out.println("Nilai Tugas : " + nTugas + " 20%    : " + nilaiTugas);
            System.out.println("Nilai Uts   : " + nUts + " 35%      : " + nilaiUts);
            System.out.println("Nilai Uas   : " + nUas + " 45%      : " + nilaiUas);
            System.out.println("Nilai Akhir : " + nilaiAkhir);
    
            cetakNilai(nilaiAkhir, getNilHuruf(nilaiAkhir) );

            System.out.println();
            System.out.println("Inputkan data lagi[Y/T]? ");
            ulang = nilai.next().charAt(0);


        }while(ulang != 'T');

    }
    
    static char getNilHuruf(float nilai)
    {
        char nHuruf;
        if(nilai>=85){
            nHuruf='A';
        }
        else if(nilai>=70 && nilai<85){
            nHuruf='B';
        }
        else if(nilai>=60 && nilai<70){
            nHuruf='C';
        }
    
        else if(nilai>=40 && nilai<60){
            nHuruf='D';
        }
        else{
            nHuruf='E';
        }
        return nHuruf;
        
    }  

    static String getPredikat(char huruf){
        String predikat;
        switch(huruf){
            case 'A':
                     predikat="Apik";
                     break;
            case 'B':
                     predikat="Baik";
                     break;
            case 'C':
                     predikat="Cukup";
                     break;
            case 'D':
                     predikat="Dablek";
                     break;
            default:
                     predikat="Elek";
            }
            
            return predikat;
            
    }

    static void cetakNilai(float nilaiAkhir, char nHuruf){
        System.out.println("Nilai Huruf : "+ getNilHuruf(nilaiAkhir));
        System.out.println("Predikat : "+getPredikat(nHuruf));
    }

    
    }