package StringTasks;

public class Seventh {
	String str= "How to Print Uppercase Letters in Java";
	
	for (int i = 0; i < str.length(); i++) 
	{
	    if(Character.isUpperCase(str.charAt(i)))
	    {    
	    	System.out.println(str.charAt(i));
	    }
	}
}
