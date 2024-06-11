public class ATL3 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Sdasdas");
            }
        };
        Thread thread = new Thread(runnable); // new
        thread.start();
    }
}
