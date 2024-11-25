package CauDieuKien;

import java.util.Scanner;

public class CauDienKienIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        if (x > 5){
            System.out.println("X co gia tri lon hon 5: " + x + " > 5");
        }
        if (x == 5){
            System.out.println("X co gia tri bang 5: " + x + " = 5");
        }
        if (x != 5){
            System.out.println("X co gia tri # 5: " + x + " # 5" );
        }
        if (x >= 10){
            System.out.println("X co gia tri lon hon bang 10: " + x + " >= 10");
        }
        if (x <= 10){
            System.out.println("X co gia tri be hon bang 10: " + x + " <= 10");
        }
        System.out.println("Chuong trinh ket thuc!");
    }
}
