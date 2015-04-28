package cn.jackie.thread;

public class ThreadDemo1 {
	public static void main(String[] args)
	{
//		new Thread().start();
//		while(true)
//		{
//			System.out.println();
//		}
		TestThread tt = new TestThread();
//		tt.start();
//		tt.start();
//		tt.start();
//		tt.start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
}

class TestThread implements Runnable{//extends Thread{
//	public void run(){
//		while(true){
//			System.out.println("run():"+Thread.currentThread().getName());
//		}
//	}
	int tickets = 100;
	String str = new String("");
	public void run(){
		if(str.equals("method"))
		while(true)
		{
//			synchronized(str){
//			if(tickets >0)
//			{
//			try{
//				Thread.sleep(2000);
//			}catch(Exception e){}
//			
//			System.out.println(Thread.currentThread().getName()+" is saling ticket "+ tickets--);
//				}
//			}
			sale();
		}
	}
	public synchronized void sale(){
		if(tickets > 0){
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+" is saling ticket" + tickets--);
		}
	}
}

