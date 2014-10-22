package cn.jackie.algorithm.selectsort;

public class SelectSortApp {
	public static void main(String[] args) {
		int maxSize = 100;
		ArraySel arr = new ArraySel(maxSize);
		
		arr.insert(77);
		arr.insert(97);
		arr.insert(17);
		arr.insert(132);
		arr.insert(11);
		arr.insert(1);
		arr.insert(7);
		arr.insert(727);
		arr.insert(2);
		
		arr.display();
		arr.selectSort();
		arr.display();
	}
}
