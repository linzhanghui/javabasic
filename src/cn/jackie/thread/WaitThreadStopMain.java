package cn.jackie.thread;

class WaitThreadStop extends Thread {
	WaitThreadStop(){}
	WaitThreadStop(String szName) {
		super(szName);
	}
	public void run() {
		for(int count =1,row=1;row<10;row++,count++) {
			for(int i=0;i<count;i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}


public class WaitThreadStopMain {
	public static void main(String[] args) {
		WaitThreadStopMain test = new WaitThreadStopMain();
		test.Method2();
	}
//	Method1使用while-alive方法测试线程是否还在
	public void Method1() {
		WaitThreadStop th1 = new WaitThreadStop();
		WaitThreadStop th2 = new WaitThreadStop();
		th1.start();
		//while(th1.isAlive()){
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		//}
		th2.start();
	}
//	Method2使用join
	public void Method2() {
		WaitThreadStop th1 = new WaitThreadStop();
		WaitThreadStop th2 = new WaitThreadStop();
		th1.start();
		try{
			th1.join(2000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		th2.start();
	}
}
