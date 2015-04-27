package cn.jackie.algorithm;

public class StackApp{
	public static void main(String[] args) {
		StackX theStack = new StackX(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(1);
		theStack.push(2);
		theStack.push(22);
		
		while(!theStack.isEmpty()){
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.print("");
	}
}