public class Main {
    public static void main (String[] args) throws InterruptedException {

        /*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority

    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”

    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
				JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("primary");
        System.out.println(Thread.currentThread().getName());
        //priority scale 1-10 , 10 highest priority
        System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        for (int i=3;i>0;i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Done");

        MyThread myThread = new MyThread();
        System.out.println("is alive? " + myThread.isAlive());
        System.out.println("is Deamon " + myThread.isDaemon());
        //myThread.setDaemon(true);
        System.out.println("is Deamon " + myThread.isDaemon());
        myThread.start();
        System.out.println("is alive? " + myThread.isAlive());
        System.out.println(myThread.getName());
        myThread.setName("My thread");
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());
        System.out.println(Thread.activeCount());


    }
}
