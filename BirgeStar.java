package febPattern_11;

import java.util.Scanner;

public class BirgeStar {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {

				System.out.print("*");


			}for(int s=1; s<=rows-i; s++) {
				System.out.print(" ");

			}
			for(int j=rows; j>=i; j--) {
			System.out.print("*");
			}
			for(int s=3; s<=2*i; s++) {
			System.out.print(" ");
			}
			for(int j=rows; j>=i; j--) {
				System.out.print("*");
			}for(int s=1; s<=rows-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(  );
		
	}

	}
}
