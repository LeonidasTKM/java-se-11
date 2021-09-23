package com.hafricker.thread;

/**
 * How to  implement a thread and manage it
 */
public class Write implements Runnable {

    private final String text;
    private final int nbWrite;
    private final int sleepTime;

    public Write(String text, int nbWrite, int sleepTime) {
        this.text = text;
        this.nbWrite = nbWrite;
        this.sleepTime = sleepTime;
    }

    public void start(){
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < nbWrite; i++) {
            System.out.print(text);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
