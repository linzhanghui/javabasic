package cn.jackie.some;

import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println(cl.get(Calendar.YEAR) + "年"+cl.get(Calendar.MONTH)+"月"+cl.get(Calendar.DAY_OF_MONTH)+"日"+cl.get(cl.HOUR)+"时");
	}
}
