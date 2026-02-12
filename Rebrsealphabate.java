package feb6;

public class Rebrsealphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char x;
		char y;
		for(x='E'; x>='A'; x--) {
			for(y='A'; y<=x; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
}
