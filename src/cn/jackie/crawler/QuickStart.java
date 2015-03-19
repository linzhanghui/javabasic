package cn.jackie.crawler;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class QuickStart {
	public static void main(String[] args) throws Exception{
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpGet = new HttpGet("http://www.163trade.com");
			CloseableHttpResponse response1 = httpclient.execute(httpGet);
			try {
				System.out.println(response1.getStatusLine());
				HttpEntity entity1 = response1.getEntity();
				if(entity1 != null) {
					System.out.println(EntityUtils.toString(entity1));
				}
				EntityUtils.consume(entity1);
			} finally {
				response1.close();
			}
		} finally {
			httpclient.close();
		}
	}
}
