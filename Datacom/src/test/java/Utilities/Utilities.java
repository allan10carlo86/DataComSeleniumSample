package Utilities;


import java.text.ParseException;

public class Utilities {
	
	public String getAmount(String str_amount) {
	    String[] result = str_amount.split(" ");
	    //System.out.println(result[0]);
	    return result[0]; 
	
	}
	
	public double formatNumber(String str_amount) {
		return Double.parseDouble(str_amount.replaceAll("[$,]", ""));
	}
	
	public static void main(String args[]) throws ParseException {
		String amount = "$5,000.00";
		Utilities util = new Utilities();
		Double number = util.formatNumber(amount);
		System.out.println(number+500);

	}
}
