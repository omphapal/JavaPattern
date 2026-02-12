package feb3;

public class T_alphabate {

	public static void main(String[] args) {
		int row,col;
		
		for( row=1; row<=5; row++) {
			for(col=1; col<=4; col++) {
				if((row ==1) ||(col==3) ) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
