package loop_through_enum;

public class Main {
    public static void main(String[] args) {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

    }
}
enum Level {
    LOW,
    MEDIUM,
    HIGH
}