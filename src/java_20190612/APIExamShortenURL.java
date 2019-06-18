package java_20190612;

//���̹� �˻� API ���� - ���� URL - GET
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIExamShortenURL {
	public String getShorternUrl(String id, String scret, String u) {

		StringBuffer response = new StringBuffer();
		String clientId = id;// ���ø����̼� Ŭ���̾�Ʈ ���̵�";
		String clientSecret = scret;// ���ø����̼� Ŭ���̾�Ʈ ��ũ����";
		try {
			String text = u; // �ٲ� url �Է�
			String apiURL = "https://openapi.naver.com/v1/util/shorturl?url=" + text;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // ���� ȣ��
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // ���� �߻�
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;

			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			// System.out.println(response.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		return response.toString();
	}

	public static void main(String[] args) {
		String clientId = "SV2uT4fdivWOg2cbGxGT";
		String clientSecret = "G2DExzaIMN";
		APIExamShortenURL a = new APIExamShortenURL();
		String surl = a.getShorternUrl(clientId, clientSecret, "https://www.naver.com");
		System.out.println(surl);
	}
}