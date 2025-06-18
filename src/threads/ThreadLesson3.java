package threads;
class Counter{
    int count;

    /**
     *
     *
     * This method is synchronized which means that only one thread can execute
     * this method at a time. This is important because the increment operation
     * is not atomic and if not synchronized, two threads could read the same
     * value, then both increment and write it back, thus loosing one of the
     * increments.
     *
     * @see java.lang.Thread
     */
    public synchronized void increment() {
        count++;
    }
    }

public class ThreadLesson3 {

    /**
     * Main method that demonstrates the use of threads to increment a counter.
     * The main method creates a counter and two threads that will increment the
     * counter by 1000 each. The main method waits for the two threads to finish
     * and then prints the final value of the counter.
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Counter c = new Counter();

        // create a thread that will increment the counter by 1000
        Runnable obj = () -> {
            // increment the counter 1000 times
            for (int i=1; i<=1000; i++){
                c.increment();
            }
        };

        // create a thread that will increment the counter by 1000
        Runnable obj2 = () -> {
            for (int i=1; i<=1000; i++){
                c.increment();
            }
        };

        // start two threads that will increment the counter by 1000
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // start two threads that will increment the counter by 2000
        try {
            // wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.count);
    }
}
