package pingpong;

import pingpong.Ping;
import pingpong.Pong;

public class Game {
    private Ping ping;
    private Pong pong;

    public Game() {
        this.ping = new Ping();
        this.pong = new Pong();
    }

    public void startGame() throws InterruptedException {
        this.ping.start();
        this.pong.start();

        while(true) {
            synchronized (this.ping) {
                this.ping.notify();
            }

            Thread.sleep(100); // sleep for 100ms

            synchronized (this.pong) {
                this.pong.notify();
            }
        }
    }
}