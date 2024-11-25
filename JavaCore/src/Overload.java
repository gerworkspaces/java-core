public class Overload {
    public static void chuViHinhVuong(int a){
        int cv = 2*a;
        System.out.println("Chu Vi Hinh Vuong (int):\t" + cv);
        System.out.println("1");
    }

    public static void chuViHinhVuong(float a){
        float cvf = 2*a;
        System.out.println("Chu Vi Hinh Vuong (float):\t" + cvf);
        System.out.println("2");
    }

    public static void dienTichHinhVuong(int a){
        int dt = a*a;
        System.out.println("Dien Tich Hinh Vuong (int):\t" + dt);
        System.out.println("3");
    }

    public static void dienTichHinhVuong (float a){
        float dtf = a*a;
        System.out.println("Dien Tich Hinh Vuong (float):\t" + dtf);
    }

    public static void chuViHinhTron (float r){
        float _SO_PI=3.14f;
        float result = _SO_PI*2*r;
        System.out.println("Chu Vi Hinh Tron: " + result);
    }

    public static void chuViHinhChuNhat (int a, float b, boolean check){
        double cvcn = 2*(a+b);
        System.out.println("Chu Vi Hinh Chu Nhat:\t" + cvcn);

    }


    public static void main(String[] args) {
        chuViHinhVuong(8);
        dienTichHinhVuong(8);

        chuViHinhVuong(5.5f);
        dienTichHinhVuong(7.5f);

        chuViHinhTron(1.5f);

        chuViHinhChuNhat(2, 1.5f, false);
        chuViHinhChuNhat(2, 2, false);
    }
}
