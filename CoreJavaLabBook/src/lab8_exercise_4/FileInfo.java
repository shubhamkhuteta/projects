package lab8_exercise_4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileInfo {
	public static void main(String[] args) throws IOException {
		String name_1;
		String name_2;
		int n = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What you want to create : \n1. File\n2. Directory");
		n=sc.nextInt();
		if(n==1) {
			
			System.out.println("Enter the file name : ");
			name_1=sc.next();
			File f=new File(name_1);
		
			if(f.exists())
			{
				System.out.println("File already exist!!");
				if(f.isHidden()){
					System.out.println("Hidden Info : Hidden");
				}else {
					System.out.println("Hidden Info : not Hidden");
				}
				
				if(f.canWrite()){
					System.out.println("Writable Info : Can Write");
				}else {
					System.out.println("Writable Info : Can't Write");
				}
				byte b=(byte)f.getTotalSpace();
				System.out.println("Total length in bytes : "+b);
				System.out.println("File Extension/Type is :"+name_1.substring(name_1.lastIndexOf(".")));
			}
			else 
			{
				f.createNewFile();
			}
		}
		else 
		{
			System.out.println("Enter the directory name : ");
			name_2=sc.next();
			File f1=new File(name_2);
			
			if(f1.exists()==true)
			{
				System.out.println("Directory already exist!!");
			}
			else {
				f1.mkdir();
			}
		}
	}
}
