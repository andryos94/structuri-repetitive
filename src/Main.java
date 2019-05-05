public class Main {

    public static void main(String[] args) {
        //varianta cu switch
        int month = 12;
        String monthString = "";
        switch (month) {
            case 1: monthString = "Ianuarie";
                    break;
            case 2: monthString = "Februarie";
                    break;
            case 3: monthString = "Martie";
                    break;
            case 4: monthString = "Aprilie";
                    break;
            case 5: monthString = "Mai";
                    break;
            case 6: monthString = "Iunie";
                    break;
            case 7: monthString = "Iulie";
                    break;
            case 8: monthString = "August";
                    break;
            case 9: monthString = "Septembrie";
                    break;
            case 10: monthString = "Octombrie";
                    break;
            case 11: monthString = "Noiembrie";
                break;
            case 12: monthString = "Decembrie";
                break;
            default: System.out.println("luna inexistenta");
                    break;
        }
        System.out.println(month + ": " + monthString);
    }
}