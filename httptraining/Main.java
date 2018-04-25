package httptraining;

import java.io.IOException;

public class Main {
	public static void main (String [] args){
		TrainingHttp train = new TrainingHttp();
		/*try {
			train.responseGetter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		TemperatureJson json = new TemperatureJson();
		try {
			json.temperatureSecond(train.responseGetter());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
