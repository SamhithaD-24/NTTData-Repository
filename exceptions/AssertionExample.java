package exceptions;


/*void greeting(int num) {
	assert num >=25 : "It's not Christmas day";
	System.out.println("Christmas is on " + num+ "December Every year");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssertionExample a = new AssertionExample();
		a.greeting(28);

	}
*/
	public class AssertionExample {
		void greeting(int num) {
			System.out.println("hsdbfhavs");
			
			assert num>18:"your not eligeble to vote ";
			
			System.out.println("your eligeble to vote because of your age above "+num);
		}
		public static void main(String[] args) {
			AssertionExample a=new AssertionExample();
			a.greeting(2);
			//a.greeting(10);
		}
	}


