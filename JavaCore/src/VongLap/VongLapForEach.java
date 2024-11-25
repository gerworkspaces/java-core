package VongLap;

public class VongLapForEach {
    public static void main(String[] args) {
        int[] m = {1, 3, 5, 7, 9};
        for(int bien : m){
            System.out.println(bien);
        }

        for (int i = 0; i < 10; i++){
            //System.out.println(i);
            //break;
            System.out.println("Gia tri i:\t" + i);
            for (int j = 0; j < 10; j++){
                System.out.println(j);
                break;
            }
        }

        for (int k = 0; k < 10; k++){
            System.out.println(k);
            if (k == 5){
                break;
            }
        }


        String[] sts = {"Quang", "Vo"};
        for(String chuoi : sts){
            System.out.println(chuoi);
        }


    }
}
