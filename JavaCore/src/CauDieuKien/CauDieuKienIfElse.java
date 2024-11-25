package CauDieuKien;

import java.util.Scanner;

public class CauDieuKienIfElse  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        int x = sc.nextInt();

        if (x > 25) {
            System.out.println("Quang co so tuoi la:\t " + x);
        }
        else{
            if (x == 25){
                System.out.println("Quang co so tuoi la: \t" + x);
            }
            else {
                System.out.println("Quang co so tuoi be hon 25 la:\t " + x);
            }
        }
        
        int y = sc.nextInt();
        
        if (y == 25){
            System.out.println("Quang co so tuoi la:\t " + y);
        } else if (y > 25) {
            System.out.println("Tuoi Quang lon hon 25:\t" + y);
        } else {
            System.out.println("Tuoi Quang be hon 25:\t" + y);
        }

        //Toán tử ? : chỉ dùng trong gán giá trị của biến
        System.out.println("Nhap z: ");
        int z = sc.nextInt();
        int sum = 0;
        sum = (z > 5) ? (sum + z) : (sum - z);
        System.out.println("Sum = " + sum);

        System.out.println("Nhap chuoi ki tu: ");
        String s = (z < 5) ? "s" : "Lon hon 5";

        System.out.println("Chuong trinh chay xong!");
    }
}
