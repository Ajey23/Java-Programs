import java.time.Month;

public class GetQuarter {

    public static void main(String[] args) {

    String Month = "JANUARY";
        System.out.println(Month + " is in the " + getQuarter(Month) + " quarter");
    }
    public static String getQuarter(String Month) {

        switch (Month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return "bad";
    }
}
