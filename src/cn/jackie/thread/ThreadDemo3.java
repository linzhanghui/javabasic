package cn.jackie.thread;

public class ThreadDemo3 implements Runnable {
	public void run() {
//		for(int count=1,row=1;row<10;row++,count++){
		for(int row=1;row<10;row++) {
			for(int i=1;i<=row;i++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Runnable rb = new ThreadDemo3();
		Thread td = new Thread(rb);
		td.start();
	}
}
