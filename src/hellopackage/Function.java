package hellopackage;

public class Function {

    static void fun() {
        try {
            int i;
            for (i = 0; i <= 10; i++) {

                System.out.println(i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws Exception {
        fun();
        fun();
    }

}
