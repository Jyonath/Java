import java.util.*;
class Main
{
String title,author;
int li,isbn,role;
Scanner sc=new Scanner(System.in);
void lib()
{
System.out.println("1.Add a new book");
System.out.println("2.View all books");
System.out.println("3.Exit");
li=sc.nextInt();
switch(li)
{
case 1:
System.out.print("title:");
title=sc.next();
System.out.print("author:");
author=sc.next();
System.out.print("ISBN:");
isbn=sc.nextInt();
lib();
break;
case 2:
System.out.println("title:"+title);
System.out.println("author:"+author);
System.out.println("ISBN"+isbn);
case 3:
break;
}
}
void mem()
{

}
public static void main(String[] args)
{
int role;
Scanner sc=new Scanner(System.in);
Main s=new Main();
System.out.println("Choose a role");
System.out.println("1.Librarian");
System.out.println("2.Member");
role=sc.nextInt();
if(role==1)
{
s.lib();
}
else if(role==2)
{
s.mem();
}
else
{
System.out.println("Invalid role!");
System.exit(0);
}
}
}
