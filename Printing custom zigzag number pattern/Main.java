import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int num = 1;
      for(int i = 1;i<=n;i++)
      {
        if(i%2==0)
        {
          System.out.print(num+1);
          for(int j=1;j<=n-1;j++)
          {
            System.out.print(num);
          }
          System.out.print("\n");
        }
        else
        {
          for(int j=1;j<=n-1;j++)
          {
            System.out.print(num);
          }
          System.out.print(num+1);
          System.out.print("\n");
        }
        num = num + 1;
      }
	}
}