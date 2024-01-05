//palindrome
import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,num;
int pd=0;
n=sc.nextInt();
num=n;
while(n>0)
{
pd=pd*10+(n%10);
n=n/10;
}
if(pd==num)
{
System.out.println("Given number is palindrome");
}
else
{
System.out.println("Given number is not a palindrome");
}
}
}
