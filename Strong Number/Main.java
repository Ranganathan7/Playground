import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=1;
      int digit;
      int sum=0;
      for(int i=n;i>0;i=i/10)
      {
        digit=i%10;
        s=1;
        for(int j=2;j<=digit;j++)
        {
          s=s*j;
        }
        sum=sum+s;
      }
      if(sum==n)
      {
        System.out.println("Yes");
        
      }
      else
      {
        System.out.println("No");
      }
	}
}