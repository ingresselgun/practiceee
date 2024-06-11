public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
       thread.join();
    }
}
