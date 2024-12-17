package abstracts;

abstract class Food{
abstract void fruits();
void taste()
{
	System.out.println("it is sweet");
}
}
class Apple extends Food{
	//void taste() {
	//	System.out.println("this is an apple");;
	//}
	void fruits() {
		System.out.println("this is a fruit");
	}
}
public class abs{
	public static void main(String[] args)
	{
		Apple a=new Apple();
		a.fruits();
		a.taste();
	}
}
