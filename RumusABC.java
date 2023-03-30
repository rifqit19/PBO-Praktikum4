/* 
Praktikum 4 - Latihan 2
Created by rifqitriginandri on 30/03/23.
*/

import java.util.Scanner;

public class RumusABC{

    public static void main(String[] args){
            double a, b, c, D;
            char ulang;
            Scanner nilai = new Scanner(System.in);

        do{

            System.out.println("Masukan a: ");
            a = nilai.nextFloat();
    
            System.out.println("Masukan b: ");
            b = nilai.nextFloat();
    
            System.out.println("Masukan c: ");
            c = nilai.nextFloat();
                
            D = (Math.pow(b,2) - 4*(a*c));
            
            System.out.println("Determinan         : " + D);

            getRumus(a,b,c,D);

            System.out.println();
            System.out.println("Inputkan data lagi[Y/T]? ");
            ulang = nilai.next().charAt(0);


        }while(ulang != 'T');

    }

    static void getRumus(double a,double b,double c,double d){
        double x1, x2;
        if(d > 0){
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            cetakHasil(x1, x2);

        }else if(d == 0){
            x1 = (-b) / (2 * a);
            x2 = x1;
            cetakHasil(x1, x2);

        }else if(d < 0){
            x1 = ((-b ) / (2 * a)) + (Math.sqrt(d) / (2 * a));
            x2 = ((-b ) / (2 * a)) - (Math.sqrt(d) / (2 * a));
            // cetakHasil(x1, x2);
            System.out.println("X1 = " + x1 + "i");
            System.out.println("X2 = " + x2 + "i");


        }else{
            System.out.println("Terjadi kesalahan ");
        }
        

    }

    static void cetakHasil(double x1, double x2){
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }

}