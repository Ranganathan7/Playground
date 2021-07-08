import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int N=n;
      int y=n;
      int sum=0;
      int l=0;
      int s=0;
      int o=0;
      while(y>0)
      {
        y=y/10;
        l=l+1;
      }
      while(n>0)
      {
        o=n%10;
        s=o;
        for(int i=1;i<l;i++)
        {
          s=s*o;
        }
        
        sum=sum+s;
        n=n/10;
       
      }
      if(N==sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}