package cn.jackie.thread;

public class ThreadPriority {
	public static void main(String[] args){
		InheritThread itd = new InheritThread();
		Thread rtd = new Thread(new RunnableThread());
		
		itd.setPriority(1);
		rtd.setPriority(10);
		
		itd.start();
		rtd.start();
	}
}
