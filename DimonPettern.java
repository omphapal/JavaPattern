package pattern_10_feb;

import java.util.Scanner;

public class DoubleTraing {
public static void main(String[] args) {
	

	
	System.out.println("Enter name");
	Scanner sc=new Scanner(System.in);
	String ss=sc.next();
	
	int l=ss.length();
	for(int i=1; i<=l; i++) {
		for(int s1=l-i; s1>0; s1--) {
			System.out.print(" ");
		}
		for(int j=0; j<i; j++) {
			System.out.print(ss.charAt(j)+" ");
		}
		System.out.println();
	}
	for(int i=l-1; i>=1; i--) {
		for(int s2=0; s2<l-i; s2++) {
			System.out.print(" ");
		}
		for(int j=0; j<i; j++) {
			System.out.print(ss.charAt(j)+" ");
		}
		System.out.println();
	}
	
}

}
