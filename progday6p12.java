import java.util.Scanner;
class ContinueEx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);  
//int n=sc.nextInt();
int i=0;    //byte i=0;
//short i=0;
while(i<25)                //while(true)
{
i++;
if(i%5==0)continue;
System.out.print(i+" ");
}
}
}