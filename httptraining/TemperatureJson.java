package httptraining;

import org.json.*;

public class TemperatureJson {
	
	public void temperatureSecond(String html){
	
		JSONObject obj;
		try {
			obj = new JSONObject(html);
			double tempString = obj.getJSONObject("main").getDouble("temp");
			System.out.println(tempString);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	
	}
}
