public class Main {
    static int power(int x, int y) {
        int prod = 1;
        while (y != 0) {
            prod = x * prod;
            y--;
        }
        return prod;
    }
    ////metoda, ridicarea la putere, x^y

    public static void main(String[] args) {
        int n = 6;
        long sum = 0;
        long newNo;
        newNo = (long) (power((2*3),n));
        System.out.println(newNo);
        long r; //restul impartirii la 10
        long c = newNo; //catul impartirii la 10
        while (c != 0) {
            r = newNo%10;
            c = newNo/10;
            newNo = c;
            sum = sum + r;
        }
        System.out.println(sum);
    }
}