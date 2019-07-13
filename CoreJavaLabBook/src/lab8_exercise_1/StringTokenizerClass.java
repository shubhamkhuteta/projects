package lab8_exercise_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerClass {
	public static void main(String[] args) {
		int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum+= n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
		
	}
}
