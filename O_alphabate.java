package feb3;

public class O_alphabate {

	public static void main(String[] args) {

		int col;
		int row;
		for(row =1; row<=4; row++) {
			for(col=1; col<=3; col++) {
				if((row==1 || col==2 || col ==3) && ((row==1 && col==3) &&
						(row==2 || col==3)  || (row==3 || col==3) || (row==4 || col==3))) {
					
				}
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		System.out.println("");
		

	}

}
