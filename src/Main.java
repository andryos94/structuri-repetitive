public class Main {

    public static void main(String[] args) {
        int n = 134;
        int m = 431;
        int invers = 0;
        int r;
        int c = n;
        while (c != 0) {
            r = c%10;
            c = c/10;
            invers = invers*10 + r;
        }
        System.out.println(invers);
        if (invers == m) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}