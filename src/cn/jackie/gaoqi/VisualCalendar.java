package cn.jackie.gaoqi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VisualCalendar {
	public static void main(String[] args) {
		String temp = "2030-4-10";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			
			calendar.set(Calendar.DATE, 1);
			
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			System.out.println();
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
//			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//			System.out.println(calendar.getActualMaximum(Calendar.DATE));
//			
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			for(int i=0;i<calendar.get(Calendar.DAY_OF_WEEK);i++){
				System.out.print("\t");
			}
			
			int j = 0;
			for(int i=1;i<=maxDate;i++){
				if(i==1){
					
				}
				System.out.print(i+"\t");
				j++;
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				
				if(j%7==0) {
					System.out.print("\n");
					
			}
				
			}
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	
}
