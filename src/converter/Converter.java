package converter;

public class Converter {
	
	protected static String kToC(String i) {
		double r = Double.parseDouble(i) - 273.15;
		return String.valueOf(r);
	}
	
	protected static String cToK(String i) {
		double r = Double.parseDouble(i) + 273.15;
		return String.valueOf(r);
	}
	
	protected static String kToF(String i) {
		double r = (Double.parseDouble(i) - 273.15)*1.8+32;
		return String.valueOf(r);
	}
	
	protected static String fToK(String i) {
		double r = (Double.parseDouble(i)-32)/1.8 + 273.15;
		return String.valueOf(r);
	}
	
	protected static String cToF(String i) {
		double r = Double.parseDouble(i)*1.8+32;
		return String.valueOf(r);
	}
	
	protected static String fToC(String i) {
		double r = (Double.parseDouble(i)-32)/1.8;
		return String.valueOf(r);
	}
	
	protected static String lToMl(String i) {
		double r = Double.parseDouble(i)*1000;
		return String.valueOf(r);
	}
	
	protected static String lToGal(String i) {
		double r = Double.parseDouble(i) * 0.26417;
		return String.valueOf(r);
	}
	
	protected static String mlTol(String i) {
		double r = Double.parseDouble(i)/1000;
		return String.valueOf(r);
	}
	
	protected static String mlToGal(String i) {
		double r = (Double.parseDouble(i))/1000 * 0.26417;		
		return String.format("%.8f", r);		
	}
	
	protected static String galToL(String i) {
		double r = Double.parseDouble(i)/0.26417;
		return String.format("%.8f",r);
	}
	
	protected static String galToMl(String i) {
		double r = Double.parseDouble(i)/0.26417 * 1000;
		return String.format("%.8f",r);
	}
}
