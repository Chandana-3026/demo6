import java.util.Scanner;
class SumDigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;//to hold number//241
int sd=0;//to hold sum of digits
int rem=0;
n=sc.nextInt();
while(n>0)
{
rem=n%10;//241%10=1//again 24%10=4
sd=sd+rem;//0+1=1//1+4=5
n=n/10;//241/10=24
}
System.out.println(sd);
}
}