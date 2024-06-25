import java.util.*;
class Prime
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the n:");
int n=sc.nextInt();
int c=0;
for(int i=2;i<n;i++)
{
if(n%i==0){
c+=1;
}
}
if(c!=0)
{
System.out.println("number is composite:");
}
else
{
System.out.println("number is prime:");
}
}
}