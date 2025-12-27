package threadpool;

import threadpool.Worker;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Threadpool {
    private Worker[] workers;
    private BlockingQueue<Runnable> taskQueue;

    private volatile boolean allowIncomingTask = true;
    /*default*/static final Runnable STOP_WORKER = () -> {
    };

    public Threadpool(Integer poolSize) {
        /*
        * Blocking queue : provides a thread-safe queue that automatically handles synchronization and flow control
        * between threads by blocking operations when the queue is empty or full
        * Common implementations of BlockingQueue include:
        *   ArrayBlockingQueue, LinkedBlockingQueue, PriorityBlockingQueue, DelayQueue, and SynchronousQueue
        *
        *   Action      ThrowsException	SpecialValue	Blocks	        TimesOut
            Insert	    add(e)	        offer(e)	    put(e)	        offer(e, time, unit)
            Remove	    remove()	    poll()	        take()	        poll(time, unit)
            Examine	    element()	    peek()	        NA	            NA
        */
        this.taskQueue = new LinkedBlockingQueue<Runnable>();

        this.workers = new Worker[poolSize];
        for (int i = 0; i < poolSize; i++) {
            this.workers[i] = new Worker(this.taskQueue, "Worker-" + (i + 1));
        }
    }

    // start : start thread pool
    public void start() {
        for (Worker w : this.workers) {
            w.start();
        }
    }

    public void stop() {
        this.allowIncomingTask = false; // stop accepting new tasks and complete existing tasks

        // add poison pill for all workers
        for (int i = 0; i < this.workers.length; i++) {
            this.addTask(STOP_WORKER);
        }

        System.out.println("All workers signalled to stop!");
    }

    public boolean addTask(Runnable task) {
        if (this.allowIncomingTask) {
            return this.taskQueue.offer(task);
        }

        return false;
    }
}