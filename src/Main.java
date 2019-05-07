import javax.print.DocFlavor;

public class Main {

    public static void main(String[] args) {
        //varianta cu impartiri la 10
        long n = 2090205090073L;
        long S = n/1000000000000L;
        long rest1 = n%1000000000000L;
        long AA = rest1/10000000000L;
        long rest2 = rest1%10000000000L;
        long LL = rest2/100000000L;
        long rest3 = rest2%100000000L;
        long ZZ = rest3/1000000L;
        String message = "";
        String luna;

        switch ((int)LL) {
            case 1: luna = "Ianuarie"; break;
            case 2: luna = "Februarie"; break;
            case 3: luna = "Martie"; break;
            case 4: luna = "Aprilie"; break;
            case 5: luna = "Mai"; break;
            case 6: luna = "Iunie"; break;
            case 7: luna = "Iulie"; break;
            case 8: luna = "August"; break;
            case 9: luna = "Septembrie"; break;
            case 10: luna = "Octombrie"; break;
            case 11: luna = "Noiembrie"; break;
            case 12: luna = "Decembrie"; break;
            default: luna = "Incorecta"; break;
        }

        String an;
        if ((int)AA >= 0 && (int)AA <= 9) {
            an = "0" + AA;
        } else {
            an = "" + AA;
        }

        switch ((int)S) {
            case 1:
                message = "barbat nascut pe " + ZZ + " " + luna + " 19" + an;
                break;
            case 2:
                message = "femeie nascuta pe " + ZZ + " " + luna + " 19" + an;
                break;
            case 3:
                message = "barbat nascut pe " + ZZ + " " + luna + " 18" + an;
                break;
            case 4:
                message = "femeie nascuta pe " + ZZ + " " + luna + " 18" + an;
                break;
            case 5:
                message = "barbat nascut pe " + ZZ + " " + luna + " 20" + an;
                break;
            case 6:
                message = "femeie nascuta pe " + ZZ + " " + luna + " 20" + an;
                break;
            case 7:
                message = "barbat rezident in Romania";
                break;
            case 8:
                message = "femeie rezidenta in Romania";
                break;
        }
        System.out.println("//varianta cu impartiri la 10");
        System.out.println(message);

        //varianta cu String, incompleta
        String ID = "2090205090073";
        String ID_0 = ID.substring(0,6);
        char ID_S = ID_0.charAt(0);
        int ID_AA = ID_0.charAt(1) + ID_0.charAt(2);
        System.out.println();
        System.out.println(ID_AA);
    }
}