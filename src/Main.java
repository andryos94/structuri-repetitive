public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int prod = 1;
        while (b != 0) {
            prod = a * prod;
            b--;
        }
        System.out.println(prod);
    }
}