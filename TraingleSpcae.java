package pattern_10_feb;

import java.util.Scanner;

public class TraingleSpcae {

	public static void main(String[] args) {
		
		System.out.println("Enter name");
		Scanner sc=new Scanner(System.in);
		
		String ss=sc.next();
		int l=ss.length();
		for(int i=1; i<=l; i++) {
			for(int s=l-i; s>=0; s--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print(ss.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}
