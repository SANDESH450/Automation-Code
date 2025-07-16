package Day3_02_06_2025;

public class Largest_of_3_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 80; 
		int b= 34;
		int c= 33;
		
		if(a>b && a>c) {
			System.out.println("a is largest number" + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is largest number" + b);
		}
		else 
		{
			System.out.println("C is largest number" + c);
		}

	}

}
