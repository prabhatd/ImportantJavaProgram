import java.util.Scanner;


public class fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1=0,n2=1,n3;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Count");
			int num=sc.nextInt();
			System.out.println(n1+""+n2);
			for(int i=2;i<num;++i){
				n3=n1+n2;
				System.out.println(" "+n3);
				n1=n2;
				n2=n3;
			}
		
		
	}
}