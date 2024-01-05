//To add 1+2+3+....+100
class Test1
{
public static void main(String args[])
{
int i=1;
int sum=0;
while(i<=20)//while(++i<=20)the output is 209
{
sum=sum+i;//sum+=i;
i++;//output is 210 if while(i<=20) with i++ 
}
System.out.println(sum);
}
}
