package httptraining;

import java.io.IOException;
import org.json.*;

public class Temperature{
	JSONObject obj;
	HttpRequestSender requestSender = new HttpRequestSender();

	public double getTemperature(String city) throws Exception{
		try {
			try {
				obj = new JSONObject(requestSender.getResponse(requestSender.getUrl(city)));
			} catch (IOException e) {
				throw new Exception("Could not retrieve temperature");
			}
			return obj.getJSONObject("main").getDouble("temp");
		} catch (JSONException e) {
			throw new Exception("Could not retrieve temperature");
		}
	}
}
	
