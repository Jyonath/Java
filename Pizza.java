import java.util.Scanner;
class Pizza
{
int choice;
int med=200;
Scanner sc=new Scanner(System.in);
void items()
{
System.out.println("Welcome to Domino's Pizza");
System.out.println("=========================");
System.out.println("1.Veg pizza");
System.out.println("2.Non pizza");
System.out.println("3.Slides");
System.out.println("Choose your items:");
int item=sc.nextInt();
switch(item){
case 1:
	System.out.println("1. The 4 Cheese Pizza 100/- ");
	System.out.println("2. Margherita 200/-");
	System.out.println("3. Double Cheese Margherita 300/-");
	System.out.println("4. Farm House 400/-");
	choice=sc.nextInt();
	buy();
	break;
case 2:
	System.out.println("1.Chicken Golden Delight 150/-");
	System.out.println("2.Non Veg Supreme 250/-");
	System.out.println("3.Chicken Dominator 350/-");
	System.out.println("4.PEPPER BARBECUE & ONION 450/-");
	choice=sc.nextInt();
	buy();
	break;
case 3:
	System.out.println("1.Garlic Breadsticks 110/-");
	System.out.println("2.Stuffed Garlic Bread 150/-");
	System.out.println("3.Chicken Pepperoni Stuffed Garlic Bread 220/-");
	choice=sc.nextInt();
	buy();
	break;
default:
	System.out.println("Sorry try again!");
	break;
}
}
void buy()
{
System.out.println("Change Size:");
System.out.println("1.Regular (Serves 1)");
System.out.println("2.Medium (Serves 2)");
int s=sc.nextInt();
System.out.println("Add Quantity:");
int q=sc.nextInt();
System.out.println("1.Order now");
System.out.println("2.Add to cart");
int cart=sc.nextInt();
if(cart==1)
{
System.out.println("Order Confirmed!");
}
else
{
System.out.println("Added to cart");
}
}
public static void main(String[] args)
{
Pizza p=new Pizza();
p.items();
}
}
