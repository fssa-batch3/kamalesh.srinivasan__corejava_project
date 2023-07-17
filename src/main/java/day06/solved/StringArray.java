package day06.solved;

public class StringArray {

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";

		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
		cityArr[cityArr.length-1] = "Delhi";
		
		System.out.println();
		
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
		System.out.println();
		
		for (int i = 0; i < cityArr.length; i++) {
			if(cityArr[i].equals("Bangalore")){
				cityArr[i] = "Kolkata";
			}		
		}
		
		
		System.out.println();
		
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
		
		for (int i = 0; i < cityArr.length; i++) {
			if("Mumbai".equals(cityArr[i])) {
				cityArr[i] = cityArr[i+1];
				cityArr[i+1] = null;
			}
		}
		
		System.out.println();
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
		
	}
}