package com.hafricker;

import com.hafricker.thread.Write;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        runThread();
    }

    private static void runThread (){
        Write w1= new Write("Hello ", 10, 5);
        Write w2 = new Write("World ", 10, 10);
        Write w3 = new Write("\n", 10, 15);
        w1.start();;
        w2.start();
        w3.start();
    }
}
