import java.util.Scanner;
class Student
{

String sname;
String sid;
String snum;
int sage;
String sgender;
Float cgpa;

void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name:");
sname=sc.next();
System.out.println("Enter id:");
sid=sc.next();
System.out.println("Enter num:");
snum=sc.next();
System.out.println("Enter age:");
sage=sc.nextInt();
System.out.println("Enter cgpa:");
cgpa=sc.nextFloat();
System.out.println("Enter gender:");
sgender=sc.next();
}
void details()
{
System.out.println(" name:"+sname);
System.out.println(" id:"+sid);
System.out.println(" num:"+snum);
System.out.println(" age:"+sage);
System.out.println(" cgpa:"+cgpa);
System.out.println(" gender:"+sgender);
}
public static void main(String[] pro)
{
Student s = new Student();

s.read();
s.details();
}
}
