package httptraining;

import org.json.*;

public class TemperatureJson{
	String city;
	HttpRequestSender requestSender = new HttpRequestSender();
	
	public void setCity (String city){
		this.city = city;
	}
	
	public void temperatureGetter(String html){
		JSONObject obj;
		boolean isJsonObjectOk = false;
		
		while (isJsonObjectOk == false) {
			try {
				obj = new JSONObject(html);
				double tempString = obj.getJSONObject("main").getDouble("temp");
				
				System.out.println("Temperature in " + requestSender.getCity() + " is: " +  tempString);
				isJsonObjectOk = true;
			} catch (JSONException e) {
				System.out.println("You have a problem with JSON object");
				e.printStackTrace();
			}
		}
	}
}
