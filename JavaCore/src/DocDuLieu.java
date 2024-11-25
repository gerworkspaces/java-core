import java.util.Scanner;

public class DocDuLieu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.println("Type:\t " + reader.nextLine());
        //int input = reader.nextInt();
        System.out.println("Number typing: " + "_number_?");
        int input = reader.nextInt();
        System.out.println("KETQUA:\t" + input);

        System.out.println("float:\t ");
        float f = reader.nextFloat();
        System.out.println("long:\t ");
        long l = reader.nextLong();
        double fl = f + l;
        System.out.println("KETQUA:\t " + fl);
    }
}
