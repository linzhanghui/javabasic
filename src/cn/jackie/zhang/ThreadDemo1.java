package cn.jackie.zhang;

public class ThreadDemo1 {
	public static void main(String[] args)
	{
//		new TestThread().start();
//		Thread tt = new TestThread();
//		tt.start();
//		int index =0;
//		while(true) 
//		{
//			if(index++ == 100)
//				try{
//					tt.join(10000);
//				} catch(Exception e)
//			{
//					
//			}
//			System.out.println("main():"+Thread.currentThread().getName());
//		}
		TestThread tt = new TestThread();
//		new TestThread().start();
//		new TestThread().start();
//		new TestThread().start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
}


class TestThread implements Runnable//extends Thread
{
	int tickets = 100;
	String str = new String("");
	
	public void run()
	{
		while(true)
		{
			synchronized(str){
			if(tickets >0){
				try{Thread.sleep(10);}
					catch(Exception e){}
				System.out.println("run():"+Thread.currentThread().getName()+" is saling ticket "+tickets--);
				}
			}
		}
	}
}
