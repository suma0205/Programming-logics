package practice;

interface Sm
{
	void shopping();
}
class Zudio implements Sm
{
	public void shopping() {
		System.out.println("zzzzz");
	}
}
class Trends implements Sm
{
	public void shopping() {
		System.out.println("Trrrrrrrrrrr");
	}
}
class Cust {
	static void purchase(Sm s) {
		s.shopping();
	}
}
public class MainClass {
	public static void main(String[] args) {
		Zudio z=new Zudio();
		Trends t=new Trends();
		Cust.purchase(z);
		Cust.purchase(t);
	}
}
