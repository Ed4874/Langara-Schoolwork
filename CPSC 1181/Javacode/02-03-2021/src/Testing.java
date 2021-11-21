public class Testing {
    static Day day;

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        day = day.TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("I hate Mondays.");
                break;
            case TUESDAY:
                System.out.println("Boring-est day of the week.");
                break;
            case WEDNESDAY:
                System.out.println("Slightly better than Tuesday.");
                break;
            case THURSDAY:
                System.out.println("You thought it was Friday, but it was I, THURSDAY!");
                break;
            case FRIDAY:
                System.out.println("\\033[3mFriday Night\\033[0m");
                break;
            case SATURDAY:
                System.out.println("Gamer day");
                break;
            case SUNDAY:
                System.out.println("The day before Monday");
                break;
        }
    }
}