public class Testing2 {
    //If go exits due to an exception, the program crashes
    public static void go() {
        try {
            run();
        } catch (Exception e) {
            System.out.println("What! ?");
        }
        System.out.println("go ends");
    }

    public static void run() throws MyException {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println();
                int ans = numTest(i);
                System.out.println(ans);
            }
        } catch (ArithmeticException e) {
            System.out.println("run /0");
        } finally {
            System.out.println("run finally");
        }
        System.out.println("run ends");
    }

    public static int numTest(int i) throws MyException {
        if (i == 2) {
            throw new MyException("2 is no good");
        }
        int result = -1;
        try {
            result = 10 / i;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("numTest /0");
        } finally {
            System.out.println("numTest finally");
            return result;
        }
    }

    private static class MyException extends RuntimeException {
        public MyException(String message) {
            System.out.println("MyException Triggered");
        }
    }
    public static void main(String[] args) {
        go();
    }
}