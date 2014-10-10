package interview.trafic;

public enum Lamp {
	S2N("N2S","S2W",false);
	
	private Lamp(String opposite,String next,boolean lighted){
		this.opposite = opposite;
		this.next = next;
		this.lighted = lighted;
	}
	
	private boolean lighted;
	private String opposite;
	private String next;
	
	public boolean isLighted(){
		return lighted;
	}
	
	public void light() {
		this.lighted = true;
		if(opposite != null){
			Lamp.valueOf(oppsite).light();
			
		}
	}
	
}
