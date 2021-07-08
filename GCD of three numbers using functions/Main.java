import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int f = 0;
      int i=a;
      while(i>1)
      {
        if(a%i==0 && b%i==0)
        {
          break;
        }
        i = i - 1;
      }
      a = i;
      b = c;
      i = i;
      while(i>1)
      {
        if(a%i==0 && b%i==0)
        {
          break;
        }
        i = i - 1;
      } 
      System.out.println(i);
	}
}