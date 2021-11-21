public class edwardLMidtermTesting {
    public static void main (String[] args) {
        try{
            function1();
            System.out.println("Message 1");
        } catch(Exception e) {
            System.out.println("Message 2");
        } finally {
            System.out.println("Message 3");
        }
    }
    public static void function1() throws Exception {
        try {
            System.out.println("Message 4");
            throw new Exception();
        } catch(Exception e) {
            System.out.println("Message 5");
            throw new Exception("Message 6");
        } finally {
            System.out.println("Message 7");
        }
    }
}
