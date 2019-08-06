import java.util.Scanner;


public class primeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,m=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		m=n/2;
		
		if(n==0||n==1){
			System.out.println("Number is Not Prime");
		}
		
		for(int i=2;i<=m;i++){
			if(n%i==0){
				System.out.println(n+"Number is not Prime");
				flag=1;
				break;
			}
		}
		
		if(flag==0){
			System.out.println(n+"\nNumber is Prime");
		}
	}

}
