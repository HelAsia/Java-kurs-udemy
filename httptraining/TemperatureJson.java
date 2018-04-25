package httptraining;

import org.json.*;

public class TemperatureJson {
	
	public float temperatureSecond(String city, StringBuffer response){
	
	JSONObject obj = new JSONObject(response);
	String tempString = obj.getJSONObject("main").getString("temp");
	}

}
