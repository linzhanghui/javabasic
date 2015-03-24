package cn.jackie.algorithm;

//import cn.jackie.algorithm.bubblesort.ArrayBub;

class ArrayBub {
	private long[] a;
	private int nElmes;
	
	public ArrayBub(int max){
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value){
		a[nElems]=value;
		nElems++;
	}
	
	public void display() {
		for(int j=0;j<nElems;j++)
			System.out.println(a[j]+" ");
		System.out.println("");
	}
	
	public void bubbleSort(){
		int out,in;
		
		for(out=nElems-1;out>1;out--)
			for(in=0;in<out;in++)
				if(a[in]>a[in+1])
					swap(in,in+1);
	}
	
	public void swap(int one,int two)
	{
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}

public class BubbleSortApp {
	public static void main(String[] args) {
		//1.定义最大值；
		//2.new arr数组，最大值为maxSize();
		
		int maxSize = 100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);
		
		arr.insert(77);
		arr.insert(97);
		arr.insert(47);
		arr.insert(57);
		arr.insert(57);
		arr.insert(77);
		arr.insert(77);
		
		arr.display();
		arr.bubbleSort();
		arr.display();
		
	}
}
