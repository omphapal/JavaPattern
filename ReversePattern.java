package pattern_10_feb;

import java.util.Scanner;

public class ReversePattern {

	public static void main(String[] args) {
		
	
			
			System.out.println("Enter name");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			
			
			for(int i=s.length(); i>=0; i--) {
				for(int j=0; j<i; j++) {
					System.out.print(s.charAt(j));
				}System.out.println();
			}
	}
}
