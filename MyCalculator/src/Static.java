
public class Static {

	static int x=13;
	/**
	 * @param args
	 */
	
	static void func(){
		System.out.println("Inside Static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static.func();
		System.out.println(Static.x);
		Static s1= new Static();
		Static s2= new Static();
		System.out.println(s1.x);
		s1.func();
	}

}
