package cn.jackie.algorithm.hash;
import java.io.*;

public class DataItem {
	private int iData;
	
	public DataItem(int ii){
		iData = ii;
	}
	
	public int getKey() {
		return iData;
	}
}
