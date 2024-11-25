package TinhToan;

public class HinhVuongHCN {
    public static void main(String[] args) {
        int x = 10;

        chuViHinhVuong(5);
        chuViHinhVuong(x); //a = x = 10
        chuViHCN(2,4);

        int dienTich = dienTichHCN(4,2);
        System.out.println("Dien Tich HCN:\t" + dienTich);
    }

    public static void chuViHinhVuong(int a){
        int chuVi = a*a;
        System.out.println("Chu Vi Hinh Vuong la:\t" + chuVi);

        return;
    }

    public static void chuViHCN(int a, int b){

        int p = (a+b)*2;

        System.out.println("Chu Vi Hinh Chu Nhat:\t" + p);

        return;
    }

    public static int dienTichHCN(int a, int b){
        int dt = a*b;
        return dt;
    }

}
