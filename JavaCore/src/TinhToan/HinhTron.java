package TinhToan;

public class HinhTron {
    public static final float _SO_PI = 3.14f;

    public static float chuVi(float r){
        System.out.println("chuVi:");
        return 2 * r * _SO_PI;
    }

    public static float dienTich(float r){
        System.out.println("dienTich:");
        return _SO_PI * r * r;
    }

    public static void chuV(float r){
        float cv = 2*r* _SO_PI;
        System.out.println("chuV:\n"+cv);
        return;
    }

    public static void main(String[] args) {
        float r = 5f;
        System.out.println(chuVi(r));
        System.out.println(dienTich(r));

        System.out.println("ketqua void chuV():");
        chuV(10);
    }

}
