package cn.jackie.test;

public class IncDecThread {
	public static final int TEST_COUNT = 20;
	
	public static void main(String[] args) {
		Data data = new Data();
		
		new Thread(new IncRunnable(data)).start();
		new Thread(new IncRunnable(data)).start();
		
		new Thread(new DecRunnable(data)).start();
		new Thread(new DecRunnable(data)).start();
	}
	
	class Data {
		private int j = 10;
		
		public synchronized void inc() {
			j++;
			
		}
		
	}
	
	class IncRunnable implements Runnable {
		private Data data;
		
		public IncRunnable(Data data) {
			this.data = data;
		}
		
		public void run() {
			for(int i=0;i<IncDecThread2.TEST_COUNT;i++) {
				data.inc();
			}
		}
	}
	
	class DecRunnable implements Runnable {
		private Data data;
		
		public DecRunnable(Data data) {
			this.data = data;
		}
		
		public void run() {
			for(int i=0; i<IncDecThread2.TEST_COUNT;i++) {
				data.dec();
			}
		}
	}
	
}
