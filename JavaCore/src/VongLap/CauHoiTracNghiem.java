package VongLap;

import java.util.Scanner;

public class CauHoiTracNghiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Lua chon cua ban la gi?");
            System.out.println("Let choose option 1,2, ...");
            System.out.println("Click q to quit");
            String luaChon = sc.nextLine();

            if (luaChon.equals("1")){
                System.out.println("Option 1:\t Quang Vo");
                break;
            } else if (luaChon.equals("2")) {
                System.out.println("Option 2:\t 25 tuổi");
                break;
            } else if (luaChon.equals("q")) {
                System.out.println("Thoat lua chon");
                break;
            } else {
                System.out.println("Input again!");
            }
        }
    }
}
