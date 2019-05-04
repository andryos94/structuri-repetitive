public class Main {

    static int maxNumber (int[] randArray ) {
        int max = 0;
        for (int i=0;i<randArray.length;i++) {
            if (randArray[i]>max) {
                max = randArray[i];
            }
        }
        return max;
    }
    ///metoda maxNumber functioneaza, dar nu o folosesc momentan;

    public static void main(String[] args) {
        int[] firstArray = new int[]{6,10,3,7,1,0,20,19,32,15};
        int l = firstArray.length;
        int max = 0;
        for (int i=0;i<l;i++) {
            if((firstArray[i]%2 != 0) && (firstArray[i]>max)) {
                max = firstArray[i];
            } else {
                System.out.println("no");
            }
        }
        System.out.println(max);
    }
}