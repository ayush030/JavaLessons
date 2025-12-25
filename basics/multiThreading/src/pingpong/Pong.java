package pingpong;

import pingpong.Ifacepingpong;

class Pong extends Thread implements Ifacepingpong{
    @Override
    public synchronized void play() throws InterruptedException {
        this.wait();
        System.out.println("Pong");
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