package pattern_10_feb;

import java.util.Scanner;

public class Star {

public static void main(String[] args) {
	
	System.out.println("Enter name");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	
	
	for(int i=0; i<s.length(); i++) {
		for(int j=0; j<=i; j++) {
			System.out.print(s.charAt(j));
		}System.out.println();
	}
}
}
