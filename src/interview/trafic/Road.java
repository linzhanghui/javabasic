package interview.trafic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Road {
	private List<String> vechicles = new ArrayList<String>();
	private String name = null;
	
	public Road(String name){
		this.name = name;
		
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		pool.execute(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					try{
						Thread.sleep((new Random().nextInt(10)+1)*1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					vechicles.add(Road.this.name+" "+i);
					
				}
			}
		});
	}
	
	
	
}
