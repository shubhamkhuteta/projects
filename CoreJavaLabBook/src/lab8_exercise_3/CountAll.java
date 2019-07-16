package lab8_exercise_3;

import java.util.Scanner;

public class CountAll {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name = sc.nextLine();
		int cha=0, word=0, line=0;
		
		for(int i=0;i<name.length();i++) {
		if(name.charAt(i)==' '){
			cha++;
		}else if(name.charAt(i)=='\n') {
			line++;
		}else {
			word++;
		}
		
		System.out.println("Character : "+cha+"Lines : "+line+"Words : "+word);
		}
	}
}
