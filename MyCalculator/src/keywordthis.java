
public class keywordthis {

	int emp_id;
	String name;
	public keywordthis(int emp_id,String name){
		this.emp_id= emp_id;
		this.name= name;
	}
	
	void show(){
		System.out.println(emp_id+" - "+name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		keywordthis key1=new keywordthis(1, "Prabhat");
		keywordthis key2= new keywordthis(2,"Rahul");
		
		key1.show();
		key2.show();
	}

}
