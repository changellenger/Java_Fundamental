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
		// ��ü HTML������ �����ϱ� ���� ��ü
		Document doc = null;

		try {
			// url �ּҿ� get ������� ����
			doc = Jsoup.connect(url).get();

		} catch (IOException e) {
			// TODO: handle exception
		}

//		Elements elements = doc.select(".home_news");
		Elements elements = doc.select(".table-responsive");
		//System.out.println(elements);
		// h2 �� �ִ� �ֿ䴺��, ���� �����͵��� ���ڸ� �ؽ�Ʈ�� ��ȯ, ó������ 4���ڱ��� �� �߶�
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
