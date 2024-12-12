
package ts;

abstract class Transport{
	float distance;
	abstract void calculateFare();
public Transport(float distance) {
	this.distance=distance;
}
}

class Bus extends Transport{
	public Bus(float distance) {
		super(distance);	
		}
public void calculateFare() {
	System.out.println("Bus fare: "+(distance*1.2));
}	
}
class Train extends Transport{
	public Train(float distance) {
		super(distance);
	}
	public void calculateFare() {
		System.out.println("Train fare: "+(distance*0.8));
}
}
class Taxi extends Transport {
	public Taxi(float distance) {
		super(distance);
	}
	public void calculateFare() {
		System.out.println("Taxi fare: "+(distance*3.5+100));
}	
}
class Main{
	public static void main(String[] args) {
		Bus b=new Bus(1.7f);
		b.calculateFare();
		Train t=new Train(2.7f);
		t.calculateFare();
		Taxi t1=new Taxi(3.7f);
		t1.calculateFare();
	}
}

