package cn.jackie.thread;

public class Lession52 implements Runnable{
	Q q;
	public Producer(Q q){
		this.q = q;
	}
	
	public void run(){
		while(true){
			if(i==0){
			q.name="zhangshan";
			try(Thread.sleep(1);)catch(Exception e){}
			q.sex = "male";
			} else {
			
			q.name = "lisi";
			q.sex = "female";
			}
			i =(i+1)%2;
		}
	}
}

class Costumer implements Runnable{
	Q q;
	public Coustumer(Q q){
		this.q = q;
	}
	
	public void run(){
		while(true){
			System.out.println(q.name);
			System.out.println(":"+q.sex);
		}
	}
}
class Q{
	String name="unknown";
	String sex = "unknown";
}

public ThreadComunation{
	
}
