class EleBill
{
static public void main(String[] cse)
{
int usage;
double bill;
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter Your Units in KW");
usage=sc.nextInt();
if(usage<=100)//5%
{
bill=usage=0*5;
}
else if (usage<=300)
{
bill=(usage*0.5)+((usage-100)*0.75);
}
else
{
bill=(100*0.5)+(200*0.75)+((usage-300)*1.0);
}
System.out.println("Total bill "+bill);
}
}
