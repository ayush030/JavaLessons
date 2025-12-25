package main;

import numbers.Odd;
import numbers.Even;
import pingpong.Game;

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

    public static void main(String[] args) {
        //Main.startNumbers();
        Main.startPingPong();
    }
}