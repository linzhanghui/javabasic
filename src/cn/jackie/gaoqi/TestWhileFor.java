package cn.jackie.gaoqi;

public class TestWhileFor {
	public static void main(String[] args) {
		int oddsum =0;
		int evensum =0;
		for(int i=0;i<=100;i++){
			if(i%2==0){
				oddsum +=i;
			}else{
				evensum +=i;
			}
		}
		System.out.print("偶数和"+oddsum+"\n");
		System.out.print("奇数和"+evensum+"\n");
		System.out.println("######");
		
		
		for(int j=0;j<=1000;j++){
			if(j%5==0){
				System.out.print(j+" ");
			}
			if(j%(5*4)==0){
				System.out.println("");
			}
		}
		
		
		for(int k=0;k<=9;k++){
			for(int m=1;m<=k;m++) {
				System.out.print(m+"*"+k+"="+(k*m)+"\t");
			}
			System.out.println();
		}
		
		int total =0;
		System.out.println("Begin");
		while(true){
			total++;
			int i = (int)Math.round(100*Math.random());
			if(i==88){
				break;
			} 
		}
		System.out.println("Game over,used "+total+"times.");
		System.out.println();
		for(int p=100;p<150;p++){
			if(p%3==0){
				continue;
			}
			System.out.println(p);
		}
		
	}
}
