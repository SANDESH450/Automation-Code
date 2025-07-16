package Day2;

public class Operators {

	public static void main(String[] args) {
   
		// 1) Arithmetic operators + - * / %
		
		int a = 10, b =40;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		System.out.println(a%b);
		
		// 2) Relational comparison Operators > >= < <= !=  ==
		// returns boolean Value - true/false
		
		System.out.println(a<b);
		System.out.println(a>b);
		
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		System.out.println(a !=b);
		System.out.println(a ==b);
		
		boolean res = a<b;
		System.out.println(res);
		
		// 3. Logical Operations : &&, ||, !
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(x!=y);

		

	
		
		
	}

}
