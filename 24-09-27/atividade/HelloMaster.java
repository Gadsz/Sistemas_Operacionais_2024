package atividade;

import modelo.HelloFromThread;

public class HelloMaster {

    public void letsGetSomeHellos(){
        Thread t0 = new Thread(new HelloFromThread(0));
        Thread t1 = new Thread(new HelloFromThread(1));
        Thread t2 = new Thread(new HelloFromThread(2));
        Thread t3 = new Thread(new HelloFromThread(3));
        Thread t4 = new Thread(new HelloFromThread(4));

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
