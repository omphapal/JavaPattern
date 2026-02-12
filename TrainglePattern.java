package feb6;

public class TrainglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char x;
		char y;
		for(x='A'; x<='E'; x++) {
			for(y='A'; y<=x; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
