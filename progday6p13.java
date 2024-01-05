import java.util.Scanner;
class Test
{
public static void main(String args[])
{
int i,j=0;
for(i=0;i<3;i++)
{
System.out.println("\n");
for(j=0;j<5;j++)
{
if(j%2==1)continue; //if j or i is odd then continue//break;output is for break i=o,1,2;j=0,0,0
System.out.println("i="+i+"j="+j);
}
} 
}
}
