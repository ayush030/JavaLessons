package main;

import numbers.Odd;
import numbers.Even;

public class Main {
    public static void main(String[] args) {
        // odd numbers
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
}