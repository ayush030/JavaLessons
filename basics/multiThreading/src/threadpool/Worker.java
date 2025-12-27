package threadpool;

import java.util.concurrent.BlockingQueue;
import threadpool.Threadpool;

class Worker extends Thread {
    private BlockingQueue<Runnable> taskQueue;
    private volatile boolean runningStatus = false;

    Worker(BlockingQueue<Runnable> taskQueue, String name) {
        super(name);
        this.taskQueue = taskQueue;
        this.runningStatus = true;
    }

    @Override
    public void run () {
        this.process();
    }

    public boolean isWorkerRunning() {
        return this.runningStatus;
    }

    private void process() {
        try {
            while(this.runningStatus && !this.taskQueue.isEmpty()) {
                Runnable task = this.taskQueue.take();

                if (task == Threadpool.STOP_WORKER) {
                    System.out.println("Stopping " + Thread.currentThread().getName());
                    this.runningStatus = false;
                    break;
                }

                task.run();
                System.out.println(" completed by " + Thread.currentThread().getName());
            }
        } catch(InterruptedException e) {
            System.err.println("[" + Thread.currentThread().getName() + "] Error in task execution");
        }
    }
}