package StringTasks;

public class Eighth {
public static void main(String[] args) {
		
		String s1="Hello how are you ?";
		String s2="how";
		String[] s3= new String[s1.length()];
		System.out.println(s1);
		
		int i;
		
		for(i=0; i < s1.length();i++)
		{
			s3=s1.split(" ");
		}
		
		for(i=0; i<s3.length; i++) {
			if(s3[i].equals(s2)) {
				s3[i]=s3[i].toUpperCase();
			}
		}
		
		for(i=0;i<s3.length;i++) {
			System.out.println(s3[i]);
		}
		
	}
}
