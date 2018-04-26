package httptraining;

import java.io.IOException;

import org.json.*;

public class Temperature{
	
	JSONObject obj;
	HttpRequestSender requestSender = new HttpRequestSender();

	public double getTemperature(String city){

		try {
			try {
				obj = new JSONObject(requestSender.getResponse(requestSender.getUrl(city)));
			} catch (IOException e) {
				e.printStackTrace();
				return 0.0;
			}
		double temperature = obj.getJSONObject("main").getDouble("temp");
		return temperature;
		} catch (JSONException e) {
			System.out.println("You have a problem with JSON object");
			e.printStackTrace();
			return 0.0;
		}
		
	}
}
	
