import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int s = 0;
      int ins = n-2;
      int n1 = (n-1) / 2;
     
     
      for(int i=1;i<=n1;i++)
      {
        for(int j=1;j<=s;j++)
        {
          System.out.print(" ");
        }
        System.out.print("*");
        for(int k=1;k<=ins;k++)
        {
          System.out.print(" ");
        }
        ins = ins -2;
        s = s + 1;
        System.out.print("*\n");
        
      }
      
      
      for(int i=1;i<=s;i++)
      {
        System.out.print(" ");
      }
      System.out.print("*\n");
      
      ins = 1;
      s=s-1;
      for(int i=1;i<=n1;i++)
      {
        for(int j=1;j<=s;j++)
        {
          System.out.print(" ");
        }
        System.out.print("*");
        for(int k=1;k<=ins;k++)
        {
          System.out.print(" ");
        }
        ins = ins + 2;
        s = s - 1;
        System.out.print("*\n");
        
      }
	}
}