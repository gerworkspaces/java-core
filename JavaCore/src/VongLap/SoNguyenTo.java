package VongLap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen to:");
        int snt = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(snt); i++){
            if (snt % i == 0)
                isPrime = false;
                break;
        }
        if (isPrime && snt > 1)
            System.out.println("Day la snt:\t" + snt);
        else
            System.out.println(snt + " Khong phai snt");
    }
}
