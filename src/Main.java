public class Main {

    public static void main(String[] args) {
        int n = 7;
        for (int i=1;i<=n;i++) {
            for (int k=1;k<=i;k++) {
                System.out.print(k + " ");
                if (k == i){
                    System.out.print("\n");
                }
            }
        }
    }
}