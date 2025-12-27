package main;

import numbers.Odd;
import numbers.Even;
import pingpong.Game;
import threadpool.Threadpool;

public class Main {
    public static final void startNumbers() {
        Odd onum = new Odd();
        // Even numbers
        Even evnum = new Even();
        Thread evenThread = new Thread(evnum);

        evenThread.start();
        onum.start();

        try {
            evenThread.join();
            onum.join();
        } catch (InterruptedException e) {
            System.err.println("[main] Interrupted" + e.toString());
        }
    }

    public static final void startPingPong() {
        Game pingpong = new Game();
        try {
            pingpong.startGame();
        } catch (InterruptedException e) {}
    }

    public static final void startThreadPool() {
        Threadpool tp = new Threadpool(3);

        // create 10 tasks
        for(int i=0; i<10; i++) {
            int taskID = i+1;
            tp.addTask(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}

                System.out.print("Execution for task" + taskID + " done");
            });
        }

        tp.start();
        tp.stop();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: Main <operation>");
            System.exit(1);
        }

        switch (args[0]) {
            case "numbers":
                startNumbers();
                break;

            case "pingpong":
                startPingPong();
                break;

            case "threadpool":
                startThreadPool();
                break;

            default:
               System.err.println("Unknown operation: " + args[0]);
        }
    }
}