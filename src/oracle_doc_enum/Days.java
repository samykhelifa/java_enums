package oracle_doc_enum;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

public class Days {
    Day day;

    public Days(Day day) {
        this.day = day;
    }

    public static void main(String[] args) {
        Days firstDay = new Days(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Days thirdDay = new Days(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Days fifthDay = new Days(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Days sixthDay = new Days(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Days seventhDay = new Days(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }


    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}