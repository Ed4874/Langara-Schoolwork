public class Valentine extends Card {
    private String name;
    private int number;

    public Valentine(String name, int number) {
        super();
        this.name = name;
        this.number = number;
    }

    @Override
    public void greeting() {
        System.out.println("Expected Output:");
        System.out.println("My " + name);
        System.out.println("        Loves and Kisses,");
        for (int i = 0; i < number; i++) {
            System.out.print("X");
        }

    }
}
