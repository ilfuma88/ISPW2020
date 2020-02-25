package application;

public class Functions {
	
	public static Float sumOrSub(Float frstNumber, Float scndNumber, String operation) {
		Float result;
		switch (operation) {
			case "+":
				result = frstNumber + scndNumber;
				break;
			case "-":
				result = frstNumber - scndNumber;
				break;
			default:
				result = (float) 0;
				break;
			
		}
		return result;
	}

}
