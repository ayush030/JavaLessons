package pingpong;

import pingpong.Ifacepingpong;

class Ping extends Thread implements Ifacepingpong {
    @Override
    public synchronized void play() throws InterruptedException {
        this.wait();
        System.out.println("Ping");

    }

    @Override
    public void run() {
        while(true) {
            try {
                this.play();
            } catch(InterruptedException ex) {}
        }
    }
}