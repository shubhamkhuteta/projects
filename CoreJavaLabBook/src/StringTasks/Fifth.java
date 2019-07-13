package StringTasks;

public class Fifth {
	public static void main(String[] args) {
		String s = "Shubham Khuteta isd sds sd sd w sa s s ";
		int count = 1;
		 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
		System.out.println(count);
	}}
