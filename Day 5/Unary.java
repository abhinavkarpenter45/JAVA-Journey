public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        boolean login = true;

        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a--);

        System.out.println(++b);
        System.out.println(--b);

        System.out.println(+c);
        System.out.println(-c);
        System.out.println(!login);
    }
}
