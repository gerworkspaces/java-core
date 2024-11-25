import java.util.Scanner;

public class TimBaSoLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = sc.nextInt();
        System.out.println("Nhap b");
        int b = sc.nextInt();
        System.out.println("Nhap c");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " la so lon nhat");
        }
        else if (a < b && c < b){
            System.out.println(b + " la so lon nhat");
        }
        else
            System.out.println(c + " la so lon nhat");

    }

}
