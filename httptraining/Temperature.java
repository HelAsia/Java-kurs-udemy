package httptraining;

public class Temperature {
	public float temperature (String cityInputed, String html){
		
		String temp = ("{\"temp\":");
        String pressure = (",\"pressure\"");
        int tempIndex = html.indexOf(temp) + 8;
        int pressureIndex = html.indexOf(pressure);
        String htmlString =  html.substring(tempIndex, pressureIndex);
        float htmlFloat = Float.parseFloat(htmlString);
        
        System.out.println("Your temperature is: " + htmlFloat);
        
		return htmlFloat;
	}
}
