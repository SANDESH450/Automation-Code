package String_Methods;

public class String_Method {

	public static void main(String[] args) {

		String s ="sandesh ";
		
		System.out.println(s.length());
		
		String s1 = "User name";
		String s2 = "  Sandesh45";
		
		System.out.println(s1.concat (s2));
		System.out.println(s1.concat(s2).trim().length());
		
		System.out.println(s2);
		System.out.println(s2.trim());
		
		s="jayesh";
		
		System.out.println(s.contains("Jay"));
		System.out.println(s.contains("jay"));
		System.out.println(s.replace('j', 'N'));
		System.out.println(s.charAt(0));
		System.out.println(s.replace("jayesh", "Sandesh"));
		System.out.println(s.substring('y','N'));
	} 

	

	
	
}
