/*
//0+5+10....+100
*/
class Test2
{
public static void main(String args[])
{
int i=0;
int sum=0;
while(i<=100)
{
System.out.print(i+"+");
sum=sum+i;
i=i+5;
}
System.out.println("\b"+"="+sum);//("="+sum)it gives output as +=1050
}
}