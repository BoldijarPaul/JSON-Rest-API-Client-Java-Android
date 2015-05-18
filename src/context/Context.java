package context;

import java.net.HttpURLConnection;

public class Context {
	/* this class will handle all requests and (de)serializing of the objects */

	 

	/* the root adress of the api */
	private String root;

	public void setRoot(String root) {
		this.root = root;
	}

	/* for the get requets you can't set a body, for the others you can */
	public <T> T doGetRequest(String path, Class<T> type) {
		try {
			HttpURLConnection urlConnection = HttpHelper
					.createHttpUrlConnection(root + path, "GET", null);
			String response = HttpHelper
					.readHttpUrlConnectionResponse(urlConnection);
			return HttpHelper.stringToObject(response, type);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public <T> T doPostRequest(String path, Object body, Class<T> type) {
		try {
			HttpURLConnection urlConnection = HttpHelper
					.createHttpUrlConnection(root + path, "POST", body);
			String response = HttpHelper
					.readHttpUrlConnectionResponse(urlConnection);
			return HttpHelper.stringToObject(response, type);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public <T> T doDeleteRequest(String path, Object body, Class<T> type) {
		try {
			HttpURLConnection urlConnection = HttpHelper
					.createHttpUrlConnection(root + path, "DELETE", body);
			String response = HttpHelper
					.readHttpUrlConnectionResponse(urlConnection);
			return HttpHelper.stringToObject(response, type);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public <T> T doPutRequest(String path, Object body, Class<T> type) {
		try {
			HttpURLConnection urlConnection = HttpHelper
					.createHttpUrlConnection(root + path, "PUT", body);
			String response = HttpHelper
					.readHttpUrlConnectionResponse(urlConnection);
			return HttpHelper.stringToObject(response, type);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
