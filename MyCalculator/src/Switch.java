import java.util.Scanner;


public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int a = sc.nextInt();
		switch(a){
		case 1:
			System.out.println("You choose one");
			break;
			
		case 2:
			System.out.println("you choose two");
			break;
			
		case 3:
			System.out.println("You choose three");
			break;
			
		case 4:
			System.out.println("you choose four");
			break;
			
		case 5:
			System.out.println("You choose five");
			break;
			
		case 6:
			System.out.println("you choose six");
			break;
			
			default:
				System.out.println("Default Selected!");
				break;
		}

	}

}
