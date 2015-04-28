package cn.jackie.some;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebPageSource {
	public static void main(String[] args) {
		URL url;
		int responsecode;
		HttpURLConnection urlConnection;
		BufferedReader reader;
		String line;
		try{
			url = new URL("http://www.163trade.com");
			urlConnection = (HttpURLConnection)url.openConnection();
			responsecode = urlConnection.getResponseCode();
			if(responsecode == 200){
				reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"utf8"));
				while((line=reader.readLine())!=null){
					System.out.println(line);
				}
			}else{
				System.out.print("获取不到相应，服务器响应代码为："+responsecode);
			}
		}catch(Exception e){
			System.out.println("获取不到网页点源码，出现异常："+e);
		}
	}
}
