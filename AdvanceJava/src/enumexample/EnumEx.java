package enumexample;

public class EnumEx {

	 enum Color 
	    { 
	        RED, GREEN, BLUE, YELLOW; 
	    } 
	 
	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println(c);
	}
}
