
import java.util.Scanner;

class Withreturn()
{
    Static int sum(int x,int y){
        int z=x+y;
        return z;
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sum(a,b);
      System.out.println(c);
    }
}
