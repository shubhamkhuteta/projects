package com.capgemini.takehome.ui;


import java.util.InputMismatchException;
import java.util.Scanner;


import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.service.ProductService;



public class Client {
	Scanner scanner = new Scanner(System.in);
	int  productCode,productQuantity;
	Product product = new Product();
	static Client client = new Client();
	ProductService productService= new ProductService();
	static boolean res;
	int input;
	

	public static void main(String[] args) throws Exception {
		System.out.println("\n----------Welcome to Take Home----------");
		client.showMenu();
		client.chooseAny();
		
	}

	public void showMenu() throws Exception 
	{
		System.out.println("\n1) Generate Bill by entering Product code and quantity");
		System.out.println("2) Exit");
		System.out.println("Enter Choice : ");
		try {
		input = scanner.nextInt();
		
		}catch(InputMismatchException e) {
			System.out.println(input+"**********************");
			System.out.println("Invalid Input");
			
			//input = scanner.nextInt();
			//showMenu();
		}
	}

	public void chooseAny() throws Exception
	{
	
				if(input==1) {
					choose();
				}else if(input==2){
					choose();
				}else if(input==0) 
				{
					System.out.println("Do Not Enter Characters!!");
					//showMenu();
				}
				else
				{
					showMenu();
				}
	}

	public void choose() throws Exception {
		
		switch (input)
		{
		
		case 1: 
			
			res=false;
			while(res==false ) {
				System.out.println("Enter product code : ");
				productCode = scanner.nextInt();
						
				res=true;
						product = productService.getProductDetails(productCode);
						if(product.getProductCode()==0) {
							System.out.println("Product Code Not Found!!!");
							res=false;
						}else {
							res=true;
						}
			}
			
			
			
			res=false;
			while(res==false ) {
				System.out.println("Enter Quantity : ");
				productQuantity = scanner.nextInt();
						res=true;
						
						if(productQuantity<=0) {
							System.out.println("Quantity can not be 0!!");
							res=false;
						}else {
							System.out.println("Product Code : "+product.getProductCode());
							System.out.println("Product Name : "+product.getProductName());
							System.out.println("Product Category : "+product.getProductCategory());
							System.out.println("Product Price : "+product.getProductPrice());
							System.out.println("Quantity : "+productQuantity);
							System.out.println("Total Bill : "+product.getProductPrice()*productQuantity);
						}
			}
			
			
			
		break;
		
		case 2: 
			System.out.println("Do you want to exit ? press 0 to continue 1 to exit");
			int close=scanner.nextInt();
			
			if(close==0) {
				close=0;
			}else {
				System.exit(0);
			}

		default:{
			chooseAny();
		}
		}
	}
}


