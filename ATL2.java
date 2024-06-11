public class ATL2 implements Runnable{
    @Override
    public void run() {
        System.out.println("My Thread is running");
        System.out.println("My Thread finished");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ATL2());
        thread.start();
    }
}
