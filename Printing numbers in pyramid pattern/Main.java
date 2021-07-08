import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
            Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a=1;
      int s=n-1;
      int num = 1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=s;j++)
        {
          System.out.print(" ");
        }
        s=s-1;
        for(int k=1;k<=i;k++)
        {
          System.out.print(num);
          System.out.print(" ");
          num = num + 1;
        }
        
        System.out.print("\n");
      }
    }    
}