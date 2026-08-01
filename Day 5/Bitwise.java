public class Bitwise {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("AND " + (a & b)); // 1
        System.out.println("OR " + (a | b)); // 7
        System.out.println("XOR " + (a ^ b)); // 6
        System.out.println("COMPLEMENT " + (~a)); // -6
    }
}
