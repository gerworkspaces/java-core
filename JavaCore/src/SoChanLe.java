import java.util.Scanner;

public class SoChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban muon");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("So chan la:\t" + number);
        }
        else
            System.out.println("So le la:\t" + number);
    }
}
