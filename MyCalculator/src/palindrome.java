import java.util.Scanner;


public class palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= sc.nextInt();
		int temp=num;
		int rev=0;
		int rem;
		while(num!=0){
			rem= num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		if(temp==rev){
			System.out.println("Palindrome Number");
		}else{
			System.out.println("Not Palindrome");
		}

	}

}
