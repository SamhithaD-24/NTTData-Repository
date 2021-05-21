package exceptions;

public class HandleExceptions {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a=10/0;
			
		}
		catch(Exception e){
			e.printStackTrace();
			
			
		}
		System.out.println("After Exception");
	}

}
