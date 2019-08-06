
import java.util.*;
public class Calculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num= sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2= sc.nextInt();
		
		int add = num+num2;
		int sub= num-num2;
		int mul=num*num2;
		float div= num/num2;
		
		
		System.out.println("The addition of two number is \n"+add);
		System.out.println("The Subtraction of two number \n"+sub);
		System.out.println("The Multiplication of two number \n"+mul);
		System.out.println("The divison of Number \n"+div);
	}

}
