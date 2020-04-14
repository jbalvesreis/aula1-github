package util;

public class CurrencyConverter {
	
	public static double priceDollar;
	public static double qnttDollar;
	public static double valTotalDollar() {
		return priceDollar * qnttDollar * (1.0 + 0.06);				
	}
}
