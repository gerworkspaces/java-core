package CauDieuKien;

import java.util.Scanner;

public class CauDieuKienSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri trong cau dieu kien switch case:");
        int _switch = sc.nextInt();

        switch (_switch){
            case 1:
                System.out.println("Bien cua dieu kien la: " + _switch);
                break;
            case 2:
                System.out.println("Bien cua dieu kien la: 2");
                break;
            case 3:
                System.out.println("Bien cua dieu kien la: 3");
                break;
            default:
                System.out.println("Gia tri mac dinh la: default");

        }

    }
}
