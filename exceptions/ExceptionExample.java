package exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before exception");
		
		//runtime exception
		
		/*String s=null;
		s.length();
		*/
		/*String s = "hello";
		Integer.parseInt(s);
		*/
		int a=10/0;
		 int b[] = new int[9];
		 int c= b[10];
		System.out.println("After Exception");

	}

}
