package threads;

public class Main{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("new thread creates using 'thread.start', if we write 'thread.run' it will run the normal method.");
    }
}