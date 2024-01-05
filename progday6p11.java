import java.util.Scanner;
class BreakEx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);  
int n=sc.nextInt();
byte i=0;
//short i=0;
while(true)//while(i<25)
{
System.out.print(i+",");
if(i==n)break;//if(i%5==0) output is 1 2 3 4
i++;
}
}
}
