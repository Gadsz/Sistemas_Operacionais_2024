package modelo;

public class HelloFromThread implements Runnable {Runnable runnable;

    int tId;

    public HelloFromThread(int tId) {
        this.tId = tId;
    }

    @Override
    public void run() {
        System.out.println("Olá da thread " +tId);
    }
    

}
