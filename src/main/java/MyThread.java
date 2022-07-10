public class MyThread extends Thread{
    @Override
    public void run(){
        if (this.isDaemon()) {
            System.out.println("This is a deamon thread that is running");
        }
        else {
            System.out.println("This is an user thread that is running");
        }
    }
}
