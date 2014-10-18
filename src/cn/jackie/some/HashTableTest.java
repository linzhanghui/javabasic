package cn.jackie.some;

import java.util.*;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable numbers = new Hashtable();
		numbers.put(new MyKey("zhangsan",18),new Integer(1));
		numbers.put(new MyKey("lisi",15), new Integer(2));
		numbers.put(new MyKey("wangwu",20), new Integer(3));
		
		Enumeration e = numbers.keys();
		while(e.hasMoreElements())
		{
			MyKey key = (MyKey)e.nextElement();
			System.out.println(key+"=");
			System.out.println(numbers.get(key)	);
		}
	}
}
