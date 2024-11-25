package VongLap;

public class VongLapDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println("---");


        int[] dw = {3, 6, 9, 11};
        int index = 0;
        do {
            System.out.println(dw[index]);
            index++;
        } while (index < dw.length);
    }
}
