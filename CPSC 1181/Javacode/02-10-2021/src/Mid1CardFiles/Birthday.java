public class Birthday extends Card {
    private String name;
    private int age;

    public Birthday(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public void greeting() {
        System.out.println("Expected Output:");
        System.out.println("Dear " + name);
        System.out.println("        Happy " + age + "th Birthday!");
        System.out.println();
    }
}
