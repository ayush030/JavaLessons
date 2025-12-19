package numbers;

public class Even implements Runnable {
    public static void generate() throws InterruptedException {
        int i = 0;
        while(true) {
            System.out.printf("[even] %d\n", i);
            i += 2;

            // System.out.println("[even] thread sleeping");
            Thread.sleep(100); // sleep for 100ms
            // System.out.println("[even] thread started");
        }
    }

    @Override
    public void run() {
        try {
            generate();
        } catch (InterruptedException e) {
            System.err.println("[even] Interrupted" + e.toString());
        }
    }
}