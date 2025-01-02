import java.util.Scanner;
class pgm303
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double x = sc.nextDouble();
int n = sc.nextInt();
double res = 1;
if(n==0)
{
System.out.println(1);
}
if (n<0)
{
x=1/x;
n=-n;
}
while(n>0)
{
if(n%2==1)
{
res=res*x;
}
x=x*x;
n=n/2;
}
System.out.println(res);
}}