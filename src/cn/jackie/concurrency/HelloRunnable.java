package cn.jackie.concurrency;

public class HelloRunnable implements Runnable{
	
	public void run() {
		System.out.print("hello from a run thread");
	}
	
	public static void main(String[] args)
	{
		(new Thread(new HelloRunnable())).start();
	}
}
