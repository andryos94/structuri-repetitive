public class Main {

    public static void main(String[] args) {
        int n = 1234567;
        int i = 0;
        while (n != 0) {
            n = n/10;
            i++;
        }
        System.out.println(i);//digits number

        int[] digitsArray = new int[i];
        int c = 1234567;
        int sum = 0;
        while (c != 0) {
            digitsArray[i-1] = c%10;
            if ((i-1)%2 == 0) {
                sum = sum + digitsArray[i-1];
            }
            c = c/10;
            i--;
        }
        System.out.println(sum);//suma cifrelor numarului n de pe pozitii pare
    }
}