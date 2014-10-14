package cn.jackie.thread;

public class InheritThread extends Thread{
	public void run() {
		System.out.println("InheritThread is running...");
		for(int i=0;i<10;i++){
			System.out.println(" InheritThread:i="+i);
			try{
				Thread.sleep(2000);
//				Thread.sleep((int)Math.random()*1000);
			} catch(InterruptedException e){}
		}
	}
}


