package com.simplilearnThread;

public class MainImplements implements Runnable{
	
public static int count=0;
    
    public MainImplements()
    {
        
    }
    
    @Override
    public void run() {
        while(count<=10)
        {
            System.out.println("Executing Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        
        MainImplements main2=new MainImplements();
        Thread t = new Thread(main2);
        t.start();
        
        while(count<=10)
        {
            System.out.println("Main Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	


}
