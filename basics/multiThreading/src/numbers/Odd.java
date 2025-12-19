package numbers;

public class Odd extends Thread {
    public static void generate() throws InterruptedException {
        int i = 1;
        while (true) {
            System.out.printf("[odd] %d\n", i);

            // the wierd thing about JAVA is that yield only works with switch unlike python/go.
            // yield i;

            i+= 2;
            // System.out.println("[odd] thread sleeping"); int i = 0;
            Thread.sleep(100); // sleep for 100ms
            // System.out.println("[odd] thread started");
        }
    }

    @Override
    public void run() {
        try {
            generate();
        } catch (InterruptedException e) {
            System.err.println("[odd] Interrupted" + e.toString());
        }
    }
}