//W  A pr to printfactors of a number input by user
import java.util.Scanner;
class Factor
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
if(n%i==0)
{
System.out.print(i);
if(n!=i)System.out.print(",");
}
}
}
