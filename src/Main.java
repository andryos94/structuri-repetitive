public class Main {

    public static void main(String[] args) {
        int[] numberArray = new int[]{2,1,10,6,3,9,56,33,25,2,56,3,1,4};
        int sum = 0;
        int k = 0;
        for (int i=0;i<numberArray.length;i++) {
            while (k<5) {
                if (numberArray[i]%2 == 0) {
                    sum = sum + numberArray[i];
                    k++;
                    break;
                } else {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}