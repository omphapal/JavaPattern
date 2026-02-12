package feb2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc=new Scanner(System.in);
//		int i=sc.nextInt();
//		int j=sc.nextInt();	
//		
		 
		int i;
		int j=1;
		System.out.println();
		for(i=10; i>=1; i--) {
			for(j=i; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
					for(int k=2; k<=10; k++) {
				for (int l=k; l>=1; l--) {
					System.out.print(k);
				}
				System.out.println();
			}
		}
		
	}



