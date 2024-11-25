package String;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = " Quang Vo ";
        System.out.println(s1.length());
        System.out.println(s1.trim().length());

        //trim() xóa khoảng trắng

        String s2 = s1.substring(1);
        String s3 = s1.substring(1,9);
        System.out.println(s2);
        System.out.println(s3);

        if(s2.equals(s3)){
            System.out.println("ok");
        }
        else {
            System.out.println("not oke");
        }

        //lay ki tu trong chuoi
        char s0 = s1.charAt(1);
        System.out.println(s0);

        //tinh co bao nhieu ki tu trong mang
        int count = 0;
        for (int i = 0; i < s1.length() - 1; i++){
            if(s1.charAt(i) == 'a'){
                count++;
            }

        }
        System.out.println(count);

        //concat() : nối hai chuỗi lại vs nhau
        //Tìm cái String có trong index ko indexOf()
        int index = s1.indexOf(s2);
        System.out.println(index);

        //Tìm cái String cuối cùng trong index lastIndexOf()
        int lastIndex = s1.lastIndexOf(s2);
        System.out.println(lastIndex);

        if(s1.contains(s2)){
            System.out.println("ok có chứa");
        }


    }
}
