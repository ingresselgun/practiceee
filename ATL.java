public  class ATL extends Thread{
    @Override
    public void run() {
        System.out.println("My Thread is running");
        System.out.println("My Thread finished");
    }

    public static void main(String[] args) {
        ATL a = new ATL(); // new
        a.start();
    }
}

