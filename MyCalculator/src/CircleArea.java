
import java.util.*;
public class CircleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius");
		int radius = sc.nextInt();
		
		double area = 3.14 * radius * radius;
		double perimeter= 2 * 3.14 * radius;
		System.out.println("The area of the circle \n"+area);
		System.out.println("The perimeter of circle \n"+perimeter);
		
		
	}

}
