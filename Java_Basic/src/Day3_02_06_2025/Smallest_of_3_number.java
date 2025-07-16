package Day3_02_06_2025;

public class Smallest_of_3_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		int b = 12;
		int c = 19;
		
		if(a<b && a<c) {
			System.out.println("a is smallest number " +a);
		}
		else if(b<a & b<c) {
			System.out.println("b is smallest number " +b);
		}
		else {
			System.out.println("c is smallest number"+c);
		}

	}

}
