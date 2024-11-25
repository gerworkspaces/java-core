package TinhToan;

public class HCN {
    public static float chuVi(float a, float b){
        float cv = (a+b)*2;
        //System.out.println("Chu Vi "+cv);
        return cv;
    }
    public static float dienTich(float a, float b){
        float dt = a*b;
        return dt;
    }

    public static void main(String[] args) {
        chuVi(5,10);
        float dTich=dienTich(10,5);
        System.out.println("Dien tich HCN:\t" + dTich);
    }
}
