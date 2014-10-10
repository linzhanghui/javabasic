package interview.trafic;

public class MainClass {
	public static void main(String[] args) {
		
		String[] direction = new String[]{"S2N","S2W","E2W","E2S","N2S","N2E","W2E","W2N","S2E","E2N","N2W","W2S"};
		
		for(int i=0;i<direction.length;i++){
			new Road(direction[i]);
		}
		new LampControl();
	}
}
