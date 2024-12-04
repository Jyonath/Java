import java.util.Scanner;
class Profile
{
int id;
String fn;
String ln;
String username;
String password;
int age;
float cgpa;
String email;
void Create()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter id:");
id=s.nextInt();
System.out.println("Enter firstname:");
fn=s.next();
System.out.println("Enter lastname:");
ln=s.next();
System.out.println("Enter username:");
username=s.next();
System.out.println("Enter password:");
password=s.next();
System.out.println("Enter age:");
age=s.nextInt();
System.out.println("Enter cgpa:");
cgpa=s.nextFloat();
}
void login()
{
String uname;
String psw;
Scanner s=new Scanner(System.in);
System.out.println("Enter username:");
uname=s.next();
System.out.println("Enter password:");
psw=s.next();
if(username.equals(uname) && password.equals(psw))
{
System.out.println("id:"+id);
System.out.println("firstname:"+fn);
System.out.println("lastname:"+ln);
System.out.println("username:"+username);
System.out.println("password:"+password);
System.out.println("age:"+age);
System.out.println("cgpa:"+cgpa);
}
else
{
System.out.println("Invalid username/password plzz retry");
}
}
void yes()
{
String uname;
String psw;
Scanner s=new Scanner(System.in);
System.out.println("Enter username:");
uname=s.next();
System.out.println("Enter password:");
psw=s.next();
if(username.equals(uname) && password.equals(psw))
{
System.out.println("Modify your details");
Create();
}
else
{
System.out.println("Invalid username/password");
}
}
void edit()
{
String a;
String b="yes";
String c="no";
Scanner e=new Scanner(System.in);
System.out.println("Edit profile yes or no?:");
a=e.next();
System.out.println("Enter email:");
email=e.next();
if(a.equals(b))
{
yes();
}
else
{
System.out.println("ok");
}
}
void update()
{
System.out.println("id:"+id);
System.out.println("firstname:"+fn);
System.out.println("lastname:"+ln);
System.out.println("username:"+username);
System.out.println("password:"+password);
System.out.println("age:"+age);
System.out.println("cgpa:"+cgpa);
System.out.println("Updated successfully!");
}
public static void main(String[] ok)
{
Profile p=new Profile();
p.Create();
p.login();
p.edit();
p.update();
}
}
