package cn.jackie.crawler;

import java.util.LinkedList;

public class SimpleCrawler {

	public void crawl() throws Throwable {
		while(continueCrawling()) {
			CrawlerUrl url = getNextUrl();
			if(url!=null) {
				printCrawlInfo();
				String content = getContent(url);
				
				if(isContentRelevant(content,this.regexpSearchPattern)) {
					
				}
				
			}
		}
	}
	
	public CrawlerUrl getNextUrl() throws Throwable {
		CrawlerUrl nextUrl = null;
		while((nextUrl == null) && (!urlQuery.isEmpty())){
			CrawlerUrl crawlerUrl = this.urlQueue.remove();
			if(doWeHavePermissionToVisit(crawlerUrl)
					&&(!isUrlAlreadyVisited(crawlerUrl))
					&&isDepthAcceptable(crawlerUrl)){
				nextUrl = crawlerUrl;
			}
		}
		return nextUrl;
	}
	
	private String getContent(CrawlerUrl url) throws Throwable {
		//HttpClient
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url.getUrlString());
		StringBuffer strBuf = new StringBuffer();
		//execute方法直接取字符串化url的内容
		HttpResponse response = client.execute(httpGet);
		if(HttpStatus.SC_OK == response.getStatusLine().getStatusCode()){
			HttpEntity entity = response.getEntity();
			if(entity != null) {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(entity.getContent(),"UTF-8"));
				String line = null;
				if(entity.getContentLength()>0) {
					strBuf = new StringBuffer((int)entity.getContentLength());
					while((line = reader.readLine())!=null) {
						strBuf.append(line);
					}
				}
			}
			if(entity != null){
				entity.consumeContent();
			}
		}
//		读取到页面后标记为已访问；
		markUrlAsVisited(url);
		return strBuf.toString();
	}
	
	public static boolean isContentRelevant(String content,Pattern regexpPattern) {
		boolean retValue = false;
		
	}
	
	
	public static void main(String[] args) {
		try {
			String url = "";
			Query urlQuery = new LinkedList();
			String regexp = "java";
			urlQuery.add(new CrawlerUrl(url,0));
			NaiveCrawler crawler = new NaiveCrawler(urlQuery,100,5,1000L,regexp);
			crawler.crawl();
		} catch(Throwable t) {
			System.out.println(t.toString());
			t.printStackTrace();
		}
	}

}
