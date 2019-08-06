
public class DuplicateCharInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="schoolisggd";
		int count=0;
		
		char[] inp=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(inp[i]==inp[j]){
					System.out.println(inp[j]);
					count++;
					break;
				}
			}
		}
	}

}
