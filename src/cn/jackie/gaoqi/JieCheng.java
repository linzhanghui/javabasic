package cn.jackie.gaoqi;

/**
 * 
 * @author lzh
 *
 */
public class JieCheng {
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static long fact(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
	/**
	 * 
	 * @param args
	 * 
	 * 
	 */
	
	public static void main(String[] args){
		System.out.println(fact(4));
	}
}
