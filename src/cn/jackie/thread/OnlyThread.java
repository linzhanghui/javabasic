package cn.jackie.thread;

public class OnlyThread extends Thread{
	OnlyThread() {
	}
	
	OnlyThread(String szName){
		super(szName);
	}
	
	public void run() {
		for(int count=1,row=1;row<10;row++,count++) {
			for(int i=0;i<count;i++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		OnlyThread td = new OnlyThread();
		OnlyThread td2 = new OnlyThread();
		OnlyThread td3 = new OnlyThread();
		td.start();
		td2.start();
		td3.start();
	}
}
