package Mang;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
//        int x1 = 5;
//        int x2 = 10;
//        int x3 = 15;
//
//        //long[] ml = new long[3];
//
//        System.out.println(" " + x1 + " " + x2 + " " + x3);
//
//        int[] m = new int[3];
//        m[0] = 5;
//        m[1] = 10;
//        m[2] = 15;
//        System.out.println("Tong 3 mang:");
//        System.out.println(m[0] + m[1] + m[2]);
//
//        long[] ml = {3, 6, 9, 11, 14, 17};
//        System.out.println("output index[]:\t" + ml[0]);
//        System.out.println("Do dai mang[]:\t" + ml.length);
        int[] mang = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao mang:");

        for (int i = 0; i < mang.length; i++){
            mang[i] = sc.nextInt();
        }

        System.out.println("Mang duoc nhap vao la:");
        for (int x : mang){
            System.out.println(x);
        }

        //tim phan tu trong mang
        System.out.println("Nhap phan tu muon tim?:\t");
        int x = sc.nextInt();
        for (int k = 0; k < mang.length; k++){
            if (x == mang[k]) {
                System.out.println("Phan tu tim thay la: " + k);
            }
        }

        //sap xep phan tu tang dan
        for (int i = 0; i < mang.length - 1; i++){
            int temp = mang[i];
            for (int j = i+1; j < mang.length; j++){
                if (temp > mang[j]){
                    mang[i] = mang[j];
                    mang[j] = temp;
                    temp = mang[i];
                }
            }
        }
        System.out.println("Mang tang dan sap xep la:");
        for (int sx : mang){
            System.out.println(sx);
        }

        //sap xep mang giam dan
        for (int i = 0; i < mang.length - 1; i++){
            int temp = mang[i];
            for (int j = i+1; j < mang.length; j++){
                if (temp < mang[j]) {
                    mang[i] = mang[j];
                    mang[j] = temp;
                    temp = mang[i];
                }
            }
        }
        System.out.println("Giam dan:");
        for (int g : mang){
            System.out.println(g);
        }
    }
}
