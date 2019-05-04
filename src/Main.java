public class Main {

    public static void main(String[] args) {
        int n = 6;
        System.out.print(n + " ");
        int count = 1;
        while (n != 1) {
            if (n%2 == 0) {
                n = n/2;
                System.out.print(n + " ");
            } else {
                n = 3*n + 1;
                System.out.print(n + " ");
            }
            count++;
        }
        System.out.println("\n" + count);
    }
}