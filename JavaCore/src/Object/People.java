package Object;

public class People {
    String ten;
    int age;
    String address;

    public void chucNangDiLai(String fnc){
        System.out.println(fnc + " đi lại");
    }

    public static void main(String[] args) {
        new People();   // object 1
        People quangVo = new People();
        People trinhLe = new People();

        quangVo.chucNangDiLai("Quang");
        trinhLe.chucNangDiLai("Trinh");
    }
}
