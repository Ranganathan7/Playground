import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n/2;i+=1)
      {
        if(n%i==0)
        {
          System.out.println(i);
        }
      }
      System.out.println(n);
      
	}
}