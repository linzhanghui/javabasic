package cn.jackie.algorithm;

public class ArrayIns {
	private long[] theArray;
	private int nElems;
	
	public ArrayIns(int max)
	{
		theArray = new long[max];
		nElems = 0;
	}
	
	public void insert(long value)
	{
		theArray[nElems] = value;
		nElems++;
	}
	
	public void display()
	{
		System.out.print("A=");
		for(int j=0;j<nElems;j++)
			System.out.print(theArray[j]+" ");
		System.out.println("");
	}
	
	public void quickSort()
	{
		recQuickSort(0,nElems-1);
	}
	
	public void recQuickSort(int left,int right)
	{
		int size = right-left+1;
		if(size <= 3)
			manualSort(left,right);
		else
		{
			long median = medianOf3(left, right);
			int partition = partitionIt(left, right, median);
			recQuickSort(left,partition-1);
			recQuickSort(partition,right);
		}
	}
	
	public long medianOf3(int left, int right)
	{
		
	}
	
	
	public void swap(int dex1, int dex2)
	{
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
//	
//	public int partitionIt(int left,int right,long pivot)
//	{
//		return
//	}
//	
	public void manualSort(int left,int right)
	
	
}
