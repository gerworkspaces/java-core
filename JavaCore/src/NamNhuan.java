import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban muon:\t");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0){
            System.out.println(year + " la nam nhuan");
        }
        else
            System.out.println(year + " ko phai la nam nhuan");
        System.out.println("Ket thuc vong lap");
    }
}
