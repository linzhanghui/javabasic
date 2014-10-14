package cn.jackie.thread;

public class RunnableThread implements Runnable{
	public void run() {
		System.out.println("RunnableThread is running...");
		for(int i=0;i<10;i++){
			System.out.println("RunnableThread : i="+i);
			try {
				Thread.sleep(2000);
//				Thread.sleep((int)Math.random()*1000);
			}catch (InterruptedException e) {
				
			}
		}
	}
}
