package StringTasks;

public class Sixth 
{
	public static void main(String[] args)
	{
		String str= "How to Print Uppercase Letters in Java";
		
		for (int i = 0; i < str.length(); i++) 
		{
		    if(Character.isUpperCase(str.charAt(i)))
		    {    
		    	System.out.println(str.charAt(i));
		    }
		}
	}
}
