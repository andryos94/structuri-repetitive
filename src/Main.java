public class Main {

    public static void main(String[] args) {
        int[] firstArray = new int[]{6,10,3,7,1,0,20,19,32};
        int l = firstArray.length;
        int count_pare = 0;
        int count_impare = 0;
        for (int i=0;i<l;i++) {
            if(firstArray[i]%2 != 0) {
                count_impare++;
            } else {
                count_pare++;
            }
        }
        System.out.println("Exista " + count_impare + " numere impare");
        System.out.println("Exista " + count_pare + " numere pare");
    }
}