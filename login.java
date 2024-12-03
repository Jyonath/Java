import java.util.Scanner;
class Login
{
String username="kpv";
String password="kpv143";
String uname;
String psw;
void app()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter username:");
uname=s.next();
System.out.println("Enter password:");
psw=s.next();
if(username.equals(uname) && password.equals(psw))
{
System.out.println("Welcome to cse");
}
else
{
System.out.println("Invalid username/password plzz retry");
}
}
public static void main(String[] args)
{
Login l=new Login();
l.app();
}
}
