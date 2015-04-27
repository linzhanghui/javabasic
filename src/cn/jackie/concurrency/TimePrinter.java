package cn.jackie.concurrency;

import java.util.Date;

public class TimePrinter implements Runnable{
	int pauseTime;
	String name;
	
	public TimePrinter(int x, String n) {
		pauseTime = x;
		name = n;
	}
	
	public void run() {
		while(true) {
			try {
				System.out.println(name + ":" + new Date(System.currentTimeMillis()));
				Thread.sleep(pauseTime);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String args[]) {
		Thread tp1 = new Thread (new TimePrinter(1000,"Fast boy"));
		tp1.start();
		Thread tp2 = new Thread (new TimePrinter(2000,"Slow boy"));
		tp2.start();
	}

}
