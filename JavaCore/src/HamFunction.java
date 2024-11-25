public class HamFunction {
    public static void main(String[] args) {
        double a = 10;
        double b = 100;

        double hieu = hieuHaiSo(b , a);
        System.out.println(hieu);

        System.out.println(tongHaiSo());
        xinChao();

        float chuViHinhTron = soPi() * 2;
        System.out.println(chuViHinhTron);
    }
    public static int tongHaiSo(){
        int a = 4;
        int b = 2;
        int tong = a + b;
        return tong;
    }
    //ham voi doi so truyen vao
    public static double hieuHaiSo(double b, double a){
        double hieu = b - a;
        return hieu;
    }
    //ham khong co gia tri tra ve
    public static void xinChao() {
        System.out.println("xin chao");
    }

    public static float soPi(){
        return 3.14f;
    }
}
