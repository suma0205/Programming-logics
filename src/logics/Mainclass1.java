package logics;

class Car {
	 void move() {
		 System.out.println("move the car");
	 }
	}
class Traveller
{
	Car c=new Car();
	void startJourney() {
			c.move();
		}
		}
public class Mainclass1 {

	public static void main(String[] args) {
		Traveller t=new Traveller();
		System.out.println("Journey is started");
		t.startJourney();
	}
}
