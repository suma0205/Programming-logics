package Java;

// toString
public class Bottle {
	int b_cost;
	String b_name;
	Bottle(int b_cost,String b_name){
		this.b_cost=b_cost;
		this.b_name=b_name;
	}


	public static void main(String[] args) {
		Bottle b=new Bottle(10, "bislery");
		System.out.println(b);
	}
}