package Multithreading;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i is " + i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {


        MyThread t = new MyThread();// object o users My thread class

        Thread thread = new Thread(t); // object of Thread class is inbuild class here pass t referance of
        // mythread class.
        thread.start(); // here e can write methods/ task which e perform on my tread class
    }
}