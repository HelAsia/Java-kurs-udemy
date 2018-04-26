package httptraining;

import java.io.IOException;
import org.json.*;

public class Temperature{
	private static Temperature instance = null; 
	
	public static Temperature getInstance(){ 
		if (instance==null){
			instance = new Temperature(); 
		} 
		return instance; 
	} 
	private Temperature() {}
	
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
	
