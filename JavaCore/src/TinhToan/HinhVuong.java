package TinhToan;

public class HinhVuong {
    public static int chuVi(int a){
        int cv = a*2;
        System.out.println("chuVi HinhVuong:" + cv);
        return cv;
    }
    public static int dienTich(int a) {
        int dt = a*a;
        System.out.println("dienTich HinhVuong:\n" + dt);
        return dt;
    }

    public static void dienTichHinhVuong(int x){
        int dthv = x*x;
        System.out.println("dienTich HinhVuong:\t " + dthv);
        return;
    }

    public static void main(String[] args) {
        float cv = chuVi(10);
        System.out.println("cv:\t "+cv);
        System.out.println("dienTich (int):\t "+dienTich(10));

        //dienTichHinhVuong
        dienTichHinhVuong(20);
    }
}