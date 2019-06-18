package java_20190613;

import java.io.IOException;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverSportsCrawling {
	public static void main(String[] args) {
		//String url = "https://sports.news.naver.com/kfootball/index.nhn";
		//String url = "http://news.jtbc.joins.com/html/341/NB11832341.html";
		//String url = "http://news.jtbc.joins.com/";
		String url ="https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
		// 전체 HTML문서를 관리하기 위한 객체
		Document doc = null;

		try {
			// url 주소에 get 방식으로 접근
			doc = Jsoup.connect(url).get();

		} catch (IOException e) {
			// TODO: handle exception
		}

//		Elements elements = doc.select(".home_news");
		Elements elements = doc.select(".table-responsive");
		//System.out.println(elements);
		// h2 에 있는 주요뉴스, 하위 데이터들을 글자를 텍스트로 변환, 처음부터 4글자까지 만 잘라냄
		//String title = elements.select("h3").text().substring(0, 4);
		//String title = elements.select("h3").text();
		//System.out.println(title);
		/*System.out.println(title);
		for (Element temp : elements.select("li")) {
			System.out.println(temp.text());

		}*/
		Elements liEle = elements.select("td");
		for (int i = 0; i < liEle.size(); i++) {
			Element temp = liEle.get(i);
			System.out.println(temp.text());
			
		}
		/*
		
		for (Element temp : elements.select("li")) {
			System.out.println(temp.text());
			
		}*/

	}
}
