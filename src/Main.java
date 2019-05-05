public class Main {

    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        int i = 0;
            do {
                if(i%2 != 0) {
                    count++;
                    System.out.print(i + " ");
                }
                i++;
            } while (count < n);
    }
}