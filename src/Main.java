public class Main {

    public static void main(String[] args) {
        System.out.println("varianta if-else");
        int n = 7;
        ///varianta cu if-else
        if (n>=0 && n<=9) {
            if (n == 0) {
                System.out.println(n + ": zero");
            } else if (n == 1) {
                System.out.println(n + ": unu");
            } else if (n == 2) {
                System.out.println(n + ": doi");
            } else if (n == 3) {
                System.out.println(n + ": trei");
            } else if (n == 4) {
                System.out.println(n + ": patru");
            } else if (n == 5) {
                System.out.println(n + ": cinci");
            } else if (n == 6) {
                System.out.println(n + ": sase");
            } else if (n == 7) {
                System.out.println(n + ": sapte");
            } else if (n == 8) {
                System.out.println(n + ": opt");
            } else {
                System.out.println(n + ": noua");
            }
        } else {
            System.out.println("numar gresit");
        }
        System.out.println("varianta switch");
        //varianta cu switch
        int a = 10;
        switch (a) {
            case 0: System.out.println(a + ": zero");
                    break;
            case 1: System.out.println(a + ": unu");
                    break;
            case 2: System.out.println(a + ": doi");
                    break;
            case 3: System.out.println(a + ": trei");
                    break;
            case 4: System.out.println(a + ": patru");
                    break;
            case 5: System.out.println(a + ": cinci");
                    break;
            case 6: System.out.println(a + ": sase");
                    break;
            case 7: System.out.println(a + ": sapte");
                    break;
            case 8: System.out.println(a + ": opt");
                    break;
            case 9: System.out.println(a + ": noua");
                    break;
            default: System.out.println("numar gresit");
                    break;
        }
    }
}