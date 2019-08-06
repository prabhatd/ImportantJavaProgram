import java.util.Random;
import java.util.Scanner;


public class randomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange;
			Scanner sc = new Scanner(System.in);
			Random random= new Random();
			
			System.out.println("Please Enter max Range");
			
			maxRange=sc.nextInt();
			
			for(int i=1;i<10;i++){
				System.out.println(random.nextInt(maxRange));
			}
	}

}
