package cn.jackie.some;

import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) {
		System.setProperties();
		Properties sp = System.getProperties();
		Enumeration e = sp.propertyNames();
		while(e.hasMoreElements())
		{
			String key = (String)e.nextElements();
			System.out.println(key + "=" + sp.getProperty(key));
		}
	}
}
