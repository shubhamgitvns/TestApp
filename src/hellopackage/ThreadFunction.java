package hellopackage;

public class ThreadFunction extends Thread {

    public void run() {
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
        ThreadFunction tf1=new ThreadFunction();
        ThreadFunction tf2=new ThreadFunction();
        tf1.start();
        tf2.start();
    }

}
