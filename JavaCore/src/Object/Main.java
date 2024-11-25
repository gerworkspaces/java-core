package Object;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Quang");
        p1.setAge(25);
        Person p2 = new Person();
        p2.setName("Trinh");
        p2.setAge(21);

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());

    }
}
