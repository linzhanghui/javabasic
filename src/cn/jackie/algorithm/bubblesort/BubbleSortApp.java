package cn.jackie.algorithm.bubblesort;

/*
 * 需要在后期做可视化处理；
 */

public class BubbleSortApp {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayBub arr = new ArrayBub(maxSize);
		
		arr.insert(77);
		arr.insert(7);
		arr.insert(17);
		arr.insert(27);
		arr.insert(47);
		arr.insert(97);
		arr.insert(771);
		arr.insert(772);
		arr.insert(37);
		
		arr.display();
		arr.bubbleSort();
		arr.display();
	}
}
