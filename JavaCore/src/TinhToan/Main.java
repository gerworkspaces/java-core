package TinhToan;

public class Main {
    public static void main(String[] args) {
        float chieuRong = 4.5f;
        float chieuDai = 5.5f;
        float chuViHinhChuNhat = HCN.chuVi(chieuDai, chieuRong);
        System.out.println("chu vi HCN:\t"+chuViHinhChuNhat);
        float dienTichHinhChuNhat = HCN.dienTich(chieuDai, chieuRong);
        System.out.println("dien tich HCN:\t"+dienTichHinhChuNhat);

        float banKinh = 6.5f;
//        float chuViHinhTron = HinhTron.chuVi(banKinh);
//        float dienTichHinhTron = HinhTron.dienTich(banKinh);
        System.out.println(HinhTron.chuVi(banKinh));
        System.out.println(HinhTron.dienTich(banKinh));

        int doDai = 7;
        int chuViHinhVuong = HinhVuong.chuVi(doDai);
        System.out.println(chuViHinhVuong);
        int dienTichHinhVuong = HinhVuong.dienTich(doDai);

    }

}
