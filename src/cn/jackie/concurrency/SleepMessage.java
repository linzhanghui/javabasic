package cn.jackie.concurrency;

public class SleepMessage {
	public static void main(String[] args) throws InterruptedException
	{
		String ImportantInfo[] = {"Mouse eat oats","Does eat oats","people eat meat","cat eat mouse"};
		for(int i=0;i<ImportantInfo.length;i++){
			Thread.sleep(4000);
			System.out.println(ImportantInfo[i]);
		}
	}
}
