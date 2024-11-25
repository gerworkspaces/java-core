import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {

        //so nguyen
        System.out.print("Integer: \n");
        byte x = 10;
        short y = 1000;
        int z = 50000;
        long zZ = 1000000;
        System.out.println("x = " + x);
        System.out.println("x = " + y);
        System.out.println("x = " + z);
        System.out.println("x = " + zZ + "\n");

        //so thuc -> float || double
        System.out.print("Float: \n");
        float f = 40.02000f;
        double d = 100.1010000d;
        System.out.println("f = " + f);
        System.out.println("d = " + d + "\n");

        //kieu dung sai Boolean
        System.out.print("boolean: \n");
        System.out.println("args = " + Arrays.toString(args));
        boolean ff = false;
        boolean tr = true;
        System.out.println("ff = " + ff);
        System.out.println("tr = " + tr);

        //kieu ky tu Char
        System.out.println("Ky tu: \n");
        char q = 'Q';
        char u = 'U';
        char a = 'A';
        char n = 'N';
        char g = 'G';
    }
}
